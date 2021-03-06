package inheritance;

public class Doctors extends Employers {
    public Doctors(){}

    public Doctors(String name, int age, String profession, int salary){
        minAge=25;
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
