import marketEntities.Article;
import marketEntities.Cart;
import marketEntities.Client;

public class es3 {
  public static void main(String[] args) {
    Client client1 = new Client("Giacomo", "giaco@gmail", "25/10/2002");

    Article bread = new Article("bread", 2, 1);
    Article tomato = new Article("tomato", 5, 2);

    Cart cart1 = new Cart(client1);
    cart1.setCart(bread);
    cart1.setCart(tomato);

    System.out.println(cart1.toString());

  }
}
