package HW_26_1_18.task_11;

public class Lorry extends Car {
    public int carryingCapacity;

    public int getCarryingCapacity() {
        return carryingCapacity;
    }
    public void setCarryingCapacity(int carryingCapacity) {
        this.carryingCapacity = carryingCapacity;
    }
    public int ChangeCarryingCapacity(String action, int changeCarryingCapacity){
        if(action=="-"){
            carryingCapacity-=changeCarryingCapacity;
        }else if(action=="+"){
            carryingCapacity+=changeCarryingCapacity;
        }else{
            System.out.println("Ввели неправильное действие.");
        }
        System.out.println(carryingCapacity);
        return carryingCapacity;
    }
    public void reSetModel(String model) {
        this.model = model;
    }
}
