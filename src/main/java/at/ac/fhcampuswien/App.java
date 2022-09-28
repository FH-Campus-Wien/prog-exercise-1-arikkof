package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot(){
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");
    }

    //todo Task 3
    public void sumOfLiterals(){
        char a = 'Z';
        int b = 0xface; // hex, prefix Ox, decimal: 64208
        int c = 012; // base 8, prefix 0 (decimal: 10)
        long d = 80L; // long: suffix L
        float e = 44e-1f; // float: suffix f; 44 * 10 to the power of -1
        float f = 5.5f; // float
        float g = 8.88e1f; // float: 8.88 * 10 to the power of 1
        float h = 99.9f;
        int sum = (int ) ((int) a + b + c + d + (int) e + (int) f + (int) g + (int) h);

     /*   System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);*/
        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        //System.out.println("Geben Sie eine ganze Zahl ein!");
        int a = scanner.nextInt();
        //System.out.println("Geben Sie eine weitere ganze Zahl ein!");
        int b = scanner.nextInt();
        //System.out.println("Die Summe ihrer Zahlen lautet: ");
        System.out.println(a + b);
    }

    //todo Task 5
    public void swapTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Before Swap:");
        System.out.print("x: ");
        System.out.print("y: ");
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers(){
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        System.out.print("n1: ");
        System.out.print("n2: ");
        if(n1>n2){
            System.out.println("n1 > n2");
        } else if (n2>n1) {
            System.out.println("n2 > n1");
        } else {
            System.out.println("n1 == n2");
        }
    }

    //todo Task 7
    public void ratingSalesPerson(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter annual Revenue: ");
        int revenue = scanner.nextInt();
        if(revenue < 0 || revenue >= 100000){
            System.out.println("Invalid Revenue");
        }
        if(0 <= revenue && revenue < 20000){
            System.out.println("Poor Sales Revenue");
        }
        if(20000 <= revenue && revenue < 50000){
            System.out.println("Average Sales Revenue");
        }
        if(50000<= revenue && revenue  < 80000){
            System.out.println("Good Sales Revenue");
        }
        if(80000<= revenue && revenue < 100000){
            System.out.println("Excellent Sales Revenue");
        }
    }

    //todo Task 8
    public void getCommissionRate(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CommissionClass: ");
        int commissionClass = scanner.nextInt();
        switch (commissionClass) {
            case 1:
                System.out.println("Your Commission Rate was set to 0.01");
                break;
            case 2:
                System.out.println("Your Commission Rate was set to 0.02");
                break;
            case 3:
                System.out.println("Your Commission Rate was set to 0.03");
                break;
            case 4:
                System.out.println("Your Commission Rate was set to 0.04");
                break;
            default:
                System.out.println("Your Commission Rate was set to 0.0");
        }

    }

    //todo Task 9
    public void leapyear(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Year: ");
        int y = scanner.nextInt();
        if (y%4 !=0){
            System.out.println("Not a Leapyear");
        } else if(y%100 !=0) {
            System.out.println("Leapyear");
        } else if(y%400==0){
            System.out.println("Leapyear");
        } else {
            System.out.println("Not a Leapyear");
        }
    }

    //todo Task 10
    public void transposedNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
        int n = scanner.nextInt();
        int a,b,c;
        c=n % 10;
        b=((n-1*c)/10)%10;
        a=(n-1*c-10*b)/100;
        System.out.print(c);
        System.out.print(b);
        System.out.println(a);
    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}