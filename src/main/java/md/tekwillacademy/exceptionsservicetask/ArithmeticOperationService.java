package md.tekwillacademy.exceptionsservicetask;

public class ArithmeticOperationService {
    public static int divideIntNoExceptionHandling(int a, int b) {
        return  a/b;
    }
    public static double divideIntWithExceptionHandling(int a , int b) {
        try {
            int result = a/b;
            return result;
        } catch (ArithmeticException exceptionObject){
            System.out.println("An exception has occured: " + exceptionObject.getMessage());
            return  0;
        }
    }
}
