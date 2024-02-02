public class Test {
public static void main(String[] args)
{
// here is my interger for the final sum of all the numbers, as you see at the end of my loop I add the zariable i to finalSum and then I print the sum at the end of the loop
    int finalSum = 0;
// here I use an for loop with the initializing statement that int i = 0.
// my conditional statement which is checked each time the code loops is i < 100
// the i++ at the end of my for loop means that at the end of each loop the interger adds one            SYNTAX: being i used to equal 0 but after the first loop it equals 1
    for (int i = 0; i <= 100; i++)
    {
        System.out.print(i);
        
        if (i % 2 == 0){
        System.out.println(" Even");
        }
        else{
        System.out.println(" Odd");
        }
        finalSum = finalSum + i;
    }
    System.out.println(finalSum);


}
}