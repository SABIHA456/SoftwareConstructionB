public interface Mediator {
  public void send(String message, Colleague colleague);
}

public abstract Colleague{
  private Mediator mediator;
  public Colleague(Mediator m) {
    mediator = m;
  }

  public void send(String message) {
    mediator.send(message, this);
  }
  //get access to the mediator
  public Mediator getMediator() {return mediator;}
  public abstract void receive(String message);
}

