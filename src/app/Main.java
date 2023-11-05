package app;

public class Main {
    public static void main(String[] args) {

        int[] range = {1, 2, 3, 4, 5, 6};
        int sum = 0;

        for (int num: range ) {
            sum +=num;
            System.out.printf("%d) Num is %d, sum is %d%n",
                    num, num, sum);
        }
        System.out.println("------------------------\n" +
                "Sum of numbers is " + sum);
    }
}
