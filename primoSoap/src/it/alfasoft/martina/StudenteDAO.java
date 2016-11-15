package it.alfasoft.martina;

import java.util.HashMap;
import java.util.Map;

public class StudenteDAO {
	
	private Map<String,Studente> studenti;
	
	public StudenteDAO(){
		studenti= new HashMap<String,Studente>();
		Studente s1= new Studente("Martina","Debernardi");
		Studente s2= new Studente("Luca","Umoretto");
		Studente s3= new Studente("Irene","Aimone");
		
		studenti.put(s1.getNome(), s1);
		studenti.put(s2.getNome(), s2);
		studenti.put(s3.getNome(), s3);
	}
	
	public Studente getStudenteConNome(String nome){
		return studenti.get(nome);
	}

}
