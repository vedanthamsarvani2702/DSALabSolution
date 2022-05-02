package com.DSALabSolution.Driver;
import java.util.*;


public class Q2DriverApplication {
static class Node{
	int data;
	Node left,right;
	Node(int data){
		this.data=data;
		left=null;
		right=null;
		
	}
}
static boolean traversal(Node node,int sum,HashSet<Integer> set) {
	if(node==null) {
		return false;
		
	}
	if(traversal(node.left,sum,set))
	{
		return true;
	}
	if(set.contains(sum-node.data))
{
		System.out.println("Pair : (" + (sum - node.data) + "," + node.data + ")" );
	return true;
	
}
	else
	{
		set.add(node.data);
	}
	

	if(traversal(node.right,sum,set))
	{
		return true;
		
	}
	return false;
	
}
public static void main(String args[])
{
	HashSet<Integer> iteration= new HashSet<Integer>();
	int sum=0;
	System.out.println("Enter Sum ");
	Scanner sc=new Scanner(System.in);
	sum=sc.nextInt();
	
	Node root=new Node(40);
	Node left=new Node(20);
	Node right=new Node(60);
	Node leftLeft=new Node(10);
	Node leftRight = new Node(30);
	Node rightLeft=new Node(50);
	Node rightRight = new Node(70);
	
	root.left=left;
	root.right=right;
	left.left=leftLeft;
	left.right=leftRight;
	right.left=rightLeft;
	right.right=rightRight;
	
	
	boolean binarySearch = traversal(root,sum,iteration);
	if(binarySearch == false) {
		System.out.println("pair not found");
	}
			
}
}
