
import java.awt.Color;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class Grafica extends javax.swing.JPanel {
private Lienzo objeto=new Lienzo(this);
protected int grafica1;
protected int grafica2;
protected int grafica3;
protected Color c1;
protected Color c2;
protected Color c3;
    /**
     * Creates new form Grafica
     */
    public Grafica() {
        
        initComponents();
        objeto.setSize(700,600);
        this.setLocation(0,0);
        this.add(objeto);
        }
    public void setColorBarra1(Color c){
    
        objeto.setBackground(c);
        c1=c;
    }
    public Color getColorBarra1(){
        return objeto.c;
    }
    public void setColorBarra2(Color c){
    
        objeto.setBackground(c);
        c2=c;
    }
    public Color getColorBarra2(){
        return objeto.c;
    }
    public void setColorBarra3(Color c){
    
        objeto.setBackground(c);
        c3=c;
    }
    public Color getColorBarra3(){
        return objeto.c;
    }
    public void setBarra1(int n){
    grafica1=n;
    }
    public int getBarra1(){
    return grafica1;
    }
    public void setBarra2(int n){
    grafica2=n;
    }
    public int getBarra2(){
    return grafica2;
    }
    public void setBarra3(int n){
    grafica3=n;
    }
    public int getBarra3(){
    return grafica3;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
