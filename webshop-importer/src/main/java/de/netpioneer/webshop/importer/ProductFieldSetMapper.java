package de.netpioneer.webshop.importer;

import de.netpioneer.webshop.data.entities.Product;
import org.springframework.batch.item.file.mapping.FieldSetMapper;
import org.springframework.batch.item.file.transform.FieldSet;
import org.springframework.validation.BindException;

import java.math.BigDecimal;

/**
 * Created by skobow on 09.01.2016.
 */
public class ProductFieldSetMapper implements FieldSetMapper<Product> {
    public Product mapFieldSet(FieldSet fieldSet) throws BindException {
        Product product = new Product();
        product.setName(fieldSet.readString("NAME"));
        product.setDescription(fieldSet.readString("DESC"));
        product.setImageFilename(fieldSet.readString("IMAGE_FILE"));
        product.setPrice(new BigDecimal(fieldSet.readString("PRICE")));

        return product;
    }
}
