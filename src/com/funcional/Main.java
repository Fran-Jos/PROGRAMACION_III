package com.funcional;

import java.util.function.Function;

public class Main {
	public static void main(String[] args) { 

		Function<Integer, Integer> triple = x -> 3 * x;
		Function<Integer, Integer> square = x -> x * x;
		
		Function<Integer, Integer> fg = Compo.<Integer>composicion().apply(square).apply(triple);
		System.out.println(fg.apply(2));
		
		Function<Integer, Integer> fog = Compo.<Integer , Integer , Integer>composicion1().apply(square).apply(triple);
		System.out.println(fog.apply(2));
	}
}
