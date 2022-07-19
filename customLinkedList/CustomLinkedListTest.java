package com.aurionpro.model;

import com.aurionpro.test.CustomLinkedList;

public class CustomLinkedListTest {

	public static void main(String[] args) {

		CustomLinkedList<Integer> cl = new CustomLinkedList<Integer>();
		cl.add(2);
		cl.add(3);
		cl.atstart(1);
		cl.add(4);
		cl.add(5);

		System.out.println("----integer linked list---------");
		System.out.println();

		System.out.print("Linked List :=  ");
		cl.display();

		System.out.print("Index values :=");
		cl.forEach(n -> System.out.print(" " + cl.indexOf(n)));
		System.out.println();
		System.out.println("-----------------------------------");
		System.out.println("removing node with value 3 below");
		cl.remove(3);
		System.out.print("Linked List :=  ");
		cl.display();
		System.out.print("Index values :=");
		cl.forEach(n -> System.out.print(" " + cl.indexOf(n)));
		System.out.println();
		System.out.println("------------------------------------");
		System.out.println();

		System.out.println("----String linked list---------");
		System.out.println();

		CustomLinkedList<String> cll = new CustomLinkedList<String>();
		cll.add("b");
		cll.add("c");
		cll.atstart("a");
		cll.add("d");
		cll.add("e");

		System.out.print("Linked List :=  ");
		cll.display();

		System.out.print("Index values :=");
		cll.forEach(n -> System.out.print(" " + cll.indexOf(n)));
		System.out.println();

		System.out.println("------------------------------------");
		System.out.println("removing node with data e below");
		cll.remove("e");
		System.out.print("Linked List :=  ");
		cll.display();
		System.out.print("Index values :=");
		cll.forEach(n -> System.out.print(" " + cll.indexOf(n)));
		System.out.println();

		System.out.println("printing index value of data not present ");
		System.out.println(cll.indexOf("i"));

		System.out.println("printing using enhance for loop which invokes iterator !!");

		for (String node : cll)
			System.out.print(" " + node);

	}

}
