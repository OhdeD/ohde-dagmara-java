package com.kodilla.others.generics;

public class ElementDagmara<T> {
    private T value;
    private ElementDagmara<T> next;
    private ElementDagmara<T> prev;

    public ElementDagmara(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public ElementDagmara<T> getNext() {
        return next;
    }

    public ElementDagmara<T> getPrev() {
        return prev;
    }

    public void setNext(ElementDagmara<T> next) {
        this.next = next;
    }

    public void setPrev(ElementDagmara<T> prev) {
        this.prev = prev;
    }
}
