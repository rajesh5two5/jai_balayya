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
				<!-- BEGIN SAMPLE FORM PORTLET-->
				<div class="portlet light bordered init">
					<div class="portlet-title">
						<div class="caption font-red-sunglo">
							<span class="caption-subject bold "> Create Data Template
							</span>
						</div>
					</div>
					<div class="portlet-body form">
						<input type="hidden" id="tourl" value="createForm" />
						<!--  <form role="form" method="post" action="">  -->
						<form action="createForm" enctype="multipart/form-data"
							method="get" accept-charset="utf-8">

							<div class="form-body">
								<div class="row">
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												id="datasetid" name="dataset"
												placeholder=" Enter the Data Template Name "> <label
												for="form_control_1">Data Template Name *</label>
											<!--  <span class="help-block">Data Set Name </span> -->
										</div>
										<br /> <span class="required"></span>
									</div>
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control" id="descriptionid"
												name="description" placeholder=" Enter your description ">
											<label for="form_control">Description</label>
											<!-- <span class="help-block">Short text about Data Set</span> -->
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<select class="form-control" id="locationid" name="location"
												placeholder="Choose Location">
												<option value="">Select...</option>
												<option value="File System">File System</option>
												<option value="HDFS">HDFS</option>
												<option value="S3">S3</option>
												<option value="Google">Google</option>
												<option value="Azure">Azure</option>
												<option value="Cassandra">Cassandra</option>
												<option value="MongoDB">MongoDB</option>
												<option value="MySQL">MySQL</option>
												<option value="MS SQL">MS SQL</option>
												<option value="Oracle">Oracle</option>
												<option value="DB2">DB2</option>
												<option value="Vertica">Vertica</option>

											</select> <label for="form_control_1">Data Location *</label>
											<!-- <span class="help-block">Data Location  </span> -->



										</div>
										<br /> <span class="required"></span>
									</div>
									<div class="col-md-6 col-capture" id="sourcedivid">
										<div class="form-group form-md-line-input">
											<!-- <input type="text" class="form-control" id="sourceid" name="source" placeholder="Enter Data Template"> -->
											<select class="form-control" id="sourceid" name="source"
												placeholder="Choose Location">
												<option value="xls">XLS</option>
												<option value="csv">CSV</option>
												<option value="tab">TAB</option>
											</select> <label for="form_control_1">Data Format</label>
											<!-- <span class="help-block">Short text about Data Set</span> -->
										</div>
									</div>
								</div>
								<div id="hide-file" style="display: none;">
									<div class="row" id="csv_id" id="uploaddivid">
										<div class="col-md-6 col-capture">
											<div class="form-group form-md-line-input">
												<input type="file" class="form-control" name="upload"
													id="upload_id" /> <label for="form_control">Metadata
													File</label>
											</div>
											<br />
										</div>
										<div class="col-md-6 col-capture" id="s3typeid">
											<div class="form-group form-md-line-input">
												<!-- <input type="text" class="form-control" id="sourceid" name="source" placeholder="Enter Data Template"> -->
												<select class="form-control" id="s3typevalueid"
													name="s3type" placeholder="Choose Location">
													<option value="DataBuck S3 Bucket">DataBuck S3
														Bucket</option>
													<option value="Your S3 Bucket">Your S3 Bucket</option>
												</select> <label for="form_control_1">Choose Bucket Type</label>
												<!-- <span class="help-block">Short text about Data Set</span> -->
											</div>
										</div>
									</div>
									<div class="row" id="csv_id" id="uploaddivid">
										<div class="col-md-6 col-capture">
											<div class="form-group form-md-line-input">
												<input type="file" class="form-control" name="dataupload"
													id="dataupload_id" /> <label for="form_control">Data
													Source File</label>
											</div>
											<br />
										</div>
									</div>
								</div>
								<div class="form-body" style="display: none;" id="s3_form_id">
									<!-- <div class="form-body"  id="hdfs_form_id"> -->
									<div class="row">
										<div class="col-md-6 col-capture" id="host-id-container">
											<div class="form-group form-md-line-input">
												<input type="text" class="form-control catch-error"
													id="hostName" name="hostName"> <label
													for="form_control_1" id="host-id">Host URI*</label>
												<!--  <span class="help-block">Data Set Name </span> -->
											</div>
											<br /> <span class="required"></span>
										</div>
										<div class="col-md-6 col-capture">
											<div class="form-group form-md-line-input">
												<input type="text" class="form-control catch-error"
													id="schemaName" name="schemaName"> <label
													for="form_control_1" id="folder-id">Folder *</label>
												<!--  <span class="help-block">Data Set Name </span> -->
											</div>
											<br /> <span class="required"></span>
										</div>
									</div>
									<div class="row">
										<div class="col-md-6 col-capture">
											<div class="form-group form-md-line-input">
												<input type="text" class="form-control" id="userName"
													name="userName"> <label for="form_control"
													id="user-id">User login*</label>
												<!-- <span class="help-block">Short text about Data Set</span> -->
											</div>
										</div>
										<div class="col-md-6 col-capture">
											<div class="form-group form-md-line-input">
												<input type="password" class="form-control catch-error"
													id="pwd" name="pwd"> <label for="form_control_1"
													id="user-pwd">Password *</label>
												<!--  <span class="help-block">Data Set Name </span> -->
											</div>
											<br /> <span class="required"></span>
										</div>
									</div>
									<div id="hide-table" style="display: none;">
										<div class="row">
											<div class="col-md-6 col-capture">
												<div class="form-group form-md-line-input">
													<input type="text" class="form-control" id="folderName"
														name="folderName"> <label for="form_control"
														id="table-name">Table Name *</label>
													<!-- <span class="help-block">Short text about Data Set</span> -->
												</div>
												<br />
											</div>
											<div id="hide-port" style="display: none">
												<div class="col-md-6 col-capture">
													<div class="form-group form-md-line-input">
														<input type="text" class="form-control" id="portName"
															name="portName"> <label for="form_control">Port
															*</label>
														<!-- <span class="help-block">Short text about Data Set</span> -->
													</div>
												</div>
											</div>
										</div>
									</div>
									<!-- <div class="col-md-6 col-capture">
                                                    <div class="form-group form-md-line-input">
                                                        <input type="text" class="form-control" id="mosloginid" name="moslogin" placeholder="Enter your description">
                                                        <label for="form_control" id="db-user-name">User Name*</label>
                                                        <span class="help-block">Short text about Data Set</span>
                                                    </div><br/>
                                                </div> -->

									<!-- <div class="row" style="display:none;">
                                                <div class="col-md-6 col-capture">
                                                    <div class="form-group form-md-line-input">
                                                        <input type="text" class="form-control catch-error" id="moscolid" name="moscol" placeholder="Enter the Data Set Name">
                                                        <label for="form_control_1">Collection *</label>
                                                        <span class="help-block">Data Set Name </span> 
                                                     </div><br/>
                                                    <span class="required"></span>
                                                </div>
                                            </div> -->
									<!-- </div> -->
								</div>


								<div class="form-body" style="display: none" id="mqsql_form_id">
									<div class="row">
										<div class="col-md-6 col-capture">
											<div class="form-group form-md-line-input">
												<input type="text" class="form-control catch-error"
													id="hostid" name="host"> <label
													for="form_control_1">Host Name *</label>
												<!--  <span class="help-block">Data Set Name </span> -->
											</div>
											<br /> <span class="required"></span>
										</div>
										<div class="col-md-6 col-capture">
											<div class="form-group form-md-line-input">
												<input type="text" class="form-control" id="portid"
													name="port"> <label for="form_control">Port
													*</label>
												<!-- <span class="help-block">Short text about Data Set</span> -->
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-md-6 col-capture">
											<div class="form-group form-md-line-input">
												<input type="text" class="form-control" id="userid"
													name="username"> <label for="form_control">Username
													*</label>
												<!-- <span class="help-block">Short text about Data Set</span> -->
											</div>
										</div>

										<div class="col-md-6 col-capture">
											<div class="form-group form-md-line-input">
												<input type="password" class="form-control" id="pwdid"
													name="password"> <label for="form_control">Password
													*</label>
												<!-- <span class="help-block">Short text about Data Set</span> -->
											</div>
										</div>
									</div>

									<div class="row">
										<div class="col-md-6 col-capture">
											<div class="form-group form-md-line-input">
												<input type="text" class="form-control" id="dbid"
													name="dbname"> <label for="form_control">Database
													Name *</label>
												<!-- <span class="help-block">Short text about Data Set</span> -->
											</div>
											<span class="required"></span>

											<div class="form-group form-md-line-input">
												<input type="text" class="form-control" id="tableid"
													name="tablename"> <label for="form_control">Table
													Name*</label>
												<!-- <span class="help-block">Short text about Data Set</span> -->
											</div>
										</div>
									</div>
								</div>
								<br /> <br />
								<div class="row">
									<div class="note note-danger hidden"></div>
								</div>
							</div>
							<div class="form-actions noborder align-center">
								<button type="submit" id="datasetupid" class="btn blue">Submit</button>
							</div>
							<!-- </form> -->
						</form>
					</div>
				</div>
				<div class="note note-info hidden">File uploaded Successfully
				</div>
				<!-- END SAMPLE FORM PORTLET-->
			</div>
		</div>
	</div>
</div>
<!-- END QUICK SIDEBAR -->


<jsp:include page="footer.jsp" />