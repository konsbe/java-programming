import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Student s1 = new Student();
        Student s2 = new Student();
        s2.uuid = "asd123for43skq?=";
        s2.setAge(1000);
        System.out.println((s1.uuid));
        System.out.println((s2.getAge()));
        System.out.println("first insert: ");

        Scanner scanner = new Scanner(System.in);
//        String s13 = scanner.next();
//        System.out.println((s1) + s13);
//        System.out.println("insert: ");
//        String s14 = scanner.next();
        System.out.println("insert: ");
        s1.setUuid(scanner.next());
        System.out.println((s1));
        System.out.println("insert: ");
        s1.setUuid(scanner.next());
        System.out.println((s1));

    }
}
