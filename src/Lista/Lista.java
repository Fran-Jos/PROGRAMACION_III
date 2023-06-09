package Lista;

import java.util.function.Predicate;

public sealed interface Lista<T> permits  Nil, Cons {

    Lista NIL = new Nil();



    T head();
    Lista<T> tail( );

    boolean isEmpty();

    static <T> Lista< T> of(T h, Lista<T> t){
        return new Cons<>(h,t);
    }
    static <T> Lista<T> of(T ... elems) {
        Lista<T> ret = Lista.NIL;
        for(int i = elems.length -1; i>=0; i--){
            T h = elems [i];
            var tmp = Lista.of(h,ret);
            ret = tmp;
        }
        return ret;
    }

    default Lista<T> append (T elemen){
//        if (isEmpty()){
//            return Lista.of(elemen);
//        }else{
//            return Lista.of(head(), tail().append(elemen));
//        }
    	return isEmpty()
    			? Lista.of(elemen) : Lista.of(head(), tail().append(elemen));
    }

    default Lista<T> prepend(T elem){
        return Lista.of(elem,this);
    }
    
    default Lista<T> remove(T elem){
//    	if (isEmpty()) {
//            return NIL;
//    	}else {
//            if (elem.equals(head())){
//                return tail();
//            }else {
//                return Lista.of(head(),tail().remove(elem));
//            }
//        }
    	
    	return isEmpty()
    			? NIL :  elem.equals(head())
    					? tail() : Lista.of(head(),tail().remove(elem));
    }
    
    default Lista<T> drop(int n){
        //elimina un numero determinado de elemntos drop(2)  // elimina dos elementos
//        if (isEmpty() || n<=0){
//            return this;
//        }else{
//                return tail().drop(n-1); 
//        }
    	return isEmpty() || n<=0
    			? this : tail().drop(n-1); 
                       
    }
    
   default Lista<T> dropWhile(Predicate <T> p){
//        if (isEmpty() || p.test(head())){
//            return this;
//        }else{
//                return tail().dropWhile(p); 
//        }
	   
	   return isEmpty() || p.test(head())
			   ? this : tail().dropWhile(p); 
   }
   
   default Lista<T> concat(Lista<T> a){
//       if ( isEmpty()){
//           return a;
//       }else{
//           return Lista.of(head(), tail().concat(a));
//       }
	   
	   return isEmpty()
			   ? a : Lista.of(head(), tail().concat(a));
   }
   
   default Lista<T> take(int n){
//       if ( isEmpty() || n<=0){
//           return NIL;
//       }else{
//          return Lista.of(head(), tail().take(n-1));
//       }
       
       return isEmpty() || n <= 0
    		   ? NIL: Lista.of(head(), tail().take(n-1));
   }
      default Lista<T> takeWile(Predicate <T> p){
//       if ( isEmpty() || !p.test(head())){
//           return NIL;
//       }else{
//          return Lista.of(head(), tail().takeWile(p));
//       }
    	  
    	  return isEmpty() || !p.test(head())
    			  ? NIL : Lista.of(head(), tail().takeWile(p));
   }
      
      
//      default Integer sumarElement(Lista<T> a ) {
//    	  
//    	  if (isEmpty()) {
//			return 0 ;
//		}else if (tail().isEmpty()) {
//			return (Integer) head();
//		}else {
//			return head() + tail().head();
//		}
//      }
      
      static Integer sumar(Lista<Integer>a ) {
    	  if (a.isEmpty()) {
			return 0 ;
		}else if (a.tail().isEmpty()) {
			return a.head();
		}else {
			return a.head() + sumar(a.tail());
		}
    	  
      }
      
   



}

