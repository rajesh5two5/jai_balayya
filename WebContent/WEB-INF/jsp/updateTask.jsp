
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
			<div class="col-md-12" style="width: 100%;">
				<!-- BEGIN SAMPLE FORM PORTLET-->
				<div class="portlet light bordered init">
					<div class="portlet-title">
						<div class="caption font-red-sunglo">
							<span class="caption-subject bold "> Update ModuleTask </span>
						</div>
					</div>
					<div class="portlet-body form">
					
						<form role="form" method="get"
							                            action="updateTask">
							<input type="hidden" id="toUrl"
								value="update" /> <input
								type="hidden" id="editTaskFormId" value="yes"> <input
								type="hidden" id="editTaskId" name="idTask" value="${task.idTask}">
							<div class="form-body">
								<div class="row">
									<div class="col-md-12 col-capture">
										<div class="form-group form-md-line-input">
											
											<input type="text" class="form-control catch-error"
												id="idTask" name="taskName" value="${task.taskName}"
												placeholder="Enter your Task name"> <label
												for="idTask">Task name *</label> <span
												class="help-block"></span>
										</div>
										<span class="required"></span>
									</div>
								</div>

								<br />
								<div class="row">
									<div class="note note-danger hidden"></div>
								</div>
							</div>
							<div class="form-actions noborder align-center">
							<button type="submit" class="btn blue" >Update</button>
		                			
		                			<a href="taskview" class="btn default">Cancel</a>
		            			</div>
						</form>
					</div>
				</div>
				<div class="note note-info hidden">Module Edited Successfully
				</div>
				<!-- END SAMPLE FORM PORTLET-->
			</div>
		</div>
	</div>
</div>
	
	
	
	
	<jsp:include page="footer.jsp" />