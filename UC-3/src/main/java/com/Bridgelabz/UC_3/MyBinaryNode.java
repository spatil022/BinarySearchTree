package com.Bridgelabz.UC_3;

public class MyBinaryNode<K extends Comparable<K>> {
	K key;
	MyBinaryNode<K> leftchild;
	MyBinaryNode<K> rightchild;

	public MyBinaryNode(K key) {
		this.key = key;
		this.leftchild = null;
		this.rightchild = null;
	}
}