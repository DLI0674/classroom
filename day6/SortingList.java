package classroom.day6;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Person {
    String name;
    Integer age;
    int salary;

    Person(String n,Integer a,int s){
        this.name=n;
        this.age=a;
        this.salary=s;
    }
    int getAge(){
        return age;
    }
}
public class SortingList {
    public static void main(String[] args) {
        Person p1=new Person("Mridul",20,100);
        Person p2=new Person("Anand",22,100);
        Person p3=new Person("Saket",19,100);
        List<Person>list= Arrays.asList(p1,p2,p3);
        List<Person>ans=list.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        ans.forEach(p-> System.out.println(p.name));
    }
}
