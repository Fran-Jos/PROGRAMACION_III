package main;

import Lista.Lista;

public class Main {
    public static void main(String[] args) {

    Lista<Integer> miLista = Lista.of(2,7,7,4,8);
        System.out.println( miLista.head() );
        System.out.println(miLista.toString());
        var empty =Lista.of();
        var l2 = miLista.append(99);
        System.out.println((l2));  
        var l3 = miLista.prepend(99);
        System.out.println((l3));
        var l4 = miLista.remove(5);
        System.out.println((l4));
        
        
        System.out.println("DROP");
        var l5 = miLista.drop(2);
        System.out.println(l5);
        
        
        Lista<Integer> miLista2 = Lista.of();
        System.out.println("DROPWHILE");
        var l6 = miLista2.dropWhile(t->t%2==0);
        System.out.println(l6);
        
        System.out.println("CONCAT");
        var l7 = miLista.concat(miLista);
        System.out.println(l7);
        
        System.out.println("TAKE");
        var l8 = miLista.take(2);
        System.out.println(l8);
                
        System.out.println("TAKEWHILE");
        var l9 = miLista.takeWile(t->t%2==0);
        System.out.println(l9);
        
       var l10 = Lista.sumar(miLista);
       System.out.println(l10);

    }
}

