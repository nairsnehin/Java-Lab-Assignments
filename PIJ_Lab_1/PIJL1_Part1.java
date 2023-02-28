import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class PIJL1_Part1
{
    public static void main(String[] k) throws IOException {
        int n, fact = 1, con = 1;
        do {
            Scanner sc = new Scanner(System.in);
            BufferedReader rd = new BufferedReader(new
                    InputStreamReader(System.in));
            System.out.println("1) Fibonacci using Scanner");
            System.out.println("2) Fibonacci using Buffer");
            System.out.println("3) Factorial using Scanner");
            System.out.println("4) Factorial using Buffer");
            int q= Integer.parseInt(k[0]);
            switch (q) {
                case 1: {
                    System.out.println("Enter number 1 : ");
                    int n1 = sc.nextInt();
                    System.out.println("Enter number 2 : ");
                    int n2 = sc.nextInt();
                    System.out.println("Enter length : ");
                    int len = sc.nextInt();
                    for(int i =0;i<len;i++)
                    {
                        int p = n1+n2;
                        n1 = n2;
                        n2=p;
                        System.out.println(p + " ");
                    }
                    break;
                }

