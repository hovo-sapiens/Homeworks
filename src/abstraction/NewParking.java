package abstraction;

public class NewParking {
    private int count;
    private int parkingLength;
    private Car[][] arr;

    NewParking(int parkingLength) {
        this.parkingLength = parkingLength;
        this.arr = new Car[parkingLength][parkingLength];
    }

    void addCarInParking(Car car) {
        if (count == parkingLength * parkingLength) {
            System.out.println("Parking is full, please remove a car.");
        } else {
            switch (car.getType()) {
                case JEEP:
                    addCarLogic(0, car);
                    break;
                case SEDAN:
                    addCarLogic(1, car);
                    break;
                case COUPE:
                    addCarLogic(2, car);
                    break;
                default:
                    System.out.println("This type of car cannot be parked here.");
            }
        }
    }

    private void addCarLogic(int floor, Car car) {
        for (int i = 0; i < arr[floor].length - 1; i++) {
            if (arr[floor][i] != null && car.getModel() == arr[floor][i].getModel()) {
                System.out.println("The car is already in parking.");
                break;
            } else if (arr[floor][i] == null) {
                arr[floor][i] = car;
                count += 1;
                System.out.println("Car is added.");
                break;
            } else {
                if (i == arr[floor].length - 1) {
                    System.out.println("This floor is full, bro.");
                }

            }
        }

    }

    void removeCar(int floor,int place){
        if (floor>=0&&floor<arr.length&&place>=0&&place<arr[floor].length&&arr[floor][place]!=null) {
            --this.count;
            System.out.println("The "+arr[floor][place].getModel()+" is removed");
            arr[floor][place]=null;
        }else{
            System.out.println("This place was already empty");
        }
    }

    void emptyFloor(int floor){
        if(floor>=0 && floor<arr.length){
            for(int i=0;i<arr[floor].length;i++){
                arr[floor][i]=null;
            }
            System.out.println("The "+floor+" floor is empty.");
        }else {
            System.out.println("There isn't floor "+floor+" in this parking");
            return;
        }
    }

    void parkingInfo(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ; ");
            }
            System.out.println();
        }
    }
}
