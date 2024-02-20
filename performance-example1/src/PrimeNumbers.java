import java.util.ArrayList;
import java.util.List;

public class PrimeNumbers {
    
    private List<Integer> primes = new ArrayList<Integer>();

    //isPrime method
    public boolean isPrime(Integer number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    //generate Next Prime method
    public Integer generateNextPrime(Integer number) {
        Integer nextPrime = number + 1;
        while (!isPrime(nextPrime)) {
            nextPrime++;
        }
        return nextPrime;
    }

    //generatePrimes using generateNextPrime method
    public void generatePrimes(Integer max) {
        Integer number = 2;
        while (primes.size() <= max) {
            primes.add(number);
            number = generateNextPrime(number);
        }
        // System.out.println(primes);
    }

 
}
