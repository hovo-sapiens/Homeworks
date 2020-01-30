package com.company;

public class Car {
    private String name;
    private String model;
    private String color;
    private String number;
    private int maxSpeed=190;
    private int speed;
    private Boolean start;
    private boolean engineStatus=true;

    public Car(String name,String model,String color,String number){
        this.name=name;
        this.model=model;
        this.color=color;
        this.number=number;
    }

    public String getCarNumber() {
        return this.number;
    }

    public void setEngineStatus(boolean engineStatus){
        if(speed>maxSpeed){
            System.out.println("Your car's engine needs a repair");
        }else{this.engineStatus=engineStatus;}
    }

    public void setStart(String start){
        boolean value;
        if(start == "on") {
            value = true;
        } else {
            value = false;
        }
            this.start = value;
    }
    public boolean getStart(){
        return start;
    }

    public void setSpeed(int speed) {
        if(start == false) {
            System.out.println("Start your engine first");
        } else if(engineStatus == false) {
            System.out.println("Your car's engine needs a repair");
        } else if(speed < 0) {
            System.out.println("You're breaking the laws of physics");
        } else {
            this.speed = speed;
        }
    }
    public int getSpeed() {
        System.out.println("Your speed is "+speed+"km/h");
        return speed;
    }

    public int increaseSpeed(int addSpeed) {
        speed += addSpeed;
        if(speed > maxSpeed) {
            engineStatus=false;
            System.out.println("Your car's engine needs a repair");
        }
        else if(speed<0||addSpeed<0){
            System.out.println("You're breaking the laws of physics");
        }
        else {
            System.out.println("Now your speed is " + speed + "km/h");
        }
            return speed;
    }

    public int decreaseSpeed(int takeSpeed){
        if(speed>maxSpeed){
            engineStatus=false;
        }
        else if(speed<0||takeSpeed<0){
            System.out.println("You're breaking the laws of physics");
        }
        else {
            speed-=takeSpeed;
            System.out.println("Now yore speed is " + speed + "km/h");
        }
        return speed;
    }
}
