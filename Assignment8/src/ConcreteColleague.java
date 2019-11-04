public class ConcreteColleague extends Colleague {
  public void receive(String message) {
    System.out.println("Colleague Received: " + message);
  }
}
public class MobileColleague extends Colleague {
  public void receive(String message) {
    System.out.println("Mobile Received: " + message);
  }
}
