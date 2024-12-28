public class h24 {
    public static void main(String[] args) {
        Duniya worldFemale = new Duniya("F");
        Duniya worldMale = new Duniya("M", 21);
        worldFemale.survive();
        worldMale.survive();

    }
}

class Duniya {
    String inshan;
    int umar;

    public Duniya(String gender) {
        inshan = gender;
    }
    public Duniya(String gender, int age) {
        inshan = gender;
        umar = age;
    }

    void survive() {
        System.out.println("Jiyo jee bhar ke, kyuki you are a " + inshan +" aur iska umar hai " +umar);
    }
}
