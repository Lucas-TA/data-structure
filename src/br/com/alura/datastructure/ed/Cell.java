package br.com.alura.datastructure.ed;

public class Cell {
    private Object element;
    private Cell next;

    public Cell(Object element, Cell next) {
        this.element = element;
        this.next = next;
    }

    public Cell getNext() {
        return next;
    }

    public void setNext(Cell next) {
        this.next = next;
    }

    public Object getElement() {
        return element;
    }
}
