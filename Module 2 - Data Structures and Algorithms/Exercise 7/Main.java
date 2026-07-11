package dsa.exercise7;

public class Main {
    public static void main(String[] args){
        FinancialForecast fc=new FinancialForecast();
        double amount=10000;
        double rate=0.10;
        int years=5;
        double result=fc.futureValue(amount,rate,years);
        System.out.println("Initial Amount: "+amount);
        System.out.println("Growth Rate: "+(rate*100)+"%");
        System.out.println("Years: "+years);
        System.out.println("Future Value: "+result);
    }
}