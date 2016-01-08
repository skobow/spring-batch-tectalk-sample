package de.netpioneer.webshop.data.repositories;

import de.netpioneer.webshop.data.conf.DatabaseConfiguration;
import de.netpioneer.webshop.data.entities.Product;
import de.netpioneer.webshop.data.entities.ProductBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.Assert.*;

/**
 * Created by skobow on 07.01.2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DatabaseConfiguration.class)
public class ProductRepositoryIT {

    @Autowired
    ProductRepository productRepository;

    @Test
    public void shouldInsertProductIntoDatabase() {
        String uid = UUID.randomUUID().toString();
        Product product = ProductBuilder.create()
                .withName("Testprodukt")
                .withDescription("Ein ganz tolles Produkt")
                .withPrice(new BigDecimal("2.00"))
                .withUid(uid)
                .build();

        product = productRepository.save(product);

        assertNotNull(product.getId());

        productRepository.delete(product);
    }
}