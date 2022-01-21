package github.x1n32;
import static org.junit.jupiter.api.Assertions.*;


import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import org.junit.After;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;




public class HashMapExerciseTest {

	HashMap<String, String> ItemDescriptions = new HashMap<>();
	String fileReport = "";

	@After
	void file(){

		try {
            FileWriter Writer = new FileWriter("myfile.txt");
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
	void initEach() {
		System.out.println("Starting Tests");

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
			System.out.println("checking specific value in list");
			 String expected = "A map of the street...";
			 assertEquals(expected, ItemDescriptions.get("Map"), "This should match the same text as the value of map.");
 
		  }

		  @Test
		  @DisplayName("testChangeinValue")
		  public void testChangeinValue(){
			
			System.out.println("Testing new Description");
			String newDescription = "Testing change in description";
			ItemDescriptions.put("Wooden Shield", newDescription);

			assertEquals(newDescription, ItemDescriptions.get("Wooden Shield"),
			 "Error. What the value returrned: " + ItemDescriptions.get("Wooden Shield") + " returned. when it should be " + newDescription);
			 
		  }
		  @Test
		  @DisplayName("testFindEmptyValues")
		  public void testFindEmptyValues(){
			System.out.println("Testing find and replace empty values");
			ItemDescriptions.put("empty", "");
		    HashMapExercise.findAndReplaceEmptyValue(ItemDescriptions);
			assertEquals("Unknown Description", ItemDescriptions.get("empty"));


		  }

		  @Test
		  @DisplayName("testHashMapCreationUnderstanding")
		  public void testHashMapCreationUnderstanding(){
			System.out.println("Testing if user can create a hashmap in the method");
			System.out.println("testHashMapCreationUnderstanding");
			assertEquals("Abby", HashMapExercise.createNewHashMap());

		  }

    }






}