public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Prime numbers!");
        PrimeNumbers primeNumbers = new PrimeNumbers();
        // args[0] is the first command line argument
        primeNumbers.generatePrimes(Integer.parseInt(args[0]));
        // primeNumbers.generatePrimes(10);
    }
}
