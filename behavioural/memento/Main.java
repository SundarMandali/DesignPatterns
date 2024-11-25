package behavioural.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        Caretaker caretaker = new Caretaker();

        // Initial text
        editor.setText("Hello");
        System.out.println("Text: " + editor.getText());

        // Save state
        caretaker.saveState(editor.save());

        // Modify text
        editor.setText("Hello, World!");
        System.out.println("Text: " + editor.getText());

        // Undo to previous state
        editor.restore(caretaker.undo());
        System.out.println("After Undo: " + editor.getText());
    }
}
