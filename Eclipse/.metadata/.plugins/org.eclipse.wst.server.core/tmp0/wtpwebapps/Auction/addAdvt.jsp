<%@ include file="view/partials/header.jsp"%>
<%

	response.setHeader("Cache-Control","no-cachee, no-store, must-revalidate");
	response.setHeader("pragma","no-cache");
	response.setHeader("Expires","0");
	if(session.getAttribute("username")==null)
	{
		response.sendRedirect("login.jsp");
		
	}
%>

<link rel="stylesheet" type="text/css" href="Stylesheets/login.css">
<div class="container-fluid bg">
	<div class="row">
		<div class="col-xs-12 col-md-4"></div>
		<div class="col-xs-12 col-md-4">

			<!--Form start -->

			<form class="form-container" action="addAdvt" method="post" enctype="multipart/form-data">
				<h3>AddAdvt</h3>
				<div class="form-row">
					<div class="form-group col-md-12">
						<label for="inputUname">Name</label> <input type="text"
							class="form-control" name="name" id="inputUname"
							placeholder="Name">
					</div>
					
			
					<div class="form-group col-md-12">
						<label for="inputImage">Image</label> <input type="file"
							class="form-control" name="image" id="inputImage"
							placeholder="choose image">
					</div>


					<div class="form-group col-md-12">
						<label for="inputBid">Minimum Bid</label> <input type="number"
							class="form-control" name="Mbid" id="inputBid"
							placeholder="Minimum Bid">
					</div>
					<div class="form-group col-md-12">
						<label for="inputBuy">Buy Now</label> <input
							type="number" class="form-control" id="inputBuy"
							name="Bnow" placeholder="Buy Now Price">
					</div>
					
					<div class="form-group col-md-12">
						<label for="inputDate">Auction End Date</label> <input
							type="date" class="form-control" id="inputDate"
							name="date" >
					</div>
					
				<div class="form-group">
					<label for="inputDesc">Description</label>
					<textarea name = "describe" class="form-control" id = "inputDesc" placeholder = "Enter Description" rows ="5" cols = "34" ></textarea>
					
				</div>
				</div>
				
				
				
				<button type="submit" class="btn btn-primary col-md-12">Add Advt</button>
			</form>
			
			</div>
				<br>			
		
		</div>
		<div class="col-xs-12 col-md-4"></div>
	</div>

</body>
</html>