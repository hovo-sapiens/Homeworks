package inheritance;

public class Therapists extends Doctors {

    public Therapists(){}

    public Therapists(String name,int age,String profession,int salary)
    {
        super(name, age, profession, salary);
    }
}
