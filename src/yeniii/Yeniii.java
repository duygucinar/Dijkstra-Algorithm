package yeniii;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Yeniii {
    public static int s;
    public static int d;
    public static double [][] dizi=new double[51][51];
    public static double uzunluk[][]=new double[81][81];
    public static double hipotenus[][]=new double[81][81];
    public static double yenihipotenus[][]=new double[81][81];
    public static double [][] derece=new double[81][81];
    public static double [][] rakimdizi=new double[81][81];
    public static int komsulukdizi[][] = new int [81][10];
    public static double latlong[][] = new double [81][4];
    
   public static void main(String[] args) throws IOException {
        String dizi[]=new String[81];
        
        JFrame frame = new JFrame();
        frame.setTitle("GEZGİN ZEPLİN");
        frame.setLocation(380,200);
        frame.setVisible(true);
        frame.setResizable(false);
        
        String str;
        try{

            FileReader fr = new FileReader("komsuluk.txt");
            BufferedReader br = new BufferedReader(fr);

            

            for (int i = 0; i < dizi.length; i++) {
                if ((str = br.readLine()) != null) {
                   dizi[i] = str;
                }
            }

            br.close();

        }catch (FileNotFoundException ex) {
            System.out.println("dosya okunmady");
        }
        String []kelime;
        String kdizi[][]=new String[81][20];
        for(int i=0;i<81;i++){
            for(int j=0;j<10;j++){
                kelime=dizi[i].split(",");
                kdizi[i][j]=kelime[j];
            }
        }
        
        int i,j;
          
        for(i=0;i<81;i++){
            for(j=0;j<10;j++){
                komsulukdizi[i][j]=Integer.parseInt(kdizi[i][j]);
            }
        }
          
        String [] latdizi = new String[81];
          
        try{
            FileReader fr = new FileReader("lat long.txt");
            BufferedReader br = new BufferedReader(fr);

            for(i = 0; i < dizi.length; i++){
                if((str = br.readLine()) != null){
                   latdizi[i] = str;
                }
            }

            br.close();

        }catch (FileNotFoundException ex) {
            System.out.println("dosya okunmadi");
        }
          
        String longdizi[][] = new String[81][4];
        
        for(i=0;i<81;i++){
            for(j=0;j<4;j++){
                kelime=latdizi[i].split(",");
                longdizi[i][j]=kelime[j];
                latlong[i][j]=Double.parseDouble(longdizi[i][j]);
            }
        }
   
  }
}