package md.tekwillacademy.exceptionsservicetask;

public class Main {
    public static void main(String[] args) {
String controlVariable = null;
//System.out.println("The string length it i= " + TextManager.getTheTextLength(controlVariable));
        System.out.println("The string length it i= " + TextManager.getTheTextLengthWithTryAndCatch(controlVariable));
        System.out.println("The string length it i= " + TextManager.getTheTheTextLengthIfElse(controlVariable));

    System.out.println(ArithmeticOperationService.divideIntWithExceptionHandling(0,2));
        System.out.println(ArithmeticOperationService.divideIntWithExceptionHandling(0,0));


    }
}
