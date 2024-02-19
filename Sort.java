// This code has the function of sorting an array of numbers in ascending order. It will do this by checking two variables that are next to each other and swapping them if they are in the wrong order. similar to a bubble sort.
// Code by deacon.davis@malad.us
// For CTE software development 1
// Instructor Mr. Gross
import java.util.Arrays;

public class Sort {
// Here is the function that was made by kimg@techtrepacademy.com; it took me a while to understand it, but after thinking about it it makes a lot of sense and is very useful. If you look at the end of the first comment you can see how it functions.
    static int[] swapTwoArrayElements(int[] arrayToSwap, int lowerIndex) {
        int temp = arrayToSwap[lowerIndex];
        arrayToSwap[lowerIndex] = arrayToSwap[lowerIndex + 1];
        arrayToSwap[lowerIndex + 1] = temp;
        return arrayToSwap;
    }

    public static void main(String[] args)
     {
        int[] arrayToSort = {1, 3, 4, 5, 1, 23, 57, 126, 4, 543, 345, 23, 12, 45, 67, 97};
// Here is the array that I am challenging my code to sort. I will first print the unsorted array, and then the sorted one after.
        System.out.println(Arrays.toString(arrayToSort));
// Here is my flag variable, it is a very important part of the code, and if it doesn't exist the code will only sort the array once, giving you a result something like this [1, 3, 4, 1, 5, 23, 57, 4, 126, 345, 23, 12, 45, 67, 97, 543]
        boolean sorted = false;

        while(!sorted){
        sorted = true;
        for(int i=0; i<arrayToSort.length-1; i++)
        {
            if(arrayToSort[i] > arrayToSort[i+1]){
// This is the part of my code that actually uses the function that was made at the beginning of the code.
            swapTwoArrayElements(arrayToSort, i);
// here is where my flag variable makes my code funciton properly.
            sorted = false;
            }
        }
    }
    System.out.println(Arrays.toString(arrayToSort));
// Finally my code outputs the sorted array, and my job is done.
 }
}