package behavioural.mediator;

//Concrete Mediator
class Teacher implements Mediator {
 @Override
 public void sendMessage(String message, Student student) {
     System.out.println(student.getName() + " says: " + message);
 }
}

