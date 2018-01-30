package HW_26_1_18.task_10;

public class Student extends Man {

    public int age_Studying;
    public int raise;

    public int getAge_Studying() {
        return age_Studying;
    }
    public void setAge_Studying(int age_Studying) {
        this.age_Studying = age_Studying;
    }

    public int getRaise() {
        return raise;
    }

    public void setRaise(int raise) {
        this.raise = raise;
    }

    public int raiseAge(){
        age_Studying+=raise;
        System.out.println(age_Studying);
        return age_Studying;
    }
}
