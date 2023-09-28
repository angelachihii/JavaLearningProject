package md.tekwillacademy.operationsandciclicfunctions;

public class ciclic {
    public static void main(String[] args) {

                int ziSaptamana = 7; // 1 pentru Luni, 2 pentru Marti, etc.

                switch (ziSaptamana) {
                    case 1:
                        System.out.println("Este Luni.");
                        break;
                    case 2:
                        System.out.println("Este Marti.");
                        break;
                    case 3:
                        System.out.println("Este Miercuri.");
                        break;
                    case 4:
                        System.out.println("Este Joi.");
                        break;
                    case 5:
                        System.out.println("Este Vineri.");
                        break;
                    case 6:
                        System.out.println("Este Sambata.");
                        break;
                    case 7:
                        System.out.println("Este Duminica.");
                        break;
                    default:
                        System.out.println("Valoarea zilei saptamanii nu este valida.");
                }
            }
        }

