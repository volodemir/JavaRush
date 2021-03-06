package main.java.org.javaRush.TicTacToe;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

import static java.lang.System.in;

public class TicTacToe {
    private final char X = 'x';
    private final char O = '0';
    private final char empty = '-';
    private char [][]grid;
    private Scanner scanner;
    public String playerOne;
    public String playerTwo;
    public int countWinsPlayerOne;
    public int countWinsPlayerTwo;
    public String playerOneId;
    public String playerTwoId;
    public int stepNumber;
    public int x,y;
    public ArrayList<String> gameLog;

    public static void main(String[] args) throws IOException {
        new TicTacToe().game();
    }

    public TicTacToe() throws FileNotFoundException {
        scanner = new Scanner(in);
        grid = new char[3][3];
        playerOneId = "1";
        playerTwoId = "2";
        stepNumber = 0;
        this.gameLog = new ArrayList<>();
    }
    void game() throws IOException {
        initTable();
        System.out.print("1 игрок, введите ваше имя: ");
        playerOne = scanner.next();
        System.out.print("2 игрок, введите ваше имя: ");
        playerTwo = scanner.next();
        while (true){
            turnPlayerOne();
            if(checkWin(X)){
                System.out.println("Игрок " + playerOne + " победил!");
                countWinsPlayerOne ++;
                break;
            }
            if(isGridFull()){
                System.out.println("sorry draw");
                break;
            }
            turnPlayerTwo();
            printTable();
            if (checkWin(O)){
                System.out.println("Игрок " + playerTwo + " победил!");
                countWinsPlayerTwo ++;
                break;
            }
            if(isGridFull()){
                System.out.println("sorry draw");
                break;
            }
        }
        System.out.println("Игра окончена");

        FileWriter writer = new FileWriter("D://workspace//JavaRush//src//main//java//org//javaRush//TicTacToe/rating.txt", true);
        writer.append("Количество побед у игрока " + playerOne + ": " + countWinsPlayerOne + "\n");
        writer.append("Количество побед у игрока " + playerTwo + ": " + countWinsPlayerTwo + "\n");
        writer.close();
        printTable();
    }
    void initTable(){
        for (int i=0; i<3; i++){
            for (int j = 0; j<3; j++){
                grid[i][j] = empty;
            }
        }
    }
    void printTable(){
        for (int i=0; i<3; i++){
            for (int j = 0; j<3; j++) {
                System.out.print(" " + grid[i][j] + " |");
            }
                System.out.println();

        }
    }
    void turnPlayerOne(){
        do {
            System.out.println(playerOne + ", введите координаты X и Y (1-3):");
            System.out.print("x: "); x = scanner.nextInt() - 1;
            System.out.print("y: "); y = scanner.nextInt() - 1;
            stepNumber++;
            gameLog.add((x+1) + Integer.toString(y+1));
        }
        while (!isCellValid(x,y));
            grid[y][x] = X;

    }
    void turnPlayerTwo(){
        do {
            System.out.println(playerTwo + ", Введите координаты X и Y (1-3):");
            System.out.print("x: "); x = scanner.nextInt() - 1;
            System.out.print("y: "); y = scanner.nextInt() - 1;
            stepNumber++;
            gameLog.add((x+1) + Integer.toString(y+1));
        }
        while (!isCellValid(x,y));
        grid[y][x] = O;

    }
    boolean isCellValid(int x, int y){
        if (x<0 || y<0 || x>=3 || y>=3){
            return false;
        }
        return grid[y][x] == empty;
    }
    boolean checkWin(char ch){
        for (int i=0; i<3; i++){
            if((grid[i][0] == ch && grid[i][1] == ch && grid[i][2] == ch) ||
                    (grid[0][i] == ch && grid[1][i] == ch && grid[2][i] == ch)){
                return true;
            }
            if ((grid[0][0] == ch && grid[1][1] == ch && grid[2][2] == ch) ||
                    (grid[2][0] == ch && grid[1][1] == ch && grid[0][2] == ch)){
                return true;
            }
        }
        return false;
    }
    boolean isGridFull(){
        for (int i=0; i<3; i++){
            for (int j=0; j<3; j++){
                if (grid[i][j] == empty){
                    return false;
                }
            }
        }
        return true;
    }
    private void gameLog(){

    }
}
