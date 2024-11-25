package behavioural.commad;

//Client
public class Main {
 public static void main(String[] args) {
     // Receiver
     Light livingRoomLight = new Light();

     // Commands
     Command lightOn = new LightOnCommand(livingRoomLight);
     Command lightOff = new LightOffCommand(livingRoomLight);

     // Invoker
     RemoteControl remote = new RemoteControl();

     // Turn the light ON
     remote.setCommand(lightOn);
     remote.pressButton(); // Output: The light is ON

     // Turn the light OFF
     remote.setCommand(lightOff);
     remote.pressButton(); // Output: The light is OFF
 }
}
