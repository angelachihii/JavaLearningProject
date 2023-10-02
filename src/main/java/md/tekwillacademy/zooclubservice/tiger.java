package md.tekwillacademy.zooclubservice;

public class tiger extends Animai  {
    public tiger(String nameOfTheTiger){
        super(nameOfTheTiger);
    }

    @Override
    public void makeSound() {
        System.out.println("Hrrrr");
    }

    @Override
    public void eat() {
        System.out.println("The dog is eating meat.");
    }
}
