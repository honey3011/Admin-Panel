<%-- 
    Document   : Chart.jsp
    Created on : 28 Mar, 2017, 5:07:48 PM
    Author     : Honey Shah
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Charts</title>
        <script src='../css/Chart.min.js'></script>
        <style>
            .container1 {
                 width: 50%;
                 height: 30%;
                 margin: auto;
            }
        </style>
    </head>
    <body>
        <%@include file="../index.jsp" %> 
        <div class="container1">
            <div>
                  <canvas id="myChart" width="600" height="400"></canvas>
            </div>
        </div>
       <div class="c1">
            <div>
                <canvas id="myChart2" width="600" height="400"></canvas>
            </div>
        </div>
    </body>
    <script>
    var ctx = document.getElementById("myChart").getContext('2d');
    var myChart = new Chart(ctx, {
        type: 'doughnut',
        data: {
        labels: ["7AM-3PM", "3PM-11PM", "11PM-7AM"],
        datasets: [{
            backgroundColor: [
                "#2ecc71",
                "#3498db",
                "#95a5a6",
            ],
            data: [12, 19, 3]
        }]
       }
    });
   
    var ctx1 = document.getElementById('myChart2').getContext('2d');
    var myChart1 = new Chart(ctx1, {
      type: 'line',
      data: {
        labels: ["7AM-3PM", "3PM-11PM", "11PM-7AM"],
        datasets: [{
          label: 'no. of views',
          data: [12, 19, 3],
          backgroundColor: "rgba(153,255,51,0.4)",
          borderColor: "rgba(153,255,51,1)"
        }]
      }
    });
  </script>
</html>
