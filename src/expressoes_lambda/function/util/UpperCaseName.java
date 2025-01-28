package expressoes_lambda.function.util;

import java.util.function.Function;

import expressoes_lambda.function.entities.Product;

public class UpperCaseName implements Function<Product, String> {

  @Override
  public String apply(Product t) {
    return t.getName().toUpperCase();
  }

}
