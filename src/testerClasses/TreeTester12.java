package testerClasses;

import labUtils.Utils;
import treeClasses.LevelsCountPairIterator;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedBinaryTree2;
import treeClasses.LinkedTree;

public class TreeTester12 {
	   public static  <E extends Comparable<E>> void main(String[] args) { 
		     // LinkedBinaryTree2<> t = new LinkedBinaryTree2<>();   
		   LinkedBinaryTree2<E> t = new LinkedBinaryTree2<>(); 
				
				t.insert((E)(Object)15); 
				t.insert((E)(Object)12);
				t.insert((E)(Object)10); 
				t.insert((E)(Object)20); 
				t.insert((E)(Object)17); 
				t.insert((E)(Object)4); 
				t.insert((E)(Object)9); 
				t.insert((E)(Object)45); 
				t.insert((E)(Object)30); 
				t.insert((E)(Object)7); 
				t.insert((E)(Object)19); 
				t.insert((E)(Object)21); 
				t.insert((E)(Object)40); 

		    // display content as a tree
		    Utils.displayTree("The structure of the tree is: ", t);
		        
		    LevelsCountPairIterator<E> iter = 
		               new LevelsCountPairIterator<E>(t);
		    Utils.displayIter("Pairs (level, nodes at level): ", iter);
		   }
		}