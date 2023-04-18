/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectQTDL;

/**
 *
 * @author yen nuong
 */
public class HangHoa {
    private String idhanghoa;
    private String tenhanghoa;
    private String dongia;
    private String tendanhmuc;
    private int soluong;
    
    public HangHoa( String idhanghoa, String tenhanghoa, String dongia, String tendanhmuc, int soluong){
        this.idhanghoa = idhanghoa;
        this.tenhanghoa = tenhanghoa;
        this.dongia = dongia;
        this.tendanhmuc = tendanhmuc;
        this.soluong = soluong;
    }

    HangHoa() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String toString() {
        return "HangHoa{" + "idhanghoa=" + idhanghoa + ", tenhanghoa=" + tenhanghoa + ", dongia=" + dongia + ", tendanhmuc=" + tendanhmuc + ", soluong=" + soluong + '}';
    }


    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getIdhanghoa() {
        return idhanghoa;
    }

    public void setIdhanghoa(String idhanghoa) {
        this.idhanghoa = idhanghoa;
    }

    public String getTenhanghoa() {
        return tenhanghoa;
    }

    public void setTenhanghoa(String tenhanghoa) {
        this.tenhanghoa = tenhanghoa;
    }

    public String getDongia() {
        return dongia;
    }

    public void setDongia(String dongia) {
        this.dongia = dongia;
    }

    public String getTendanhmuc() {
        return tendanhmuc;
    }

    public void setTendanhmuc(String tendanhmuc) {
        this.tendanhmuc = tendanhmuc;
    }
    
    public static void main(String[] args){
        
    }
}
