package org.lessons.java.shop;

import java.util.Random;

/*Un prodotto è caratterizzato da: - codice (numero intero) - nome - descrizione - prezzo - iva
Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter
ed eventuali altri metodi di “utilità” per fare in modo che: - alla creazione di un nuovo prodotto il 
codice sia valorizzato con un numero random - il codice prodotto sia accessibile solo in lettura - gli 
altri attributi siano accessibili sia in lettura che in scrittura - il prodotto esponga un metodo per 
avere il prezzo base - il prodotto esponga un metodo per avere il prezzo comprensivo di iva - il prodotto 
esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome Nello stesso package aggiungete 
una classe Main con metodo main nella quale testate tutte le funzionalità della classe Prodotto.
BONUS: create un metodo (statico) che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri 
(ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)*/

public class Prodotto {
    
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;
    
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
	this.codice = codiceRandom(); //Creare e chiamere così il metodo per il codice random
	this.nome = nome;
	this.descrizione = descrizione;
	this.prezzo = prezzo;
	this.iva = iva;
    }
    
    public int getCodice() {
	return codice;
    }
    
    public String getNome() {
	return nome;
    }
    
    public String getDescrizione() {
   	return descrizione;
       }

    public double getPrezzo() {
   	return prezzo;
       }
    
    public double getIva() {
   	return iva;
       }
    
    //Metodo prezzo base
    public double getPrezzoBase() {
	return prezzo;
    }
    
    //Metodo prezzo+iva
    public double getPrezzoIva() {
	return prezzo * (1 + iva / 100);
    }
    
    //Metodo per creare il nome esteso
    public String getNomeEsteso() {
	String codiceFormattato = String.format("%08d", codice); //ricordarmi che sto  formattando il codice a 8 cifre in riferimento al bonus..
	String nomeEsteso = codiceFormattato + "-" + nome;
	return nomeEsteso;
    }
    
    //creo il metodo per il codice random privato perche lo voglio interno alla classe prodotto.
    private int codiceRandom() {
	Random random = new Random();
	return random.nextInt(90000000) + 10000000;
    }
    
    //creare metodo (statico) che restituisca il codice con un pad left di 0.
}

