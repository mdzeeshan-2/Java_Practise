public class k27 {
    public static void main(String[] args) {
        A Rohan = new A();
        Rohan.print();
        final A Rohit = new A();
        Rohit.num = 199;
        Rohit.print();
        
    }

}

class A {
    int num = 10;

    void print() {
        System.out.println(num);
    }
}
