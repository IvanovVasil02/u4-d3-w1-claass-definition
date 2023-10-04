package marketEntities;

import java.util.ArrayList;

public class Cart {
private int clientID;
private ArrayList<Article> elementList = new ArrayList<Article>();

private int totalCost = 0;


public Cart (Client client) {
  this.clientID = client.clientId;
}

public void setCart (Article article){
  elementList.add(new Article(article.description, article.price, article.amount));
  this.totalCost += article.price;
}

  public int getClientID() {
    return clientID;
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
