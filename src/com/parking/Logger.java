package com.parking;

import javafx.scene.input.DataFormat;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger logger = null;
    private final String logFile = "log-file.txt";
    private PrintWriter writer;
    private String log;

    private Logger(){
        try {
            FileWriter fw = new FileWriter(logFile);
            writer = new PrintWriter(fw, true);
        } catch (IOException e){
            e.printStackTrace();
        }

        log = new String();

    }

    private static class LoggerHolder{
        private final static Logger instance = new Logger();
    }

    public static Logger getInstance(){
        return LoggerHolder.instance;
    }


   public void addLog(String log){
       this.log += log + "\n";
   }

   public String showLog(){
       return log;
   }
}
