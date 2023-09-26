package md.tekwillacademy.accessmodifiers.ChisinauEvidenceCatalog.peopleevidence.Person;


public class Person {
    private  String name ;

    private String surname;

    private long ID;

    protected  String residence;

    public boolean isRetired;

    private Person(String name, String surname, long ID) {
        this.name = name;
        this.surname = surname;
        ID = long id;
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
