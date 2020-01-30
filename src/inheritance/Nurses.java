package inheritance;

public class Nurses extends Employers {

    public Nurses(){}

    public Nurses(String name,int age,String profession,int salary) {
        super(name, age, profession, salary);
    }
}
