package simEntities;

import java.util.Random;

public class Call {

  int callId ;
  String calledNumber;
  int callDuration;

  public Call(String calledNumber, int duration){
    Random randomNum = new Random();
    this.callId = randomNum.nextInt(1, 100);
    this.calledNumber = calledNumber;
    this.callDuration = duration;
  }

  @Override
  public String toString() {
    return "Call{" +
            "callId=" + callId +
            ", calledNumber='" + calledNumber + '\'' +
            ", callDuration=" + callDuration +
            '}';
  }
}
