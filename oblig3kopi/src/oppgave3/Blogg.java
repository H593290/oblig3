package oppgave3;

import common.TODO;
import oppgave1.*;
import oppgave2.Tekst;

public class Blogg {
	
	Innlegg[] innleggtabell;
	int nesteledige;

	
	public Blogg() {
		this.innleggtabell=new Innlegg[20];
		nesteledige=0;
	}

	public Blogg(int lengde) {
		this.innleggtabell=new Innlegg[lengde];
		nesteledige=0;
	}

	public int getAntall() {
		return nesteledige;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		int ret=-1;
		for(int i=0;i<nesteledige;i++) {
			if(innlegg.erLik(innleggtabell[i])) {ret=i;}
		}
		return ret;
	}

	public boolean finnes(Innlegg innlegg) {
		boolean fins=false;
		for(int i=0;i<nesteledige;i++) {
			if(innlegg.erLik(innleggtabell[i])) {fins=true;}
		}
		return fins;
	}

	public boolean ledigPlass() {
		boolean ledig=true;
		if(innleggtabell.length<=nesteledige) {ledig=false;}
		return ledig;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		boolean lagtTil=false;
		
		if(!finnes(innlegg)) {
			innleggtabell[nesteledige]=innlegg;
			lagtTil=true;
			nesteledige++;
		}
		return lagtTil;
	}
	
	public String toString() {
		String ut=nesteledige+"\n";
		for(int i=0;i<nesteledige;i++) {
			ut+=innleggtabell[i].toString();
		}
		return ut;
	}


	
	public void utvid() {
		
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {
	
				
	}
		
	
	public boolean slett(Innlegg innlegg) {
		
	}
	
	public int[] search(String keyword) {
	
	}
}