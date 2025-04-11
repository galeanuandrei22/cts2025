public interface Subject {
    void subscribe(Observer observer);
    void unsuscribe(Observer observer);
    void notifyObservers(String message);
}
