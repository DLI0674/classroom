package classroom.day5.policymanagementsystem;

import java.util.Scanner;

public class PolicyMain {
    public static void main(String[] args) {
        PolicyManager manager=new PolicyManager();
        Scanner sc=new Scanner(System.in);
        Boolean flag=true;
        while(flag){
            System.out.println("Enter your operation: ");
            String operation=sc.nextLine();
            switch (operation){
                case "Add":{
                    System.out.println("Enter policy number: ");
                    String policynumber=sc.nextLine();
                    System.out.println("Enter policy holder name: ");
                    String policyname=sc.nextLine();
                    System.out.println("Enter expiry date: ");
                    String expiraydate=sc.nextLine();
                    System.out.println("Enter coverage type: ");
                    String coveragetype=sc.nextLine();
                    System.out.println("Enter premium amount: ");
                    String premiumamount=sc.nextLine();
                    Policy policy=new Policy(policynumber,policyname,expiraydate,coveragetype,premiumamount);
                    manager.addPolicy(policy);
                    break;
                }
                case "GetUniquePolicies":{
                    manager.getAllUniquePolicies();
                    break;
                }
                case "GetPoliciesByCoverage":{
                    System.out.println("Enter coverage type: ");
                    String s=sc.nextLine();
                    manager.getPoliciesByCoverage(s);
                    break;
                }
                case "FindDuplicatePolicies":{
                    manager.findDuplicatePolicies();
                    break;
                }
                case "GetPoliciesExpiringSoon":{
                    manager.getPoliciesExpiringSoon();
                    break;
                }
                case "ComparePerformance":{
                    manager.comparePerformance();
                    break;
                }
                default:{
                    System.out.println("Thank You");
                    flag=false;
                }
            }
        }
    }
}
