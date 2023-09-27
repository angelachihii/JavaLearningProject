package md.tekwillacademy.accessmodifiers.peopleevidence;


public class Person {
    private  String name ;

    private String surname;

    private long ID;

    protected  String residence;

    public boolean isRetired;

    public  Person(String name, String surname, long id) {
        this.name = name;
        this.surname = surname;
        ID = id;
        System.out.println("Un obiect de tip Person a fost creat, folosind un constructor cu 3 parametri formali");


    }

    public Person(String name, String surname, long id, String residence, boolean isRetired) {
        this.name = name;
        this.surname = surname;
        ID = id;
        this.residence = residence;
        this.isRetired = isRetired;
        System.out.println("Un obiect de tip Person a fost creat cu ajutorul a5 parametri formali");

    }

}
