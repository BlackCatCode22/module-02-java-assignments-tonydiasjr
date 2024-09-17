//TDJR 9/17/24
// MainClassPractice.java
public class MainClassPractice {
    public static void main(String[] args) {

        System.out.println("\nwelcome to my OOP Class Practice Program!");

        //create a couple Dog objects
        Dog myDog = new Dog();
        Dog anotherDog = new Dog();

        //create a dog with a name
        Dog aDog = new Dog("spot");


        System.out.println("\nThe new dog name is:"+ aDog.getName());

        Dog fourthDog = new Dog( 33);

        System.out.println("\nmy new dog age is "+fourthDog.setAge());


        Dog fithDog = new Dog("my new dogs name",  7);

        System.out.println("\n my last dogs name is "+fithDog.getName()+"and age is:"+fithDog.setAge());

    }
}