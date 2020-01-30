package inheritance;

public class Surgeons extends Doctors {

    public Surgeons(){}

    public Surgeons(String name, int age, String profession, int salary){
        minAge=27;
        super.name = name;
        super.profession = profession;
        if(age < minAge || age > maxAge){
            System.out.println("Age of " + name + " is inappropriate");
        }else{
            super.age = age;
        }
        if(salary < minSalary){
            System.out.println("You can't hire " + name + " with salary lower than minimal salary");
        }else{
            super.salary = salary;
        }
    }
}
