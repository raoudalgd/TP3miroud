import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class Tri {

	public static void main(String[] args) {

		String fichier ="input.txt";	
    Integer[] tableau = new  Integer[0];
    try {
      java.io.InputStream ips=new java.io.FileInputStream(fichier); 
      java.io.InputStreamReader ipsr=new java.io.InputStreamReader(ips);
      java.io.BufferedReader br=new java.io.BufferedReader(ipsr);
      String ligne;
      while ((ligne=br.readLine())!=null){
                Integer[] oldTableau = tableau;
                Integer noligne = oldTableau.length;
                tableau = new Integer[noligne+1];
                System.arraycopy(oldTableau, 0, tableau,0, noligne);
                tableau[noligne] = Integer.parseInt(ligne);
      }
      System.out.println("how do you want to sort your array? In croissant order or in reverse? [true/false] ");
      Scanner in = new Scanner(System.in);
      Boolean s = in.nextBoolean();
      System.out.println(s);
      if(s == true){
        Arrays.sort(tableau);
      }
      else {
        Arrays.sort(tableau, Collections.reverseOrder());
      }
      for(Integer i = 0; i< tableau.length; i++) {
        System.out.println(tableau[i]);
    }
    PrintWriter writer = new PrintWriter("output.txt", "UTF-8");
    for(int i = 0; i<tableau.length; i++){
      writer.println(tableau[i]);
    }
    writer.close();
      br.close();
      in.close();
    }catch (Exception e){
      System.out.println(e.toString());
    }
	}
}
