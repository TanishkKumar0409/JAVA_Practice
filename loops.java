import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        Scanner Value = new Scanner(System.in);
        // ? First Task
        System.out.print("Please Enter a Number of * To Print in First Row:");
        int Row = Value.nextInt();
        for (int i = Row; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }

        // ! Second Task
        System.out.print("Enter the Number to sum:");
        int Number = Value.nextInt();
        int x = 0;
        while (Number >= 0) {
            if (Number % 2 == 0) {
                x = x + Number;
                Number -= 2;
            }
        }
        System.out.println(x);

        // * */ Third Task
        System.out.print("Enter a Number To Print Table:");
        int Table = Value.nextInt();
        int i = 1;
        do {
            System.out.println(Table + " * " + i + " = " + Table * i);
            i++;
        } while (i <= 10);
        Value.close();
    }
}
