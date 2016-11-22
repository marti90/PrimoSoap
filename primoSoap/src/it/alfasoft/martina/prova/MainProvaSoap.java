package it.alfasoft.martina.prova;

import it.alfasoft.martina.Calcolatrice;

import javax.xml.ws.Endpoint;

public class MainProvaSoap {

	public static void main(String[] args) {
		Endpoint.publish("http://localhost:1234/primoSoap",  
				         new Calcolatrice());

	}

}
