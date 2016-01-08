package de.netpioneer.webshop.data.repositories;

import de.netpioneer.webshop.data.entities.Product;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by skobow on 07.01.2016.
 */
public interface ProductRepository extends CrudRepository<Product,Long> {
}
