public class MathFunctions {

    public static double add(double a, double b) {
        return a + b;
    }


    public static double sub(double a, double b) {
        return a - b;
    }


    public static double multiply(double a, double b) {
        return a * b;
    }


    public static double div(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Ehtiyotkorona xato: nolga bo'lib bo'linmaydi!");
            return 0;
        }
    }


    public static double abs(double a) {
        return Math.abs(a);
    }


    public static double pow(double a) {
        return Math.pow(a, 2);
    }

    public static void main(String[] args) {
        // Test qilish
        System.out.println("Add: " + MathFunctions.add(10, 5));
        System.out.println("Sub: " + MathFunctions.sub(10, 5));
        System.out.println("Multiply: " + MathFunctions.multiply(10, 5));
        System.out.println("Div: " + MathFunctions.div(10, 5));
        System.out.println("Abs: " + MathFunctions.abs(-10));
        System.out.println("Pow: " + MathFunctions.pow(5));
    }
}
