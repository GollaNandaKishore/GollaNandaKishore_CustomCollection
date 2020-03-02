package Collections;

import java.util.Arrays;

public class CustomCollection 
{
	     
	      public static void main(String...a) 
	      {
	           CustomArrayList<String> list = new CustomArrayList<String>();
	     list.add("red");
	     list.add("yellow");
	     list.add("white");
	     list.add(("black"));
	     list.add(("red"));
	     list.add(("pink"));
	     list.add("blue");
	     list.add("green");
	     list.add("gray");
	     list.add("Yellow");
	     list.display();
	list.add("red");
	System.out.println("Adding 11th element:");
	list.display();
	System.out.println("element at index "+1+" = "+list.get(1));
	System.out.println("element at index "+5+" = "+list.get(5));
	list.remove(1);
	System.out.println("List elements after removing element at index 1:");
	list.display();
	     
	      }

}
class CustomArrayList<E> {
    
	  private static int INITIAL_CAPACITY = 10;
	  private Object elementData[]={};
	  public int size = 0;
	  public CustomArrayList() {
	    elementData = new Object[INITIAL_CAPACITY];
	  }
	  public void add(E e) {
	    if (size == elementData.length) {
	      ensureCapacity();
	    } 
	    elementData[size++] = e;
	  }
	  @SuppressWarnings("unchecked")
	public E get(int index) {
	    if ( index <0 || index>= size) { 
	      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
	    }
	    return (E) elementData[index];
	  }
	  public Object remove(int index) {
	    if ( index <0 || index>= size) {
	      throw new IndexOutOfBoundsException("Index: " + index + ", Size " + index);
	    }
	   
	    Object removedElement=elementData[index];
	    for(int i=index;i<size - 1;i++){
	       elementData[i]=elementData[i+1];
	    }
	    size--;  
	   
	    return removedElement;
	  }
	  private void ensureCapacity() {
	    int newIncreasedCapacity = elementData.length * 2;
	    elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
	  }
	  public void display() {
	      System.out.print("[");
	      for(int i=0;i<size;i++){
	             System.out.print(elementData[i]+" ");
	      }
	      System.out.print("]");
	System.out.println();
	  }
	 
	}
