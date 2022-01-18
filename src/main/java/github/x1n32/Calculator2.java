package github.x1n32;



/**Try Making this class do some more things to the original calculator.
 * Such as the Quadratic Formula. Search online on BBC Bitesize if you don't know what it is.
     * Try using values a b c 
     * to create a method of using the quadratic formula.
     * The quadratic formula is used to solve a quadratic to find x: ax^2 + bx + c
     * The Equation: x = (-b +- square root(b^2 - 4ac))  / 2a
     * +- means plus or minus. x should have two answers.
     * Should return a positive x answer, and a negative x answer.
     * e.g. 2x^2 -5x - 6 
     *      Gives the answer: x = 3.860.... and x = -0.88....
 */
public class Calculator2 extends Arrays{

    /**
     * Return the value of b squared.
     */
    public float squareOfB(float b){
        return 0;
    }

    /**
     * For the quadratic formula, it requires the value of 4ac.
     * Have it done here, so it can be tested.
     */
    public float fourAC(float a, float c){
        return 0;
    }
  
    /**
     * Take the value of the square of b, and the value of 4ac
     * then square root it.
     */
    public double squareRootAnswer(float squareOfB, float fourAC){
        return 0;
    }

    /**
     * Positive x answer gotten by filling in the rest of the formula using +
     * x = (-b + sqrt(b^2 - 4ac) )/2a
     */
    public double positiveAnswer(float a, float b, float c){
        return 0;
    }

    /**
     * Negative x answer gotten by filling in the rest of the formula with -
     * x = (-b - sqrt(b^2 - 4ac) )/2a
     */
    public double negativeAnswer(float a, float b, float c){
        return 0;
    }


    /**
     * Output the answer here so you can just call this funtion in the main method below.
     */
    public void quadraticFormula(float a, float b, float c) {
	}

    
    public static void main(String[] args) {
        System.out.println("Have a go at creating functions to perform the quadratic formula.");
        System.out.println("There are some empty methods to break down the steps to do it.");
        System.out.println("Once done, have a check at the testing: on the test folder");
        
        Calculator2 cal = new Calculator2();
        cal.quadraticFormula(-2,-5,-6); // Answer: x = 3.860.... and x = -0.88....
    }
}