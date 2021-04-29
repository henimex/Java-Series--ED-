package hendev.exceptions;


public class Main {
    public static void main(String[] args) {

        int exceptionCounter = 0;
        try {

            String city = "Ankara";
            System.out.println(city.charAt(19));
            int[] numbers = new int[]{1,2,3,4,5,6};
            System.out.println(numbers[15]);

        }catch(Exception exception){
            System.out.println("There is an Error");
            System.out.println(exception.getMessage());
            exceptionCounter+=1;

        }finally {
            System.out.println("Request Complated With " + exceptionCounter + " error/s");
        }
    }
}
