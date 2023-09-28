package md.tekwillacademy.operationsandciclicfunctions;

public class incrdecr {
    public static void main(String[] args) {

        {
            int numar = 5;

            // Incrementare
            int a = numar++;
            System.out.println("Post-incrementare: " + numar);

            int b = ++numar;
            System.out.println("Pre-incrementare: " + numar);

            // Decrementare
            int c = numar--;
            System.out.println("Post-decrementare: " + numar);

            int d = --numar;
            System.out.println("Pre-decrementare: " + numar);
        }
    }

}
