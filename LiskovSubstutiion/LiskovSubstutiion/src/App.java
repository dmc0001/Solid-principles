public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Rectangel r1 = new Rectangel();
        Rectangel r2 = new Squre();
        r1.setHight(10);
        r1.setWidth(2);

        r2.setHight(10);
        System.out.println("Area : "+r1.getArea());
        r2.setWidth(2);
        System.out.println("Area : "+r1.getArea());
        System.out.println("Area : "+r2.getArea());
        //r1.getArea();
    }
}
