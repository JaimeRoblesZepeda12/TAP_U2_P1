
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Luz Robles
 */
public class Lienzo extends Canvas{
Barras b1= new Barras(50,300,50,0);
Barras b2= new Barras(200,300,50,0);
Barras b3= new Barras(350,300,50,0);


Grafica puntero;
Color c;

public Lienzo(Grafica c){
  puntero=c;
}
    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        Graphics2D g2= (Graphics2D)g;
        this.setBackground(Color.GRAY);
        
        
        g2.setStroke(new BasicStroke(5));
        g2.setColor(Color.black);
        g2.drawLine(50, 550, 650, 550);
        g2.setColor(Color.black);
        g2.drawLine(50, 550, 50, 50);
        // X and Y axis
        
        g2.setColor(Color.black);
        g2.drawLine(40,50,60 ,50 );
        g2.setColor(Color.black);
        g2.drawLine(40,100,60 ,100 );
        g2.setColor(Color.black);
        g2.drawLine(40,150,60 ,150 );
        g2.setColor(Color.black);
        g2.drawLine(40,200,60 ,200 );
        g2.setColor(Color.black);
        g2.drawLine(40,250,60 ,250);
        g2.setColor(Color.black);
        g2.drawLine(40,300,60 ,300);
        g2.setColor(Color.black);
        g2.drawLine(40,350,60 ,350);
        g2.setColor(Color.black);
        g2.drawLine(40,400,60 ,400);
        g2.setColor(Color.black);
        g2.drawLine(40,450,60 ,450);
        g2.setColor(Color.black);
        g2.drawLine(40,500,60 ,500);
        //-----------
        
        g.setColor(Color.black);
        g.setFont(new Font("Arial",Font.PLAIN,20));
        g.drawString("10", 10, 55);
        g.drawString("9", 20, 110);
        g.drawString("8", 20, 160);
        g.drawString("7", 20, 210);
        g.drawString("6", 20, 260);
        g.drawString("5", 20, 310);
        g.drawString("4", 20, 360);
        g.drawString("3", 20, 410);
        g.drawString("2", 20, 460);
        g.drawString("1", 20, 510);
        
        int valorAlto1=b1.alto+puntero.getBarra1()*50;
        int valorY1=550-puntero.getBarra1()*50;
        int valorAlto2=b2.alto+puntero.getBarra2()*50;
        int valorY2=550-puntero.getBarra2()*50;
        int valorAlto3=b3.alto+puntero.getBarra3()*50;
        int valorY3=550-puntero.getBarra3()*50;
        
        
        g2.setColor(puntero.c1);
        g2.fillRect(180, valorY1, b1.ancho, valorAlto1);
        g.drawString("Grafica X", 160, 580);
       
        g2.setColor(puntero.c2);
        g2.fillRect(320, valorY2, b2.ancho, valorAlto2);
        g.drawString("Grafica y", 310, 580);
        
        g2.setColor(puntero.c3);
        g2.fillRect(460, valorY3, b3.ancho, valorAlto3);
        g.drawString("Grafica Z", 455, 580);
    }
    
}
