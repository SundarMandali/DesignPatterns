package behavioural.commad;

//Command to turn the light OFF
class LightOffCommand implements Command {
 private Light light;

 public LightOffCommand(Light light) {
     this.light = light;
 }

 @Override
 public void execute() {
     light.turnOff();
 }
}