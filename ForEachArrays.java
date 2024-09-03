//Tony Dias 09/03/24
// ForEachArrays.java

public class ForEachArrays {
    public static void main(String[] args) {

        System.out.println("\n Welcome to my For : Each practice!\n");

        //Create arrays of cars. Do this to different ways and able to explain to your lab partner
        //create a cars [] array using initialization

        String[]cars = {"Camaro","Mustang","Challenger"};

        //output the cars array using a for each loop
        for (int i = 0; i < 3;i++){
            System.out.println(cars[i]);

        }
        System.out.println("\n My for loop is done!");

        //use a for : each loop to do the same thing

        for (String car :cars){
            System.out.println(car);
        }

        //Create a string array using the new operator
        //Create a 4 element string array named myCars.

        String[] myCars = new String [4];

        // myCars[0] , myCars[1] , myCars[2] , myCars[3]

        // Fill the newly created String[] array with data
        myCars[0] = "Mustang";
        myCars[1]= "GMC";
        myCars[2]= "jeep";
        myCars[3]="Challenger";

        //use a for each loop to output myCars Array

        for (String myCar :myCars ){
            System.out.println("\n A car in myCars array is:"+ myCar);
        }
        String[] myStrings = new  String[6];

        // use a for loop to fill the array with some strings
        /*
        for (int i =0;i<6;i++){
            // fill my arrays with strings
            myStrings[i]= "this is string number:"+(i + 1);
        }
        */
        int aNum =0;
        for (String aStr : myStrings){
            // fill my array with strings
            myStrings[aNum] = "this is string number" + (aNum+1);
            aNum++;
        }


        // now use a for : each loop to output the myStrings[] Array
        for (String aStr : myStrings){
            System.out.println("\n An element in myString[] is:"+aStr);
        }
        String myStrToReverse = "abcdefg";

        for (int i =0;i<7;i++){
            System.out.println("myStrToReverse["+i+"]is:"+myStrToReverse.charAt(i));
        }
        System.out.println("End of initial output.");

        String reversedStr="";

        System.out.println("reversedStr before reversion loop is :"+reversedStr);

        for (int i = 6; i<0; i--){
            char charToAdd = myStrToReverse.charAt(i);

            reversedStr=reversedStr.concat(Character.toString(charToAdd));
        }
        System.out.println("reversedStr after reversion is:"+reversedStr);
    }
}