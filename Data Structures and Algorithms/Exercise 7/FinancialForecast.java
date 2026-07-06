package dsa.exercise7;

public class FinancialForecast {
    public double futureValue(double amount,double rate,int years){
        if(years==0){
            return amount;
        }
        return futureValue(amount*(1+rate),rate,years-1);
    }
}