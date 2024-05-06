package org.lessons.java.shop;

//Nello stesso package aggiungete 
//una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.

public class Main {

	public static void main(String[] args) {
		Prodotto cremaMani = new Prodotto("Ambra liquida", "Crema mani profumata", 69.99, 22.0);
		
		System.out.println("Codice: " + cremaMani.getCodice());
		System.out.println("Nome: " + cremaMani.getNome());
		System.out.println("Descrizione: " + cremaMani.getDescrizione());
		System.out.println("Prezzo: " + cremaMani.getPrezzo());
		System.out.println("Iva: " + cremaMani.getIva());
		System.out.println("Prezzo Base: "+ cremaMani.getPrezzoBase());
		System.out.println("Prezzo con Iva: " + cremaMani.getPrezzoIva());
		System.out.println("Nome Esteso: " + cremaMani.getNomeEsteso());

	}
	//aggiungere il bonus dopo aver creato il metodo static
}
