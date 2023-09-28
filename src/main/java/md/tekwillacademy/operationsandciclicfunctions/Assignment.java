package md.tekwillacademy.operationsandciclicfunctions;

public class Assignment {
    public static void main(String[] args) {
        int q = 8;
        int z = 4;

        //Atribuire simpla
        int result = q;
        System.out.println("Atribuie o adunare:" + result);

    //Atrribuire cu scadere
        result -= z;
        System.out.println("Atribuire cu adunare :" + result);
        //Atribuire cu adunare
        result += z;
        System.out.println("Atribuire cu scadere: " + result);

        //Atribuire cu impartire
        result /= z;
        System.out.println("Atribuirea cu impartire este:" + result);
        //Atribuirea cu restul impartirei
        result %= z;
        System.out.println("Atribuirea cu restul impartirei este:" + result);

    //Atribuirea cu inmultire
        result *= z;
        System.out.println("Rezultatul atribuirei cu inmultire este: " +result);

    }
}
