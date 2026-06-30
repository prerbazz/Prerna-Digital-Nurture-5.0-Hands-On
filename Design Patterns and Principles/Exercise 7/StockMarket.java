import java.util.ArrayList;

public class StockMarket implements Stock {
    private ArrayList<Observer> obs=new ArrayList<>();
    private String stockName;
    private double price;
    @Override
    public void registerObserver(Observer ob) {
        obs.add(ob);
    }
    @Override
    public void removeObserver(Observer ob) {
        obs.remove(ob);
    }
    @Override
    public void notifyObservers() {
        for(Observer ob:obs) {
            ob.update(stockName,price);
        }
    }
    public void setStock(String stockName,double price) {
        this.stockName=stockName;
        this.price=price;
        notifyObservers();
    }
}