package JavaBasics;

public class Ch1_Pro4_IfElseCondition {
    public static void main(String[] args) {
        int myNum[] = {1,2,3,4,20,10,5,18,6,9,8,15,52,91,102,105};
        String names[] = {"Bhavin","Jayesh","Mamta","Prayag"};

        // Check if array has multiple of 2
        for (int i=0; i<myNum.length; i++)
        {
            if (myNum[i] % 2 == 0)
            {
                System.out.println(myNum[i]);
            }
            /*else
            {
                System.out.println(myNum[i] + " is not multiple of 2");
            }*/
        }
    }
}
