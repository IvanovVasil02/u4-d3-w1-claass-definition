package marketEntities;

import java.util.Random;

public class Article {
  int articleId;
  String description;
  int price;
  int amount;

  public Article (String description, int price, int amount){
    this.description = description;
    this.price = price;
    this.amount = amount;
    Random rndm = new Random();
    this.articleId = rndm.nextInt(1, 1000);

  }

  @Override
  public String toString() {
    return "Article{" +
            "articleId='" + articleId + '\'' +
            ", description='" + description + '\'' +
            ", price=" + price +
            ", amount='" + amount + '\'' +
            '}';
  }
}
