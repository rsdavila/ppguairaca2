package br.com.guairaca.comportamental.Iterator;

public interface Iterator {
	public void first();

	public void next();

	public boolean isDone();

	public Object currentItem();

	public int getIndex();

	public byte getLength();
}
