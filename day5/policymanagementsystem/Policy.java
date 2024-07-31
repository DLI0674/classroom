package classroom.day5.policymanagementsystem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Policy implements Comparable<Policy>{
    String policyNumber;
    String Name;
    String expiryDate;
    String coverageType;
    String premiumAmount;
    Integer remainingDays;

    Policy(String policynumber,String name,String expirydate,String coveragetype,String premiumamount){
        this.policyNumber=policynumber;
        this.Name=name;
        this.expiryDate=expirydate;
        this.coverageType=coveragetype;
        this.premiumAmount=premiumamount;

        LocalDate curDate=LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate inputDate=LocalDate.parse(expiryDate,formatter);
        remainingDays= (int)ChronoUnit.DAYS.between(inputDate,curDate);
    }
    @Override
    public int compareTo(Policy x) {
        return this.remainingDays.compareTo(x.remainingDays);
    }
}
