package HW_26_1_18.task_13;

public class Fraction {

    public int numerator;
    public int denominator;
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void  method1(){
        System.out.println(numerator+"/"+denominator);
    }
    public double method2(double numerator2,double denominator2){
        double num=numerator/denominator;
        double num2=numerator2/denominator2;
        double num3=num+num2;
        System.out.println(num3);
        return num3;
    }
    public double method3(double factor){
        double num=numerator/denominator;
    double result;
    result=num*factor;
        System.out.println(result);
        return result;
    }
    public double method4(double divider){
        double num=numerator/denominator;
        double result;
        result=num/divider;
        System.out.println(result);
        return result;
    }
}
