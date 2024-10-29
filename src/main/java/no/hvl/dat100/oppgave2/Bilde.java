package no.hvl.dat100.oppgave2;

import no.hvl.dat100.common.TODO;

public class Bilde extends Tekst {

	// TODO - objekt variable
	
	String url;
	int id;
	String bruker;
	String dato;
	int likes;
	
	public Bilde(int id, String bruker, String dato, String tekst, String url) {
	
	this.id = id;
	this.bruker = bruker;
	this.dato = dato;
	this.tekst = tekst;
	this.url = url;
	
		
	}

	public Bilde(int id, String bruker, String dato, int likes, String tekst, String url) {
	
		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
		this.tekst = tekst;
		this.url = url;
			
	}
	
	public String getUrl() {

		return url;
		
	}

	public void setUrl(String url) {
	
		this.url = url;
		
	}

	@Override
	public String toString() {
	
	return "BILDE\n" + id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n" + "et bilde" +  "\n" + url + "\n";

	}

	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
