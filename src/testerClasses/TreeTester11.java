package testerClasses;

import labUtils.Utils;
import treeClasses.LevelsCountPairIterator;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;

public class TreeTester11 {
	   public static <E> void main(String[] args) { 
		      LinkedBinaryTree<E> t = (LinkedBinaryTree<E>) Utils.buildExampleTreeAsLinkedBinaryTree();  

		    // display content as a tree
		    Utils.displayTree("The structure of the tree is: ", t);
		        
		    LevelsCountPairIterator<E> iter = 
		               new LevelsCountPairIterator<E>(t);
		    Utils.displayIter("Pairs (level, nodes at level): ", iter);
		   }
		}