import java.util.Scanner;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Choice{

public Choice(){

  Scanner scan = new Scanner(System.in);
  System.out.println("Which program do you want to select: Calculator, Tic Tac Toe, or Snake? Type C, T, or S. ");
  String option = scan.nextLine();
  if(option.equals("C")){
    Calculator calculatorOne = new Calculator();
  }
  else if(option.equals("T")){
    TicTacToe tictactoe = new TicTacToe();
  }
  else if(option.equals("S")){
    GameFrame frame = new GameFrame();
  }
  else{
    System.out.println("Please type C, T, or S to select a program.");
  }
}






}