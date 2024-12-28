public class h22 {
    public static void main(String[] args) {
        inshanJaat janwar = new inshanJaat();
        janwar.name = "Abhimanu";
        janwar.birthYear = 2025;
        janwar.deathYear = 2063;
        janwar.caste();
        inshanJaat Dusrajanwar = new inshanJaat();
        Dusrajanwar.name = "Ritweek";
        Dusrajanwar.birthYear = 2062;
        Dusrajanwar.deathYear = 2103;
        Dusrajanwar.caste();
    }
}

class inshanJaat {
    String name;
    int birthYear;
    int deathYear;

    void caste() {
        System.out.println(
                "Iska naam hai " + name + " iska janam hoga " + birthYear + " Fir iska mritu hoga " + deathYear);
    }
}
