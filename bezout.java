//mcd con metodo di euclide e identita di bezout
import java.util.Scanner;

public class bezout{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);

    long a=input.nextLong();
    long b=input.nextLong();
    long c=input.nextLong();

    long []v = new long [2];
    v=b(a,b,c);
    System.out.println("identità di bezout: "+v[0]+ "a "+ v[1]+"b");
  }

    public static long[] b(long a,long b,long c){

          long appo1=a;
          long appo2=b;

          long resto=3;
            int i=0;
            long [][]risultati = new long [2][40];
            long []v = new long [2];
            int contatore=0;

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

      // identita bezout

              long x=1;
              long y=-ris;

              //x e -ris valori passo 0

                if(contatore==0){
                  //passo 0
                  v[0]=x;
                  v[1]=y;
                  risultati[0][i]=v[0];
                  risultati[1][i]=v[1];
                  i++;
                }

                if(contatore==1){
                  //primo passo
                  v[0]=-v[0]*ris;
                  v[1]=-v[1]*ris+1;
                  risultati[0][i]=v[0];
                  risultati[1][i]=v[1];
                  i++;
                }


                //secondo passo
                if (contatore>1)
                {
                  int k=i-2;
                  int j=i-1;
                  v[0]=-risultati[0][j]*ris+risultati[0][k];
                  v[1]=-risultati[1][j]*ris+risultati[1][k];
                  risultati[0][i]=v[0];
                  risultati[1][i]=v[1];
                  i++;
                }

                contatore++;

              a=b;
              b=resto;

              if (resto==0)
              {
                i=i-2;
              }
            }

            v[0]=risultati[0][i];
            v[1]=risultati[1][i];

            return v;
          }

}
