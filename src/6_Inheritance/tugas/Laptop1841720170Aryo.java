/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author ASUS FX504
 */
public class Laptop1841720170Aryo extends Komputer18417210270Aryo{

    public String jnsBaterai;

    public Laptop1841720170Aryo() {

    }

    public Laptop1841720170Aryo(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jnsBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jnsBaterai = jnsBaterai;
    }

    public void tampilLaptop() {
        System.out.println("============LAPTOP============");
        super.tampilData();
        System.out.println("Jenis Baterai         :" + jnsBaterai);
    }

}
