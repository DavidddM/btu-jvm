package btu;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        TicTacToe ticTacToe = new TicTacToe();
        ticTacToe.ShowGrid();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Position: ");
            int pos = sc.nextInt();
            if (pos > 9 || pos < 1) continue;
            while(!ticTacToe.PlayerMove(pos)) {
                System.out.println("Position: ");
                pos = sc.nextInt();
                if (pos > 9 || pos < 1) break;
                ticTacToe.PlayerMove(pos);
            }
            ticTacToe.ComputerMove();
        }
    }
}
