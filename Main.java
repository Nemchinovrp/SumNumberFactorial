public class Main {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static int sumFactorial(BigInteger n) {
        int sum = 0;
        String s = n.toString();
        for (int i = 0; i < s.length(); i++) {
            sum += Integer.parseInt(Character.toString(s.charAt(i)));
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumFactorial(factorial(100000)));
    }
}
