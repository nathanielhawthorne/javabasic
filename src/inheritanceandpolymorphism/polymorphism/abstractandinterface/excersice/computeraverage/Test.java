package inheritanceandpolymorphism.polymorphism.abstractandinterface.excersice.computeraverage;

abstract class ComputerAverage {
    double []data;
    abstract double average(double []data);
}


class Gymnastics extends ComputerAverage {
    double []data;
    Gymnastics(){

    }
    Gymnastics(double []data){
        this.data=data;

    }
    @Override
    double average(double []data) {
        double max,min;
        int k1=0,k2=0;
        max=min=data[0];
        for(int i=0;i<data.length;i++){
            if(data[i]>max){
                max=data[i];
                k1=i;
            }
            else if(data[i]<min){
                min=data[i];
                k2=i;
            }
        }
        data[k1]=0;
        data[k2]=0;
        double sum=0;
        for(int i=0;i<data.length;i++){
            sum+=data[i];
        }
        sum=sum/(data.length-2);
        return sum;
    }
}

class School extends ComputerAverage{
    double []data;
    School(){

    }
    School(double []data){
        this.data=data;
    }
    @Override
    double average(double []data) {
        double sum=0;
        for(int i=0;i<data.length;i++){
            sum+=data[i];
        }
        sum=sum/data.length;
        return sum;
    }
}

public class Test {

    public static void main(String[] args) {
        int n=6;
        double []data=new double[n];
        for(int i=0;i<n;i++){
            data[i]=i;
        }
        ComputerAverage g=new Gymnastics(data); //上转型对象
        System.out.println(g.average(data));

        for(int i=0;i<n;i++){
            data[i]=i;
        }
        ComputerAverage s=new School(data);  //上转型对象
        System.out.println(s.average(data));
    }
}