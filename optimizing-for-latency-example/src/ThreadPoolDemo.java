import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {

    public static void main(String[] args) {
        
        Executor executor = Executors.newFixedThreadPool(4);

        executor.execute(()-> System.out.println("Run by thread" + Thread.currentThread().getName()));
        executor.execute(()-> System.out.println("Run by thread" + Thread.currentThread().getName()));
        executor.execute(()-> System.out.println("Run by thread" + Thread.currentThread().getName()));
        executor.execute(()-> System.out.println("Run by thread" + Thread.currentThread().getName()));
        executor.execute(()-> System.out.println("Run by thread" + Thread.currentThread().getName()));
        executor.execute(()-> System.out.println("Run by thread" + Thread.currentThread().getName()));
        executor.execute(()-> System.out.println("Run by thread" + Thread.currentThread().getName()));
        executor.execute(()-> System.out.println("Run by thread" + Thread.currentThread().getName()));

    }
    
}
