package de.netpioneer.webshop.data.entities;

import java.math.BigDecimal;

/**
 * Created by skobow on 07.01.2016.
 */
public final class ProductBuilder {
    private Product product = new Product();

    private ProductBuilder() {}

    public static ProductBuilder create() {
        return new ProductBuilder();
    }

    public ProductBuilder withName(String name) {
        product.setName(name);
        return this;
    }

    public ProductBuilder withDescription(String description) {
        product.setDescription(description);
        return this;
    }

    public ProductBuilder withPrice(BigDecimal price) {
        product.setPrice(price);
        return this;
    }

    public ProductBuilder withUid(String uid) {
        product.setUid(uid);
        return this;
    }

    public ProductBuilder withImageFilename(String fileName) {
        product.setImageFilename(fileName);
        return this;
    }

    public Product build() {
        return product;
    }
}
