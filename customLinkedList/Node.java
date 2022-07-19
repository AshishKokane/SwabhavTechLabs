package com.aurionpro.test;

public class Node<T> {

	Node next;
	T data;

	public Node(T data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public T getData() {
		return data;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public void setData(T data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Node [next=" + next + ", data=" + data + "]";
	}

}
