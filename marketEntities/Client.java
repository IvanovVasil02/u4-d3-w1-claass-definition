package marketEntities;

import java.util.Random;

public class Client {
 protected int clientId;
  public String nameSurname;
  public String email;
  public String registrationDate;

  public Client (String fullName, String email, String registrationDate){
      this.nameSurname = fullName;
      this.email = email;
      this.registrationDate = registrationDate;
      Random rndm = new Random();
      this.clientId = rndm.nextInt(1, 1000);
  }

  @Override
  public String toString() {
    return "Client{" +
            "clientId=" + clientId +
            ", nameSurname='" + nameSurname + '\'' +
            ", email='" + email + '\'' +
            ", registrationDate='" + registrationDate + '\'' +
            '}';
  }
}
