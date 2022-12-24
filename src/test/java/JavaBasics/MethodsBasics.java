package JavaBasics;

public class MethodsBasics {
    public static void main(String[] args) {

        MethodsBasics obj1 = new MethodsBasics();
        String s1 = obj1.getData();
        System.out.println(s1);
        System.out.println("--------------------------");
        getUserData();
    }

    public String getData()
    {
        System.out.println("getData method called");
        return "Return string from getData method";
    }

    public static void getUserData()
    {
        System.out.println("Static method called");
    }

}
