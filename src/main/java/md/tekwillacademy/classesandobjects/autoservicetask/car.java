package md.tekwillacademy.classesandobjects.autoservicetask;

public class car {
    public String vinCode;

    public String Mark;

    public Person Owner;
    public car(String vinCodeInput, String mark, Person owner){

        vinCode = vinCodeInput;
        this.Mark = mark;
        this.Owner = owner;
        System.out.println("Now is a acar in the service of type " + mark);


    }


}
