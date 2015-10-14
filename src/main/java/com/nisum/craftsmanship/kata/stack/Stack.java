package com.nisum.craftsmanship.kata.stack;

public class Stack {
    private final int[] elements;
    private int nextIndex = 0;


    public Stack(int i) {
        elements = new int[i];
    }


    public boolean isEmpty() {
        return nextIndex == 0;
    }


    public void push(int i) {
        if (nextIndex == getCapacity())
            throw new Overflow();

       elements[nextIndex++] = i;
    }


    public int pop() {
        if (isEmpty())
            throw new Underflow();

        return elements[--nextIndex];
    }


    public int getCapacity() {
        return elements.length;
    }


    public class Underflow extends RuntimeException{

    }


    public class Overflow extends RuntimeException {

    }
}
