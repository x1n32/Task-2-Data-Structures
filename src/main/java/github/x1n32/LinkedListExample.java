package github.x1n32;
import java.util.LinkedList;

import java.util.Iterator;


/**ABOUT ARRAYLIST AND LINKED LISTS
 * The ArrayList class is a resizable array,
 * which can be found in the java.util package.
 * The difference between a built-in array and an ArrayList in Java, 
 * is that the size of an array cannot be modified 
 * (if you want to add or remove elements to/from an array, 
 * you have to create a new one).
 * While elements can be added and removed from an ArrayList whenever you want.
 * 
 * The LinkedList class has all of the same methods as the ArrayList 
 * class because they both implement the List interface.
 *  This means that you can add items, change items, remove items 
 * and clear the list in the same way.
 * ------
 * SIMILARITES AND DIFFERENCES
 * The LinkedList stores its items in "containers."
 *  The list has a link to the first container and each container
 *  has a link to the next container in the list. 
 * To add an element to the list, the element is placed into a 
 * new container and that container is linked to one 
 * of the other containers in the list.
 * -----
 * WHEN TO USE:
 * Use an ArrayList for storing and accessing data, and LinkedList to manipulate data.
 */
public class LinkedListExample {

	private static void cyclicRotate(LinkedList<String> al, LinkedList<String> al2, int shift) {
        Iterator<String> it = al.iterator();
        int index = 0;
 
        while (it.hasNext()){
            System.out.println(index);
            index = (index + shift) % al2.size();
            al2.add(al.get(index));
            it.next();
            if (index <= 0){ index = 1; shift = 1;}
            
        }
    }
    
    public static void main(String[] args) throws Exception{

        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("milk");
        shoppingList.add("bread");
        shoppingList.add("cheese");
        shoppingList.add("cookies");
        shoppingList.add("Cake");
        shoppingList.add("Doughnuts");

        System.out.println(shoppingList.get(0));
        shoppingList.set(0, "Juice");
        System.out.println(shoppingList.get(0));
        shoppingList.remove(0);
        System.out.println(shoppingList.get(0));

        LinkedList<String> newList = new LinkedList<>();
        System.out.println("Hello?");
        System.out.println(shoppingList);
        cyclicRotate(shoppingList, newList, -2);
        System.out.println("Cycling");
        System.out.println(shoppingList);
        System.out.println(newList);
    }

}
