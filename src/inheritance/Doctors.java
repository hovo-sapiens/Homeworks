package inheritance;

public class Doctors extends Employers {
    public Doctors(){}

    public Doctors(String name,int age,String profession,int salary){
        super(name,age,profession,salary);
        this.minAge=25;
    }
}
