package behavioural.memento;

class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    // Save current state as a memento
    public Memento save() {
        return new Memento(text);
    }

    // Restore state from a memento
    public void restore(Memento memento) {
        this.text = memento.getState();
    }
}
