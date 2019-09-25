import java.util.*;

public class Main {

    private static void Task1() {
        String[] pLanguages = {"C++", "C#", "Java", "Pascal", "PHP", "JavaScript", "ActionScript"};
        for(String str: pLanguages) {
            System.out.println(str);
        }
    }

    private static void Task2() {
        Scanner sc = new Scanner(System.in);
        try {
            int a,b;
            a = sc.nextInt();
            b = sc.nextInt();
            System.out.println(a/b);
            System.out.println(b%a);

        }
        catch(Exception ex) {
            System.out.println("An exception has occurred: " + ex);
        }
    }

    private static void Task3() {
        Scanner sc = new Scanner(System.in);
        try {
            int sum = 0, mult = 1, tmp;
            for (int i = 0; i < 3; i++) {
                tmp = sc.nextInt();
                sum += tmp;
                mult *= tmp;
            }
            System.out.println(sum);
            System.out.println(mult);
        }
        catch(Exception ex) {
            System.out.println("An exception has occurred: " + ex);
        }
    }

    private static void Task4() {
        Scanner sc = new Scanner(System.in);
        try {
            int num;
            num = sc.nextInt();
            if(num<100 || num>999) {
                throw new Exception();
            }
            LinkedList<Integer> stack = new LinkedList<Integer>();
            while(num!=0) {
                stack.push(num % 10);
                num /= 10;
            }
            while(!stack.isEmpty()) {
                System.out.println(stack.pop());
            }
        }
        catch(Exception ex) {
            System.out.println("An exception has occurred: " + ex);
        }
    }

    private static void Task5() {
        Scanner sc = new Scanner(System.in);
        try {
            int num, sum=0;
            num = sc.nextInt();
            if(num<1000 || num>9999) {
                throw new Exception();
            }
            while(num!=0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println(sum);
        }
        catch(Exception ex) {
            System.out.println("An exception has occurred: " + ex);
        }
    }

    private static void Task6() {
        Scanner sc = new Scanner(System.in);
        try {
            int num, sum=0;
            num = Math.abs(sc.nextInt());
            while(num != 0) {
                sum += num % 10;
                num /= 10;
            }
            System.out.println(sum);
        }
        catch(Exception ex) {
            System.out.println("An exception has occurred: " + ex);
        }
    }

    private static int GCD(int n, int m) {
        if(n == 0) {
            return m;
        }
        return GCD(m % n, n);
    }

    private static void Task7() {
        Scanner sc = new Scanner(System.in);
        try {
            int n, m;
            n = sc.nextInt();
            m = sc.nextInt();
            System.out.println(String.format("GCD: %d\nLCM:%d", GCD(n,m), (n*m)/GCD(n, m)));
        }
        catch(Exception ex) {
            System.out.println("An exception has occurred: " + ex);
        }
    }

    private static void Task8() {
        Scanner sc = new Scanner(System.in);
        try {
            int M, N;
            M = sc.nextInt();
            N = sc.nextInt();
            for(;M<N;M++) {
                System.out.println(M);
            }
        }
        catch(Exception ex) {
            System.out.println("An exception has occurred: " + ex);
        }
    }

    private static void Task9() {
        Scanner sc = new Scanner(System.in);
        try {
            double[] numbers = new double[8];
            double min, max;
            min = max = numbers[0] = sc.nextDouble();
            for(int i=1; i<numbers.length; i++) {
                numbers[i] = sc.nextDouble();
                min = Double.min(numbers[i], min);
                max = Double.max(numbers[i], max);
            }
            for(double d: numbers) {
                System.out.println(d);
            }
            System.out.println(String.format("Max: %f\nMin: %f", max, min));
        }
        catch(Exception ex) {
            System.out.println("An exception has occurred: " + ex);
        }
    }

    private static void Task10() {
        Scanner sc = new Scanner(System.in);
        try {
            double[] numbers = new double[8];
            for(int i=0; i<numbers.length; i++) {
                numbers[i] = sc.nextDouble();
            }
            Arrays.sort(numbers);
            for(double d: numbers) {
                System.out.println(d);
            }
        }
        catch(Exception ex) {
            System.out.println("An exception has occurred: " + ex);
        }
    }

    private static void Task11() {
        double[] numbers = new double[8];
        Random rand = new Random();
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = rand.nextDouble() * rand.nextInt(10000);
        }
        for(double d: numbers) {
            System.out.println(d);
        }
    }

    private static void Task12() {
        Integer[] numbers = new Integer[8];
        Random rand = new Random();
        for(int i=0; i<numbers.length; i++) {
            numbers[i] = rand.nextInt(10000);
        }
        Arrays.sort(numbers, Collections.reverseOrder());
        for(int d: numbers) {
            System.out.println(d);
        }
    }

    public static void main(String[] args) {
        // Method calls..
    }
}
