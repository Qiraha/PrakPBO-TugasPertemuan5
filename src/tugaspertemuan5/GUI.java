/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.InputMismatchException;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author hp
 */
public class GUI extends JFrame implements ActionListener{
    JLabel lpanjang = new JLabel("Panjang ");
    final JTextField fpanjang = new JTextField(10);
    
    JLabel llebar = new JLabel("Lebar ");
    final JTextField flebar = new JTextField(10);
    
    JLabel ltinggi = new JLabel("Tinggi ");
    final JTextField ftinggi = new JTextField(10);
    
    JLabel lhasil = new JLabel("Hasil :");
    JLabel lempt = new JLabel(" ");
    JLabel lempt2 = new JLabel(" ");
    JLabel lempt3 = new JLabel(" ");
    
    JLabel lluasP = new JLabel("Luas Persegi Panjang ");
    final JTextField fluasP = new JTextField(11);
    
    JLabel lkelilingP = new JLabel("Keliling Persegi Panjang ");
    final JTextField fkelilingP = new JTextField(11);
    
    JLabel lvolumeB = new JLabel("Volume Balok ");
    final JTextField fvolumeB = new JTextField(11);
    
    JLabel lluasPer = new JLabel("Luas Permukaan Balok ");
    final JTextField fluasPer = new JTextField(11);

    Container c = new Container();
    
     JButton bcount = new JButton("Hitung");
     JButton breset = new JButton("Reset");

    public GUI(){
        setTitle("Kalkulator Balok");
        setSize(350,200);

        setLayout(new GridLayout(10,2));
        c = getContentPane();
        c.add(lpanjang);
        c.add(fpanjang);
        c.add(llebar);
        c.add(flebar);
        c.add(ltinggi);
        c.add(ftinggi);
        c.add(lempt3);
        c.add(lempt2);
        c.add(lhasil);
        c.add(lempt);
        c.add(lluasP);
        c.add(fluasP);
        c.add(lkelilingP);
        c.add(fkelilingP);
        c.add(lvolumeB);
        c.add(fvolumeB);
        c.add(lluasPer);
        c.add(fluasPer);
        c.add(bcount);
        c.add(breset);
        
        
        
        pack();
        
        
        
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        bcount.addActionListener(this);
        breset.addActionListener(this);
        
        
    }
    
    public void actionPerformed(ActionEvent e){
        double err = 0;
        if(e.getSource()==bcount){
            double p, l, t; double x; String hk, hl, hlP, hv;
            double l1 = 0, k = 0, v = 0, lP = 0;
            
            try{
                p = Double.parseDouble(fpanjang.getText());
                l = Double.parseDouble(flebar.getText());
                t = Double.parseDouble(ftinggi.getText());
                l1 = p*l;
            k = 2*(p+l);
            v = p*l*t;
            lP = 2*(p*l + p*t + l*t);          
            
            hk = String.valueOf(l1);
            fkelilingP.setText(hk);
            
            hl = String.valueOf(k);
            fluasP.setText(hl);
            
            hlP = String.valueOf(v);
            fluasPer.setText(hlP);
            
            hv = String.valueOf(lP);
            fvolumeB.setText(hv);
            
            } catch(NumberFormatException error){
                err = 1;
                
            } catch(InputMismatchException error){
                err = 1;
                
            } finally{
                if(err == 1){
                    JOptionPane.showMessageDialog(null, " Error! Masukkan Angka ");
                    err = 0;
                }
                p = 0;
                l = 0;
                t = 0;
            } 
            
        }
        
        if(e.getSource()==breset){
            String x = "";
            fpanjang.setText(x);
            flebar.setText(x);
            ftinggi.setText(x);
            fkelilingP.setText(x);
            fluasP.setText(x);
            fluasPer.setText(x);
            fvolumeB.setText(x);
        }
    }
    

    
}
