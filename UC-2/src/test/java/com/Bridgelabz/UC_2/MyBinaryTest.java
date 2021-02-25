package com.Bridgelabz.UC_2;


import org.junit.Assert;
import org.junit.Test;
public class MyBinaryTest {
	@Test
	public void added3Numbers_IntoBST() {
		MyBinaryTree<Integer> bst = new MyBinaryTree<>();
		bst.add(56);
		bst.add(30);
		bst.add(70);
		int size = bst.getSize();
		Assert.assertEquals(3, size);
	}

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
}