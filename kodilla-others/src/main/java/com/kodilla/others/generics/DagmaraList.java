package com.kodilla.others.generics;

public class DagmaraList<T> {
    private ElementDagmara<T> collectionHead;

    public void addElement(T value) {
        ElementDagmara<T> element = new ElementDagmara<>(value);
        if (collectionHead == null) {
            collectionHead = element;
        } else {
            ElementDagmara<T> temp = collectionHead;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(element);
            element.setPrev(temp);
        }
    }

    public T getElement(int index) {
        ElementDagmara<T> temp = collectionHead;
        int counter = 0;

        while (counter < index) {
            temp = temp.getNext();
            counter++;
        }
        return temp.getValue();
    }

    public void removeElement(T value) {
        ElementDagmara<T> temp = collectionHead;
        ElementDagmara<T> element;

        while (temp.getValue() != value) {
            temp = temp.getNext();
        }

        element = temp.getPrev();
        element.setPrev(temp.getPrev().getPrev());
        element.setNext(temp.getNext());
    }

}
