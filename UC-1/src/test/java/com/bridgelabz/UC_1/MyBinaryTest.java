package com.bridgelabz.UC_1;

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
}
