<%-- 
    Document   : Users.jsp
    Created on : 28 Mar, 2017, 6:59:03 PM
    Author     : Honey Shah
--%>

<%@page import="java.util.List,com.AdminDao.*"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Table</title>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.0/jquery.min.js"></script>
        <style>
            .container1 {
                width: 50%;
                height: 30%;
                margin: auto;  
           }
        </style>
    </head>
    <body>
          <%@include file="index.jsp" %> 
        <div class="table-responsive container1">          
        <table class="table table-hover table-bordered">
          <thead>
            <tr>
              <th>Firstname</th>
              <th>Lastname</th>
              <th>SportsClicks</th>
              <th>BusinessClicks</th>
              <th>LifeStyleClicks</th>
              <th>PoliticsClicks</th>
            </tr>
          </thead>
          <tbody>
              <% 
                  String spageid=request.getParameter("page"); 
                  int pageid=1;
                  if(spageid!=null){
                     pageid=Integer.parseInt(spageid);  
                  }
                  int total=5; 
                  
                  if(pageid==1){}  
                   else{  
                      int pageid1=pageid-1;  
                      pageid=pageid1*total+1;  
                   }  
                  List<List> users=Dao.getUsers(pageid,total);;
                  for(int i=0;i<users.size();i++){
                      List<String> user=users.get(i);
                  
              %>  
                    <tr>
                        <td><%= user.get(0) %></td>
                      <td><%= user.get(1) %></td>
                      <td><%= user.get(2) %></td>
                      <td><%= user.get(3) %></td>
                      <td><%= user.get(4) %></td>
                      <td><%= user.get(5) %></td>
                    </tr>
                 <% } %>    
          </tbody>
        </table>
        </div>
        <div id="pagination" class="container1" align="center">
             <ul class="pagination">
                 <li class="active"><a href="Users.jsp?page=1">1</a></li>
             <li><a href="Users.jsp?page=2">2</a></li>
             <li><a href="Users.jsp?page=3">3</a></li>
             <li><a href="Users.jsp?page=4">4</a></li>
             <li><a href="Users.jsp?page=5">5</a></li>
            </ul>
        </div>
    </body>
    <script>
        $(document).ready(function (){
            $('#pagination ul li').click(function(e) {
            var $this = $(this);
            if (!$this.hasClass('active')) {
                  $this.addClass('active');
            },
            e.preventDefault();
            });
        });
    </script>
</html>
