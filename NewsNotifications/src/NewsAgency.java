import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Subject{
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unsuscribe(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void publishArticle(String articleTitle) {
        notifyObservers("Stire noua: " + articleTitle);
    }
}
