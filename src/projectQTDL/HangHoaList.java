/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectQTDL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author yen nuong
 */
public class HangHoaList {
    private Connection conn;
    
    public HangHoaList(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlst","root","T#9758@qlph");
        }catch(Exception e){
            e.printStackTrace();
            
        }
        
    }
            
    public boolean addHangHoa(HangHoa s){
        String sql = "insert into hanghoa()" + "values(?,?,?,?,?)";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,s.getIdhanghoa());
            ps.setString(2,s.getTenhanghoa());
            ps.setString(3,s.getDongia());
            ps.setString(4,s.getIddanhmuc());
            ps.setInt(5,s.getSoluong());
            
            return ps.executeUpdate()>0;
        }catch(Exception e){
            e.printStackTrace();
        }
        return false;
    }
    
    public ArrayList<HangHoa> getListHangHoa(){
        ArrayList<HangHoa> list = new ArrayList<>();
        String sql = "select * from hanghoa";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                HangHoa s = new HangHoa();
                s.setIdhanghoa(rs.getString("idhanghoa"));
                s.setTenhanghoa(rs.getString("tenhanghoa"));
                s.setDongia(rs.getString("dongia"));
                s.setIddanhmuc(rs.getString("iddanhmuc"));
                s.setSoluong(rs.getInt("soluong"));
                list.add(s);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return list;
    }
    
//    PreparedStatement ps = null;
//    ResultSet rs= null;
//    
//    public List<HangHoa> getAllHangHoa(){
//        String query = "select * from hanghoa";
//        try{
//            List<HangHoa> list = new ArrayList<>();    
//            Class.forName("com.mysql.jdbc.Driver");
//            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlst","root","T#9758@qlph");
//            ps = con.prepareStatement(query);
//            rs = ps.executeQuery();
//            while(rs.next()){
//                list.add(new HangHoa(rs.getString(1),
//                rs.getString(2),
//                rs.getString(3),
//                rs.getString(4),
//                rs.getInt(5)));   
//            }
//            return list;
//        }catch(Exception e){
//                JOptionPane.showMessageDialog(null,e);
//
//        }
//        return null;
//        
//    }
    
    public static void main(String[] args){
        new HangHoaList();
    }
}
