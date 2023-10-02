package md.tekwillacademy.zooclubservice;

public abstract class Animai implements Animaiinterface {

    private String name;

    public  Animai(String name) {
        this.name = name;
    }

    public  String getName(){return name;}
    public abstract void eat();


}
