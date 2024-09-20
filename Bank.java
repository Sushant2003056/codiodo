import java.util.*;
import java.util.Scanner;
public class Bank {
    static void deposite(){
        System.out.println("error occured");
        input();
        
    }
    static int input(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter amount:");
        int a=sc.nextInt();
        return a;
    }
    public static void main(String[] args) {
        int b=input();
       while(b<0){
        deposite();
       }
        if(b<0){
        deposite();
        }
        else{
            System.out.println("........................");
        }
        System.out.println();
    }
}