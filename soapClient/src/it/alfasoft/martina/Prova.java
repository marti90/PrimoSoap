package it.alfasoft.martina;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

public class Prova {

	public static void main(String[] args) {
		
		CalcolatriceServiceLocator locator= new CalcolatriceServiceLocator();
		
		try {
			Calcolatrice c= locator.getCalcolatrice();
			int risultato = c.add(5, 2);
			System.out.println(risultato);
			
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
