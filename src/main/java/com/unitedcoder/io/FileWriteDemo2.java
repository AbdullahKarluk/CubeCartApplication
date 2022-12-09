package com.unitedcoder.io;

import org.apache.commons.io.FileUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.IOException;

public class FileWriteDemo2 {
    public static void main(String[] args) {
        StringBuilder builder=new StringBuilder();
        builder.append(" Apache Commons IO Test\n");
        builder.append("Test Automation CubeCart");
        DateTime dateTime=new DateTime();
        DateTimeFormatter formatter= DateTimeFormat.forPattern("yyyy-MM-dd--HH-mm-ss-SSS");
        String timeStamp=dateTime.toString(formatter);

        System.out.println(timeStamp);
        System.out.println("Time:"+FileWriteDemo1.getCurrentDateTime());



        File myFile=new File("doc"+File.separator+ timeStamp+"myFile"+".txt");
        try {
            FileUtils.writeStringToFile(myFile,builder.toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
