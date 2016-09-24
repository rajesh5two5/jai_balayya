
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<jsp:include page="header.jsp"/>

<jsp:include page="container.jsp"/>


		
		<!--============= BEGIN CONTENT BODY============= -->


                    <!--*****************      BEGIN CONTENT **********************-->
		
		<div class="page-content-wrapper">
			<!-- BEGIN CONTENT BODY -->
			<div class="page-content">
				<!-- BEGIN PAGE TITLE-->
				<!-- END PAGE TITLE-->
				<!-- END PAGE HEADER-->
				<div class="row">
					<div class="col-md-12">
					
                  <!--****         BEGIN EXAMPLE TABLE PORTLET       **********-->
						
						<div class="portlet light bordered">
							<div class="portlet-title">
								<div class="caption font-red-sunglo">
									<span class="caption-subject bold "> Data Templates </span>
								</div>
							</div>
							<div class="portlet-body">
								<table class="table table-striped table-bordered table-hover"
									id="showDataTable">
									<thead>
										<tr>
											<th>Name</th>
											<th>Description</th>
											<th>Location</th>
											<th>Source</th>
											<th>Created At</th>
											<th>View</th>
											<th>Delete</th>
										</tr>
									</thead>
									<tbody>

										<c:forEach var="listdatasource" items="${listdatasource}">
											<tr>
												<td>${listdatasource.name}</td>
												<td>${listdatasource.description}</td>
												<td>${listdatasource.dataLocation}</td>
												<td>${listdatasource.dataSource}</td>
												<td>${listdatasource.createdAt}</td>
												<td><a href="listdataview?idData=${listdatasource.idData}">View </td>
												<td>
												<a href="deletedatasource?idData=${listdatasource.idData}">
												<i style="margin-left: 20%;color:red" class="fa fa-trash"></i></a>	
				                          
				                            </tr>
										</c:forEach>
									</tbody>
								</table>
							</div>
						</div>
		<!--       *************END EXAMPLE TABLE PORTLET*************************-->
	
					</div>
				</div>
			</div>
		</div>
	

	
	                  <!--********     BEGIN CONTENT ********************-->

<jsp:include page="footer.jsp"/>