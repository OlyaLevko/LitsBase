package HomeworkSix;

import java.util.*;
import java.util.function.UnaryOperator;

public class myLinkedList<T> implements List<T> {
    public int size;
    public Entry<T> first;
    public Entry<T> last;

    private static class Entry < T > {
        T element ;
        Entry < T > next ;
        Entry < T > prev ;

        Entry ( T element , Entry < T > next , Entry < T > prev ) {
            this . element = element ;
            this . next = next ;
            this . prev = prev ; }
    }
    @Override
    public boolean add(T element) {

        final  Entry<T> l = last;
        final Entry<T> newNode = new Entry<>(element, null, l);
        last = newNode;
        if (l == null){
            first = newNode;
        }
        else
            l.next = newNode;
        size++;


        return true;
    }



    @Override
    public void sort(Comparator c) {
        Object ob;
        for (int i = 0; i < this.size; i++) {
            for (int j = i; j < this.size; j++) {
                if(c.compare(this.get(i), this.get(j)) == -1){
                   ob = this.get(i);
                    this.set(i, this.get(j));
                    this.set(j, ob);

                }
            }
        }

    }



    @Override
    public int size() {

        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {


        return (indexOf(o)>=0);
    }

    @Override
    public Iterator iterator() {


       return new Iterator() {
           Entry<T> currentNode = first;

           @Override
           public boolean hasNext() {
               return currentNode != null;
           }

           @Override
           public T next() {
               if (hasNext()) {
                   T nextNode = currentNode.element;
                   currentNode = currentNode.next;
                   return nextNode;
               }
               return null;
           }
       };
    }

    @Override
    public Object[] toArray() {
        Object [] array = new Object[size];
        for (int i = 0; i < size; i++) {
            array[i] = this.get(i);
        }
        return array;
    }

    @Override
    public Object[] toArray(Object[] a) {
        if (a.length <= size){
            for (int i = 0; i < a.length; i++) {
                a[i] = this.get(i);
            }
        }
        else {
            for (int i = 0; i < size; i++) {
                a[i] = this.get(i);
            }
            for (int i = size; i < a.length; i++) {
                a[i] = null;
            }
        }
        return a;
    }



    @Override
    public boolean remove(Object o) {
        if(this.contains(o)){
     remove(this.indexOf(o));
     return true;}
        else return false;
    }

    @Override
    public boolean containsAll(Collection c) {
        boolean a = false;
        for(Object o: c){
            if (this.contains(o))a = true;
            else { a = false; break;}
        }
     return a;
    }

    @Override
    public boolean addAll(Collection c) {
        for(Object element: c)
            this.add((T)element);
        return true;
    }

    @Override
    public boolean addAll(int index, Collection c) {
        for(Object element: c)
            this.add(index++,(T)element);
        return true;
    }

    @Override
    public boolean removeAll(Collection c) {
        for(Object element: c)
            this.remove((T)element);
        return true;
    }

    @Override
    public boolean retainAll(Collection c) {
        for (Object o: this) {
            if (!c.contains(o)) this.remove(o);
        }
        return true;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) {
            remove(0);
        }

    }

    @Override
    public T get(int index) {
        Entry<T> currentNode = first;
        if (index < size) {
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.next;

            }
            return currentNode.element;
        }
        else return null;
    }

    @Override
    public Object set(int index, Object element) {
        this.remove(index);
        this.add(index, element);
        return element;
    }

    @Override
    public void add(int index, Object element) {
        if(index < size ){
            Entry<T> currentNode = first;
            if (index ==0){
                Entry<T> newNode = new Entry<T>((T)element, currentNode, null);
                first = newNode;
                currentNode.prev = newNode;
            }
            else {
                for (int i = 1; i < index; i++) {
                    currentNode = currentNode.next;
                }
                Entry<T> newNode = new Entry<T>((T) element, currentNode, currentNode.prev);
                currentNode.prev.next = newNode;
                currentNode.next.prev = newNode;
            }
        }
        else if(index == size) add((T)element);
        size++;

    }

    @Override
    public T remove(int index) {
        Entry<T> currentNode = first;
        if (index == 0){
            first = currentNode.next;
            currentNode.next.prev = null;
        }
        else if (index>0 && index < size -1){
            for (int i = 1; i < size-1; i++) {
                currentNode = currentNode.next;
            }
            currentNode.prev.next = currentNode.next;
            currentNode.next.prev = currentNode.prev;
            currentNode.next = null;
            currentNode.prev = null;
        }
        else if (index == size -1){
            for (int i = 1; i < size; i++) {
                currentNode = currentNode.next;
            }
            last = currentNode.prev;
            currentNode.prev.next = null;




        }
        size--;

        return currentNode.element;
    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
       ListIterator <T> it = this.listIterator();
        while(it.hasNext()){

            if (it.next() == o){
                index = it.nextIndex() -1;
                break;
            }
        }
        return index;

    }

    @Override
    public int lastIndexOf(Object o) {
        int lastIndex = -1;
        ListIterator<T> it = this.listIterator();
        while(it.hasPrevious()){
            if(it.previous()==o) {
                lastIndex = it.previousIndex() + 1;
                 break;
            }
        }

        return lastIndex;
    }

    @Override
    public ListIterator<T> listIterator() {
        return new ListIterator<T>() {
            int index = 0;
            int reversIndex = size-1;
            Entry<T> currentNode = first;
            Entry<T> currentNode2 = last;

            @Override
            public boolean hasNext() {
                return currentNode != null;
            }

            @Override
            public T next() {
                if (hasNext()) {
                    T nextNode = currentNode.element;
                    currentNode = currentNode.next;
                    index++;
                    return nextNode;

                }
                return null;
            }

            @Override
            public boolean hasPrevious() {
                return currentNode2 != null;
            }

            @Override
            public T previous() {
                if (hasPrevious()) {
                    T prevNode = currentNode2.element;
                    currentNode2 = currentNode2.prev;
                    reversIndex--;
                    return prevNode;
                }
                return null;
            }

            @Override
            public int nextIndex() {
                return index;
            }

            @Override
            public int previousIndex() {
                return reversIndex;
            }

            @Override
            public void remove() {


            }

            @Override
            public void set(T t) {

            }

            @Override
            public void add(T t) {

            }
        };

    }

    @Override
    public ListIterator listIterator(int index) {
        return null;
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        List list = new ArrayList();
        for (int i = fromIndex; i < toIndex; i++) {
            list.add(i, this.get(i));
        }
        return list;
    }
}
