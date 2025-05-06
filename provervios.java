package simon;

import java.io.*;
import java.util.*;

public class provervios {

	public static void main(String[] args) {
		 List<String> proverbios=new ArrayList<>();
		 
		 try (BufferedReader br=new BufferedReader(new FileReader("C:/Users/Angel/Downloads/proverbios.txt"))) {
	            String linea;
	            while ((linea=br.readLine()) != null) {
	            	proverbios.add(linea);
	            }
		 }catch (IOException e) {
	            System.out.println("pos no jalo: "+e.getMessage());
	            return;
	        }
	        Random rando=new Random();
	        int indice=rando.nextInt(proverbios.size());
	        System.out.println(proverbios.get(indice));

	}

}
