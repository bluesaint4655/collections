import java.util.*;
class CustomList<E> {
 
    
    private static final int INITIAL_CAPACITY = 10;
    private int size = 0;
    private Object elementData[] = {};
 
    public CustomList() {
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
           if (index < 0 || index >= size) {
                  throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                               + index);
           }
           return (E) elementData[index];
    }
 

    public Object remove(int index) {
        if (index < 0 || index >= size) {
                  throw new IndexOutOfBoundsException("Index: " + index + ", Size "
                               + index);
           }
 
           Object removedElement = elementData[index];
           for (int i = index; i < size - 1; i++) {
                  elementData[i] = elementData[i + 1];
           }
           size--; 
 
           return removedElement;
    }
 

    private void ensureCapacity() {
           int newIncreasedCapacity = elementData.length * 2;
           elementData = Arrays.copyOf(elementData, newIncreasedCapacity);
    }
 

    public void display() {
           System.out.print("Displaying list : ");
           for (int i = 0; i < size; i++) {
                  System.out.print(elementData[i] + " ");
           }
    }
 
}

public class MyList {
     
    public static void main(String... a) {
           CustomList<Integer> clist = new CustomList<Integer>();
           //Add elements in customList
           clist.add(1);
           clist.add(2);
           clist.add(3);
           clist.add(4);
           clist.add(5);
           clist.add(6);
           clist.add(7);
           clist.add(8);
           clist.add(9);
           clist.add(10); 
 
           //Display customList
           clist.display();
           System.out.println("\ncustom list at index 2 : " +clist.get(2));
 
           //Remove element from custom List
           clist.remove(2);
 
           //Again display custom List
           System.out.println("\nCustom list after deletion of element at index 2");
 
           clist.display();

    }
    
}
