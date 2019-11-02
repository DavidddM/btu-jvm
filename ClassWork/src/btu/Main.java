package btu;

public class Main {

    public static void main(String[] args) {
//        A instA = new A();
//        instA.Method1();
//        instA.Method4();
//        System.out.println(instA.Method2());
//        System.out.println(instA.Method3());
        FamilyBudget fBudget = new FamilyBudget();
        fBudget.setMoney(50000);
        FamilyMember member = new FamilyMember("David", "Maisuradze", 30, "Status");
        member.log();
        member.requestMoney(500, fBudget);
    }
}
