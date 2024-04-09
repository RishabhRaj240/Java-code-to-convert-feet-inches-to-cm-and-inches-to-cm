public class Main {

    public static void main(String[] args) {

        System.out.println("5ft, 8in = " + convetToCentimeters(5, 8) + "cm");
        System.out.println("68in = " + convetToCentimeters(68, 8) + "cm");
    }

    public static double convetToCentimeters(int inches, int i) {

        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {

        return ((feet * 12) + inches) * 2.54;
    }
}
