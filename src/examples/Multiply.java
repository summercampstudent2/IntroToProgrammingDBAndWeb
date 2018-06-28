package examples;

public class Multiply {

    static int multiply(int a, int b) {
        return a * b;
    }

    //main method is needed to run the above class and make it do something (invoke multiply method in the case here)
    public static void main(String args[]) {
        int a = 3; //initialize variable named a to value 3
        int b = 4; //initialize variable named b to value 4
        int result = multiply(a, b); //invoke the multiply method by passing in the variable names a and b as parameters
        System.out.println("result of multiplying a=" + a + " with b=" + b + " is " + result); //print out the results
    }

}
