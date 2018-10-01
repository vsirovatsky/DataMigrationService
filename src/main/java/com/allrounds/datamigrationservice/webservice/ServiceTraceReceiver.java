package com.allrounds.datamigrationservice.webservice;

import java.util.ArrayList;
import java.util.List;

import force.ITraceReciever;

public class ServiceTraceReceiver implements ITraceReciever {
	
	private List<String> messages = new ArrayList<String>();
	private List<String> errors = new ArrayList<String>();

	@Override
	public void println(String text) {
		this.messages.add( text );
	}

	@Override
	public void error(String text) {
		this.errors.add( text );
	}
	
	public List<String> getMessages(){
		return this.messages;
	}
	
	public List<String> getErrors(){
		return this.errors;
	}
}
