public class SumDivisibleByFiveAndTwo {

    public static void main(String[] args) {
        int[] values = {100, 52, 43, 99, 42, 40, 91};
        int sum = 0;

        for (int num : values) {
            if (isDivisibleByFiveAndTwo(num)) {
                sum += num;
            }
        }

        System.out.println("The sum of numbers divisible by 5 and 2 is: " + sum);
    }

    public static boolean isDivisibleByFiveAndTwo(int num) {
        return num % 10 == 0; // lcm of 5 and 2 is 10
    }
}