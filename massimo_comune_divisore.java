//mcd con metodo di euclide e identita di bezout
import java.util.Scanner;

public class massimo_comune_divisore{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);

    long a=input.nextLong();
    long b=input.nextLong();

    a=mcd(a,b);
    System.out.println();
    System.out.println("l'MCD e' "+ a);
    }

    public static long mcd(long a,long b){
      long appo1=a;
      long appo2=b;

      long resto=3;

      if (a<0)
      a=-a;

      if (b<0)
      b=-b;

      if (a<b)
      {
        long appo=a;
        a=b;
        b=appo;
      }

      while (resto!=0){
          long ris= a/b;
          resto=a-(ris*b);

          //System.out.println(a+ " = "+ b+ " * "+ris+ " + "+resto);

          a=b;
          b=resto;

          if (resto==0)
          {
            return a;
          }
    }
    return 0;
  }
}
