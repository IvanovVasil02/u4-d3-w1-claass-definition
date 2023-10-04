package marketEntities;

import java.util.Random;

public class Article {
  protected int articleId;
  protected String description;
  protected int price;
  public int amount;

  public Article (String description, int price, int amount){
    this.description = description;
    this.price = price;
    this.amount = amount;
    Random rndm = new Random();
    this.articleId = rndm.nextInt(1, 1000);

  }

  public int getArticleId() {
    return articleId;
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
