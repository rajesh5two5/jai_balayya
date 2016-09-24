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
<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
		<button>hello</button>
		<div class="row">
			<span id="tourl" style="display: value="${listdatasource.name}"></span>
			<div class="col-md-12">
				<!-- BEGIN EXAMPLE TABLE PORTLET-->
				<div class="portlet light bordered">
					<div class="portlet-title">
						<div class="caption font-red-sunglo">
							<span class="caption-subject bold ">Details for Data
								Template </span>
						</div>
					</div>
					<div class="portlet-body">
						<table class="table table-striped table-bordered table-hover"
							id="sample_editable_1">
							<thead>
								<tr>
									<th>Display Name</th>
									<th>Column Name</th>
									<th>Format</th>
									<th>Data Profile Check</th>
									<th>Group_By</th>
									<th>Duplicate_key</th>
									<th>Measurement</th>
									<!-- <th> measurement</th>
                                                <th> blend</th> -->
									<!-- <th colspan="5"> Data from CSV </th> -->
									<th>Action</th>
									<th>Action</th>
								</tr>
							</thead>
							<tbody>

								<c:forEach var="listdatadefinition"
									items="${listdatadefinition}">


									<tr class="source-item">
										<span style="display: none" class="source-item-id">${listdatadefinition.idColumn}</span>
										</td>

										<td class="source-col-name">${listdatadefinition.columnName}</td>
										<td class="source-display-name">${listdatadefinition.displayName}</td>
										<td class="source-format">${listdatadefinition.format}</td>
										<td class="source-kbe">${listdatadefinition.KBE}</td>
										<td class="source-dgroup">${listdatadefinition.dgroup}</td>
										<td class="source-dupkey">${listdatadefinition.dupkey}</td>
										<td class="source-measurement">${listdatadefinition. measurement}</td>

										<td><a class="edit"
											id="sourceitem-${listdatadefinition.idColumn}"
											href="edit?idColumn=${listdatadefinition.idColumn}">Edit</a>
										</td>
										<td>-</td>
									</tr>
								</c:forEach>



							</tbody>

						</table>
						<!-- <a href="" class="btn blue" >Add DataBlend</a> -->

					</div>
				</div>
				<!-- END EXAMPLE TABLE PORTLET-->
			</div>
		</div>
	</div>

</div>

<jsp:include page="footer.jsp" />