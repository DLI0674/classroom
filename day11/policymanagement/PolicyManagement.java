package classroom.day11.policymanagement;

public class PolicyManagement {
    public static void main(String[] args) {
        Policy p=new Policy("123","Mridul",50000);
        PolicyManager manager=new PolicyManager();
        for(int i=0;i<10;i++){
            manager.write(p);
        }
        manager.summeries();
    }
}
