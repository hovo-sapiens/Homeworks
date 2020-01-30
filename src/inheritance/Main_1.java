package inheritance;

public class Main_1 {
    public static void main(String[] args){
        Nurses n=new Nurses("Anna Hakobyan",23,"nurs",65000);
        System.out.println(n);
        Doctors d=new Doctors("Hakob Hakobyan",23,"surgeon",80000);
        System.out.println(d);
    }
}
