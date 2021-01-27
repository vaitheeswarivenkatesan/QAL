import java.util.*;

public class Qal{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    double sum=0;
    for(int i=0;i<n;i++){
      double b=sc.nextDouble();
      double x=sc.nextDouble();
      sum=sum+(b*x);
    }
    System.out.println(sum);
  }
}

