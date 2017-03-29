package com.AdminDao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Honey Shah
 */
public class Dao {
 
    public static List<List> getUsers(int startIndex,int total){
        List<List> users=new ArrayList();
        try {
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("select FirstName,LastName,SportsClicks,PoliticsClicks,LifeStyleCliks,BusinessClicks from userinformation limit "+(startIndex-1)+","+total);
             ResultSet r=preparedStatement.executeQuery();
            while(r.next()){
                String firstName=r.getString("FirstName");
                String lastName=r.getString("LastName");
                String sportsClicks=String.valueOf(r.getLong("SportsClicks"));
                String businessClicks=String.valueOf(r.getLong("BusinessClicks"));
                String lifeStyleClicks=String.valueOf(r.getLong("LifeStyleCliks"));
                String politicsClicks=String.valueOf(r.getLong("PoliticsClicks"));
                List<String> user=new ArrayList();
                user.add(firstName);
                user.add(lastName);
                user.add(sportsClicks);
                user.add(businessClicks);
                user.add(lifeStyleClicks);
                user.add(politicsClicks);
                users.add(user);
            }
           
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return users;
    }
    
}
