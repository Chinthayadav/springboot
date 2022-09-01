package com.chintha.spring.springboot.Reftype;

public class Shippingcart {
	
	private Items items;

	public Items getItems() {
		return items;
	}

	public void setItems(Items items) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Shippingcart [items=" + items + "]";
	}
	
	

}
