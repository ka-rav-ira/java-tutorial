public class DistinctPrimeFactors {
    class Solution {
        public int distinctPrimeFactors(int[] nums) {
            int maxNum = 0;
            for (int num : nums) {
                maxNum = Math.max(maxNum, num);
            }

            // Get all primes up to maxNum using the sieve
            List<Integer> primes = sieve(maxNum);
            Set<Integer> distinctPrimes = new HashSet<>();

            // Extract prime factors for each number
            for (int num : nums) {
                for (int prime : primes) {
                    if (prime > num) break;
                    if (num % prime == 0) {
                        distinctPrimes.add(prime);
                        while (num % prime == 0) {
                            num /= prime;
                        }
                    }
                }
            }

            return distinctPrimes.size();
        }

        public List<Integer> sieve(int N) {
            List<Integer> primes = new ArrayList<>();
            boolean[] isPrime = new boolean[N + 1];
            Arrays.fill(isPrime, true);
            isPrime[0] = isPrime[1] = false;

            for (int i = 2; i * i <= N; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= N; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            for (int i = 2; i <= N; i++) {
                if (isPrime[i]) {
                    primes.add(i);
                }
            }

            return primes;
        }
    }
}
