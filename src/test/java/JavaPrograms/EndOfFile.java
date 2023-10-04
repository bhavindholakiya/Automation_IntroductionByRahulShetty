package JavaPrograms;

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String line;
        int i = 1;
        while (input.hasNext()){
            line = input.nextLine();
            System.out.println(i + " " + line);
            i++;
        }
    }
}
