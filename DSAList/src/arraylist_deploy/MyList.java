package arraylist_deploy;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    public MyList(int size, Object[] elements) {
        this.size = size;
        this.elements = elements;
    }

    public MyList(int capacity) {
        elements = new Object[capacity];
    }
    public void add(int index, E element) {

    }

//    public MyList remote(int index) {
//        return ....
//    }

    public int size(int size) {
        return size;
    }

//    public MyList clone(){
//        return clone;
//    }

    public boolean contains(E o){
        return true;
    }

    public int indexOf(E o) {
        return 2;
    }

    public boolean add(E e) {
        return true;
    }

    public void ensureCapacity(){
        if (size > elements.length){
            int biggerSize = size * 2;
            elements = Arrays.copyOf(elements, biggerSize);
        }
    }

//    public MyList get(int i) {
//        return
//    }
}
