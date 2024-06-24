package JavaPrograms;

public class SwapValueWithoutThirdVariable {
    public static void main(String[] args) {
        int a = 68;
        int b = 72;

        a = a + b; // 68+72 = 140
        b = a - b; // 140-72 = 68
        a = a - b; // 140-68 = 72

        System.out.println("After Swapping Value of A = " +a+ " and value of B = "+b);

    }
}
