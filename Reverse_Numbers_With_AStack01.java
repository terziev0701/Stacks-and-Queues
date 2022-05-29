import java.util.ArrayDeque;
import java.util.Scanner;

public class Reverse_Numbers_With_AStack01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numbers = scanner.nextLine().split(" ");
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (String number : numbers){
            stack.push(Integer.parseInt(number));
        }
        for (Integer element : stack){
            System.out.printf("%s ", stack.pop());
        }
    }
}
