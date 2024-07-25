package classroom.day1.rectangle;

class Rectangle {
    int length;
    int width;
    Rectangle(int l,int w){
        this.length=l;
        this.width=w;
    }
    int area(){
        return length*width;
    }
    int perimeter(){
        return 2*(length+width);
    }
}
