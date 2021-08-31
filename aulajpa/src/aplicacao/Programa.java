package aplicacao;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa(1,"Carlos da Silva", "carlosdasilva@gmail.com");
		Pessoa p2 = new Pessoa(1,"Joaquim Torres", "joaquimtorres@gmail.com");
		Pessoa p3 = new Pessoa(1,"Ana Maria", "anamaria@gmail.com");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
	}

}
