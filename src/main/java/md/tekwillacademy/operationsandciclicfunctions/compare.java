package md.tekwillacademy.operationsandciclicfunctions;

public class compare {
    public static void main(String[] args) {
        int a=10;
        int b=1000000;
        //Egal
        boolean isEqual = a == b;
        System.out.println("Egal cu:" + isEqual);

        //Mi mare
        boolean isGreaterThan = a>b;
        System.out.println("Mai mare decat" +isGreaterThan);
        //Mai mic
        boolean isLessThan =a<b;
        System.out.println("Mai mic decat:" + isLessThan);

        //Mai mare sau egal cu
        boolean isLessThanOrEqual = a<= b;
        System.out.println("Mai mic sau egal cu:" +  isLessThanOrEqual);

        //Mai mic sau egal cu
        boolean isGreaterThanOrEqual = a<= b;
        System.out.println("Mai mic sau egal cu:" +  isGreaterThanOrEqual);
    }





}
