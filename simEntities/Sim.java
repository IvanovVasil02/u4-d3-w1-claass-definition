package simEntities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sim {
  private String number;
  private int availableCredit = 0;

  Call[] callList = new Call[0];

  public Sim(String phoneNumber){
    this.number = phoneNumber;
  }
  public void setSim(int availableCredit, Object objCall){
    this.availableCredit = this.availableCredit + availableCredit;
    Call call = (Call) objCall;

    List<Object> objList = new ArrayList<Object>(Arrays.asList(callList));

    objList.add(new Call(call.calledNumber, call.callDuration));

    if(objList.size() > 5){
      objList.remove(0);
    }

    this.callList = objList.toArray(this.callList);

  }

  @Override
  public String toString() {
    return "Sim{" +
            "phoneNumber=" + number +
            ", availableCredit=" + availableCredit +
            ", callList=" + Arrays.toString(callList) +
            '}';
  }

  public String getNumber() {
    return number;
  }

  public int getAvailableCredit() {
    return availableCredit;
  }

  public Call[] getCallList() {
    return callList;
  }

}

