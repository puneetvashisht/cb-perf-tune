public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Prime numbers!");
        // find time to run the program
//        Thread.sleep(50000);
        long startTime = System.currentTimeMillis();
    
        PrimeNumbers primeNumbers = new PrimeNumbers();
        // args[0] is the first command line argument
        primeNumbers.generatePrimes(Integer.parseInt(args[0]));
        long endTime = System.currentTimeMillis();
        System.out.println("Time to run: " + (endTime - startTime) + "ms");

        // primeNumbers.generatePrimes(10);
    }
}
