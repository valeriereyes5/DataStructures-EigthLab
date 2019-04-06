package treeClasses;

public class Pair<E,E1> {
	
		private E first; 
		private E1 second; 
		public E first() { return first;}
		public void first(E first) { this.first = first;}
		public E1 second() { return second;}
		public Pair(E first, E1 second) {
	         super();  
	         this.first = first;  
	         this.second = second; 
	       }
		public Pair() {}
	public String toString() {
		String s = " "+first+" "+second;
		return s;
	}

}
