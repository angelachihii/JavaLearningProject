package md.tekwillacademy.accessmodifiers.ChisinauEvidenceCatalog;

import md.tekwillacademy.accessmodifiers.ChisinauEvidenceCatalog.peopleevidence.Person.
import md.tekwillacademy.classesandobjects.autoservicetask.Person;

public class Java {
    public static void main(String[] args) {

        Person ionPerson = new Person("Ion", "Cartof", 147852369);

        ionPerson.isRetired = true;

        if (ionPerson.isRetired) {
            System.out.println("Ion e la pensie");
        } else {
            System.out.println("Ion nu e la pensie");
        }
    }
}
