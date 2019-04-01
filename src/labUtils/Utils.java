package labUtils;

import java.util.Iterator;

import treeClasses.ElementsIterator;
import treeClasses.LinkedBinaryTree;
import treeClasses.LinkedTree;
import treeInterfaces.Position;
import treeInterfaces.Tree;

public class Utils {
	public static <E> void displayTree(String msg, Tree<E> t) { 
		System.out.println("\n\n" + msg); 
		t.display(); 
	}

	public static <E> void displayTreeElements(String msg, Tree<E> t) {
		System.out.println("\n\n" + msg); 
		for (E element : t)
			System.out.println(element); 
		
	}
	
	public static LinkedTree<Integer> buildExampleTreeAsLinkedTree() { 
		LinkedTree<Integer> t = new LinkedTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position posc9 = t.addChild(t.root(),9 );
		t.addChild(posc9,7);
		t.addChild(posc9,10);
		Position posc20 = t.addChild(t.root(),20 );

		Position pos15 =  t.addChild(posc20, 15);
		Position pos12 =  t.addChild(pos15, 12);
		Position pos17 =  t.addChild(pos15, 17);
		Position pos19 =  t.addChild(pos17, 19);
		
		Position pos21 =  t.addChild(posc20, 21);
		Position pos40 =  t.addChild(pos21, 40);
		t.addChild(pos40, 30);
		t.addChild(pos40, 45);

		return t; 
	}
	
	public static LinkedBinaryTree<Integer> buildExampleTreeAsLinkedBinaryTree() { 
		LinkedBinaryTree<Integer> t = new LinkedBinaryTree<>(); 
		// ADD CODE AS SPECIFIED IN EXERCISE 2
		t.addRoot(4);
		Position posc9 = t.addLeft(t.root(),9 );
		t.addLeft(posc9,7);
		t.addRight(posc9,10);
		Position posc20 = t.addRight(t.root(),20 );

		Position pos15 =  t.addLeft(posc20, 15);
		Position pos12 =  t.addLeft(pos15, 12);
		Position pos17 =  t.addRight(pos15, 17);
		Position pos19 =  t.addLeft(pos17, 19);
		
		Position pos21 =  t.addRight(posc20, 21);
		Position pos40 =  t.addRight(pos21, 40);
		t.addLeft(pos40, 30);
		t.addRight(pos40, 45);
		
		return t; 
	}
	public static <E> void displayIter(String msg, Iterator<E> iter) { 
	    System.out.println(msg); 
	    while (iter.hasNext()) 
	         System.out.println(iter.next()); 
	} 
	public static LinkedTree<Character> buildTrieAsLinkedTree() { 
		   //String[] words = {"sal", "sala", "salado", "salto", "si", "u", "un", "uno"}; 

		   
		   String[] words = {"aleluya", "aleluyado", "aleta", "aletas", "alerta", 
		        "alertado", "altercado", "altercados", "altura", "alturo", "alturito", 
		         "balacera", "bala", "balas", "bala", "balon", "barato"};
		   
		        
		   LinkedTree<Character> t = new LinkedTree<>(); 
		   Position<Character> p = t.addRoot('['); 
		   for (String s : words)
		    addWordToTrie(t, p, s, 0);   // auxiliary method below
		            
		   return t; 
		}
		    
		private static void addWordToTrie(LinkedTree<Character> t, 
		        Position<Character> r, String s, int index) {
		   if (index == s.length()) 
		    t.addChild(r,  ']'); 
		   else { 
		      Position<Character> pcc = null;   // position in children of r containing s[index] 
		    for (Position<Character> p : t.children(r))
		       if (p.getElement().equals(s.charAt(index))) pcc = p; 
		    if (pcc == null)
		       r = t.addChild(r, s.charAt(index)); 
		    else 
		       r = pcc;
		    addWordToTrie(t, r, s, index+1); 

		   }
		}

}
