<%@ include file="view/partials/header.jsp"%>

<div class="container-fluid">
	<div class="row">
		<div class="col-sm-12">
			<div id="my-slider" class="carousel slide" data-ride="carousel">

				<!--indicators dot nav-->
				<ol class="carousel-indicators">
					<li data-target="my-slider" data-slide-to="0" class="active"></li>
					<li data-target="my-slider" data-slide-to="1"></li>
					<li data-target="my-slider" data-slide-to="2"></li>
					<li data-target="my-slider" data-slide-to="3"></li>
					<li data-target="my-slider" data-slide-to="4"></li>


				</ol>

				<!--wrappers-->
				<div class="carousel-inner" role="listbox">
					<div class="item active">
						<img
							src="https://hdwallsource.com/img/2014/10/antique-watches-wallpaper-44831-45971-hd-wallpapers.jpg"
							alt="abes" width="100%" height="10%">
						<div class="carousel-caption">
							<h2>testing</h2>
						</div>
					</div>
					<div class="item">
						<img
							src="http://antiquebharat.in/wp-content/uploads/2018/06/68982987-antique-wallpapers.jpg"
							width="100%" alt="abes">
						<div class="carousel-caption">
							<h2>testing</h2>
						</div>
					</div>
					<div class="item">
						<img
							src="data:image/jpeg;base64,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"
							width="100%" height="50%" alt="abes">
						<div class="carousel-caption">
							<h2>testing</h2>
						</div>
					</div>
					<div class="item">
						<img
							src="https://shopnix.in/blog/wp-content/uploads/2015/12/sell-antiques-online-in-india.jpg"
							width="100%" alt="abes">
						<div class="carousel-caption">
							<h2>testing</h2>
						</div>
					</div>
					<div class="item">
						<img
							src="https://img2.10bestmedia.com/Images/Photos/71986/p-rooney-robison-dining-room_54_990x660_201404182150.jpg"
							width="100%" height="3%" alt="abes">
						<div class="carousel-caption">
							<h2>testing</h2>
						</div>
					</div>

				</div>

				<!--controls or next and prev button-->

				<a class="left carousel-control" href="#my-slider" role="button"
					data-slide="prev"> <span
					class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
					<span class="sr-only">previous</span>
				</a> <a class="right carousel-control" href="#my-slider" role="button"
					data-slide="next"> <span
					class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
					<span class="sr-only">previous</span>
				</a>
			</div>
		</div>
	</div>
</div>


<!--  COROSEL END HERE -->


<%@page import="java.sql.*"%>



<%
String driverName = "com.mysql.cj.jdbc.Driver";
String connectionUrl = "jdbc:mysql://localhost:3306/";
String dbName = "website";
String userId = "root";
String password = "f00tb@ller";
String seller = (String) session.getAttribute("username");


try {
Class.forName(driverName);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}


Connection connection = null;

ResultSet resultSet = null;
%>



<div class="container">

    
    <div class="row">
        <div class="col-lg-12">
            <h3>Things you may like</h3>
        </div>
    </div>
    
  <div class="row text-center">
<%
try{ 
connection = DriverManager.getConnection(connectionUrl+dbName, userId, password);

String sql ="SELECT * FROM items";
PreparedStatement st = connection.prepareStatement(sql);
//st.setString(1, seller);


resultSet = st.executeQuery(sql);
while(resultSet.next()){
%>

<div class="col-md-3 col-sm-6">
             <div class="thumbnail">
                  <img src="images/<%=resultSet.getString("image")%>">
                  
          
            <div class="caption">
                <h4><%=resultSet.getString("name") %></h4>
            </div>
            <p>
                <a href="item.jsp?id=<%=resultSet.getString("id") %>" class="btn btn-primary">More Info</a>
            </p>
        </div>
      
        </div>

<% 
}

} catch (Exception e) {
e.printStackTrace();
}
%>

    </div>

</div>


<div class="row text-center"></div>
<div class="tm-content col-sm-8">
	<h1>This is a prototype for the webpage</h1>

	<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do
		eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad
		minim veniam, quis nostrud exercitation ullamco laboris nisi ut
		aliquip ex ea commodo consequat. Duis aute irure dolor in
		reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla
		pariatur. Excepteur sint occaecat cupidatat non proident, sunt in
		culpa qui officia deserunt mollit anim id est laborum.</p>


</div>

<aside id="tm-sidebar" class="col-sm-4">
	<div>
		<h3>Stories</h3>
		<ul>
			<li><a href="#">Story 1</a></li>
			<li><a href="#">Story 2</a></li>
			<li><a href="#">Story 3</a></li>
			<li><a href="#">Story 4</a></li>

		</ul>
	</div>
</aside>

<div>
	<footer class="footer clearfix">
		<p class="text-center">&copy; copyright 2017</p>
	</footer>
</div>
</body>
</html>