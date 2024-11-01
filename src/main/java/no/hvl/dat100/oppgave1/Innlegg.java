package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	int id;
	String bruker;
	String dato;
	int likes;
	
	public Innlegg() {

	
	}
	
	public Innlegg(int id, String bruker, String dato) {

		likes = 0;
		this.bruker = bruker;
		this.dato = dato;
        this.id = id;
	}

	public Innlegg(int id, String bruker, String dato, int likes) {

		this.bruker = bruker;
		this.id = id;
		this.dato = dato;
		this.likes = likes;
	}
	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}

	
	public void doLike () {
		likes++;
	}
	
	public boolean erLik(Innlegg innlegg) {
		if (this.id == innlegg.id) {
			return true;
		}
		return false;

	}
	
	@Override
	public String toString() {
		
		return id + "\n" + bruker + "\n" + dato + "\n" + likes + "\n";
				
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
