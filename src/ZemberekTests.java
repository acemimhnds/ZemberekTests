import net.zemberek.erisim.Zemberek;
import net.zemberek.tr.yapi.TurkiyeTurkcesi;
import net.zemberek.yapi.Kelime;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.lang.String;

public class ZemberekTests {
			  public void heceler(){
				  
				  return;
			  }
	
              public static void main(String[] args){
			      Scanner m=new Scanner(System.in);
			      Zemberek z = new Zemberek(new TurkiyeTurkcesi());
		          String k;
		        
		          System.out.println("lütfen cümleyi giriniz:");
		          k=m.nextLine();
		          String dizi[]=null;
		          dizi= k.split(" ");
		       
		        //********************hecele fonksiyonu*************************
		         
		          System.out.println("hecelenecek cümle : "+k);
		          int a=0;
		          while(a<dizi.length){ 
		        	   String[] hecelenmiş=z.hecele(dizi[a]);
		               System.out.println(">>>"+dizi[a] +"  kelimesinin  hecelenmiş hali:"+Arrays.toString(hecelenmiş));
		               a++;}
			           System.out.println("\n");
			        
			    //*****************asciiyeDönüştür fonksiyonu*******************
			        
			       String l=z.asciiyeDonustur(k);
			       System.out.println(">>>Ascı ya dönüşmüş hali:");
			       System.out.print(l);
			       System.out.println("\n");
              
			    // ****************oner fonksiyonu******************************
                  
			       int b=0;
                  while(b<dizi.length){
			            String[] oneriler = z.oner(dizi[b]);
			            System.out.println(">>>"+dizi[b]+ " kelimesi icin oneriler:");
			                   for (int i = 0; i < oneriler.length; i++) {
			                       System.out.println(oneriler[i]);}
			                       b++; }
                  System.out.println("\n");
                //******************kelimeDenetle fonksiyonu*********************
                 
                  int c=0;
                  while(c<dizi.length){
			           if(z.kelimeDenetle(dizi[c]))
			        	   System.out.println(">>>"+dizi[c]+" kelimesi doğru yazılmış");
			          else
			               System.out.println(">>>"+dizi[c]+" kelimesi doğru yazılmamış");
			             c++; }
                  System.out.println("\n");
			     //*****************kelimeÇözümle fonksiyonu*********************
                
                  int d=0;
                 while(d<dizi.length){
			          System.out.println(">>>"+dizi[d]+" için cozumlemeler:");
			          Kelime[] cozumler = z.kelimeCozumle(dizi[d]);
			                for (Kelime kelime : cozumler){
			                    System.out.println(kelime);}
			                    d++;}
                 System.out.println("\n");
			     //********************kelimeAyrıştır fonksiyonu*******************    
			    
                 int h=0;
			     while(h<dizi.length){
			           System.out.println(">>>"+dizi[h] +" için ayristirma sonuclari:");
			           List<String[]> ayrisimlar = z.kelimeAyristir(dizi[h]);
			           for (String[] strings : ayrisimlar) 
			           System.out.println(Arrays.toString(strings)); 
			           h++;}}}
         
			           

			           
			      
			    	  
			        
			
	        
	


