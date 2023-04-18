/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectQTDL;

/**
 *
 * @author yen nuong
 */
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class DanhMucList{
//    public Vector<DanhMuc> hienthidanhmuc(){
//        Vector<DanhMuc> vec = new Vector<DanhMuc>();
//        
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlst","root","T#9758@qlph");
//            String sql = "select tendanhmuc from danhmuc";
//            PreparedStatement pst = con.prepareStatement(sql);
//            ResultSet rs = pst.executeQuery();
//            while(rs.next()){
//                DanhMuc dm = new DanhMuc();
//                dm.settendanhmuc(rs.getString(1));
//                vec.add(dm);
//            }
//            
//            
////            String sql = "select tendanhmuc from danhmuc";
////            Statement statement = conn.createStatement();
////            ResultSet result = statement.executeQuery(sql);
////            
////            while(result.next()){
////                DanhMuc dm = new DanhMuc();
////                dm.settendanhmuc(result.getString(1));
////                vec.add(dm);
////            }
//            
//        }catch(Exception e){
//            e.printStackTrace();
//        }
//        return vec;
//    }
    
//    public void DoDanhMucVaoCombobox(){
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlst","root","T#9758@qlph");
//            String sql = "select * from danhmuc";
//            PreparedStatement pst = con.prepareStatement(sql);
//            ResultSet rs = pst.executeQuery();
//        
//          String caulenhLayDM = "select * from danhmuc";
//          ResultSet rs = sqlHelper.executeQuery(caulenhLayDM);
        
            //Tạo 1 DefaultComboboxModel
//            DefaultComboBoxModel cbbModel = (DefaultComboBoxModel)jComboBox1.getModel();
//            cbbModel.removeAllElements(); //Xoa het du lieu trong combobox
//
//            //Do danhmuc vao combobox
//            while(rs.next()){
//                    int IDdanhmuc = rs.getInt("IDdanhmuc");
//                    String tendanhmuc = rs.getString("tendanhmuc");
//
//                    DanhMuc mycbb = new DanhMuc(IDdanhmuc,tendanhmuc);
//
//                    cbbModel.addElement(mycbb);
//                }
//        }catch( ClassNotFoundException | SQLException ex){
//                JOptionPane.showMessageDialog(null,ex);
//        }
//    
        
//    }
    
    
    public static void main(String[] args){
        
    }
            
}
