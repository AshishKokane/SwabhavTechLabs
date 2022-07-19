package com.aurionpro.test;

import java.util.Iterator;

public class CustomLinkedList<T> implements Iterable<T> {
	Node head;

	public void add(T data) {
		if (head == null) {
			head = new Node(data);
			return;
		}
		Node current = head;
		while (current.next != null) {
			current = current.next;
		}

		current.next = new Node(data);

	}

	public void atstart(T data) {
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;

	}

	public int indexOf(T o) {

		int index = 0;
		if (o == null) {
			for (Node<T> x = head; x != null; x = x.next) {
				if (x.data == null)
					return index;
				index++;
			}
		} else {
			for (Node<T> x = head; x != null; x = x.next) {
				if (o.equals(x.data))
					return index;
				index++;
			}
		}
		return -1;
	}

	public void remove(T data) {
		if (head == null)
			return;

		if (head.data == data) {
			head = head.next;
			return;
		}

		Node current = head;
		while (current.next != null) {
			if (current.next.data == data) {
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}

	}

	public void display() {

		Node current = head;

		if (head == null) {
			System.out.println("[]");
			return;
		}

		while (current != null) {

			System.out.print(current.data + " ");
			current = current.next;

		}
		System.out.println();

	}

	public Iterator<T> iterator() {
		return new Iterator<T>() {
			Node current = head;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public T next() {
				if (hasNext()) {
					T data = (T) current.data;
					current = current.next;
					return data;
				}
				return null;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException("Remove not implemented.");
			}

		};

	}

}
