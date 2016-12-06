package com.kvvssut.ejb.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Remove;
import javax.ejb.Stateful;

import com.kvvssut.ejb.remote.ShoppingCartRemote;

@Stateful
public class ShppingCartBean implements ShoppingCartRemote {

	@Override
	public void addToCart() {
		// TODO Auto-generated method stub

	}

	@Override
	@Remove
	public void remove() {
		// TODO Auto-generated method stub

	}
	
	@PostConstruct
	private void method1() {
	}

	@PreDestroy
	private void mehtod2() {
		remove();
	}
}
