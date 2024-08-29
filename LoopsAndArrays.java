//TDJr 8/29/24
/*
*LoopsAndArrays.java
*
* This program will use the for loop through
* a list of names stored in a string array.
 */
import java.util.Scanner;
public class LoopsAndArrays {
    public static void main(String[] args) {
        // create a scanner object for user imput
        Scanner scanner= new Scanner(System.in);

        System.out.println("\n Welcome to my Friendly for loop program friends!");

        //create a for loop that displays 'Hello There' five times

        //the loop control variable of this for loop
        // is named i (it means integer(whole number)).
        // this loop control variable must be : initialized, checked , changed.
        for (int i = 0; i <=10; i++){
            System.out.println("The value of i is: " + i);

        }

        //create a while loop that does the same thing
        int loopControlVariable = 0;
        while (loopControlVariable < 10){
            System.out.println("the value of loopControlVariable is:"+ loopControlVariable);
        //change the loop control variable
            loopControlVariable++;
        }
        //create a string array of five words.
        //String[] names = new String

        String[]  names ={"one", "two", "three","four","five","six","seven","eight","nine","ten"};
        //create a array with 10 elements
        int[] myNumbers= new int[10];

        //usa a for loop to get ten whole numbers form the user
        for (int i=0;i<10;i++){
            System.out.println("please enter number:"+ (i+1));
            myNumbers[i]=   scanner.nextInt();
        }
        // output the myNumbers[] array....with a for loop,using the length property
        for (int i = 0;i<10;i++){
            System.out.println("the value of myNumbers ["+i+"]is;"+myNumbers[i]);
        }




        for (int i = 0; i < 5; i++){
            System.out.println("names["+ i + "] is.."+names[i]);
        }

        System.out.println("\n one of our names is:"+names[4]);
        //output the length of our array named name.
        System.out.println("\n The name of our array :"+ names.length);


        //create a for loop that outputs all elements values in the names array



        System.out.println("This is the end of our program!");


    }
}