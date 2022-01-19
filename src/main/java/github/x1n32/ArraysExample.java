package github.x1n32;

/**This basic class is to help revise how arrays are created
 * Arrays are used to store multiple values in a single variable,
 *  instead of declaring separate variables for each value.
 * 
 * +we can directly access any element in the array by adding the offset to the pointer,
 *  we can look up any element in the same amount of time, regardless of the size of the array.
 *  This means that getting MyArray[1000] would take the same amount of time as getting MyArray[5]
 * 
 */
public class ArraysExample {

	/**
	 * Goes through the array and outputs them.
	 * @param message
	 * @param array
	 */
	private static void printArray(String message, int array[]) {
		System.out.println(message + ": [length: " + array.length + "]");
		
		for (int i = 0; i < array.length; i++) {
		   if(i != 0) {
			  System.out.print(", ");
		   }
		   System.out.print(array[i]);                     
		}
		System.out.println();
	 }

	 /**
	  * Insetion sort.
	  * @param array
	  */
	 public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  

	/**
	 * Calculates the cumulative total of all values in the array.
	 * @param message
	 * @param array
	 */
	private static void printTotal(String message, int array[]) {
		System.out.println(message + ": [length: " + array.length + "]");
		float total = 0;
		for (int i = 0; i < array.length; i++) {
		   total += array[i];
		   //System.out.print(array[i]);                     
		}
		System.out.println(total);
	 }



    public static void main(String[] args) throws Exception{

		//Integer array. Arrays are created with the [], and they can store many elements
		int array[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
		printArray("Printing all elements in the array:", array);

		insertionSort(array);
		printArray("Printing all elements in the array:", array);
		printTotal("Printing total:", array);


    }
}