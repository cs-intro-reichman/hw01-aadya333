public class Triangle {
    // Computes the roots of the equtaion a*x+b=c
    public static void main(String[] args) 
    {
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     int c = Integer.parseInt(args[2]);
     // Check if it is a triangle
     boolean isTriangle = false;

        if ((a + b > c) && (b + c > a) && (a + c > b)){
         
             
             isTriangle = true;
        }

        else{

             isTriangle = false;
         }
    
    System.out.println( a + ", " + b + ", " + c + ": " + isTriangle);


    }
}
