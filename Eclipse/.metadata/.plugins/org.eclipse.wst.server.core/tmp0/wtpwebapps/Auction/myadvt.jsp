<%@ include file="view/partials/header.jsp" %>
<%

	response.setHeader("Cache-Control","no-cachee, no-store, must-revalidate");
	response.setHeader("pragma","no-cache");
	response.setHeader("Expires","0");
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
		
	}
%>

<%@page import="java.sql.*,com.dao.* "%>
<% 

myAdvtDao dao = new myAdvtDao();
ResultSet rs = null;
String seller;
try {
	dao.connect();
seller =(String)session.getAttribute("username");
rs = dao.getItems(seller);
	

%>
<div class="container">
    <header class="jumbotron">
        <div class="container">
        <h1> This is Advertisements Page</h1>
        <p>
            Would You like to Add more to your valuable collection
        </p>
        <p>
            <a class="btn btn-primary btn-large" href="addAdvt.jsp">Add New Advertisement</a>
        </p>
        </div>
    </header>
    
    <div class="row">
        <div class="col-lg-12">
            <h3>Your Advertisements</h3>
        </div>
    </div>
    
  <div class="row text-center">
<%
	while(rs.next()){
%>

<div class="col-md-3 col-sm-6">
             <div class="thumbnail">
                  <img src="images/<%=rs.getString("image")%>">
                  
          
            <div class="caption">
                <h4><%=rs.getString("name") %></h4>
            </div>
            <p>
                <a href="item.jsp?id=<%=rs.getString("id") %>" class="btn btn-primary">More Info</a>
            </p>
        </div>
      
        </div>

<% 
}
} catch (Exception e) {
	// TODO Auto-generated catch block
	System.out.println(e);
}


%>

    </div>

</div>


</body>
</html>
