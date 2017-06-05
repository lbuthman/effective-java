package chapter2.item6;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by lbuthman on 5/30/17.
 * A Stack that grows and then shrinks will contain obsolete references. These
 * need to be nulled out.
 */

public class ExampleMemoryLeak {

    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public ExampleMemoryLeak() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }

    //spot of problem that needs to be addressed
    //pop will shrink Stack and so needs to null out old references
    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        //return elements[--size];  BAD
        Object result = elements[--size];
        elements[size] = null;  //  GOOD
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }
}
