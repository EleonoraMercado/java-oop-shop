package org.lessons.java.shop;

import java.util.Random;


public class Prodotto {
    
    private int codice;
    private String nome;
    private String descrizione;
    private double prezzo;
    private double iva;
    
    //costruttore
    public Prodotto(String nome, String descrizione, double prezzo, double iva) {
	this.codice = codiceRandom(); 
	this.nome = nome;
	this.descrizione = descrizione;
	this.prezzo = prezzo;
	this.iva = iva;
    }
    
    //Getter e Setter
    public int getCodice() {
	return codice;
    }
    
    public String getNome() {
	return nome;
    }
    
    public String setNome( ) {
	return nome;
    }
    
    public String getDescrizione() {
   	return descrizione;
       }
    
    public String setDescrizione() {
	return descrizione;
    }

    public double getPrezzo() {
   	return prezzo;
       }
    
    public double setPrezzo() {
	return prezzo;
    }
    
    public double getIva() {
   	return iva;
       }
    
    public double setIva() {
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
    
    //Bonus
    public static String formattaCodice(int codice) {
	return String.format("%08d", codice);
    }
    
    //Metodo per creare il nome esteso
    public String getNomeEsteso() {
	String codiceFormattato = formattaCodice(codice);  
	String nomeEsteso = codiceFormattato + "-" + nome;
	return nomeEsteso;
    }
    
    //metodo codice random
    private int codiceRandom() {
	Random random = new Random();
	return random.nextInt(90000000) + 10000000;
    }
    
   
}

