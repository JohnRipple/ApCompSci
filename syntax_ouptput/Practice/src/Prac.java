import java.util.Scanner;
public class Prac {
    public static void main(String[] args){
        double z = 94.32;
        long x = 98;
        int a = 9, b = 4;
        char var = 'C';
        System.out.println( 5 + 2 * 4 );			// LINE 1

        System.out.println( a * (a % b) );			// LINE 2

        System.out.println( b / a );				// LINE 3

        System.out.println( 'B' + 5 );				// LINE 4

        System.out.println( 4 % 8 );				// LINE 5

        System.out.println( a % b );				// LINE 6

        System.out.println( b % a );				// LINE 7

        System.out.println( 8 % 4 );				// LINE 8

        System.out.println( (double)( a / b ) );		// LINE 9

        System.out.println( (double)a / b );			// LINE 10

        System.out.println( 7.0 / 2 );				// LINE 11

        System.out.println((char)(var + 5));			// LINE 12

        a = var + 2;
        System.out.println( a );    				// LINE 13

        z = var + 5;
        System.out.println( z);    				// LINE 14

        var = 'A' + 4;
        System.out.println( var);				// LINE 15


    }


}
