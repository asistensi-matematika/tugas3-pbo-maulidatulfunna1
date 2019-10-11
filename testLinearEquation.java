
package pbo;

import java.util.Scanner;
public class testLinearEquation {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println(" input : ");
        int a = read.nextInt();
        int b = read.nextInt();
        double c = read.nextDouble();
        double  d = read.nextDouble();
        double e = read.nextDouble();
        double f = read.nextDouble();
    
       LinearEquation le = new LinearEquation( a, b, c, d, e , f);
       le.Output();
        le.persamaannya(a, b, e);
        le.info();
        le.cekSolusi();
    }}
       
    
