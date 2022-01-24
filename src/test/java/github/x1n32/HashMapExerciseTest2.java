package github.x1n32;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
//import org.junit.rules.ErrorCollector;




public class HashMapExerciseTest2 {

	HashMap<String, String> ItemDescriptions = new HashMap<>();

    @BeforeEach
	public void initEach() {


		ItemDescriptions.put("Rusty Sword", "Weak and Rusty. Perhaps a bit of polish would make it shine");
		ItemDescriptions.put("Rusty Dagger", "Weak and Rusty. Perhaps a bit of polish would make it shine");
		ItemDescriptions.put("Wooden Shield", "Wooden but durable. Can take a few hits. Be careful around fire");
		ItemDescriptions.put("Map", "A map of the street...");
		ItemDescriptions.put("lunch box", "Only an apple is inside...");

	}

	@Nested
	class HashMapTestingWithReport {
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

				System.out.println(e + "\n");
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
				System.out.println(e + "\n");
			}

		   }

		  @Test
		  @DisplayName("testChangeinValue")
		  public void testChangeinValue(){
			try {
				System.out.println("Testing new Description");
				String newDescription = "Testing change in description";
				ItemDescriptions.put("Wooden Shield", newDescription);
	
				assertEquals(newDescription, ItemDescriptions.get("Wooden Shield")
				 );
				 
				
			} catch (Exception e) {

				System.out.println(e + "\n");
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
	
				assertEquals(newDescription, ItemDescriptions.get("Item"));
				 
				  
			  } catch (Exception e) {

				System.out.println(e + "\n");
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

				System.out.println(e + "\n");
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

				System.out.println(e + "\n");
			}
		  }

		  @Test
		  @DisplayName("testHashMapCreationUnderstanding")
		  public void testHashMapCreationUnderstanding(){
			try {
				System.out.println("Testing if user can create a hashmap in the method");
				System.out.println("testHashMapCreationUnderstanding");
				assertEquals("Abby", HashMapExercise.createNewHashMap() );
	
			} catch (Exception e) {

				System.out.println(e + "\n");
			}
		  }



    }






}