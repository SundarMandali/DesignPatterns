package behavioural.commad;

//Command to turn the light ON
class LightOnCommand implements Command {
 private Light light;

 public LightOnCommand(Light light) {
     this.light = light;
 }

 @Override
 public void execute() {
     light.turnOn();
 }
}