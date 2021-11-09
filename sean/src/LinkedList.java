
/**
 * Write a description of class LinkedList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LinkedList<E>{
    private Node<E> head, tail;
    public LinkedList()
    {
        head = null;
        tail = null;
    }
    public void append(E item) {
    
	Node<E> newNode = new Node<>(item); 

    if (head == null) {
      head = tail = newNode; 
    }
    else {
      tail.next = newNode; 
      tail = newNode; 
    }
  }
  public E getMax(){
      Node<E>ptr = head.next;
      E max = head.element;
      while(ptr != null)
      {
          E ptr2 = ptr.element;
          if (((Comparable)ptr2).compareTo(max)> 0)
          
          {
              max = ptr2;
            }
            ptr = ptr.next;
        }
      return max;
    }
    public static class Node<E>{
    
        E element;
        Node<E>next;
       public Node(E elements)
     {
        this.element = element;
        next = null;
     }
    }
    public String toString() {
    String result = "[";

    Node<E> ptr = head;
    for (ptr= head;ptr!=null; ptr=ptr.next) 
	{
		 result = result +  ptr.element.toString();     
		 if (ptr.next != null)
             result = result + ","; // add commas but not to the final 1   
	}
    result += "]";
    return result;
  }
  
     public void clear() {
     head = tail = null;
  }
}
