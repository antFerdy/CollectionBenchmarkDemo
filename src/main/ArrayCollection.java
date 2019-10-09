package main;

import java.util.Collection;
import java.util.Iterator;

public class ArrayCollection<T> implements Collection<T> {
    private T[] m = (T[]) new Object[0];
    private int size = 0;

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public boolean contains(Object item) {
        for (int i = 0; i < size(); i++) {
            if(m[i].equals(item)) return true;
        }
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        return new ItemIterator();
    }

    @Override
    public Object[] toArray() {
        T[] array = (T[]) new Object[size()];
        System.arraycopy(m, 0, array, 0, size());
        return array;
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        if(m.length == size()) {
            T[] newM = (T[]) new Object[(size() + 1) * 2];
            System.arraycopy(toArray(), 0, newM, 0, size());
            m = newM;
        }
        m[size()] = t;
        size++;
        return true;
    }

    @Override
    public boolean remove(Object o) {
        for (int i = 0; i < size(); i++) {
            if(m[i].equals(o)) {
                if(i != size() - 1) {
                    System.arraycopy(m, i+1, m, i, size() - i - 1);
                }
                size--;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        for (Object item : collection) {
            if(!this.contains(item)) return false;
        }
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        for(Object item : c) {
            this.add((T) item);
        }
        return true;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        for(Object item : c) {
            this.remove(item);
        }
        return true;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        for(Object item : this) {
            if(!c.contains(item)) this.remove(item);
        }
        return true;
    }

    @Override
    public void clear() {
        m = (T[]) new Object[0];
        size = 0;
    }

    private class ItemIterator implements Iterator<T> {
        private int currentIndex = 0;

        @Override
        public boolean hasNext() {
            return currentIndex < size();
        }

        @Override
        public T next() {
            return m[currentIndex++];
        }
    }
}
