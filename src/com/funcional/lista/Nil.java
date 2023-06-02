package com.funcional.lista;

//--nodo final
 final class Nil<T> implements Lista<T> {
	 
	 
    @Override
    public T head() {
        return null;
    }

    @Override
    public Lista<T> tail() {
        return null;
    }

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	public String toString() {
		
		return "NIL";
	}
}
