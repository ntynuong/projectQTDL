/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectQTDL;

/**
 *
 * @author yen nuong
 */
public class DanhMuc {
    Object value; //Chua iddanhmuc
    Object text; //Chua tendanhmuc
   
    public DanhMuc(Object value,Object text){
        this.value = value;
        this.text = text;
        
    }
    
    @Override
    public String toString(){
        return text.toString();
    }
    
    public int MaInt(){
        return Integer.parseInt(value.toString());
    }
    
    public String MaString(){
        return value.toString();
    }
    
//    private String iddanhmuc;
//    private String tendanhmuc;
//    
//    public DanhMuc(String iddanhmuc, String tendanhmuc){
//        this.iddanhmuc = iddanhmuc;
//        this.tendanhmuc = tendanhmuc;
//    }
//
//    /**
//     *
//     * @return
//     */
//    @Override
//    public String toString() {
//        return "DanhMuc{" + "iddanhmuc=" + iddanhmuc + ", tendanhmuc=" + tendanhmuc + '}';
//    }
//
//
//    public String getIddanhmuc() {
//        return iddanhmuc;
//    }
//
//    public void setIddanhmuc(String iddanhmuc) {
//        this.iddanhmuc = iddanhmuc;
//    }
//
//    public String getTendanhmuc() {
//        return tendanhmuc;
//    }
//
//    public void setTendanhmuc(String tendanhmuc) {
//        this.tendanhmuc = tendanhmuc;
//    }
//
//    void settendanhmuc(String string) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
//    


    

    
}
