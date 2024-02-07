public class Test {
public static void main(String[] args)
{
// this variable will add all of the numbers in my index together to make a runnning total.
int finalSum = 0;


int[] nmbrs = new int[100];
// the above line of code creates my array which is named nmbrs and it has an index of 100 
// the below line of code makes a loop that adds a value to an index in my array each time it loops. the values count up to one hundred.
for(int i=0; i<100; i++)
{
// this below line of code tells my code that all the values in the array nmbrs are equal to the value of the current index plus 1
   nmbrs[i] = i+1; 
}
// this for loop states that the code in brackets should be done while i is less than the length of the array nmbrs
for(int i=0; i<nmbrs.length; i++)
{
    finalSum = finalSum + nmbrs[i];
    System.out.print(nmbrs[i]);
// the lines 22-30 tell my code that if you divide the value of the current index by two and it has a remainder, than it is an odd number.
    if(nmbrs[i] % 2 == 0)
    {
    System.out.println(" Even");
    }
    else
    {
    System.out.println(" Odd");
    }
}
// this final line of code prints out the running total of all the numbers in the array nmbrs
System.out.println(finalSum);
}
}



