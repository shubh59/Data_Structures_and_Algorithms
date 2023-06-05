public class Recursion1 {
    public static void main(String[] args) {

        System.out.println(power(2, 8));
    }

    private static int power(int base, int expo) {
        if (expo < 1) // base case
            return 1;
        return base * power(base, expo - 1); // recursive case
    }
}
