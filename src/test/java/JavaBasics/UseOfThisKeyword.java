package JavaBasics;

public class UseOfThisKeyword {
    String name;
    int age;

    UseOfThisKeyword(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void changeName(String name){
        this.name = name;
    }

    //method to print details of person (name & age)
    public void printDetails(){
        System.out.println("Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("---------------------------------------------");
    }
    public static void main(String[] args) {
        //Object declaration to access class level variable and methods.
        UseOfThisKeyword first = new UseOfThisKeyword("Bhavin", 30);
        UseOfThisKeyword second = new UseOfThisKeyword("Jayesh", 28);

        first.printDetails();
        second.printDetails();

        first.changeName("Prayag");
        System.out.println("Name has been changed to: "+first.getName());
    }
}
