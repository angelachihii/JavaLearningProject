package md.tekwillacademy.methodstask;

public class ExecutionService {
    public static void main(String[] args) {
        int randomInt = DataGeneratorUtil.getRandomInt(150, 340);
        System.out.println("Variabila randomInt:" + randomInt);

        int randomInt1 = DataGeneratorUtil.getRandomInt(150);
        System.out.println("Variabila randomInt:" + randomInt1);

        double randomDouble = DataGeneratorUtil.getRandomDouble(1000.0);
        System.out.println("Variabila randomDouble:" + randomDouble);

        double randomDouble1 = DataGeneratorUtil.getRandomDouble(-10000.0);
        System.out.println("Variabila randomDouble:" + randomDouble1);

        System.out.println("Random boolean : " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Email 1:" + DataGeneratorUtil.getRandomEmail());
        System.out.println("Random Email 2: " + DataGeneratorUtil.getRandomEmail());

        System.out.println("Random Valid String de X chars:" + DataGeneratorUtil.generateValidRandomString(256));
        System.out.println("Random Valid String de X chars:" + DataGeneratorUtil.generateValidRandomString(259));
        System.out.println("Random Valid String de X chars:" + DataGeneratorUtil.generateValidRandomString(19));

        Customer ionConsumer = new Customer("Ion Apapii", 26, "Ion.ppp@gmail.com");

        System.out.println("Nume obiect Ion:" + ionConsumer.getName());
        System.out.println("Ani obiect Ion :" + ionConsumer.getAge());
        System.out.println("Email obiect Ion:" + ionConsumer.getEmail());

        ionConsumer.setName("Ion Ciuperca");
        ionConsumer.setAge(96);
        ionConsumer.setEmail("ihhgyhyfh@gmail.com");

        System.out.println("Nume obiect Ion:" + ionConsumer.getName());
        System.out.println("Ani obiect Ion :" + ionConsumer.getAge());
        System.out.println("Email obiect Ion:" + ionConsumer.getEmail());

        Customer randomDataCustomer = new Customer(DataGeneratorUtil.generateInvalidRandomString(71), DataGeneratorUtil.getRandomInt(147), DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer.toString());

        randomDataCustomer.setName(DataGeneratorUtil.generateValidRandomString(9));
        randomDataCustomer.setAge(DataGeneratorUtil.getRandomInt(258, 589));
        randomDataCustomer.setEmail(DataGeneratorUtil.getRandomEmail());

        System.out.println(randomDataCustomer);

    }
    }
