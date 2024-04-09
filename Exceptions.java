// Code by Deacon Davis
// for CTE Software Development 1
// Instructor Kim Gross
public class Exceptions {
    public static void main(String[] args) {
// here I create my array that I will be pushing out of bounds
        int[] arry = new int[3];
        arry[0] = 1;
        arry[1] = 2;
        arry[2] = 3;
// I use the try method to attempt things that might push the program beyond its limits
        try {
            arry[3] = 4; // this will work because it is in the bounds of the array
            arry[4] = 5; // this won't work because it is out of the bounds of the array
        } 
        catch (ArrayIndexOutOfBoundsException e) {
// here I catch the error that I created with an array out of bounds catch
            System.out.println("Cannot create an index higher than the pre-established array index limit");
        }

// here I create some variables, that I can use to perform some equations
        int sum;
        int difference;
        int divide;

        int num1;
        int num2;
        int num3;
        int num4;
// there might be an easier way to do this, but I'm not sure how, so this will have to do for now
        num1 = 10;
        num2 = 8;
        num3 = 0;
        num4 = 2;
        
        sum = num4 + num2;
        System.out.println("answer " + sum);
// I will ask the code to perform basic arithmatic, and to print the answer
        difference = num1 - num3;
        System.out.println("answer " + difference);

        divide = num1/num4;
        System.out.println("answer " + divide);
// here I prove that my divide variable actually works 
        try{
            divide = num1/num3;
// and here I purposefully divide by zero to create an arithmatic exception
        }
// here I catch the exception, and print an error message
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }

        System.out.println("All exceptions caught");
// Finally I print that I have caught all of the exceptions
    }
}
