package expressoes.lambda.predicate.util;

import java.util.function.Predicate;

import expressoes.lambda.predicate.entities.Product;

public class ProductPredicate implements Predicate<Product> {

  @Override
  public boolean test(Product t) {
    return t.getPrice() >= 100.0;
  }
  
}
