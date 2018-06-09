package list;

import element.Element;

public class LinearList<T extends Comparable<?>> {

    private Element[] elements;
    private int currentSize;

    public LinearList(final int size) {
        this.currentSize = 0;
        this.elements = new Element[size];
    }

    public void add(T value) {
        this.elements[currentSize++] = new Element(value);
    }

    public int size() {
        return this.currentSize;
    }
}
