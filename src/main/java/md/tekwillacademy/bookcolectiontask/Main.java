package md.tekwillacademy.bookcolectiontask;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Book firstBook = new Book("Amintiri din copilarie", "  Ion Creanga");
        Book secondBook = new Book("Amintiri din viitor", " Andreea Russo");
        Book trirdBook = new Book("IT STARTS WITH US", " COLLEEN HOOVER");
        Book fourthBook = new Book("THEODOROS", " Mircea Cartarescu");
        Book fifthBook = new Book("Anne de la Green Gables", " Lucy Maud Montegomery");

        firstBook.printTheBookDetails();
        secondBook.printTheBookDetails();
        trirdBook.printTheBookDetails();
        fourthBook.printTheBookDetails();
        fifthBook.printTheBookDetails();

        Library carturestiLibrary = new Library("Carturesti");

        carturestiLibrary.addBook(firstBook);
        carturestiLibrary.addBook(secondBook);
        carturestiLibrary.addBook(trirdBook);
        carturestiLibrary.addBook(fourthBook);

        carturestiLibrary.addBook(fifthBook);
        System.out.println(carturestiLibrary.getTheStockStatusNumber());
        System.out.println(carturestiLibrary.isThereSuchABookInTheStock(fifthBook));

carturestiLibrary.deleteABookIfExist(fifthBook);
        System.out.println((carturestiLibrary.getTheStockStatusNumber()));

        carturestiLibrary.printAllTheBooks();

        Library angelasLibrary = new Library("Cartier");

        angelasLibrary.addBook(firstBook);
        angelasLibrary.addBook(secondBook);
        angelasLibrary.addBook(trirdBook);

        System.out.println(angelasLibrary.getTheStockStatusNumber());
        angelasLibrary.printAllTheBooks();

        Map<String, Library> libraryMap = new HashMap<>();
        libraryMap.put("Str. Stefan cel Mare 136 ", carturestiLibrary);
        libraryMap.put("Str. Dacia 27/3 ap.101", angelasLibrary);

        System.out.println(libraryMap.get("Str. Dacia 27/3 ap.101").getLibraryName());

        libraryMap.get("Str. Stefan cel Mare").printAllTheBooks();
        System.out.println(libraryMap.get("Str. Dacia 17/3 ap.101").isThereSuchABookInTheStock(firstBook));

int[] dataTable = new int[6];
dataTable [1]=65;
dataTable[2] = 89;
dataTable[3] = 6;
dataTable[4] = 47;
dataTable[5]= 3;
dataTable[6]= 965;

        System.out.println(IntNumberArrayService.findMin(dataTable));
        System.out.println(IntNumberArrayService.getAvg(dataTable));

    }
}
