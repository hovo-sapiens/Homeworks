package com.company;

public class Parking {
    private int maxPlace=3;
    private int carCount;
    private Car[] cars;

    Parking(){
        this.carCount=0;
        this.cars=new Car[maxPlace];
    }

    public void addCar(Car car){
        for(int i=0; i < cars.length; ++i){
            if(cars[i] == car){
                System.out.println("The car is parked");
                return;
            }
        }
        if(this.carCount>=maxPlace){
            System.out.println("Parking is full.Please remove a car");
        }else{
            for(int i=0;i<cars.length;i++){
                if(cars[i]==null){
                    ++this.carCount;
                    cars[i]=car;
                    System.out.println("the car is parked in " + i + " place");
                    System.out.println(this.cars[i].getCarNumber());
                    return;
                }
            }
        }
    }

    public void removeCar(int index){
        if (index >= 0 && index < cars.length && cars[index]!=null) {
            --this.carCount;
            cars[index]=null;
            System.out.println("The car is removed");
        }else{
            System.out.println("The place is empty");
        }
    }

    public void getParkingInfo(){
        for(int i=0; i<cars.length; i++){
            if(cars[i]!=null){
                System.out.println(i+":"+this.cars[i].getCarNumber());
            }else{
                System.out.println("Place is empty");
            }
        }
    }
}
