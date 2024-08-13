package classroom.day16.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation {
    List<Location>list=new ArrayList<>();
    void register(Location location){
        list.add(location);
    }
    void deregister(Location location){
        list.remove(location);
    }
    void updateAll(int t,int h){
        for(Location location:list){
            location.currentTemperature(t);
            location.currentHumidity(h);
        }
    }
}
