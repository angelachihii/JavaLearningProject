package md.tekwillacademy.zooclubservice;

public class zooservice {
  public static void main(String[] args) {


    Animai CharlyDog = new dog("Charley");


    System.out.println(CharlyDog.getName());
    CharlyDog.eat();
     CharlyDog.makeSound();

     dog rexDog = new dog("rex");
     System.out.println((rexDog.getName()));



  }

}
