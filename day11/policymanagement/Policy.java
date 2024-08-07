package classroom.day11.policymanagement;

public class Policy {
    private String policyId;
    private String policyHolderName;
    private int amount;
    Policy(String id,String holderName,int money){
        this.policyId=id;
        this.policyHolderName=holderName;
        this.amount=money;
    }
    String getString(){
        return policyId+","+policyHolderName+","+amount;
    }
}
