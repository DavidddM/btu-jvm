package btu;

import java.util.Random;
import java.util.Scanner;

public class A implements AInterface{
    int[] m = new int[15];

    @Override
    public void Method1() {
        int a, b;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a>b) {
            int tmp=a;
            a=b;
            b=tmp;
        }
        Random rand = new Random();
        for(int i=0; i<m.length; i++) {
            this.m[i] = rand.nextInt(b-a+1)+a;
        }
    }

    public int Method2() {
        int sum=0;
        for(int i=0; i<m.length; i++) {
            if(m[i]<i) {
                sum+=m[i];
            }
        }
        return sum;
    }

    public int Method3() {
        int mult=1;
        for(int i=0; i<m.length; i++) {
            if(m[i]>i) {
                mult*=i;
            }
        }
        return mult;
    }

    public void Method4() {
        for(int i=0; i<m.length; i++) {
            if(m[i]%2==0) {
                System.out.println(m[i]);
            }
        }
    }
}
