/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dto.CarsDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import myLib.DBUtils;

/**
 *
 * @author LTC
 */
public class CarsDAO {
    //tao moi xe
    public void newCar(int CarID, String CarName,String Manufacturer,double Price,int ReleasedYear) throws Exception{
        int result = 0;
        PreparedStatement ps = null;
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if(cn!=null){
                String sql = "insert Cars([CarID],[CarName],[Manufacturer],[Price],[ReleasedYear]) values (?,?,?,?,?)";
                ps = cn.prepareStatement(sql);
                ps.setInt(1, CarID);
                ps.setString(2, CarName);
                ps.setString(3, Manufacturer);
                ps.setDouble(4, Price);
                ps.setInt(5, ReleasedYear);
                ps.executeQuery();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            if(ps!=null){
                ps.close();
            }
            if(cn!=null){
                cn.close();
            }
        }
    }
    
    //in danh sach xe
    public ArrayList<CarsDTO> printCars ()throws Exception{
        ArrayList<CarsDTO> list = new ArrayList<>();
        Connection cn= null;
        try {
            cn = DBUtils.makeConnection();
            if(cn!=null){
                String sql = "select [CarID],[CarName],[Manufacturer],[Price],[ReleasedYear]\n"
                        + "from [dbo].[Cars]";
                Statement st = cn.createStatement();
                ResultSet table = st.executeQuery(sql);
                if(table!=null){
                    while(table.next()){
                        int m_carID = table.getInt("CarID");
                        String m_carName = table.getString("CarName");
                        String m_manufacturer = table.getString("Manufacturer");
                        double m_price = table.getDouble("Price");
                        int m_year = table.getInt("ReleasedYear");
                        CarsDTO cars = new CarsDTO(m_carID, m_carName, m_manufacturer, m_price, m_year);
                        list.add(cars);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(cn != null) cn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return list;
    }
    
    public int deleteCar(int CarID)throws Exception{
        int result = 0;
        Connection cn = null;
        try {
            cn = DBUtils.makeConnection();
            if(cn != null){
                String sql = "delete from [dbo].[Cars]\n" +
                                "where CarID = ?";
                PreparedStatement st = cn.prepareStatement(sql);
                st.setInt(1, CarID);
                result = st.executeUpdate();
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return result;
    }
    
//    public void detailCar (int CarID){
//        Connection cn =null;
//        
//        try {
//            cn = DBUtils.makeConnection();
//            
//            ResultSet rs=null;
//            
//            
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                
//            } catch (Exception e) {
//                e.printStackTrace();
//            }
//        }
//        return rs;
//    }
}
