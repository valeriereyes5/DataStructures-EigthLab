package testerClasses;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import labUtils.Utils;
import treeInterfaces.Position;
public class BinaryTreeCloneTester {
	public static void main(String[] args) {
		LinkedBinaryTree<Integer> t = Utils.buildExampleTreeAsLinkedBinaryTree();

		// display content as a tree
		Utils.displayTree("The structure of the tree is: ", t);

		// display elements as a list
		Utils.displayTreeElements("The elements of the tree are: ", t);


		LinkedBinaryTree<Integer> t2 = null;
		try {
			t2 = t.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Utils.displayTree("The structure of the tree is: ", t2);

		Utils.displayTreeElements("The elements of the tree are: ", t2);
	}
}

