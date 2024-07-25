package classroom.day1.student;

public class Student {
    private String studentID;
    private String name;
    private int age;
    private char grade;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }


    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }
    public void display(){
        System.out.println(this.studentID);
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.grade);
    }
}
