package expressoes.lambda.consumer.util;

import java.util.function.Consumer;

import expressoes.lambda.consumer.entities.Product;

public class PriceUpdate implements Consumer<Product> {
  
  @Override
  public void accept(Product p) {
    p.setPrice(p.getPrice() * 1.1);
  }
  
}
