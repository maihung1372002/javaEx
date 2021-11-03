package homework3;


public class Test {
    public static void main(String [] args) {
        Customer t = new Customer(1, "hung", 10);
        Invoice i = new Invoice(2, t, 30000);
        System.out.print(t.toString()+"/n" + i.toString());
    }
}
