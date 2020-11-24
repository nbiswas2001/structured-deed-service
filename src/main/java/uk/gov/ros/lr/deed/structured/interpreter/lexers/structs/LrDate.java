package uk.gov.ros.lr.deed.structured.interpreter.lexers.structs;

import uk.gov.ros.lr.deed.structured.model.IEntity;

import java.util.HashMap;
import java.util.Map;

public class LrDate implements IEntity {

    private String day;
    private String month;
    private String year;

    public String getDay() { return day;}
    public void setDay(String day) { this.day = day;}
    public String getMonth() { return month;}
    public void setMonth(String month) { this.month = month;}
    public String getYear() { return year;}
    public void setYear(String year) { this.year = year;}

    //---------------------------------------
    private static Map<String, String> monthMap = new HashMap<>();
    static {
        monthMap.put("Jan", "01");
        monthMap.put("Feb", "02");
        monthMap.put("Mar", "03");
        monthMap.put("Apr", "04");
        monthMap.put("May", "05");
        monthMap.put("Jun", "06");
        monthMap.put("Jul", "07");
        monthMap.put("Aug", "08");
        monthMap.put("Sep", "09");
        monthMap.put("Oct", "10");
        monthMap.put("Nov", "11");
        monthMap.put("Dec", "12");
    }

    //------------------------------
    public String toDateString() {
       StringBuilder sb = new StringBuilder(year);
       sb.append("-").append(monthMap.get(month)).append("-");
       if(day.length() == 1) sb.append("0");
       sb.append(day);
       return sb.toString();

    }

    //----------------------------------
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Date:{ day: ").append(day).append(", month: ").append(month).append(", year: ").append(year).append("}");
        return sb.toString();
    }

}
