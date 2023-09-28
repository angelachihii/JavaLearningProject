package md.tekwillacademy.operationsandciclicfunctions;

public class operatiiLogiceSiIfElse {
    public static void main(String[] args) {

                int varsta = 19;
                boolean arePermisDeConducere = true;
                boolean esteStudent = false;

                // Verifica dacă persoana are permis de conducere și este mai mare de 18 ani
                if (arePermisDeConducere && varsta >= 18) {
                    System.out.println("Persoana poate conduce.");
                } else {
                    System.out.println("Persoana nu poate conduce.");
                }

                // Verifica dacă persoana este student sau are mai mult de 30 de ani
                if (esteStudent || varsta > 46) {
                    System.out.println("Persoana este student sau are peste 30 de ani.");
                } else {
                    System.out.println("Persoana nu este student și nu are peste 30 de ani.");
                }

                // Negarea unei condiții
                boolean nuEsteStudent = !esteStudent;
                if (nuEsteStudent) {
                    System.out.println("Persoana nu este student.");
                } else {
                    System.out.println("Persoana este student.");
                }
            }
        }



