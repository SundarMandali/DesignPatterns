package behavioural.commad;

//Invoker
class RemoteControl {
 private Command command;

 // Set the command
 public void setCommand(Command command) {
     this.command = command;
 }

 // Execute the command
 public void pressButton() {
     command.execute();
 }
}

