package com.cisc181.core;

public class PersonException extends Exception {
	private Person Person;
	
	public PersonException(){
		super();
	}
	
	public PersonException(Person p){
		super("Error");
		this.Person=p;
	}
	

}
