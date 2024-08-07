package classroom.day11.policymanagement;

import java.io.*;

public class PolicyManager {
      File policyfile=new File("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\policymanagement\\policies.txt");
      File summaryfile=new File("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\policymanagement\\summary.txt");
      void summeries(){
          try(BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\policymanagement\\policies.txt")); BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\policymanagement\\summary.txt"))){
              String line;
              int total=0,ct=0;
              while((line=reader.readLine())!=null){
                  String[] str=line.split(",");
                  if(str.length==3){
                      total+=Integer.parseInt(str[2]);
                      ct++;
                  }
              }
              String s="Total Number of Policies: "+ct;
              String sb="Total Policy Amount: "+total;
              writer.write(s);
              writer.write("\n");
              writer.write(sb);
          }catch (IOException e){
              e.printStackTrace();
          }
      }
      void write(Policy p){
          try(BufferedWriter writer=new BufferedWriter(new FileWriter("C:\\Users\\Mridul.Tiwari\\IdeaProjects\\Java\\src\\classroom\\day11\\policymanagement\\policies.txt",true))){
              writer.write(p.getString());
              writer.write("\n");
          }catch (IOException e){
              e.printStackTrace();
          }
      }
}
