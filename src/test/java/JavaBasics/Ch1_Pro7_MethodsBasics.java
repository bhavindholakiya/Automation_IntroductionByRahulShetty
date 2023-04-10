package JavaBasics;

public class Ch1_Pro7_MethodsBasics {
    public static void main(String[] args) {

        Ch1_Pro7_MethodsBasics obj1 = new Ch1_Pro7_MethodsBasics();
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
