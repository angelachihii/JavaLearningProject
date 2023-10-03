package md.tekwillacademy.exceptionsservicetask;

public class TextManager {

    public static int getTheTextLengthWithTryAndCatch(String inputString) {
        try {
            return inputString.length();
        } catch (NullPointerException capturedExceptionInTryBlock) {
            System.out.println("Afost comisa o exceptie cu mesajul:" + capturedExceptionInTryBlock.getMessage());
return  0;
        } finally {
            System.out.println("This block is executed");

        }

    }
public static int getTheTheTextLengthIfElse(String inputString) {
        if (inputString == null) {
            System.out.println("Input string is a null value,please be careful!!!!");
            return  0 ;
        }else {
            return inputString.length();
        }
}

}