package HomeworkSix;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;

public class CommonIterator<T> implements Iterator<T> {
    private Stack <T> stack;


    public CommonIterator(Stack<T> stack){
        this.stack = copy(stack);
    }

    public Stack<T> copy(Stack<T> stack){
        ArrayList<T> list = new ArrayList<>();
        while(!stack.empty()) {
            list.add(stack.pop());
        }
        Stack copyStack = new Stack();
        for (int i = 0; i < list.size(); i++) {
            stack.push(list.get(list.size() -1-i));
            copyStack.push(list.get(i));
        }
        return copyStack;
    }

    @Override
    public boolean hasNext() {
        return !stack.empty();
    }

    @Override
    public T next() {
        return this.stack.pop();

    }



}
