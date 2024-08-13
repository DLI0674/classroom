package classroom.day16.observerpattern;

public class ObserverMain {
    public static void main(String[] args) {
        WeatherStation weatherStation=new WeatherStation();
        Location location1=new Location1();
        Location location2=new Location2();
        weatherStation.register(location1);
        weatherStation.register(location2);
        weatherStation.updateAll(35,65);
        location1.display();
        location2.display();
    }
}
