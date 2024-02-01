//mcd con metodo di euclide e identita di bezout
import java.util.Scanner;

public class potenze_mod_n{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);

    long x = input.nextLong();
    long base = input.nextLong();
    long k = input.nextLong();

    //dovrei invocare l'mcd e verificare che sia uno per tutte le coppie di numeri.
    long a=0;
      a=pmn(x,base,k);
      System.out.println();
      System.out.println(a);
  }


    public static long pmn(long x,long base,long k){
        long appo=x;

        //per determinare grandezza array
        int trovato=0;
        long prova=x;
        for (int i=0;prova>0;i++)
        {
          prova=prova/2;
          trovato++;
        }

        long resto;
        long [] array=new long[trovato];
        for (int i=array.length-1;x>0;i--){
          array[i]=x%2;
          x=x/2;
        }

        long c=1;
        long ris=0;
        for(int i=0;i<array.length;i++){
          c=c*c;
          ris=c*(long)Math.pow(base,array[i]);

          if (ris>appo)
          ris=mod.mod(ris,k);


          c=ris;
          //cancella commento se vuoi vedere procedimento passo per passo
          //System.out.println(ris+" mod "+k);
        }

        return c;

    }

}
