public class sdvg {
    public static void main(String[] args) {
        int a = 12;
        int b = 5;
        double c = expr(a, b);
        System.out.println(c);
    }

    public static double expr(int a, int b){
        double result = 0;
        printSum(a, b);
        if (b == 0){
            return b;
        }
        try {
            result = (double) a / b;
            return result;
        } catch (ArithmeticException e) {
            
        }
        return result;
    }

    public static void printSum(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }
}
