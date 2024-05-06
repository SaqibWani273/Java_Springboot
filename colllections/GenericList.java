package colllections;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
    @SuppressWarnings("unchecked")
    public T[] items = (T[]) new Object[10];
    private int count = 0;
    

    public void add(T element) {
        items[count++] = element;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator(this);
     }
     private class ListIterator implements Iterator<T> {
     private   GenericList<T> list;
       private int count=0;
ListIterator(GenericList<T> list) {
    this.list=list;
}
        @Override
        public boolean hasNext() {
            return list.count>count;
           }

        @Override
        public T next() {
     return   list.items[count++];
        }

     }

}
