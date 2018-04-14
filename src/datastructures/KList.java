package datastructures;

import java.util.Arrays;

public class KList<E> {

	private int size = 0;
	private static final int DEFAULT_CAPACITY = 10;
	private E elements[];

	public KList() {
		elements = (E[]) new Object[DEFAULT_CAPACITY];
	}

	public void add(E e) {
		if (size == elements.length) {
			increaseSize();
		}
		elements[size++] = e;

	}

	public E get(int i) {
		if (isOutOfBounds(i)) {
			throw new IndexOutOfBoundsException();
		}
		return elements[i];
	}

	public void remove(int i) {
		if (isOutOfBounds(i)) {
			throw new IndexOutOfBoundsException();
		}
		int counter = i;
		while (counter < size) {
			elements[counter] = elements[counter + 1];
			counter++;
		}
		elements[counter + 1] = null;
		size--;
	}

	private void increaseSize() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}

	private boolean isOutOfBounds(int i) {
		return i >= size || i < 0;
	}

	public int size() {
		return size;
	}
}
