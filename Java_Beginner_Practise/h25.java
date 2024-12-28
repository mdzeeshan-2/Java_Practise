public class h25 {
    public static void main(String[] args) {
        Add jor = new Add(2, 4);
        jor.jorna();
        jor.ghatana();
    }
}

class Add {
    int a, b;

    public Add(int a, int b) {
        this.a = 4;
        this.b = 4;
    }

    void jorna() {
        System.out.println(a);
        System.out.println(b);
        System.out.println(a + b);
        System.out.println("This is use for calling current method");
    }

    void ghatana() {
        System.out.println(a*b);
        System.out.println("yaha se neeche this ka use hoga");
        this.jorna();
    }
    
}