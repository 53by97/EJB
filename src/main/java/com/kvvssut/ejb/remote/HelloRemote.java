package com.kvvssut.ejb.remote;

import javax.ejb.Remote;


@Remote
public interface HelloRemote {

	public String displayString(String message);
}
