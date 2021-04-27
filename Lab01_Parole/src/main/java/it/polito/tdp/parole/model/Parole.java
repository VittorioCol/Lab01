package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	ArrayList<String> finale=new ArrayList<String>();
		
	public Parole() {
	}
	
	public void addParola(String p) {
		finale.add(p);
		Collections.sort(finale);
	}
	
	public List<String> getElenco() {
		return finale;
	}
	
	public void reset() {
		finale.removeAll(finale);
	}

	@Override
	public String toString() {
		String ris = "";
		for(String f: finale) {
			ris+= f+"\n";
		}
		return ris ;
	}
	

}
