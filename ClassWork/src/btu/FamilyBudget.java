package btu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyBudget {
    private int money;

    void setMoney(int money) {
        this.money = money;
        this.log();
    }

    int getMoney() {
        return this.money;
    }

    void chMoney(int sum) {
        if ((sum < 0 && (this.money+sum>=0)) || sum>0 ) {
            this.money += sum;
            this.log();
        }
    }

    void fin() {
        if(this.money > 40000) System.out.println("მდიდარი");
        else if (this.money > 10000) System.out.println("საშუალო");
        else {
            System.out.println("ღარიბი");
        }
    }

    private void log() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("budget.txt"));
            writer.write(String.valueOf(this.money));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
