package marketEntities;

import java.util.ArrayList;

public class Cart {
private int clientID;
private ArrayList<Article> elementList = new ArrayList<Article>();

private int totalCost = 0;


public Cart (Object client) {
  Client clientId = (Client) client;
  this.clientID = clientId.clientId;
}

public void setCart (Object article){
  Article addOfArticle = (Article) article;
  elementList.add(new Article(addOfArticle.description, addOfArticle.price, addOfArticle.amount));
  this.totalCost += addOfArticle.price;
}

  public ArrayList<Article> getElementList() {
    return elementList;
  }

  public int getTotalCost() {
    return totalCost;
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
