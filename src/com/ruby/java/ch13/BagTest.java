//package com.ruby.java.ch13;
//
//class Bag {
////class Bag<T> {
////	private T thing;
////	
////	public Bag(T thing) {
////		this.thing = thing;
////	}
////	
////	public T getThing() {
////		return thing;
////	}
////	
////	public void setThing(T thing) {
////		this.thing = thing;
////	}
////	
////	void showType() {
////		System.out.println("T의 타입은 " + thing.getClass().getName());
////	}
//	private Object thing;
//	
//	public Bag(Object thing) {
//		this.thing = thing;
//	}
//	
//	public Object getThing() {
//		return thing;
//	}
//	
//	public void setThing(Object thing) {
//		this.thing = thing;
//	}
//	
//	void showType() {
//		System.out.println("T의 타입은 " + thing.getClass().getName());
//	}
//}
//
//class Book {}
//class PencilCase {}
//class Notebook {}
//
//public class BagTest {
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
////		Bag<Book> bag = new Bag<>(new Book());
////		Bag<PencilCase> bag2 = new Bag<>(new PencilCase());
////		Bag<Notebook> bag3 = new Bag<>(new Notebook());
////		
////		bag.showType();
////		bag2.showType();
////		bag3.showType();
//		Bag bag = new Bag(new Book());
//		Bag bag2 = new Bag(new PencilCase());
//		Bag bag3 = new Bag(new Notebook());
//		
////		Book book = bag.getThing();
////		PencilCase pc = bag2.getThing();
////		Notebook nb = bag3.getThing();
//		Book book = (Book) bag.getThing();
//		PencilCase pc = (PencilCase) bag2.getThing();
//		Notebook nb = (Notebook) bag3.getThing();
//		
//		bag = bag2;
//	}
//}
