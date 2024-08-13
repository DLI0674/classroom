package classroom.day16.observerpattern;

public class Location2 implements Location{
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
    @Override
    public void display(){
        System.out.println("Location2 Weather Stats\n"+"Temperature: "+temperature+"^C\n"+"Humidity: "+humidity+"%");
    }
}
