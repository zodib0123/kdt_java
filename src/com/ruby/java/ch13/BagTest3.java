package com.ruby.java.ch13;

class Bag3<T extends Solid> {
	private T thing;
	private String owner;
	
	public Bag3(T thing) {
		this.thing = thing;
	}
	
	public T getThing() {
		return thing;
	}
	
	public void setThing(T thing) {
		this.thing = thing;
	}
	
	public String getOwner() {
		return owner;
	}
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	boolean isSameOwner(Bag3<?> obj) {
		if(this.owner.equals(obj.getOwner()))
			return true;
		return false;
	}
	
	void showType() {
		System.out.println("T의 타입은 " + thing.getClass().getName());
	}
}

class Solid {}
class Liquid {}

class Book3 extends Solid{}
class PencilCase3 extends Solid{}
class Notebook3 extends Solid{}

class Water extends Liquid {}
class Coffee extends Liquid {}

public class BagTest3 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bag3<Book3> bag = new Bag3<>(new Book3());
		Bag3<PencilCase3> bag2 = new Bag3<>(new PencilCase3());
		Bag3<Notebook3> bag3 = new Bag3<>(new Notebook3());
		
		//Bag3<Water> bag4 = new Bag3<>(new Water());
		//Bag3<Coffee> bag4 = new Bag3<>(new Coffee());
		
		bag.setOwner("김푸름");
		bag2.setOwner("김푸름");
		
		boolean result = bag.isSameOwner(bag2);
		if(result) System.out.println("소유자가 동일합니다.");
		else System.out.println("소유자가 다릅니다.");
	}
}
