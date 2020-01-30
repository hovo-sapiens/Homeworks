package inheritance;

public class Employers {
    private String name;
    private int age;
    private String profession;
    private final int minSalary=68000;
    private final int maxAge=63;
    int minAge=22;
    private int salary;

    public Employers(){}

    public Employers(String name,int age,String profession,int salary){
        this.name=name;this.profession=profession;
        if(age<minAge||age>maxAge){
            System.out.println("Age of "+name+" is inappropriate");
        }else{this.age=age;}
        if(salary<minSalary){
            System.out.println("You can't hire "+name +" with salary lower than minimal salary");
        }else{this.salary=salary;}
    }


    public int getAge() {
        System.out.println("This person's age is "+age);
        return age;
    }

    public int getSalary() {
        System.out.println("This person's salary is "+salary);
        return salary;
    }

    public String getName() {
        System.out.println("This person's name is "+name);
        return name;
    }

    public String getProfession() {
        System.out.println("This person's profession is "+profession);
        return profession;
    }

    public int addSalary(int percent){
        salary+=minSalary*percent/100;
        return salary;
    }
    public int fineImpose(int percent){
        salary-=minSalary*percent/100;
        return salary;
    }

    public String toString(){
        return "Name :"+name+", age :"+age+", profession :"+profession+", salary :"+salary+"֏";
    }
}
