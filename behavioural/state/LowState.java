package behavioural.state;
//Concrete State: Low Speed
class LowState implements State {
 @Override
 public void pressButton(Fan fan) {
     System.out.println("Turning fan to High speed.");
     fan.setState(new HighState());
 }
}
