package com.dio;

import com.dio.model.Cachorro;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		Livros livros = new Livros();
		
		System.out.println(cachorro);
		System.out.println(livros);
		
		/*int a = 2;
		int b = 2;
			System.out.println("Hello Amor!" + (a+b));
	}*/
		
		
	}
}

class Livros {
	
	private String nome;
	private String tipo;
}
