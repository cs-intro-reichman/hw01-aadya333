public class LinearEq {
    // Computes the roots of the equtaion a*x+b=c
    public static void main(String[] args) {
    Double a = Double.parseDouble(args[0]);
    Double b = Double.parseDouble(args[1]);
    Double c = Double.parseDouble(args[2]);
    double x = (c - b) / a;
    System.out.println( a + "*x + " + b + " = " + c );
    System.out.println("x = " + x );


    }
}
