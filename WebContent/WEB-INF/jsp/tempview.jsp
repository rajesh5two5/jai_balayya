<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />

<jsp:include page="container.jsp" />



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
							<span class="caption-subject bold "> Extended Template</span>
						</div>
					</div>
					<div class="portlet-body">
						<table class="table table-striped table-bordered table-hover"
							id="showDataTable">
							<thead>
								<tr>
									<th>Extended Template Name</th>
									<th>Description</th>
									<th>Data Template</th>
									<th>Created At</th>
									<th></th>
									<th></th>
									<th></th>
								</tr>
							</thead>
							<tbody>

								<c:forEach var="templateview" items="${templateview}">
									<tr>
										<td>${templateview.name}</td>
										<td>${templateview.lbdescription}</td>
										<td>${templateview.lsdescription}</td>
										<td>${templateview.createdAt}</td>

										<td><a href="index?idDataBlend=${templateview.idDataBlend}&idData=${templateview.idData}">View</a>
										</td>
										<td><a
											href="createcolumn?idDataBlend=${templateview.idDataBlend}&idData=${templateview.idData}"><i
												class="fa fa-plus"></i> Add Derived Column/Filter</a></td>
										<td><a
											href="deleteTemp?idDataBlend=${templateview.idDataBlend}"><i
												style="margin-left: 20%; color: red" class="fa fa-trash"></i></a>
										</td>

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




<jsp:include page="footer.jsp" />