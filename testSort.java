// Comparable interface project code by Deacon Davis 
// For software development CTE
// Intructor Kim Gross
import java.util.Collections;
import java.util.ArrayList;

public class testSort{
    public static void main(String args[]){
// here I make an Arraylist for all of the fighters that need to be sorted.
        ArrayList<Fighter> al = new ArrayList<Fighter>();
// I have made ten fighters and they are not at all sorted
        al.add (new Fighter("Adam",5,3));
        al.add (new Fighter("Frank",2,4));
        al.add (new Fighter("Grant",3,6));
        al.add (new Fighter("Vlad",18,10));
        al.add (new Fighter("Matt",23,92));
        al.add (new Fighter("Preston",15,5));
        al.add (new Fighter("Kade",10,6));
        al.add (new Fighter("Jimothy",45,3));
        al.add (new Fighter("Thadwick",1,2));
        al.add (new Fighter("Steven",82,7));
        al.add (new Fighter("Bobert",94,1));

// here I create a for loop to print out all of the names, speeds, and strength levels before they have been sorted
        for(Fighter ft : al){
            System.out.println(ft.name + ", " + ft.strength + ", " +ft.speed);
        }

        System.out.println(" ");
        System.out.println("now for the sorted list");
        System.out.println(" ");

// here I use the Collections.sort method to sort my fighters from weakest to strongest
// to see the that part of the code, see my updated fighter class lines 21-31
        Collections.sort(al);
// here I create a for loop to print out all of the names, speeds, and strength levels after they have been sorted
        for(Fighter ft : al){
            System.out.println(ft.name + ", " + ft.strength + ", " +ft.speed);
        }
    }
}