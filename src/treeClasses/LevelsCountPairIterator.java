package treeClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

import treeInterfaces.Position;

public class LevelsCountPairIterator<E> implements Iterator<Pair<Integer, Integer>>{

	private int level = 0;
	ArrayList<Integer> list = new ArrayList<>(); 

	public LevelsCountPairIterator(LinkedTree<E> t) { 
		Iterator<E> iter = t.iterator();
		if (!t.isEmpty()) {
			
			while(iter.hasNext()) {
				list.add(0);
				iter.next();
			}
			fill(t, t.root(), 0); 

		}
	}

	public LevelsCountPairIterator(LinkedBinaryTree<E> t) {
		// TODO Auto-generated constructor stub
		Iterator<E> iter = (Iterator<E>) t.iterator();
		if (!t.isEmpty()) {
			
			while(iter.hasNext()) {
				list.add(0);
				iter.next();
			}
			fill(t, t.root(), 0); 

		}
	}

	private void fill(LinkedBinaryTree<E> t, Position<E> r, int level2) {
		// TODO Auto-generated method stub
		if(t.isRoot(r)) {
			list.set(0, 1);

		}else{
			list.set(level2, list.get(level2)+1);
		}
		
		for(Position<E> p: t.children(r)) {
			 fill(t, p, level2+1);
		}
		list.remove((Object)0);
		
	}

	// fill list using a preorder traversal of tree so that it ends 
	// having size equal to the number of levels in t, and where its
	// i-th element is the number of nodes at level i. 
	private void fill(LinkedTree<E> t, Position<E> r, int level) { 
		// ADD CODE HERE.... TO PROPERLY FILL LIST
		if(t.isRoot(r)) {
			list.set(0, 1);

		}else{
			list.set(level, list.get(level)+1);
		}
		
		for(Position<E> p:t.children(r)) {
			 fill(t, p, level+1);
		}
		list.remove((Object)0);

	} 

	public boolean hasNext() {
		return level < list.size(); 
	}

	public Pair<Integer, Integer> next() {
		if (!hasNext()) throw new NoSuchElementException("No more pairs."); 
		Pair<Integer, Integer> p = new Pair<>(level, list.get(level)); 
		level++; 
		return p;
	}

}



