import java.io.*;

class Keskiarvo {
    public static void main(String[]args){
        int luku=0;
        int summa=0;
        double keskiarvo=0;
        double luku_jono = 0;

        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Ohjelma laskee syötettyjen arvosanojen keskiarvon.\n Lopetus negatiivisella kokonaisluvulla.");
            while (true)
            {System.out.println("Anna arvosana (4-10):");
            luku = Integer.parseInt(in.readLine());
            if(luku > 3 && luku < 11){
                luku_jono+=luku;
                summa+=1;
                keskiarvo = luku_jono/summa;
                 }
            else{
                System.out.println("");
            }
            if (luku<0){
                System.out.println("Ohjelmaan syötetty "+summa+" arvosanaa.\nArvosanojen keskiarvo: "+keskiarvo);
                break;}
        }
    }
        catch (Exception e){
            System.out.println("Error");
        }
    }
}
