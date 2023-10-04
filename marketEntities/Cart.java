package marketEntities;

import java.util.ArrayList;

public class Cart {
 int clientID;
ArrayList<Article> elementList = new ArrayList<Article>();

int totalCost = 0;


public Cart (Object client) {
  Client clientId = (Client) client;
  this.clientID = clientId.clientId;
}

public void setCart (Object article){
  Article addOfArticle = (Article) article;
  elementList.add(new Article(addOfArticle.description, addOfArticle.price, addOfArticle.amount));
  this.totalCost += addOfArticle.price;
}

  @Override
  public String toString() {
    return "Cart{" +
            "clientID=" + clientID +
            ", elementList=" + elementList +
            ", totalCost=" + totalCost +
            '}';
  }
}
