import java.util.LinkedList;
import java.util.Collection;

public class labsheetq1{
    public static void main(String[] args){
        Collection<Integer> c = new LinkedList<>();
        
        // Adding elements to the collection
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        
        // Removing the element '40'
        c.remove(Integer.valueOf(40));
        
        // Checking if the collection is empty
        System.out.println("Is the collection empty? " + c.isEmpty());
        
        // Printing the size of the collection
        System.out.println("Size of the collection: " + c.size());
        
        // Checking if the collection contains the element '30'
        int elementToCheck = 30;
        System.out.println("Does the collection contain " + elementToCheck + "? " + c.contains(elementToCheck));

        // Printing the elements in the collection
        System.out.println("Elements in the collection after removal: " + c);
    }
}