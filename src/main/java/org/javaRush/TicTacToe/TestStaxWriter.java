package main.java.org.javaRush.TicTacToe;

import java.io.FileNotFoundException;
import java.io.IOException;

public class TestStaxWriter {
    public static void main(String[] args) {
        StaxWriter configFile = new StaxWriter();
        configFile.setFile("D://workspace//JavaRush//src//main//java//org//javaRush//TicTacToe/gameLog.xml");
        try {
            configFile.saveConfig();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
