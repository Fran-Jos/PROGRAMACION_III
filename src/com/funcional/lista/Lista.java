package com.funcional.lista;

public sealed interface Lista<T> permits Nil , Cons{
    T head();
    Lista<T> tail( );
    


    public static final Lista NIL = new Nil();
    
    
    //chequeo si es o no vacia 
//    default boolean isEmpty() {
//    	return this == NIL;
//    }
    
  //chequeo si es o no vacia 
    
    
    
    boolean isEmpty();
    
    
    
    
    //lista para agregar un elemento
    static <T>Lista<T> of(T h , Lista<T>t ){
    	return new Cons<T>(h, t);
    	
    }
    
    
    
    
    // lista para agregar varios elementos 
    static <T> Lista<T> of(T...elems){
    	Lista<T>ret = Lista.NIL;
    	for (int i = elems.length-1; i >= 0; i--) {
			T h = elems[i];
			var tmp = Lista.of(h, ret);
			ret = tmp;
			
		}
    	
    	return ret;
    }
    
    
    
    
    
  default Lista<T> append(T elem){
	  
	  if (isEmpty()) {
		return Lista.of(elem);
	}else {
		return Lista.of(head() , tail().append(elem));
	}
  }
    
    
    
    
//    default String toString1() {
//    	
//    	StringBuilder sb = new  StringBuilder();
//    	var tmp = this;
//    	
//    	while (!tmp.isEmpty()) {
//			sb.append( tmp.head());
//			sb.append(", ");
//			tmp = tmp.tail();	
//		}
//    	
//    	sb.append("NIL");
//    	
//    	return sb.toString();
//    	
//    	
//    	
//    	
//    }
}

