/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uas_pbo;

/**
 *
 * @author Aspire Ryzen
 */
public class Brg {
    public String nm_brg, kd_brg;
    int stok;
    double hrg_bl, hrg_jl;
    
    public Brg (String kd_brg, String nm_brg, int stok, double hrg_bl, double hrg_jl){
        //konstruktor
        this.kd_brg = kd_brg;
        this.nm_brg = nm_brg;
        this.stok = stok;
        this.hrg_bl = hrg_bl;
        this.hrg_jl = hrg_jl;
    }
}
