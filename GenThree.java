public class GenThree {
    public static void main(String[] args) {
        
     int a = Integer.parseInt(args[0]);
     int b = Integer.parseInt(args[1]);
     
        int random1 = (int) ((Math.random()*(b-a))+a);
        int random2 = (int) ((Math.random()*(b-a))+a);
        int random3 = (int) ((Math.random()*(b-a))+a);

        System.out.println(random1);
        System.out.println(random2);
        System.out.println(random3);

         
        int min = Math.min(random1, random2);
        int min2 = Math.min(min, random3);

        System.out.println("The minimal generated number was " + min2);
    
    }
}