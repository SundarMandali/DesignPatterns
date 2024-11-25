package behavioural.mediator;

//Colleague
public class Student {
 private Mediator mediator;
 private String name;

 public Student(Mediator mediator, String name) {
     this.mediator = mediator;
     this.name = name;
 }

 public String getName() {
     return name;
 }

 public void sendMessage(String message) {
     mediator.sendMessage(message, this);
 }
}
