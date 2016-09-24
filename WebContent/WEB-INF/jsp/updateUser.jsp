
<jsp:include page="header.jsp" />
<jsp:include page="container.jsp" />

<!-- BEGIN CONTENT -->
<div class="page-content-wrapper">
	<!-- BEGIN CONTENT BODY -->
	<div class="page-content">
		<!-- END PAGE HEADER-->
		<div class="row">
			<div class="col-md-6" style="width: 100%;">
				<!-- BEGIN SAMPLE FORM PORTLET-->
				<div class="portlet light bordered init">
					<div class="portlet">
						<div class="portlet-title">
							<div class="caption font-red-sunglo">




								<span class="caption-subject bold "> Update Details for :
									${user.firstName}&nbsp;&nbsp;${user.lastName} </span>
							</div>
						</div>
					</div>
					<div class="portlet-body form">
						<form role="form" method="get" action="">
							<input type="hidden" id="toUrl" value="${user.idUser }" /> <input
								type="hidden" id="idUser" value="${user.idUser}" />
							<div class="form-body">
								<div class="row">
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												id="firstName" name="firstName"
												placeholder="Enter your firstname" value="${user.firstName}">
											<label for="">First Name</label> <span class="help-block"></span>
										</div>
										<span class="required"></span>
									</div>
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												id="lastName" name="lastName"
												placeholder="Enter your lastname" value="${user.lastName}">
											<label for="">Last Name</label> <span class="help-block"></span>
										</div>
										<span class="required"></span>
									</div>
								</div>
								<br />


								<!--   For Cheak Box -->



								<div class="row">
									<div class="col-md-12">
										<div class="form-group form-md-checkboxes">
											<div class="md-checkbox-list">
												<div class="md-checkbox">
													<input type="checkbox" id="id1" name="${user.roleName}"
														class="md-check accessControlCheckbox" value="${user.idRole}" checked>
													<label for="id1"> <span></span> <span
														class="check"></span> <span class="box"></span> ${user.roleName}
													</label>
												</div>
											</div>
										</div>
									</div>
								</div>







								<div class="row">
									<div class="col-md-6">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												id="companyId" name="company"
												placeholder="Enter company name" value="${user.company}">
											<label for="">Company</label> <span class="help-block"></span>
										</div>
										<span class="required"></span>
									</div>
									<div class="row">
										<div class="col-md-6">
											<div class="form-group form-md-line-input">
												<input type="text" class="form-control" id="departmentId"
													name="department" placeholder="Enter department name"
													value="${user.department}"> <label for="">Department</label>
												<span class="help-block"></span>
											</div>
										</div>
									</div>
									<br />
									<div class="row">
										<div class="note note-danger validation-fail hidden"></div>
									</div>
								</div>
								<div class="form-actions noborder align-center">
									<button type="submit" class="btn blue" id="updateUserId">Submit</button>
								</div>
						</form>
					</div>

				</div>
			</div>
			<div class="note note-info hidden">User Updated Successfully</div>

			<div class="note note-danger hidden"></div>

			<!-- END SAMPLE FORM PORTLET-->
		</div>
	</div>
</div>
<jsp:include page="footer.jsp" />