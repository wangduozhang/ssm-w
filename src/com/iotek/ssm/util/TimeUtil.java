package com.iotek.ssm.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2018/10/18 0018.
 */
public class TimeUtil {

    public static String getTime(){
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        String year = String.valueOf(calendar.get(Calendar.YEAR));
        String month = String.valueOf(calendar.get(Calendar.MONTH)+1);
        String day = String.valueOf(calendar.get(Calendar.DATE));
        String wh =year+"-"+month+"-"+day+" ";
        return wh;
    }
    public static String getLatenes(Date date){
        String late="";
        Long time = date.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String wh =getTime()+"09:00:00";
        try {
            Date date1 = sdf.parse(wh);
            System.out.println(date1);
            Long time1 = date1.getTime();
            if (time.intValue()>time1.intValue()){
                late= "迟到";
            }else {
                late= "未迟到";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return late;
    }
    public static String getBefore(Date date){
        String late="";
        Long time = date.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String wh =getTime()+"17:00:00";

        try {
            Date date1 = sdf.parse(wh);
            Long time1 = date1.getTime();
            if (time.intValue()>time1.intValue()){
                late= "未早退";
            }else {
                late= "早退";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return late;
    }
    public static String getAbsent(Date date){
        String late="";
        Long time = date.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String wh =getTime()+"09:30:00";

        try {
            Date date1 = sdf.parse(wh);
            Long time1 = date1.getTime();

            if (time.intValue()>time1.intValue()){
                late ="旷工";
            }else {
                    late ="未旷工";
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return late;
    }
}
