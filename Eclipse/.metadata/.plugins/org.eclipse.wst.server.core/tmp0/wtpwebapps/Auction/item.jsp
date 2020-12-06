<%@ include file = "view/partials/header.jsp" %>

<%@page import="java.sql.*, com.dao.*,java.util.* "%>

<%
String user =(String)session.getAttribute("username");
itemDao dao = new itemDao();

ResultSet rs = null;
int item =Integer.parseInt(request.getParameter("id"));
//System.out.println(item);

try{ 
	dao.connect();
	rs = dao.getItems(item);
if(rs.next()){
	String seller = rs.getString("seller");
	java.sql.Date dbSqlDate = rs.getDate("EndDate");
		String date = dbSqlDate.toString() ;
		//date = new StringBuffer(date).reverse().toString();
%>
<div class="container">
    <div class="row">
        <div class="col-md-3">
            <p class="lead">Other Products</p>
            <div class="list-group">
            <ul>
                <li class="list-group-item active">Info 1</li>
                <li class="list-group-item ">Info 2</li>
                <li class="list-group-item">Info 3</li>
                </ul>
            </div>
        </div>
  		<div class="col-md-9">
                <div class="thumbnail">
					<img class="img-responsive" src="images/<%=rs.getString("image")%>">
					
                <div class="caption-full">
                    <h4 class="pull-right">Minimum Bid:$<%=rs.getString("MinBid") %></h4>
                    <a> <h4><%=rs.getString("name")%></h4> </a>					
				 <p><%=rs.getString("descript") %></p>
                    <p>
                        <em>Seller <%=rs.getString("seller") %></em>
                       
                    </p>
                 </div>
                      <h4 class="pull-right">Present Bid:$<%=rs.getString("PresentBid") %></h4>
                <%if(session.getAttribute("username")==null) {%>      
                      <h4 class="pull-left">Login To Bid</h4>
                      <%}else if(user.equals(seller) ) {%>
                    	  <a class="btn btn-primary">Edit</a>
                    	  <a class="btn btn-danger">Delete</a>
                    	  <br></br>
                      <h4 class="pull-left">Present Buyer: <%= rs.getString("buyer") %></h4>	  
                    <% } else{ %>
                       <form action="bid?id=<%=rs.getString("id")%>" method="post">
                       	<input type="number" name="PresBid">
                       	<input type="submit" value="Bid">
                       </form>
                       <% } %>
                        <h4 class="pull-right">End Date:<%=date%></h4>
                </div>     
                
                </div>
                </div>
                </div>
                               

<%
}
}catch (Exception e) {
System.out.println(e);
}

%>
</body>
</html>