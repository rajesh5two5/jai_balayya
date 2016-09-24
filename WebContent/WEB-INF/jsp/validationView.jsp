<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
<jsp:include page="container.jsp" />
<!-- BEGIN CONTENT -->


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
							<span class="caption-subject bold "> Validation Checks </span>
						</div>
					</div>
					<div class="portlet-body">
						<table class="table table-striped table-bordered table-hover"
							id="showDataTable">
							<thead>
								<tr>
									<th>Validation Check Name</th>
									<th>Description</th>
									<th>Type</th>
									<th>Data Template Name</th>
									<th>Created At</th>
									<th></th>
									<!-- <th> </th> -->
									<th></th>
									<th></th>
									<th></th>
									<!-- <th> formula</th> -->
								</tr>
							</thead>
							<tbody>

								<c:forEach var="validation" items="${validation}">
									<tr>
										<td>${validation.ldname}</td>
										<td>${validation.lddescription}</td>
										<td>${validation.ldappType}</td>
										<td>${validation. lsdescription}</td>
										<td>${validation.lscreatedAt}</td>
										<td><a
											href="view?idApp=${validation.idApp}&ld.idApp=ls.idApp">View</a></td>

										<td><a href="create?idApp=${validation.idApp}">Add</a></td>
										<td><a href="cloneView?idApp=${validation.idApp}">Clone</a></td>
										<td><a
											href="delete?idApp=${validation.idApp}&ld.idApp=ls.idApp"><i
												style="margin-left: 20%; color: red" class="fa fa-trash"></i></a></td>
									</tr>
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


















