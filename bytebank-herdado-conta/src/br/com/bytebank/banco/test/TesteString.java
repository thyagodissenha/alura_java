package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {

		String nome = "Alura";
		String outra = nome.replace("A", "a");
//		String outra = nome.toUpperCase();

		String vazio = " Thyago T. Dissenha";
		System.out.println(vazio.trim());
		
		System.out.println(nome);
		System.out.println(outra);

	}

}
