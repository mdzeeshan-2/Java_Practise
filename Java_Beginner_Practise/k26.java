// import java.util.Scanner;
public class k26 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Roll No. ? Marks ? Subject ?");
        Students Rohan = new Students(21, 41, "English", "Rohan");
        Students Rohit = new Students(62, 34, "Maths", "Rohit");
        Students Harsh = new Students();

        // Rohan.rno = sc.nextInt();
        // Rohan.marks = sc.nextInt();
        // Rohan.subject = sc.nextLine();
        Rohan.print();
        Rohit.print();
        System.out.println(Harsh.marks);
    }
}

class Students {
    int rno;
    int marks;
    String subject;
    String name;

    // Students() {
    //     rno = 32;
    //     marks = 52;
    //     subject = "Social Science";
    //     name = "Harsh";
    // }
    Students() {
        this (8,1,"Science", "Zeeshan");
    }

    Students(int rno, int b, String c, String d) {
        this.rno = rno;
        marks = b;
        subject = c;
        name = d;
    }

    void print() {
        System.out.println(name + " ka roll number: " + rno + " " + name + " ka marks: " + marks + " " + name
                + " ka subject: " + subject);
    }
}
