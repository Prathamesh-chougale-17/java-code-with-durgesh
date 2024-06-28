public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//        typecasting

//        implicit
        int i=2;
        double d = i;
        System.out.println(i);
        System.out.println(d);
//        explicit type
        double x = 2.4;
//        double cannot be converted in interger so we have used forceful or explicit convertion
        int y = (int)x;
        System.out.println(x);
        System.out.println(y);

    }
}