package md.tekwillacademy.accessmodifiers;


import md.tekwillacademy.accessmodifiers.peopleevidence.Person;

public class ChisinauEvidenceCatalog {
    public static void main(String[] args) {
        Person ionPerson = new Person("Ion", "Cartof", 147852369L);

        ionPerson.isRetired = true;

        if (ionPerson.isRetired) {
            System.out.println("Ion e la pensie");
        } else {
            System.out.println("Ion nu e la pensie");
        }
    }
}
