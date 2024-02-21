public class CustomerHarness {

    public static void main(String[] args) throws InterruptedException {
        Runtime runtime = Runtime.getRuntime();

        long totalMemory = runtime.totalMemory();
        System.out.println("Total memory at start: " + totalMemory / 1024 + "k");

        long availableMemory = runtime.freeMemory();
        System.out.println("Available memory at start: " + availableMemory / 1024 + "k");
    
        for(int i=0; i<10000000; i++) {
            Customer customer = new Customer(i, "Customer" + i, 30);
        }

        availableMemory = runtime.freeMemory();
        System.out.println("Available memory after customers created: " + availableMemory / 1024 + "k");

        Thread.sleep(1000);

        availableMemory = runtime.freeMemory();
        System.out.println("Available memory after 1 second: " + availableMemory / 1024 + "k");

        System.gc();

        availableMemory = runtime.freeMemory();
        System.out.println("Available memory after GC: " + availableMemory / 1024 + "k");
        
    }

   
}
