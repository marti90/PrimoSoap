package it.alfasoft.martina;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface iCalcolatrice {

	@WebMethod
	public abstract int add(int num1, int num2);

}