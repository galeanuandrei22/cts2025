import java.util.Stack;

public class History {
    private Stack<Memento> undoStack = new Stack<>();
    private Stack<Memento> redoStack = new Stack<>();

    public void saveState(Memento memento) {
        undoStack.push(memento);
        redoStack.clear();
    }

    public Memento undo(Memento current) {
        if(!undoStack.isEmpty()) {
            redoStack.push(current);
            return undoStack.pop();
        }
        return current;
    }

    public Memento redo(Memento current) {
        if (!redoStack.isEmpty()) {
            undoStack.push(current);
            return redoStack.pop();
        }
        return current;
    }
}
