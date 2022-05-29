import java.util.*;

public class Basic_Stack_Operations02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] input = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int countToPush = input[0];
        int countToPop = input[1];
        int elementToSearch = input[2];

        int [] numbers = Arrays.stream(scanner.nextLine()
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < countToPush ; i++) {
        stack.push(numbers[i]);

        }
        for (int i = 0; i <countToPop ; i++) {
            stack.pop();
        }
        if (stack.contains(elementToSearch)){
            System.out.println("true");
        }else if (stack.isEmpty()){
            System.out.println("0");
        }else {
           int minElement = Integer.MAX_VALUE;
           for (Integer number : stack) {
               if (number < minElement){
                   minElement = number;

               }
           }
            System.out.println(minElement);
        }

    }
}
