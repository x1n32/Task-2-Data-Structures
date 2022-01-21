package github.x1n32;
import java.util.HashMap;


/*
 * HashMap store items in "key/value" pairs, 
 * and you can access them by an index of another type (e.g. a String)
 * 
 * HashMap is mainly the implementation of hashing.
 *  It is useful when we need efficient implementation of search, insert and delete operations. 
 */


 /** -------------------
  * TASK: Read the code and comment it. Have a guess at what will be the output
  * TASK2: After you predict what is happening, find the error and fix it.
  *----------------------
  * 
  * CHALLENGE: Add a new method that searches a hashmap for keys with empty values.
  *     Then add the string "Unknown Description" for its value.

  *  CHALLENGE2 : Create a Hash Map with suitable Generics for the commented code below.
  * 
  */
public class HashMapExercise {

    public static void displayKeys (HashMap<String, String> hMap){
        System.out.println(hMap.keySet());
        //TO DO: COMMENT WHAT YOU THINK IT DOES:
    }
    public static void displayValues (HashMap<String, String> hMap){
        System.out.println(hMap.values());
        //TO DO: COMMENT WHAT YOU THINK IT DOES:
    }
    public static void displayFindDes (HashMap<String, String> hMap, String DesToFind){
        System.out.println(hMap.get(DesToFind));
        //TO DO: COMMENT WHAT YOU THINK IT DOES:
    }
    public static void displayHashMap (HashMap<String, String> hMap){
        for (String i : hMap.keySet()) {
            System.out.println(	"-----\nkey: " + i + "\n value: " + hMap.get(i) + "\n-----");
        }
        //TO DO: COMMENT WHAT YOU THINK IT DOES:
    }

    public static void changeDescription (HashMap<String, String> hMap, String key, String newDescription){
        System.out.println(hMap.put("Wooden Shield", newDescription));
        //TO DO: COMMENT WHAT YOU THINK IT DOES:
    }




    public static void findAndReplaceEmptyValue (HashMap<String, String> hMap){
        //CHALLENGE: Loop through the hash map for empty values (descriptions) and replace it with "Unknown Description"
        for (String i : hMap.keySet()) {
            if (hMap.get(i) == "" || hMap.get(i) == null ){
                System.out.println("empty description found!");
                hMap.put(i, "Unknown Description");
            }
        }
    }

    public static String createNewHashMap (){
        //CHALLENGE 2: Create a Hash Map with suitable Generics for the commented code below.

        //Create new Hash map here:
        HashMap<Integer, String> name = new HashMap<>();


        name.put(0,"Abby"); //Don't change these.
        name.put(1,"Becky");
        return(name.get(1));

    }




    public static void main(String[] args){
        //Creating a HashMap with String generics.
        HashMap<String, String> ItemDescriptions = new HashMap<>();

        //Adding values to the HashMap
        ItemDescriptions.put("Rusty Sword", "Weak and Rusty. Perhaps a bit of polish would make it shine");
        ItemDescriptions.put("Rusty Dagger", "Weak and Rusty. Perhaps a bit of polish would make it shine");
        ItemDescriptions.put("Wooden Shield", "Wooden but durable. Can take a few hits. Be careful around fire");
        ItemDescriptions.put("Map", "A map of the street...");
        ItemDescriptions.put("lunch box", "Only an apple is inside...");
        ItemDescriptions.put("void item?", "");
        ItemDescriptions.put("Unknown?", null);
       
        //Can add more items here.


        displayKeys(ItemDescriptions);
        displayValues(ItemDescriptions);
        displayFindDes(ItemDescriptions, "Rusty Sword");
        changeDescription(ItemDescriptions, "Wooden Shield", "wooden it is!");
        displayHashMap(ItemDescriptions); //Run this a few times. Notice anything about the order?
        findAndReplaceEmptyValue(ItemDescriptions);
        displayHashMap(ItemDescriptions);
        
        createNewHashMap();
        

    }

}
