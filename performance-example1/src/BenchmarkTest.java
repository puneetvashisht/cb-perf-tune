class BenchmarkTest{
    public static void main(String[] args) {
        NumberChecker nc = new NumberChecker();

        for(int i=0;i<10000;i++){
            nc.isPrime1(i);
        }

        System.out.println("Warm up period...");
        System.out.println("Now testing for performance");
        long startTime = System.currentTimeMillis();
        for(int i=0;i<50000;i++){
            nc.isPrime1(i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Time to run: " + (endTime - startTime) + "ms");
    }
}