package classroom.day16.observerpattern;

public interface Location {
    void currentTemperature(int t);
    void currentHumidity(int h);
    void display();
}
