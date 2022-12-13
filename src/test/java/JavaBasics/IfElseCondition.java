package JavaBasics;

public class IfElseCondition {
    public static void main(String[] args) {
        int myNum[] = {1,2,3,4,20,10,5,18,6,9,8,15};
        String names[] = {"Bhavin","Jayesh","Mamta","Prayag"};

        for (int i=0; i<myNum.length; i++)
        {
            if (myNum[i] % 2 == 0)
            {
                System.out.println(myNum[i]);
            }
        }
    }
}
