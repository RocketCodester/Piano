/*
   12/2/14
   JDK 1.7
   Draw piano keys using a loop
*/
import java.awt.*;
import javax.swing.*;
public class Piano extends JComponent{
    JFrame frame = new JFrame ("Piano");
    Container content = frame.getContentPane();
    public static void main(String[] args) {
        Piano drawing = new Piano();
        drawing.setUp();
    }
            public void setUp(){
                content.add(this);
                frame.setSize(300,110);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
    @Override
    public void paint(Graphics g){
        int n = 14;
        for(int i=0; i<n; i++){
            g.drawRect(i*20,0,20,60);
            //if(i!=0 & i!=3 & i!=7 & i!=10)
            //g.fillRect(i*20-5,0,10,30);
            if(i%7!=0 && i%7!=3 && i <n)
                g.fillRect(i*20-5,0,10,30);
        }
    }
}