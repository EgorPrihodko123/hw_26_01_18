package HW_26_1_18.task_11;

public class Run {
    public static void main(String[] args) {
        Car car=new Car();
        car.setPower(5);
       // car.changePower("-",3);
        Lorry lor=new Lorry();
        lor.setModel("mazda");
        lor.reSetModel("toyota");
        System.out.println(lor.getModel());
    }
}
