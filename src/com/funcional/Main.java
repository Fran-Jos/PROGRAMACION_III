package com.funcional;

//import com.funcional.lista.Cons;

import com.funcional.lista.Lista;

public class Main {
    public static void main(String[] args) {

//        Cons<Integer> n8 = new Cons<>(8, Lista.NIL);
//        Cons<Integer> n4 = new Cons<>(4, n8 );
//        Cons<Integer> n7 = new Cons<>(7, n4);
//        Cons<Integer> n3 = new Cons<>(3, n7);
        
        
//        Lista<Integer> n8 = Lista.of(8, Lista.NIL);
//        Lista<Integer> n4 = Lista.of(4, n8 );
//        Lista<Integer> n7 = Lista.of(7, n4);
//        Lista<Integer> n3 =Lista.of(3, n7);
//       
//        Lista<Integer> miLista = Lista.of(2, n3);
        
        Lista<Integer> miLista = Lista.of(2,3,7,4,8);
        

        System.out.println( miLista.head() );
        System.out.println( miLista);
        System.out.println();
        
         var l2  = miLista.append(99);
         
         System.out.println(l2);
        
//
//        var tmp = miLista;
//        while(!tmp.isEmpty()) {
//            System.out.println(tmp.head());
//            tmp = tmp.tail();
//        }
//        
//        
//        var  empty=  Lista.of();
//        
//        if (empty.isEmpty()) {
//			System.out.println("vacia");
//		}
    }
}

