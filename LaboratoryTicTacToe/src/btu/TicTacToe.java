package btu;

import java.util.*;

public class TicTacToe {
    // 1 - X - Player
    // 2 - O - Computer

    int [][] grid = new int[3][3];
    private Map<Integer, String> symbMap = new HashMap<Integer, String>();

    public TicTacToe() {
        this.symbMap.put(1, "X");
        this.symbMap.put(2, "O");
    }

    public boolean PlayerMove(int pos) {
        int j = (pos-1)%3;
        int i = (int)((pos-1)/3);
        if(this.grid[i][j]!=0) return false;
        this.grid[i][j]=1;
        this.CheckForWin(i, j, i==j || Math.abs(i-j)==2);
        this.ShowGrid();
        return true;
    }

    public void ComputerMove() {
        Random rand = new Random();
        int x, y;
        while(true) {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
            if(this.grid[x][y] == 0) {
                this.grid[x][y] = 2;
                break;
            }
        }
        this.ShowGrid();
        this.CheckForWin(x, y, x==y || Math.abs(x-y)==2);
    }

    public void ShowGrid() {
        System.out.println();
        int ident=1;
        for(int i=0; i<3; i++) {
            for (int j = 0; j < 3; j++, ident++) {
                if(this.grid[i][j]==0) {
                    System.out.print("(" + String.valueOf(ident + ") "));
                }
                else System.out.print("("+this.symbMap.get(this.grid[i][j]) + ") ");
            }
            System.out.print("\n");
        }
    }

    public void CheckForWin(int x, int y, boolean checkForDiagonal) {
        boolean winX;
        boolean winY=winX=true;
        boolean winDiag1;
        boolean winDiag2=winDiag1=false;

        boolean tie=true;
        for(int i=0; i<3; i++) {
            for(int j=0; j<3; j++) {
                if(this.grid[i][j]!=0) tie=false;
            }
        }
        if(tie) {
            System.out.println("Tie!");
            System.exit(0);
        }
        for(int i=0; i<2; i++) {
            if(this.grid[x][i]!=this.grid[x][i+1]) winX=false;
            if(this.grid[i][y]!=this.grid[i+1][y]) winY=false;
        }
        if(checkForDiagonal) {
            if (x==y) {
                winDiag1 = true;
                for (int i = 0; i < 2; i++) {
                    if (this.grid[i][i] != this.grid[i + 1][i + 1]) winDiag1 = false;
                }
            }
            else {
                winDiag2 = true;
                for (int i = 0, j = 2; i<2 && j>0; i++, j--) {
                    if (this.grid[i][j] != this.grid[i + 1][j - 1]) winDiag2 = false;
                }
            }
        }
        if(winX || winY || winDiag1 || winDiag2) {
            this.ShowGrid();
            System.out.println(this.symbMap.get(this.grid[x][y])+" won!");
            System.exit(0);
        }

    }
}
