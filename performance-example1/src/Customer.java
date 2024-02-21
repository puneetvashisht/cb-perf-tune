public class Customer {
    int id;
    String name;
    int age;

    public Customer(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }
    public Customer() {
    }

    @Override
    protected void finalize() throws Throwable {
        // TODO Auto-generated method stub
        super.finalize();

        System.out.println("Customer object is garbage collected" + this.name);
        while(true){
            
        }
    }


}
