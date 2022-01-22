package github.x1n32;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
//import org.junit.rules.ErrorCollector;




public class HashMapExerciseTest {

	HashMap<String, String> ItemDescriptions = new HashMap<>();
	String fileReport = "Reporting Errors: \n";

	//ErrorCollector error = new ErrorCollector();
	

	  @Before
	  public void fileCreation(){
  
		  try {
			File myObj = new File("reportingErrors.txt");
			if (myObj.createNewFile()) {
				System.out.println("File created: " + myObj.getName());
			  } else {
				System.out.println("File already exists.");
			  }
		
		  } catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		  }
	  }


	@AfterEach
	public void file(){

		try {

            FileWriter Writer = new FileWriter("reportingErrors.txt");
            Writer.write(fileReport);
			Writer.close();
            System.out.println("Successfully written.");

        }
        catch (IOException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }

	}


	
    @BeforeEach
	public void initEach() {
		//System.out.println("Starting Tests");

		ItemDescriptions.put("Rusty Sword", "Weak and Rusty. Perhaps a bit of polish would make it shine");
		ItemDescriptions.put("Rusty Dagger", "Weak and Rusty. Perhaps a bit of polish would make it shine");
		ItemDescriptions.put("Wooden Shield", "Wooden but durable. Can take a few hits. Be careful around fire");
		ItemDescriptions.put("Map", "A map of the street...");
		ItemDescriptions.put("lunch box", "Only an apple is inside...");

	}

	@Nested
	class HashMapTesting {
        @Test
		@DisplayName("Create")
		public void Create() {
			System.out.println("Create list");
			assertFalse(ItemDescriptions.isEmpty());
 		}

		 @Test
		 @DisplayName("checkValue")
		 public void checkValue() {

			try {
				System.out.println("checking specific value in list");
				String expected = "A map of the street...";
				assertEquals(expected, ItemDescriptions.get("Map"), "This should match the same text as the value of map.");
	
			} catch (Exception e) {
				fileReport += "Error getting the correct value from the key: \n";
				fileReport += e;
				System.out.println(fileReport);
			}

		  }
		  @Test
		  @DisplayName("checkValue2")
		  public void checkValue2() {
			try {
				
				System.out.println("checking specific value in list 2");
				String expected = "This new descpription";
				ItemDescriptions.put("Item", "This new descpription");
				assertEquals(expected, ItemDescriptions.get("Item"), "This should match the same text as the value of map.");
	
			} catch (Exception e) {
				fileReport += "Error getting the correct value from the key: \n";
				fileReport += e;
				System.out.println(fileReport);
			}

		   }

		  @Test
		  @DisplayName("testChangeinValue")
		  public void testChangeinValue(){
			try {
				System.out.println("Testing new Description");
				String newDescription = "Testing change in description";
				ItemDescriptions.put("Wooden Shield", newDescription);
	
				assertEquals(newDescription, ItemDescriptions.get("Wooden Shield"),
				 "Error. What the value returrned: " + ItemDescriptions.get("Wooden Shield") + " returned. when it should be " + newDescription);
				 
				
			} catch (Exception e) {
				fileReport += "Error changing the value of an existing key: \n";
				fileReport += e;
				System.out.println(fileReport);
			}
			

		  }

		  @Test
		  @DisplayName("testChangeinValue2")
		  public void testChangeinValue2(){
			  try {
				System.out.println("Testing new Description 2");
				ItemDescriptions.put("Item", "This descpription");
				String newDescription = "Chango description";
				ItemDescriptions.put("Item", newDescription);
	
				assertEquals(newDescription, ItemDescriptions.get("Item"),
				 "Error. What the value returrned: " + ItemDescriptions.get("Item") + " returned. when it should be " + newDescription);
				 
				  
			  } catch (Exception e) {
				fileReport += "Error changing the value of an existing key: \n";
				fileReport += e;
				System.out.println(fileReport);
			}

		  }



		  @Test
		  @DisplayName("testFindEmptyValues")
		  public void testFindEmptyValues(){
			  try {
				System.out.println("Testing find and replace empty values");
				ItemDescriptions.put("empty", "");
				HashMapExercise.findAndReplaceEmptyValue(ItemDescriptions);
				assertEquals("Unknown Description", ItemDescriptions.get("empty"));
			  } catch (Exception e) {
				fileReport += "Error found in CHALLENGE1: findAndReplaceEmptyValue() when looking for empty values. If you haven't started this task, ignore this message. \n Otherwise, did you check you recieved the right input? Are you searching values correctly? \n Look for empty values with no spaces, and null values. Remember to add a new value, you just set it again, like how you add a new key/value. \n Make sure you set the description to be the same as what the task requires. \n";
				fileReport += e;
				System.out.println(fileReport);
			}

		  }

		  @Test
		  @DisplayName("testFindNullValues")
		  public void testFindNullValues(){
			try {
				System.out.println("Testing find and replace null values");
				ItemDescriptions.put("empty2", null);
				HashMapExercise.findAndReplaceEmptyValue(ItemDescriptions);
				assertEquals("Unknown Description", ItemDescriptions.get("empty2"));
			} catch (Exception e) {
				fileReport += "Error found in CHALLENGE1: findAndReplaceEmptyValue() when looking for null values. If you haven't started this task, ignore this message. \n Otherwise, did you check you recieved the right input? Are you searching values correctly? \n Look for empty values with no spaces, and null values. Remember to add a new value, you just set it again, like how you add a new key/value. \n Make sure you set the description to be the same as what the task requires. \n";
				fileReport += e;
				System.out.println(fileReport);
			}
		  }

		  @Test
		  @DisplayName("testHashMapCreationUnderstanding")
		  public void testHashMapCreationUnderstanding(){
			try {
				System.out.println("Testing if user can create a hashmap in the method");
				System.out.println("testHashMapCreationUnderstanding");
				assertEquals("Abby", HashMapExercise.createNewHashMap(), 
				"The method should return Abby. Are the Generics for the map correct? Check for capital letters.");
	
			} catch (Throwable e) {
				fileReport += "Error found in CHALLENGE2: createNewHashMap(). If you haven't started this task, ignore this message. \n Have you checked you have put two generics? <> should have two data types inside that would suit 0 and Abby. You only need to write one line of code to create a hash map.";
				fileReport += e;
				System.out.println(fileReport);
			}
		  }



    }






}