package btu;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FamilyMember {
    String name;
    String lastName;
    int age;
    String status;

    public FamilyMember(String name, String lastName, int age, String status) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.status = status;
    }

    public void log() {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("family.txt"));
            writer.write(String.format("%s\n%s\n%d\n%s\n", this.name, this.lastName, this.age, this.status));
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void requestMoney(int amount, FamilyBudget budget) {
        budget.chMoney(-amount);
    }
}
