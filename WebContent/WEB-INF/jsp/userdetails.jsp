<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<jsp:include page="header.jsp" />

<jsp:include page="container.jsp" />



<!-- BEGIN CONTENT -->
<div class="page-content-wrapper">
	<!-- BEGIN CONTENT BODY -->
	<div class="page-content">
		<!-- BEGIN PAGE TITLE-->
		<!-- END PAGE TITLE-->
		<!-- END PAGE HEADER-->
		<div class="row">
			<div class="col-md-12">
				<!-- BEGIN EXAMPLE TABLE PORTLET-->
				<div class="portlet light bordered">
					<div class="portlet-title">
						<div class="caption font-red-sunglo">
							<span class="caption-subject bold "> Users </span>
						</div>
					</div>
					<div class="portlet-body">
						<table class="table table-striped table-bordered dataTable"
							id="showDataTable">
							<thead>
								<tr>
									<th>Email</th>
									<th>FirstName</th>
									<th>LastName</th>
									<th></th>
								</tr>
							</thead>
							<tbody>
								<!-- 
								String sql = " SELECT idUser,firstName, lastName,salt, password"
				+ " company,department,email,createdAt,updatedAt FROM User"; -->

								<c:forEach var="user" items="${user}">
									<tr>
										<td>${user.email}</td>
										<td>${user.firstName}</td>
										<td>${user.lastName}</td>

										<td><a href="updateUser?idUser=${user.idUser}"><i
												style="margin-left: 10%;" class="fa fa-edit"></i></a> <a
											href="deleteUser?idUser=${user.idUser}"><i
												style="margin-left: 30%;" class="fa fa-trash"></i></a></td>
								</c:forEach>





							</tbody>
						</table>
					</div>
				</div>
				<!-- END EXAMPLE TABLE PORTLET-->
			</div>
		</div>
	</div>
</div>


<jsp:include page="footer.jsp" />