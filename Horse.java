//Simple horse class created by Kim Gross
//for CTE Software Development class 2022

public class Horse {
    String name;// current name of the horse
    int birthYear;//year the horse was born
    String[] names; //array of old names of the horse
    int numberofNames=0; //how many old names are there.
    public Horse(String horseName, int year){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;
    };
    
    public void age (){
        this.birthYear = newbirthYear;
    }; 
    public void changeName (String newName){//change the name but save the old name
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    };
    public String toString (){
        return name;
    };    
// Additional code created by Deacon Davis
// Here is the start to the additional code.
    public static void main (String[] args)
    {
// Here is where I use the horse object to create three horses, You can see that I gave each of them a birth year as well as a name.
    Horse horse1 = new Horse("Jimbo", 2008);
    Horse horse2 = new Horse("Craigothy", 2000);
    Horse horse3 = new Horse("Deangelo lopez", 1994);
// I then printed out their names. I didn't have to use a getter or setter, because I have them in a public method.
// If it was in a private method and I used getters and setters it would look like this: System.out.println(horse1.getName); . I would also set the names of my horses like this:  horse1.setName("bilbo"); .
// using getters and setters is called encapsulation, and it is useful if you want to hide private code from users. Since this code is just for fun, I will not need to use encapsulation.
    System.out.println(horse1);
    System.out.println(horse2);
    System.out.println(horse3);
    }
}
