package demo;

public class Main {

    static class Yes{
        int studentId=1;
        String studentName = "Prathamesh";

//        method
        public void study(){
            System.out.println(studentName+" is studying");
        }
    }

    static void test(){
        System.out.println("test hello");
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        typecasting

//        implicit
        int i=2;
        System.out.println(i);
        System.out.println((double) i);
//        explicit type
        double x = 2.4;
//        double cannot be converted in integer, so we have used forceful or explicit conversion
        int y = (int)x;
        System.out.println(x);
        System.out.println(y);
        test();
        Yes a = new Yes();
        System.out.println(a.studentId);
        System.out.println(a.studentName);
        a.study();

        Dog dg = new Dog();
        System.out.println(dg.color);

        dg.eating();
    }
}

