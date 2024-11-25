package behavioural.memento;

import java.util.Stack;

class Caretaker {
    private final Stack<Memento> mementoStack = new Stack<>();

    public void saveState(Memento memento) {
        mementoStack.push(memento);
    }

    public Memento undo() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null;
    }
}
