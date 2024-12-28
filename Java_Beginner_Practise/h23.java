public class h23 {
    public static void main(String[] args) {
        School dav = new School();
        dav.kakshaGyarvi(12);
        dav.kakshaGyarvi("A");
        dav.kakshaGyarvi("JohnWick", 11);
    }
}

class School {

    void kakshaGyarvi(int kaksha){
        System.out.println("Ye bacha "+kaksha+ " me padhta hai");
    }
    void kakshaGyarvi(String section){
        System.out.println("Ye bacha "+section+ " me padhta hai");
    }
    void kakshaGyarvi(String name,int kaksha){
        System.out.println("Ye bacha hai "+name+ " aur ye " +kaksha+ " me padhta hai");
    }
}
