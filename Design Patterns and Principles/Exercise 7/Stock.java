public interface Stock {
    void registerObserver(Observer ob);
    void removeObserver(Observer ob);
    void notifyObservers();
}