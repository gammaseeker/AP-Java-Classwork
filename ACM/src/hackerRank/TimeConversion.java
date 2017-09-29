package hackerRank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        if(s.substring(s.length() - 2, s.length()).equals("PM")){
            int hour = Integer.parseInt(s.substring(0,2));
            hour += 12;
            if(hour > 24){
                hour -= 12;
                int diff = 24 - hour;
                int num = 12 - diff;
                hour = 0;
                hour += num;
            }
            String output = hour + s.substring(2, s.length() - 2);
            return output;
        }
        return s.substring(0, s.length() - 2);
    }

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        String time = scan.next();
        String tArr[] = time.split(":");
        String AmPm = tArr[2].substring(2,4);
        int hh,mm,ss;
        hh = Integer.parseInt(tArr[0]);
        mm = Integer.parseInt(tArr[1]);
        ss = Integer.parseInt(tArr[2].substring(0,2));
        
        String checkPM = "PM",checkAM ="AM";
        int h = hh;
        if(AmPm.equals(checkAM) && hh==12)
        	h=0;
        else if(AmPm.equals(checkPM)&& hh<12)
        	h+=12;
        
        System.out.printf("%02d:%02d:%02d",h,mm,ss);
    }
}
