//From Java21Days pg 241 - Hash maps. Great for manipulating large amounts of data.
package github.x1n32;


import java.util.*;

/*
Challenge 1: Where it says quality.put(), change the string text (i.e. mint) to 
            enumerated versions (Condition.MINT) instead.

Challenge 2: add two more conditions/enumerations.
        Create a PRISTINE_MINT condition where it sells for 5 times the price,
        and a COVERLESS that sells for 0.1 times the price.
        Then create two new comics that use those conditons.
        NOTE: Remember you have to change the size of the comix array.

Challenge 3: Create an ArrayList to store comics rather than a normal array 
            so that you don't need to resize the array every time you add a new comic.
            Look at the ListExample.java to learn how to make an array list and add values to it.
            
            Display the contents of your new Array List by using a method. 
            Copy the for-loop in the main code below and paste it into the method - remember to change the name comix1
            

*/



/**This class uses a HASHMAP to store values with certain keys (like a database primary key)
 * To store a condition of a comic book. and the sell price multiplier 
 * 
 * To store a new comic to sell, it uses the comic class (below the comic book class), where you say
 * the name, issue number, conditon and base price 
 * where the this Comic Book class converts the price into the new sell price 
 * 
 * 
 * */ 
public class ComicBooks {
    //Application class ComicBooks and helper class Comic.
    public ComicBooks(){}
    
    public static void main(String[] arguments){
        //Set up hash map
        HashMap<String,Float> quality = new HashMap<>();//<> IS A GENERIC! 
        //IT IS ADDED TO A DATA STRUCTURCTURE, SO THAT IT HAS A TYPE
        //AND NOT LEAD TO RUNTIME ERROR - SAY IF PRICE1 WAS A STRING.
        //IT IS ALSO EASIER TO RETRIEVE OBJECTS FROM THEM AS YOU DON'T HAVE TO CAST THEM TO THE DESIRED CLASS
        


        //TO DO CHALLENGE 1: Use enumerated values instead of the string values (e.g. Condition.MINT)
        float price1 = 3.00F;    //Add to map with key mint.
        quality.put("mint", price1); 
        
        float price2 = 2.00F;
        quality.put("near mint", price2);
        
        float price3 = 1.50f;
        quality.put("very fine", price3);
        
        float price4 = 1.00F;
        quality.put("fine", price4);
        
        float price5 = 0.50F;
        quality.put("good", price5);
        
        float price6 = 0.25f;
        quality.put("poor", price6);
        
        //Set up collection with an array of comics to hold books for sale
        Comic[] comix = new Comic[3];
        //Store detail and get new price based on condition
        //.get(Strig) is called with the conition, one of the keys. Returns as an object, so we cast it to ffloat
        comix[0] = new Comic("Amazing Spider Man", "1A", "very fine", 12_000.00F);
        //NO NEED FOR (Float) , DUE TO CASTING IT IN THE GENERICS. i.e not this: comix[0].setPrice((Float) quality.get(comix[0].condition));
        comix[0].setPrice(quality.get(comix[0].condition));
        
        comix[1] = new Comic("Incredible Hulk", "181", "near mint",680.00F);
        comix[1].setPrice(quality.get(comix[1].condition));
        
        comix[2] = new Comic("Cerebus", "1A", "good", 190.00F);
        comix[2].setPrice(quality.get(comix[2].condition));


        //TO DO CHALLENGE 2: create another two comics to comix[] that uses your new PRISTINE_MINT and COVERLESS CONDTIONS.
       
        //For loop to display contents of the comix array.
        for (Comic comix1 : comix) {

            System.out.println("Title: " + comix1.title);
            System.out.println("Issue: " + comix1.issueNumber);
            System.out.println("Condition: " + comix1.condition);
            System.out.println("Price: $" + comix1.price + "\n");
            
            
        }      

        //TO DO CHALLENGE 3: Create an ArrayList of <Comic> to store comic books rather than an array
        //Add Spider Man comic in to test. To Set the new price, you must use .get(position).setPrice(...);
        ArrayList<Comic> myComix = new ArrayList<>();
        myComix.add(new Comic("sup Spider Man", "1A", "very fine", 12_000.00F));
        myComix.get(0).setPrice(quality.get(comix[0].condition));

        myComix.add(new Comic("Incredible Hulk", "181", "near mint",680.00F));
        myComix.get(1).setPrice(quality.get(comix[1].condition));

        
        printArrayList(myComix);


    }


    /**
     * TO DO CHALLENGE 3.5: Copy the for loop above into this method. 
     * This should output the values of the comic from an ArrayList.
     * @param arrayListComic
     */
    public static void printArrayList(ArrayList<Comic> arrayListComic) {
        //Copy the for loop above into this method. 

            for (Comic com: arrayListComic){
                System.out.println("Title: " + com.title);
                System.out.println("Issue: " + com.issueNumber);
                System.out.println("Condition: " + com.condition);
                System.out.println("Price: $" + com.price + "\n");
            }
        
    }  




}//END OF COMIC BOOK CLASS




class Comic { //5 instance vars
    String title, issueNumber, condition;
    float basePrice, price;
    //Constructor method to set the values
    Comic(String inTitle, String inIssueNumber, String inCondition,
            float inBasePrice){
        
        title = inTitle;
        issueNumber = inIssueNumber;
        condition = inCondition;
        basePrice = inBasePrice;
    }
    //Sets the price - set as float. 
    void setPrice(float factor){
        price = basePrice * factor;
    }
}


//Enum of conditions - they are like constants: static and final.
enum Condition {
    PRISTINE_MINT,
    MINT,
    NEAR_MINT,
    VERY_FINE,
    FINE,
    GOOD,
    POOR,
    COVERLESS 
}