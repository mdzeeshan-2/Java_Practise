public class k29 {
    public static void main(String[] args) {
        cube cube = new cube();
        cube.breadth = 2;
        cube.length = 4;
        cube.weight = 8;
        cube.print();
    }
}

class box {
    double length;
    double breadth;
    double weight;
}

class cube extends box {
    void print() {
        System.out.println(length * breadth * weight);
    }
}
