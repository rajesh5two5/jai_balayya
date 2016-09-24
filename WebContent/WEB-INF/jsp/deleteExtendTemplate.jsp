
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
			<div class="col-md-6" style="width: 100%;">
				<div class="portlet light bordered init">
					<div class="portlet-title">
						<div class="caption font-red-sunglo">
							<span class="caption-subject bold "> Delete Extended
								Template : </span>${deletetempview.lename}
						</div>
					</div>
						<div class="portlet-body form">
					<form role="form" method="get" action="deleteTempId">
							<input type="hidden" id="toUrl"
							                            	value="update" /> <input
								type="hidden" id="editTaskFormId" value="yes"> <input
								type="hidden" id="editTaskId" name="idDataBlend" value="${deletetempview.idDataBlend}">


				
						
			


							<div class="form-body">
								<div class="row">
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												id="lename" value="${deletetempview.lename}" readonly>
											<label for="form_control">Name</label>
										</div>



										<span class="required"></span>
									</div>
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												id="ledescription" value="${deletetempview.ledescription}" readonly>
											<label for="form_control">Description</label>
										</div>
										<span class="required"></span>
									</div>
								</div>

								<div class="row">
									<div class="col-md-6">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control" id="lsdescription"
												value="${deletetempview.lsdescription}" readonly> <label
												for="form_control">Data Template for Modification</label>
										</div>
									</div>
								</div>


								<div class="form-actions noborder align-center">
									<button type="submit" class="btn red" >Delete</button>
								</div>

							</div>
						</form>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-12">
				<!-- BEGIN EXAMPLE TABLE PORTLET-->
				<div class="portlet light bordered">
					<div class="portlet-title">
						<div class="caption font-red-sunglo">
							<span class="caption-subject bold">Derived Columns</span>
						</div>
					</div>
					
					<div class="portlet-body">
						<input type="hidden" class="tourl1" value="deletecol">
						<input type="hidden" id="idDataBlend" value="${deletetempview.idDataBlend}">
						<!-- declared for js to work -->
						<table class="table table-striped table-bordered table-hover"
							id="showDataTable">
							
							
							
							
							<thead>
								<tr>
									<th>Name</th>
									<th>Formula</th>
									<th></th>
									<!-- <th> formula</th> -->
								</tr>
							</thead>
							<tbody>


								<tr>

									<td>${deletetempview.lsdcname}</td>
									<td>

										<p>${deletetempview.lsdccolExpression}</p>

									</td>
									<td><span style="display: none">50</span> <a href="deletelistdata?idDataBlend=${deletetempview.idDataBlend}"
										data-toggle="confirmation" class="bs_confirmation_demo_1"
										data-singleton="true"><i
											style="margin-left: 20%; color: red" class="fa fa-trash "></i></a>
									</td>
								</tr>
							</tbody>

						</table>
					</div>
				</div>
				<!-- END EXAMPLE TABLE PORTLET-->
			</div>
		</div>


		<div class="row">
			<div class="col-md-12" style="width: 100%;">
				<div class="portlet light bordered init">
					<!-- BEGIN EXAMPLE TABLE PORTLET-->
					<div class="portlet-title">
						<div class="caption font-red-sunglo">
							<span class="caption-subject bold">Filters</span>
						</div>
					</div>
					<div class="portlet light bordered">
						<div class="portlet-body">
							<input type="hidden" class="tourl1"
								value="http:ocalhost/databuck/datablend/detefilform">
							<table class="table table-striped table-bordered table-hover"
								id="showAltDataTable">
								<thead>
									<tr>
										<th>Name</th>
										<th>Filter</th>
										<th></th>
										<!-- <th> formula</th> -->
									</tr>
								</thead>
								<tbody>


									<tr>

										<td>${deletetempview.ldbfdname}</td>

										<td>
											<p>${deletetempview.ldbfdfilteringExp}</p>
										</td>

										<td><span style="display: none">21</span> <a href="#"
											data-toggle="confirmation" class="bs_confirmation_demo_1"
											data-singleton="true"><i
												style="margin-left: 20%; color: red" class="fa fa-trash "></i></a>
										</td>
									</tr>



								</tbody>

							</table>
						</div>
					</div>
				</div>
				<!-- END EXAMPLE TABLE PORTLET-->
			</div>
		</div>
		<!--  filter data end -->


		<div class="modal fade" id="notesmodal" tabindex="-1" role="basic"
			aria-hidden="true">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-hidden="true"></button>
						<h4 class="modal-title">Activity Notes for</h4>
					</div>
					<div class="modal-body"></div>
					<div class="modal-footer">
						<button type="button" class="btn btn-gray" data-dismiss="modal">Close</button>
					</div>
				</div>
				<!-- /.modal-content -->
			</div> --%>
			 
		<!-- /.modal-dialog -->
	</div>

</div>
</div>






<jsp:include page="footer.jsp" />
