package com.ruby.java.ch08;

class LinkedList2 {

	private Node head = null;

	private class Node {
		private String data;
		private Node link;

		public Node(String data) {
			this.data = data;
		}
	}

	public void add(String data) {
		Node nNode = new Node(data);
		if (head == null) {
			head = nNode;
		} else {
			Node next = head;
			while (next.link != null) {
				next = next.link;
			}
			next.link = nNode;
		}
	}

	public void print() {
		if (head == null) {
			System.out.println("노드가 비었습니다.");
		} else {
			Node next = head;
			while (next != null) {
				System.out.println(next.data);
				next = next.link;
			}			
		}
	}
	
	public void delete(String data) {
		if (head == null) {
			System.out.println("노드가 비었습니다.");
		} else {
			Node next = head;
			Node temp = next;
			while (next != null) {
				if (next.data.equals(data)) {
					temp.link = next.link;
					break;
				} else {					
					temp = next;
					next = next.link;
				}
			}
		}
	}
}
public class 실습_내부클래스_linkedlist_과제 {
	public static void main(String[] args) {
		LinkedList2 myList = new LinkedList2();
		myList.print();

		myList.add("11");
		myList.add("55");
		myList.add("77");
		myList.add("177");
		myList.add("33");
		myList.print();
		myList.delete("33");
		System.out.println("삭제후 출력: ");
		myList.print();
		//Node ndx = new Node("kim");
		//MyLinkedList.Node nd = myList.new Node("Hong");		//not visible
		//nd.data = "hello";
	}
}
