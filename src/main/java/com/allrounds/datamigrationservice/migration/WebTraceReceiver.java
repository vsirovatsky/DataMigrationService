package com.allrounds.datamigrationservice.migration;

import force.ITraceReciever;

public class WebTraceReceiver implements ITraceReciever {

	@Override
	public void println(String text) {
		System.out.println("INFO: " + text);
	}

	@Override
	public void error(String text) {
		System.out.println("ERROR: " + text);
	}

}
