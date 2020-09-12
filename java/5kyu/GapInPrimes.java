import java.util.*;

class GapInPrimes {

    public static boolean isPrime(long i) {
        if (i <= 3)
            return i > 1;
        else if (i % 2 == 0 || i % 3 == 0)
            return false;

        long k = 5;
        while (k * k <= i) {
            if (i % k == 0 || i % (k + 2) == 0)
                return false;
            k += 6;
        }
        return true;
    }

    public static long[] gap(int g, long m, long n) {
        // your code
        List<Long> primes = new ArrayList<>();
        for (long i = m; i < n; i++) {
            if (isPrime(i))
                primes.add(i);
        }

        for (int i = 0; i < primes.size() - 1; i++) {
            long a = primes.get(i);
            long b = primes.get(i + 1);
            if (b - a == g)
                return new long[]{a, b};
        }

        return null;
    }
}
