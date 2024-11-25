package behavioural.mediator;
//Client
public class Main {
	public static void main(String[] args) {
		// Create a teacher (mediator)
		Teacher teacher = new Teacher();

		// Create students
		Student student1 = new Student(teacher, "Alice");
		Student student2 = new Student(teacher, "Bob");

		// Students send messages via the teacher
		student1.sendMessage("Hello, Bob!");
		student2.sendMessage("Hi, Alice!");
	}
}
