package oppgave2;

import common.TODO;
import oppgave1.*;

public class Tekst extends Innlegg {
	
	public Tekst () {
		
	}
	private String tekst;
	public Tekst(int id, String bruker, String dato, String tekst) {
		super(id,bruker,dato);
		this.tekst=tekst;
	}
	
	public Tekst(int id, String bruker, String dato, int likes, String tekst) {
		super(id,bruker,dato,likes);
		this.tekst=tekst;
	}
	
	public String getTekst() {
		return tekst;
	}
	
	public void setTekst(String tekst) {
		this.tekst=tekst;
	}
	
	@Override
	public String toString() {
		String ut="TEKST\n"+super.toString()+tekst+"\n";
		return ut;
		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
			
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
