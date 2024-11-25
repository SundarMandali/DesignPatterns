package behavioural.state;

//Concrete State: High Speed
class HighState implements State {
 @Override
 public void pressButton(Fan fan) {
     System.out.println("Turning fan Off.");
     fan.setState(new OffState());
 }
}
