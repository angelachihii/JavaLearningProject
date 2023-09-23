package md.tekwillacademy.classesandobjects;

import javafx.concurrent.Worker;
import md.tekwillacademy.classesandobjects.autoservicetask.Garage;
import md.tekwillacademy.classesandobjects.autoservicetask.Person;
import md.tekwillacademy.classesandobjects.autoservicetask.car;
import md.tekwillacademy.classesandobjects.autoservicetask.worker;


public class ManageAutoService {
    public static void main(String[] args) {
        Garage autoDocGarage;

        autoDocGarage = new Garage();

        autoDocGarage.address = "Stefan Cel Mare, IHub 64";
        autoDocGarage.surfaceM2 = 450.0F;

        System.out.println("autoGarage are urmatoarele proprietati" + autoDocGarage.address
                + "    " + autoDocGarage.surfaceM2 + "    " + autoDocGarage.capacity);
        autoDocGarage.capacity = 50;
        System.out.println("Obiectivul autoGarage are urmatoarele proprietati" + autoDocGarage.address
                + "   " + autoDocGarage.surfaceM2 + "   " + autoDocGarage.capacity);

        Garage garajIaloveni = new Garage();

        System.out.println("Obiectivul autoGarage are urmatoarele proprietati" + autoDocGarage.address
                + "   " + autoDocGarage.surfaceM2 + "   " + autoDocGarage.capacity);

        worker vasile = new worker();

        vasile.name = "Vasile";
        vasile.age = 59;
        System.out.println("Obiectul nostru are numele de " + vasile.name + " si are " + vasile.age + "ani");

        Person client = new Person("+37325478954");

        car porsche1456 = new car("njuikjh", "Porsche Cayenne", client);
        System.out.println("Masina noastra este" + porsche1456.Mark + "  " +
                "si proprietarul poate fi apelat la " + porsche1456.Owner.phoneNumber);

    }
}

