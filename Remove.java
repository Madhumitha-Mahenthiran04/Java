import java.util.Scanner;

class RemoveSpace {

    void process(String[] arr) {

        System.out.println("Original Array:");
        for (String s : arr) {
            System.out.print(s + " ");
        }

        System.out.println("\nWithout Spaces:");

        for (String s : arr) {
            if (!s.equals(" ")) {
                System.out.print(s);
            }
        }
    }
}

public class Remove{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter characters separated by space:");
        String input = sc.nextLine();

        // Convert string → array
        String[] arr = input.split(" ");

        RemoveSpace obj = new RemoveSpace();
        obj.process(arr);
    }
}