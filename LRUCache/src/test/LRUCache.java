package test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class LRUCache {
	 Set<Integer> cache;
	    int capacity;
	  
	    public LRUCache(int capacity)
	    {
	        this.cache = new LinkedHashSet<Integer>(capacity);
	        this.capacity = capacity;
	    }
	  
			
		 public boolean get(int key) {
			 
			 if(!cache.contains(key))
				 return false;
			 
			 cache.remove(key);
			 cache.add(key);
			 return true;
		 }
		 public void refer(int key)
		    {        
		        if (get(key) == false)
		           put(key);
		    }
		  public void display()
		    {
		      LinkedList<Integer> list = new LinkedList<>(cache);
		        
		      // The descendingIterator() method of java.util.LinkedList
		      // class is used to return an iterator over the elements
		      // in this LinkedList in reverse sequential order
		      Iterator<Integer> itr = list.descendingIterator(); 
		        
		      while (itr.hasNext())
		            System.out.print(itr.next() + " ");
		    }
		      
	
		 public void put(int key) {
			 if(cache.size() == capacity) {
				 int last = cache.iterator().next();
				 cache.remove(last);
			 }
			 cache.add(key);
		 }
	
	public static void main(String[] args) {
		LRUCache ca = new LRUCache(4);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();

	}

}
