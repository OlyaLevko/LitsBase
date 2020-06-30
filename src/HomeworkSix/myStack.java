package HomeworkSix;

import java.util.*;
import java.util.function.UnaryOperator;

public class myStack<T> extends Stack<T> {
     int top;
     T [] array;

    public myStack(int maxSize) {
        top = -1;
        array = (T[]) new Object [maxSize];
    }


    public int size() {
        return ++top;
    }


    public boolean isEmpty() {
        return top == -1;
    }


    public boolean contains(Object o) {
        boolean t = false;
        for (int i = 0; i < size(); i++) {
            if(array[i] == o) {
                t = true;
                break;
            }
        }
        return t;
    }

    public T peek(){
        return array[top];
    }

    public T pop(){
        return remove(top);
    }

    public T push(T element){
       add(element);
       return array[top];
    }



    public Object[] toArray() {
        return array;
    }



    public boolean add(T t) {
        array[++top] = t;
        return true;
    }



    public void clear() {
        for (int i = 0; i < size(); i++) {
            remove(i);
        }

    }


    public T get(int index) {
        return array[index];
    }


    public T set(int index, T element) {
        remove(index);
        add(index, element);
        return element;
    }


    public void add(int index, T element) {
        int l = top - index+1;
        T [] a = (T[]) new Object [l];
        for (int i = 0; i < l; i++) {
            a[i] = array[top--];
        }
        add(element);
        for (int i = l-1; i >= 0; i--) {
            this.add(a[i]);
        }


    }


    public T remove(int index) {

        int l = top - index+1;
        T [] a = (T[]) new Object [l];
        T b = null;
        for (int i = 0; i < l; i++) {
            a[i] = array[top--];
            b = array[top];

        }


       for (int i = l-2; i >= 0; i--) {
           this.add(a[i]);
       }


        return array[top];
    }


    public int search(Object o) {
        int index = -1;

        for (int i = 0; i < size(); i++) {
            if(array[i] == o) index = i;
            break;
        }
        return index;
    }

 public Iterator<T> iterator() {


        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return top != -1;
            }

            @Override
            public T next() {
                int t = top;

                if(hasNext()) {

                    return array[top--];


                }
                else {top = t; return null;}
            }
        };

 }
}
