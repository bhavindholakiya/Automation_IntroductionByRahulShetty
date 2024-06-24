package JavaPrograms;

public class SwappingValue {
    public static void main(String[] args) {
        int a = 68;
        int b = 72;

        System.out.println("Before swapping values are.. " + a + " " + b);
        swappingValue(a, b);
        swappingValueWithoutThirdVariable(a, b);
        swappingValueWithoutThirdVariableWithDivisonAndMultiplication(a, b);
        swappingValueUsingXORBitWiseOperator(a, b);
    }

    public static void swappingValue(int a, int b) {
        System.out.println("--- Swapped value using third variable");
        int t = a;
        a = b;
        b = t;
        System.out.println("After swapping values are.. " + a + " " + b);
    }

    public static void swappingValueWithoutThirdVariable(int a, int b) {
        System.out.println("--- Swapped value without using third variable");
        a = a + b; // 68+72 = 140
        b = a - b; // 140-72 = 68
        a = a - b; // 140-68 = 72

        System.out.println("After swapping values are.. " + a + " " + b);
    }

    public static void swappingValueWithoutThirdVariableWithDivisonAndMultiplication(int a, int b) {
        System.out.println("--- Swapped value using Division  and Multiplication");
        a = a * b;
        b = a / b;
        a = a / b;

        System.out.println("After swapping values are.. " + a + " " + b);
    }

    public static void swappingValueUsingXORBitWiseOperator(int a, int b) {
        System.out.println("--- Swapped value using XOR BitWise operator");
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("After swapping values are.. " + a + " " + b);
    }

    public static void swappingValueUsingLogic5(int a, int b) {
        System.out.println("--- Swapped value using XOR BitWise operator");
        b = a + b - (a - b);
        System.out.println("After swapping values are.. " + a + " " + b);
    }


}
