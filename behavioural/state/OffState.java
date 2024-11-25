package behavioural.state;

//Concrete State: Off
class OffState implements State {
 @Override
 public void pressButton(Fan fan) {
     System.out.println("Turning fan to Low speed.");
     fan.setState(new LowState());
 }
}