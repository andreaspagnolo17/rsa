import java.util.Scanner;

public class rsa{
  public static void main (String[] args){
    Scanner input = new Scanner (System.in);

    System.out.println("inserire due numeri primi");
    long a=input.nextLong();
    long b=input.nextLong();

    long n=a*b;

    long r=0;
    long c=0;
    do{
      System.out.println("inserisci un numero r in modo tale che (r, φ(N )) = (r, a*b) =1 . con a e b numeri appena inseriti");
      c=input.nextLong();
      r=massimo_comune_divisore.mcd(n,c);
    }while(r!=1);

    long yn=(a-1)*(b-1);

    long []v = new long [2];
    v=bezout.b(yn,c,0);

    long s=v[1];


    System.out.println("quanto e' lungo il messaggio");
    int lunghezza=input.nextInt();
    int i=0;
    int trovato=0;
    long []messaggio=new long[lunghezza];
    while (i<lunghezza){
      messaggio[i]=input.nextLong();
      i++;
    }

    i=0;
    long []risultatof=new long[lunghezza];
    long risultato=0;
    while(i<lunghezza){
      risultato=potenze_mod_n.pmn(s,messaggio[i],n);
      risultatof[i]=risultato;
      i++;
    }

    System.out.println();
    for(i=0;i<risultatof.length;i++)
    System.out.println(risultatof[i]);



  }



}
