package yeniii;


import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import static java.lang.Math.atan;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static yeniii.Graph.dijkstra;
import static yeniii.Yeniii.derece;
import static yeniii.Yeniii.hipotenus;
import static yeniii.Yeniii.rakimdizi;
import static yeniii.Yeniii.s;
import static yeniii.Yeniii.d;
import static yeniii.Yeniii.komsulukdizi;
import static yeniii.Yeniii.latlong;
import static yeniii.Yeniii.uzunluk;
import static yeniii.Yeniii.yenihipotenus;


/**
 *
 * @author uset
 */
public class JFrame extends javax.swing.JFrame {

    int baslangic,hedef,yolcu;
    
    
    
    public JFrame() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        resim = new javax.swing.JLabel();
        sehir1 = new javax.swing.JTextField();
        sehir2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ek_bilgi = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        guzergah = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        resim.setIcon(new javax.swing.ImageIcon("C:\\Users\\uset\\Desktop\\Proje\\Prolab-II\\Yeniii\\turkiye_il_plaka_kodlari_haritasi.jpg")); // NOI18N

        sehir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sehir1ActionPerformed(evt);
            }
        });

        sehir2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sehir2ActionPerformed(evt);
            }
        });

        jButton1.setText("Hesapla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setText("Başlangıç Şehiriniz               :");

        jLabel5.setText("Hedef Şehiriniz                    :");

        jLabel2.setText("Zeplin Güzergahı :");

        jLabel3.setText("Ek Bilgi:");

        ek_bilgi.setColumns(20);
        ek_bilgi.setRows(5);
        jScrollPane1.setViewportView(ek_bilgi);

        guzergah.setColumns(20);
        guzergah.setRows(5);
        jScrollPane2.setViewportView(guzergah);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(resim, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(85, 85, 85)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sehir1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sehir2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(150, 150, 150)
                                .addComponent(jButton1)))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(229, 229, 229)
                                .addComponent(jLabel3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(resim, javax.swing.GroupLayout.PREFERRED_SIZE, 476, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sehir1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(sehir2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        baslangic = Integer.parseInt(sehir1.getText());
        hedef = Integer.parseInt(sehir2.getText());
    //    yolcu = Integer.parseInt(ylc.getText());
        
      
        
        if(baslangic<0 || baslangic>81){
            JOptionPane.showMessageDialog(rootPane, "Yanlış Plaka Bilgisi");
        }
        if(hedef<0 || hedef>81){
            JOptionPane.showMessageDialog(rootPane, "Yanlış Plaka Bilgisi");
        }
       /* if(yolcu<5 || yolcu>50){
            JOptionPane.showMessageDialog(rootPane, "Yolcu sayısı 5 ile 50 arasında olmalıdır!");
        }*/
        s=baslangic;
        d=hedef;

        int i,j;
        
        File file = new File("komsuluk1.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException ex) {
                Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, false);
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedWriter bWriter = new BufferedWriter(fileWriter);
        
        hesap x = new hesap();
        
        
        for(i=0;i<81;i++){
            for(j=0;j<10;j++){
                if(komsulukdizi[i][j]!=0 && j!=0){
                    for(int a=0;a<81;a++){
                        if(komsulukdizi[i][j]==latlong[a][2]){
                            for(int c=0;c<81;c++){
                                if(komsulukdizi[i][0]==latlong[c][2]){
                                    uzunluk[c][a]=hesap.distance(latlong[c][0],latlong[c][1],latlong[a][0],latlong[a][1]);
                                    
                                    if(c==s-1)
                                        rakimdizi[c][a]=Math.abs(latlong[a][3]-latlong[c][3]+50);
                                    else
                                        rakimdizi[c][a]=Math.abs(latlong[c][3]-latlong[a][3]);
                                    
                                    derece[c][a]=atan(rakimdizi[c][a]/uzunluk[c][a])*(180.0/3.14159265);
                                    
                                    try {
                                        bWriter.write((c+1)+"-"+(a+1)+"  "+uzunluk[c][a]+" km  "+derece[c][a]+" Derece");
                                        bWriter.newLine();
                                    } catch (IOException ex) {
                                        Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    
                                    hipotenus[c][a]=Math.sqrt(((rakimdizi[c][a]/1000)*(rakimdizi[c][a]/1000))+(uzunluk[c][a]*uzunluk[c][a]));
                                }
                            }
                        }
                    }
                }
            }
        }
        
        
        
        try {
            bWriter.close();
        } catch (IOException ex) {
            Logger.getLogger(JFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
           for(int k=5;k<=50;k++){
            for(i=0;i<81;i++){
                for(j=0;j<81;j++){
                    if(derece[i][j]<80-k){ 
                        yenihipotenus[i][j]=hipotenus[i][j];
                    }
                    else
                        yenihipotenus[i][j]=0;
                }
            }
            System.out.println(k+" kişi için:");
            guzergah.append(k+" kişi için  :");
            dijkstra(yenihipotenus,s-1);
            
            System.out.println("");
           
           
            if("".equals(Graph.var)){
                guzergah.append(Graph.yok+"\n");
            }
            else{
                guzergah.append(Graph.var+"\n");
            }
           }
        }
        catch (StackOverflowError e){
            System.out.println("yol yok...");
        }

        int ucret=0;
        double maliyetdizi[]=new double[100];
        double kârdizi[]=new double[100];
        double yüzdeellikardizi[]=new double[100];
        double kactldizi[]=new double[100];
        
        for(i=5;i<Yeniii.dizi.length;i++){
            if(Yeniii.dizi[i][i]!=0){
                
                
                System.out.println(i+"kisi için yol uzunlukları:"+Yeniii.dizi[i][i]);
                System.out.println(i+"kisi için yol maliyetleri:"+((Yeniii.dizi[i][i]*1000)/100));
                maliyetdizi[i]=((Yeniii.dizi[i][i]*1000)/100);
                yüzdeellikardizi[i]=maliyetdizi[i]+(maliyetdizi[i]/2);
                kactldizi[i]=yüzdeellikardizi[i]/i;
                System.out.println(i+" kişiden yüzde elli kâr için kişi başı alınması gereken ucret: "+kactldizi[i]+" tl dir.");
                ucret=100*i;
                System.out.println(i+"kisi için gidilen yoldan elde edilen kâr:"+(ucret-((Yeniii.dizi[i][i]*1000)/100)));
                kârdizi[i]=(ucret-((Yeniii.dizi[i][i]*1000)/100));
                System.out.println("");
                
                ek_bilgi.append(" "+i+" kişi için yol uzunlukları   :"+Yeniii.dizi[i][i]+" km");
                ek_bilgi.append("\n "+i+" kişi için yol maliyetleri   :"+((Yeniii.dizi[i][i]*1000)/100)+" TL");
                ek_bilgi.append("\n "+i+" kişiden %50 kâr için kişi başı alınması gereken ücret   :"+kactldizi[i]+" TL");
                ek_bilgi.append("\n "+i+" kişi için gidilen yoldan elde edilen kâr    :"+((ucret-((Yeniii.dizi[i][i]*1000)/100))));
                ek_bilgi.append("\n\n"); 
            }
            
        }
        double max;
        int tut=5;
        max=kârdizi[5];
        for(i=5;i<kârdizi.length;i++)
        {
            if(kârdizi[i]>max && kârdizi[i]!=0)
            {
                max=kârdizi[i];
                tut=i;
            }
    
        }
        System.out.println("zeplin için en kârlı uçuş "+tut+" kişi ile sağlanmaktadır ve bu kar "+max+" tl dir.");
        ek_bilgi.append("\nZeplin için en kârlı uçuş "+tut+" kişi ile sağlanmaktadır ve bu kar "+max+" TL\n");
        
        double tut2;
        int ter=5;
        int m,n;
        Arrays.sort(kârdizi); 
        
        ek_bilgi.append("\nEdilen kâr maliyetleri   :\n");
        for (i =kârdizi.length-1;i>=0;i--){
            if(kârdizi[i]!=0){
                System.out.println(kârdizi[i]);
                ek_bilgi.append(kârdizi[i]+"\n");
            }
        }

        
     
        
        
            
        
        
        

     


    }//GEN-LAST:event_jButton1ActionPerformed

    private void sehir2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sehir2ActionPerformed

    }//GEN-LAST:event_sehir2ActionPerformed

    private void sehir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sehir1ActionPerformed

    }//GEN-LAST:event_sehir1ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new JFrame().setVisible(true);
        });
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea ek_bilgi;
    private javax.swing.JTextArea guzergah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel resim;
    private javax.swing.JTextField sehir1;
    private javax.swing.JTextField sehir2;
    // End of variables declaration//GEN-END:variables

}