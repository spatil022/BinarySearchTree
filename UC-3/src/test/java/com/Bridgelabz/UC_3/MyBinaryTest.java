package com.Bridgelabz.UC_3;


import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTest {

	//UC1
	@Test
	public void added3Numbers_IntoBST() {
		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		int size = bst.getSize();
		Assert.assertEquals(3, size);
	}

	//UC2
	@Test
	public void addingNumbers_moreThan3_ToBST() {
		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(60);
		bst.add(95);
		bst.add(65);
		bst.add(63);
		bst.add(67);
		bst.add(40);
		bst.add(22);
		bst.add(11);
		bst.add(16);
		bst.add(3);
		int size = bst.getSize();
		Assert.assertEquals(13, size);
	}

	//UC3
	@Test
	public void searchForNode_InTheBST() {
		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		bst.add(60);
		bst.add(95);
		bst.add(65);
		bst.add(63);
		bst.add(67);
		bst.add(40);
		bst.add(22);
		bst.add(11);
		bst.add(16);
		bst.add(3);
		boolean result = bst.searchNode(bst.rootNode, 63);
		Assert.assertEquals(true, result);
	}
}