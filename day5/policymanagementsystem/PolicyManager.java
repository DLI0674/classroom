package classroom.day5.policymanagementsystem;

import java.util.*;

public class PolicyManager {
    ArrayList<Policy>arr=new ArrayList<Policy>();
    HashSet<Policy>s1=new HashSet<Policy>();
    LinkedHashSet<Policy>s2=new LinkedHashSet<Policy>();
    TreeSet<Policy>s3=new TreeSet<Policy>();
    void addPolicy(Policy x){
        s1.add(x);
        s2.add(x);
        s3.add(x);
        arr.add(x);
    }
    void getAllUniquePolicies(){
        Iterator<Policy>x=s1.iterator();
        while(x.hasNext()){
            System.out.println(x.next().policyNumber);
        }
    }
    void getPoliciesExpiringSoon(){
        Iterator<Policy>x=s1.iterator();
        while(x.hasNext()){
            Policy p=x.next();
            System.out.println(p.policyNumber);
            if(p.remainingDays<30){
                break;
            }
        }
    }
    void getPoliciesByCoverage(String s){
        Iterator<Policy>x=s1.iterator();
        while(x.hasNext()){
            if(x.next().coverageType.equals(s)){
                System.out.println(s);
            }
        }
    }
    void findDuplicatePolicies(){
        HashSet<String>st=new HashSet<>();
        for(int i=0;i<arr.size();i++){
            if(st.contains(arr.get(i).policyNumber)){
                System.out.println(arr.get(i).policyNumber);
            }
            else{
                st.add(arr.get(i).policyNumber);
            }
        }
    }
    void comparePerformance(){
        //Policy test=new Policy("0","Max","2024-09-24","Health","50000");
        long a1=System.nanoTime();
        //s1.add(test);
        Iterator<Policy>x=s1.iterator();
        while(x.hasNext()){
            x.next();
        }
        long a2=System.nanoTime();
        //s2.add(test);
        Iterator<Policy>y=s2.iterator();
        while(y.hasNext()){
            y.next();
        }
        long a3=System.nanoTime();
        //s3.add(test);
        Iterator<Policy>z=s3.iterator();
        while(z.hasNext()){
            z.next();
        }
        long a4=System.nanoTime();
        System.out.println("Hashset: "+(a2-a1));
        System.out.println("LinkedHashset: "+(a3-a2));
        System.out.println("Treeset: "+(a4-a3));
    }
}
