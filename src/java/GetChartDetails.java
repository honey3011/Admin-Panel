/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Honey Shah
 */
public class GetChartDetails extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            long morningClicks=0,noonClicks=0,nightClicks=0;
            Connection connection=DBConnection.getConnection();
            PreparedStatement preparedStatement=connection.prepareStatement("select MorningClicks,NoonClicks,NightClicks from analytics where Date=?");
//            preparedStatement.setString(1,"2017-03-28");
            String date=new SimpleDateFormat("yyyy_mm_dd").format(new java.util.Date());
            preparedStatement.setString(1,date);
            ResultSet r=preparedStatement.executeQuery();
            while(r.next()){
                morningClicks=r.getLong("MorningClicks");
                noonClicks=r.getLong("NoonClicks");
                nightClicks=r.getLong("NightClicks");
            }
            String data=String.valueOf(morningClicks)+","+String.valueOf(noonClicks)+","+String.valueOf(nightClicks);
            System.out.println(data);
            request.setAttribute("data", data);
            request.getRequestDispatcher("Chart.jsp").forward(request,response);
                
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(GetChartDetails.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GetChartDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}