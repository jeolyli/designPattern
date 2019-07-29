package com.me.structure.composite;
/** 
* @author jialili 
*/
public class Tree {
	
	TreeNode root = null;
	
	public Tree(String name) {
		root = new TreeNode(name);
	}
	
	public static void main(String[] args) {
		Tree tree = new Tree("a");
		TreeNode nodeb = new TreeNode("b");
		TreeNode nodec = new TreeNode("c");
		
		nodeb.add(nodec);
		tree.root.add(nodeb);
		
		
	}

}
