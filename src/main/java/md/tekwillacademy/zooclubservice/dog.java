package md.tekwillacademy.zooclubservice;

public class dog extends  Animai  {
    public  dog(String name){
        super(name);

    }

    @Override
    public void makeSound() {
        System.out.println("GAFF");
    }

    @Override
    public void eat() {
        System.out.println("A dog is eating bread.");
    }
}
