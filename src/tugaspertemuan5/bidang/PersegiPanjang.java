/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspertemuan5.bidang;

/**
 *
 * @author hp
 */
public class PersegiPanjang implements MenghitungBidang{

    public double panjang;
    public double lebar;

    public PersegiPanjang(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    
    @Override
    public double luas() {
        return panjang*lebar;    
    }

    @Override
    public double keliling() {
        return 2*panjang+2*lebar;
    }
}
