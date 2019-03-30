package testerClasses;
import labUtils.Utils;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
public class CloneTester {
	
	public static void main(String[] args) {
		LinkedTree<Integer> t = Utils.buildExampleTreeAsLinkedTree();

		// display content as a tree
		Utils.displayTree("The structure of the tree is: ", t);

		// display elements as a list
		Utils.displayTreeElements("The elements of the tree are: ", t);


		LinkedTree<Integer> t2 = null;
		try {
			t2 = t.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		Utils.displayTree("The structure of the tree is: ", t2);

		Utils.displayTreeElements("The elements of the tree are: ", t2);
	}
}
