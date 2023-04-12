package JavaBasics;

public class Ch1_Pro3_ForLoop {
    public static void main(String[] args) {
        int[] num = new int[5];
        int[] myNum = {1,2,3,4,5,8,6,9,8,15};
        String[] names = {"Bhavin","Jayesh","Mamta","Prayag"};

        num[0] = 1;
        num[1] = 3;
        num[2] = 5;
        num[3] = 7;
        num[4] = 9;

        for (int i=0; i<num.length;i++)
        {
            System.out.println("Num array value " + num[i] + " is at index of " +i);
        }
        System.out.println("---------------------------------------------");
        for (int i=0; i<names.length;i++)
        {
            System.out.println("Name " + names[i] + " is at index of " +i);
        }
        System.out.println("---------------------------------------------");

        //Enhanced For Loop
        System.out.println("This is enhanced for loop concept.");
        for (String s : names)
        {
            System.out.println(s);
        }
    }
}
