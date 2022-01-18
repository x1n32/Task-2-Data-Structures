package github.x1n32;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Iterator;


/**WHAT THIS DOES:
 * Showcasing basic ARRAY LIST AND LINKED LIST operations
 * using Iterator to go through the list as well.
 * -Methods: add(), get(), remove(), set()
 * Covering GENERICS too, which are <Integer> or <String> etc 
 * 
 * --------------------
 * ABOUT ARRAYLIST AND LINKED LISTS
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
 * Use an ArrayList for storing and accessing data,
 *  and LinkedList to manipulate data.
 * ---------
 * 
 * 
 */
public class ListExample {


    /**
     * Linked List
     * Takes the first LINKED list and copies it into the second list with a shfit of the number you put in.
     * @param al
     * @param al2
     * @param shift
     */
	private static void cyclicRotate(LinkedList<String> list, LinkedList<String> list2, int shift) {
       //ITERATOR is another way of going through the list.
       //Returns items in the list, not index
        Iterator<String> it = list.iterator();  
        int index = 0;

        if (shift <= 0){ 
            shift = 1;
            System.out.println("Please enter a shift of 1 or higher please. ");
        }
 
        //While it is not the end of the list
        while (it.hasNext()){
            //System.out.println(index);

            //Copy item from position + shift. 
            //% Modulus so we get the remainder when it goes over the size of the list
            index = (index + shift) %  list.size();
            list2.add(list.get(index));
            it.next();
        }
    }

    /**
     * ARRAY LIST - using iterator to calculate cumulative total and average.
     * @param aList
    */
    private static void statistics(ArrayList<Integer> aList ){
        Iterator<Integer> it = aList.iterator();
        int cumulative = 0;
        while (it.hasNext()){
            cumulative += it.next();
        }
        System.out.println("Cumulative total: " + cumulative);
        float average = cumulative / aList.size();
        System.out.println("Average: " + average);


    }
    
    public static void main(String[] args) throws Exception{
        System.out.println("\n ------------- \n");

        //Creating an list of integer values. Notice int is spelt Integer here as it is a wrapper.
        ArrayList<Integer> testScores = new ArrayList<>();
        testScores.add(99);
        testScores.add(3);
        testScores.add(40);
        testScores.add(66);
        testScores.add(87);
        testScores.add(34);
        System.out.println("Array List: " + testScores);
        testScores.set(0, 94);
        testScores.remove(1);
        System.out.println("New Array List: " + testScores);
        statistics(testScores);
        
        System.out.println("\n\n ------------- \n");
        //Creating a list of String values. Notice the capital.
        LinkedList<String> shoppingList = new LinkedList<>();
        shoppingList.add("milk");
        shoppingList.add("bread");
        shoppingList.add("cheese");
        shoppingList.add("cookies");
        shoppingList.add("Cake");
        shoppingList.add("Doughnuts");

        System.out.println("Linked List: " + shoppingList);
        System.out.println("Item one: " + shoppingList.get(0));
        shoppingList.set(0, "Juice");
        System.out.println("The new Item one: " + shoppingList.get(0));
        shoppingList.remove(0);
        System.out.println("Remove last item one. New Item one: " + shoppingList.get(0));
        LinkedList<String> newList = new LinkedList<>();
        cyclicRotate(shoppingList, newList, 1);
        System.out.println(shoppingList);
        System.out.println(newList);
    }

}
