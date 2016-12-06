package com.kvvssut.ejb.remote;

import javax.ejb.Remote;

@Remote
public interface MyTimerRemote {

	public void fireMePeriodically();
	
}
