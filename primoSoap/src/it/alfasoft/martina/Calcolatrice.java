package it.alfasoft.martina;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name="marti", serviceName="ciao", portName="terry")
@SOAPBinding(style=Style.RPC)
public class Calcolatrice implements iCalcolatrice {
	
	@Override
	@WebMethod(operationName="aggiungiNumeri")
	public int add(int num1, int num2){
		return num1+num2;
	}

}
