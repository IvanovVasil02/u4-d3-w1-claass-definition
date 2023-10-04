package simEntities;

import simEntities.Call;
import simEntities.Sim;

public class es2 {
  public static void main(String[] args) {
    Sim sim1 = new Sim("2452" );
    Call call1 = new Call("1", 25);
    Call call2 = new Call("2", 25);
    Call call3 = new Call("3", 25);
    Call call4 = new Call("4", 25);
    Call call5 = new Call("5", 25);
    Call call6 = new Call("6", 25);

    sim1.setSim(23, call1);
    sim1.setSim(10, call2);
    sim1.setSim(10, call3);
    sim1.setSim(10, call4);
    sim1.setSim(10, call5);
    sim1.setSim(10, call6);
    System.out.println(sim1.toString());

  }



}
