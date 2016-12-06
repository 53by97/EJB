package com.kvvssut.ejb.local;

import javax.ejb.Local;

@Local
public interface HelloLocal {

	public String displayString(String message);
}
