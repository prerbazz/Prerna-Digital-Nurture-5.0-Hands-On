public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket market=new StockMarket();
        Observer mobile=new MobileApp();
        Observer web=new WebApp();
        market.registerObserver(mobile);
        market.registerObserver(web);
        market.setStock("TCS",4200);
        System.out.println();
        market.removeObserver(web);
        market.setStock("Infosys",1800);
    }
}