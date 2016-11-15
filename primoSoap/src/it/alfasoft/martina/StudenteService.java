package it.alfasoft.martina;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class StudenteService implements iStudenteService {
	
	@Override
	@WebMethod
	public Studente prendiStudenteConNome(String nome){
		
		StudenteDAO sDao= new StudenteDAO();
		return sDao.getStudenteConNome(nome);
		
	}

}
