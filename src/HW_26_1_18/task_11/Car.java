package HW_26_1_18.task_11;

public class Car {
    public String model;
    public int weight;
    public int power;
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public int changePower(String action,int changePower){
        if(action=="-"){
            power-=changePower;
        }else if(action=="+"){
    power+=changePower;
        }else{
            System.out.println("Ввели неправильное действие.");
        }
        System.out.println(power);
        return power;
    }
}
