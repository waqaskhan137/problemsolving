
public class PrimHappy {
    private static PrimHappy primHappy;

    public static void main(String[] args) {
        primHappy = new PrimHappy();
        System.out.println(primHappy.isPrimeHappy(25));
    }

    public int isPrimeHappy(int n) {

        int isPrimeHappy = 1;
        int count = 0, sum = 0;

        for (int i = 0; i < n; i++) {

            if (primHappy.isPrime(i)) {
                count++;
                sum += i;
            }
        }

        if (count < 1) {
            isPrimeHappy = 0;
        }

        if (sum % n != 0) {
            isPrimeHappy = 0;
        }

        return isPrimeHappy;


    }

    //checks whether an int is prime or not.
    boolean isPrime(int n) {
        //check if n is a multiple of 2
        if (n % 2 == 0) return false;
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
