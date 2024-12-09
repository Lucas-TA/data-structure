package br.com.alura.datastructure.ed;

public class LinkedArray {
    private Cell first = null;
    private int totalOfElements = 0;

    public void addToStart(Object element) {
        Cell newCell = new Cell(element, first);
        this.first = newCell;
        this.totalOfElements++;
    }

    public void add(Object element) {}

    public void add(Object element, int index) {}

    public Object get(int index) {
        return null;
    }
    public void remove(int index) {}

    public int size() {
        return 0;
    }
    public boolean contains(Object element) {
        return false;
    }

    @Override
    public String toString() {
        if (this.totalOfElements == 0) {
            return "[]";
        }
        Cell atual = first;

        StringBuilder builder = new StringBuilder("[");

        for(int i = 0; i < totalOfElements; i++) {
            builder.append(atual.getElement());
            builder.append(", ");
            atual = atual.getNext();
        }
        builder.append("]");
        return builder.toString();
    }
}
