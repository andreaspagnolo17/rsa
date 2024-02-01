//mcd con metodo di euclide e identita di bezout
import java.util.Scanner;

public class cinese{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);

    long x1 = input.nextLong();
    long y1 = input.nextLong();
    long x2 = input.nextLong();
    long y2 = input.nextLong();
    long x3 = input.nextLong();
    long y3 = input.nextLong();

    //dovrei invocare l'mcd e verificare che sia uno per tutte le coppie di numeri.

    long t1=massimo_comune_divisore.mcd(x1,y1);
    long t2=massimo_comune_divisore.mcd(x1,y1);
    long t3=massimo_comune_divisore.mcd(x1,y1);
    if (t1==1 && t2==1 && t3==1)
    {

          long n = y1*y2*y3;
          long n1 = y2*y3;
          long n2 = y1*y3;
          long n3 = y1*y2;

          long n1_iniziale=n1;
          long n2_iniziale=n2;
          long n3_iniziale=n3;

          if(y1<n1)
          {
            n1=n1-((n1/y1)*y1);
          }

          if (y2<n2)
          {
            n2=n2-((n2/y2)*y2);
          }

          if (y3<n3)
          {
            n3=n3-((n3/y3)*y3);
          }

          long r=0;
          int trovato=0;

          long y_primo=0;
          long y_secondo=0;
          long y_terzo=0;

          for (int i=1;trovato==0;i++)
          {
            r=y1*i+1;
            if (r%n1==0)
            {
              r=r/n1;
              trovato++;
            }
            y_primo=r;
          }
          trovato=0;

          for (int i=1;trovato==0;i++)
          {
            r=y2*i+1;
            if (r%n2==0)
            {
              r=r/n2;
              trovato++;
            }
            y_secondo=r;
          }
          trovato=0;

          for (int i=1;trovato==0;i++)
          {
            r=y3*i+1;
            if (r%n3==0)
            {
              r=r/n3;
              trovato++;
            }
            y_terzo=r;
          }

          long c=(n1_iniziale*y_primo*x1)+(n2_iniziale*y_secondo*x2)+(n3_iniziale*y_terzo*x3);
          System.out.println("una soluzione particolare e' c = "+c);

          System.out.println("tutte le soluzioni sono "+c+" + "+n+" Z");

          r=c/n;
          long c_min=c-(r*n);
          System.out.println("la minima soluzione positiva e' "+c_min);
    }

    }

}
