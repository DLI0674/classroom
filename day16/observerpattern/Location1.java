package classroom.day16.observerpattern;

public class Location1 implements Location{
    int temperature;
    int humidity;
    @Override
    public void currentTemperature(int t) {
        this.temperature=t;
    }

    @Override
    public void currentHumidity(int h) {
        this.humidity=h;
    }
    public void display(){
        System.out.println("Location1 Weather Stats\n"+"Temperature: "+temperature+"^C\n"+"Humidity: "+humidity+"%");
    }
}
