public class Calculator {
    public static void main(String[] args) {   
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        int ratata = Integer.parseInt(args[2]);

        if (ratata > 0){
            // addtion
            int result = x + y;
            System.out.println("The addition result is:" + result);
        }
        else{
            // subtract
            int result = x - y;
            System.out.println("The subtraction result is:" + result);
        }

    }
}