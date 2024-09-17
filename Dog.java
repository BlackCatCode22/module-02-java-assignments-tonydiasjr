public class Dog {
    //create two fields for our dog objects
    private String name;
    private int age;

    //create getters and setters for our fields
    public void setName(String name){
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int setAge(){
        return this.age;

    }
    public void setAge(int age){
        this.age=age;
    }

    //create a constructor for the dog objects that will be created with the "new" keyword.
    //constructor is a special method that is called or invoked when..The Dog class is used
    //to create an object.
    public Dog(){
        System.out.println("\n a dog object was created. This message is from the dog constructor!\n");
    }


    //create a constructor that accepts a String Data type for the Dogs names
    public Dog(String myName){
        this.name = myName;


    }

    //create a constructor that accepts an argument when an object is created this argument will be a int

    public Dog(int theAge){
        this.age= theAge;

    }
    public Dog(String someName,int someAge){
        this.age=someAge;
        this.name=someName;

    }

}
