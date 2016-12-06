package com.kvvssut.ejb.remote;

import javax.ejb.Remote;
import javax.ejb.Remove;

@Remote
public interface ShoppingCartRemote {

	public void addToCart();
	
	@Remove
	public void remove();
}
