package classroom.day10.multithreading.problem3;

public class Singleton {
    private static volatile Singleton instance;
    private static Object mutex=new Object();
    private Singleton(){

    }
    static  Singleton getInstance(){
        Singleton res=instance;
        if(res==null){
            synchronized (mutex){
                res=instance;
                if(res==null){
                    instance=res=new Singleton();
                }
            }
        }
        return res;
    }
}
