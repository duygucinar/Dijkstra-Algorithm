package yeniii;



public class Graph{
    private static final int gitme = -1;
    public static String var = "";
    public static String yok= "Güzergah bulunmamaktadır";
    public static int mesafe;
    public static double yedek;

    static void dijkstra(double [][] matris,int baslangic){
                
        int index = matris[Yeniii.s-1].length;
        double[] enkisayol = new double[index];
        boolean[] ekle = new boolean[index];

        
        int hedef;
        
        for (hedef = 0; hedef < index; hedef++){
            enkisayol[hedef] = Integer.MAX_VALUE;
           ekle[hedef] = false;
                    
        }
        
        enkisayol[baslangic] = 0;
        int[] yol = new int[index];
        yol[baslangic] = gitme;

        for (int i = 1; i < index; i++){
            int en_yakin = -1;
            double kisa_yol = Double.MAX_VALUE;
        
            for ( hedef = 0; hedef < index; hedef++){
                if (!ekle[hedef] && enkisayol[hedef] < kisa_yol){
                    en_yakin = hedef;
                    kisa_yol = enkisayol[hedef];
                }
            }

        ekle[en_yakin] = true;
        
        for( hedef = 0; hedef < index; hedef++){
            double kenar_mesafe = matris[en_yakin][hedef];
            
            if (kenar_mesafe > 0 && ((kisa_yol + kenar_mesafe) <enkisayol[hedef])){
                yol[hedef] = en_yakin;
                enkisayol[hedef] = kisa_yol + kenar_mesafe;
            }
        }
    }

    yaz(baslangic, enkisayol,yol);
}

    static int i=5;
private static void yaz(int bas,double [] mesafe,int[] parents){
    int kac_kenar = mesafe.length;
                
    System.out.print("BASLANGIÇ\t HEDEF\tYOL");
    
    for (int son = 0; son < kac_kenar; son++){
        if (son != bas){
            if(son==Yeniii.d-1){
                System.out.print("\n" + (bas+1) + " -> ");
                System.out.print((son+1) + " \t\t ");
                
                if(mesafe[son]==2.147483647E9){
                    System.out.println("yol yok");
                    yok = "Güzergah bulunmamaktadır.";
                    var = "";
                    break;
                }
                System.out.print(mesafe[son] + "\t\t");
                Yeniii.dizi[i][i]=mesafe[son];
               // yedek=mesafe[son];
                
                i++;
                yol_yaz(son, parents); 
                                
        } 
                            
    }
                        
                       
    }
}

private static void yol_yaz(int suanki_yol,int[] yolum){
    
    var="";
    
    if (suanki_yol == gitme){
        return;
    }
    yol_yaz(yolum[suanki_yol], yolum);
    System.out.print((suanki_yol+1) + " ");
    var = var + (suanki_yol+1)+"-";
    
}
}

