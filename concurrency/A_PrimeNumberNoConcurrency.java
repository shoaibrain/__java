import  java.util.Scanner;

public class A_PrimeNumberNoConcurrency {
    public static  void  main(String [] args){
        int number;

        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("I can tell you nth prime number. enter n: ");
            int n = sc.nextInt();
            if (n == 0)break;
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    int number  = PrimeNumberUtil.calculatePrime(n);
                    System.out.println("prime number: " + number);
                }
            };
            Thread t = new Thread(r);
            t.setDaemon(true); //can be killed with end of main
            t.start();
        }
    }
}
