package one.digitalinnovation.experts.product.catalog.repository;

import one.digitalinnovation.experts.product.catalog.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Integer> {
}
