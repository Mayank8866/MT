//question 1
import java.util.Scanner;
class CheckNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        if(n==0){
            System.out.println(" number is a :  "+ n);
        }
      else if(n>0){
        System.out.println("the number is a positive : "+n);
      }else{
        System.out.println("the number is a negative :  "+n);
      }
    }
}
