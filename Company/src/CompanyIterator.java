import java.util.Iterator;
import java.util.Stack;

public class CompanyIterator implements Iterator<Component> {
    private Stack<Iterator<Component>> stack = new Stack<>();

    public CompanyIterator(Component root) {
        if (root instanceof Department) {
            stack.push(((Department) root).getComponents().iterator());
        }
    }

    @Override
    public boolean hasNext() {
        if(stack.isEmpty()) return false;
        Iterator<Component> iterator = stack.peek();
        if(!iterator.hasNext()) {
            stack.pop();
            return hasNext();
        }
        return true;
    }

    @Override
    public Component next() {
        if(hasNext()) {
            Iterator<Component> iterator = stack.peek();
            Component component = iterator.next();
            if (component instanceof Department) {
                stack.push(((Department) component).getComponents().iterator());
            }
            return component;
        }
        return null;
    }
}
