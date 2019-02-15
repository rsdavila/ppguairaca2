package br.com.guairaca.comportamental.Iterator;

public class IteratorImpl <T> implements Iterator {
	private T[] items;
	private int index;

	public IteratorImpl(T[] items) {
		this.items = items;
	}

	public void first() {
		index = 0;
	}

	public void next() {
		index++;
	}

	public boolean isDone() {
		return index == items.length;
	}

	public T currentItem() {
		return items[index];
	}

	public int getIndex() {
		return index;
	}

	public byte getLength() {
		return (byte) items.length;
	}
}