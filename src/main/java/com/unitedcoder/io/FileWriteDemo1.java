package com.unitedcoder.io;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public class FileWriteDemo1 {
    public static void main(String[] args) {
        String s1="I am a Student";
        String s2="I am learning Java to find a job";
        String finalContent=s1+"\n"+s2;
        FileUtility fileUtility=new FileUtility();
        fileUtility.writeToFile("doc","test-automation"+getCurrentDateTime(),"txt",finalContent);
    }
    public static String getCurrentDateTime(){
        DateTime dateTime=new DateTime();
        //formating data time
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd-HH-mm-ss-SSS");
        return dateTime.toString(formatter);
    }
}
