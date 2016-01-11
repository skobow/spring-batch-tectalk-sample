package de.netpioneer.webshop.importer;

import de.netpioneer.webshop.data.entities.Product;
import org.springframework.batch.item.ItemWriter;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

/**
 * Created by skobow on 11.01.2016.
 */
public class ProductJdbcItemWriter implements ItemWriter<Product> {

    public static final String INSERT_PRODUCT = "insert into products " +
            "(id,name,description,price,image_filename) values (?,?,?,?,?)";

    public static final String UPDATE_PRODUCT = "update products set " +
            "name=?, description=?, price=?, image_filename=? where id=?";

    private JdbcTemplate jdbcTemplate;

    public ProductJdbcItemWriter(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public void write(List<? extends Product> items) throws Exception {
        for (Product item : items) {
            int updated = jdbcTemplate.update(
                    UPDATE_PRODUCT,
                    item.getName(),
                    item.getDescription(),
                    item.getPrice(),
                    item.getImageFilename(),
                    item.getId()
            );
            if (updated == 0) {
                jdbcTemplate.update(
                        INSERT_PRODUCT,
                        item.getId(),
                        item.getName(),
                        item.getDescription(),
                        item.getPrice(),
                        item.getImageFilename()
                );
            }
        }
    }
}
