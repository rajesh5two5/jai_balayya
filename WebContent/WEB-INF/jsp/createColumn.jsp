
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
							<span class="caption-subject bold ">Create Derived
								Column/Filter for Extended Template : DM_App_Test</span>
						</div>
					</div>
					<div class="portlet-body form">
						<input type="hidden" id="tourl" value="createColumnForm" /> <input
							type="hidden" id="targeturl" value="Datablend" />


						<!--  <form role="form" method="post" action="">  -->
						<form action="createColumnForm" enctype="multipart/form-data"
							method="post" accept-charset="utf-8">

							<div class="form-body">
								<div class="row">

									<input type="hidden" id="blendid" value="48" />

									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												value="DM_App_Test" readonly> <label
												for="blendnameid">Extended Template Name *</label>
											<!--  <span class="help-block">Data Set Name </span> -->
										</div>
										<br /> <span class="required"></span>
									</div>

									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												value="DM_App_Test" readonly> <label
												for="blenddescid">Description</label>
											<!--  <span class="help-block">Data Set Name </span> -->
										</div>
										<br /> <span class="required"></span>
									</div>
								</div>

								<div class="row">
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												value="DM_App_Source1" readonly> <label
												for="blenddescid">Data Template</label>
											<!--  <span class="help-block">Data Set Name </span> -->
										</div>
										<br /> <span class="required"></span>
									</div>

									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<select class="form-control" id="blendtypeid"
												name="blendtype">
												<option value="Derived Column">Derived Column</option>
												<option value="Filter">Filter</option>
												<option value="Row Add">Row Add</option>
											</select> <label for="blenddescid">Choose Extension Type*</label>
											<!--  <span class="help-block">Data Set Name </span> -->
										</div>
										<br /> <span class="required"></span>
									</div>
								</div>
							</div>
							<div id="derived_form_id">
								<div class="row">
									<div class="col-md-6 col-capture" id="derived_input_id">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												id="formulanameid" name="formulaname"> <label
												for="formulanameid">Derived Column Name *</label>
											<!--  <span class="help-block">Data Set Name </span> -->
										</div>
										<br />
									</div>
								</div>
								<div class="col-md-6 col-capture" style="display: none"
									id="filter_input_id">
									<div class="form-group form-md-line-input">
										<input type="text" class="form-control catch-error"
											id="filternameid" name="filtername"> <label
											for="formulanameid">Filter Name *</label>
										<!--  <span class="help-block">Data Set Name </span> -->
									</div>
									<br />
								</div>
							</div>
							<div id="common_form_id">
								<div class="row">
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<select class="form-control blendops" name="blendcolumn">
												<option value="-1">Choose Column</option>


												<option value="Id">Id</option>


												<!--     fertrive data from data base -->
												<option value="Name">Name</option>
											</select> <label for="blendcolumnid">Source Column Name</label><br>
										</div>
									</div>
									<input type="hidden" id="sourceid" value="172" />

									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<select class="form-control blendops" name="blendoperator">
												<option value="-1">Choose Operator</option>
												<option value="+">+</option>
												<option value="-">-</option>
												<option value="*">*</option>
												<option value="/">/</option>
											</select> <label for="blendoperid">Choose Operator</label><br>
										</div>
									</div>
								</div>

								<div class="row">
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<select class="form-control blendops" name="rightfunction"
												placeholder="">
												<option value="-1">Choose Function</option>
												<option value="abs">abs</option>
												<option value="acros">acros</option>
												<option value="asin">asin</option>
												<option value="atan">atan</option>
												<option value="atan2">atan2</option>
												<option value="bin">bin</option>
												<option value="cbrt">cbrt</option>
												<option value="ceil">ceil</option>
												<option value="conv">conv</option>
												<option value="cos">cos</option>
												<option value="cosh">cosh</option>
												<option value="exp">exp</option>
												<option value="expm1">expm1</option>
												<option value="factorial">factorial</option>
												<option value="floor">floor</option>
												<option value="hex">hex</option>
												<option value="hypot">hypot</option>
												<option value="log">log</option>
												<option value="log10">log10</option>
												<option value="log1p">log1p</option>
												<option value="log2">log2</option>
												<option value="pmod">pmod</option>
												<option value="pow">pow</option>
												<option value="rint">rint</option>
												<option value="round">round</option>
												<option value="shiftLeft">shiftLeft</option>
												<option value="shiftRight">shiftRight</option>
												<option value="shiftRightUnsigned">shiftRightUnsigned</option>
												<option value="signum">signum</option>
												<option value="sin">sin</option>
												<option value="sinh">sinh</option>
												<option value="sqrt">sqrt</option>
												<option value="tan">tan</option>
												<option value="tanh">tanh</option>
												<option value="toDegrees">toDegrees</option>
												<option value="toRadians">toRadians</option>
												<option value="unhex">unhex</option>
												<option value="ascii">ascii</option>
												<option value="base64">base64</option>
												<option value="concat">concat</option>
												<option value="concat_ws">concat_ws</option>
												<option value="decode">decode</option>
												<option value="encode">encode</option>
												<option value="format_number">format_number</option>
												<option value="format_string">format_string</option>
												<option value="get_json_object">get_json_object</option>
												<option value="initcap">initcap</option>
												<option value="instr">instr</option>
												<option value="length">length</option>
												<option value="levenshtein">levenshtein</option>
												<option value="locate">locate</option>
												<option value="lower">lower</option>
												<option value="lpad">lpad</option>
												<option value="ltrim">ltrim</option>
												<option value="printf">printf</option>
												<option value="regexp_extract">regexp_extract</option>
												<option value="regexp_replace">regexp_replace</option>
												<option value="repeat">repeat</option>
												<option value="reverse">reverse</option>
												<option value="rpad">rpad</option>
												<option value="rtrim">rtrim</option>
												<option value="soundex">soundex</option>
												<option value="space">space</option>
												<option value="split">split</option>
												<option value="substring">substring</option>
												<option value="substring_index">substring_index</option>
												<option value="translate">translate</option>
												<option value="trim">trim</option>
												<option value="unbase64">unbase64</option>
												<option value="upper">upper</option>
											</select> <label for="form_control_1">Select Function*</label>
										</div>
										<br /> <span class="required"></span>
									</div>

									<div class="col-md-6 col-capture" id="filter_opr_id"
										style="display: none">
										<div class="form-group form-md-line-input">
											<select class="form-control blendops" name="filterfunction">
												<option value="-1">Choose Filter Function</option>
												<option value="=">=</option>
												<option value="!=">!=</option>
												<option value=">">></option>
											</select> <label for="blendfunid">Choose Filter Function</label><br>
										</div>
									</div>

								</div>

								<hr />
								<div class="row">

									<div class="col-md-12 col-capture">
										<div class="form-group form-md-line-input">
											<input type="text" class="form-control catch-error"
												id="formulaid" name="formula"> <label
												for="form_control_1">Formula *</label>
										</div>
										<br /> <span class="required"></span>
									</div>
								</div>
							</div>

							<div id="add_row_id">
								<div class="row">
									<div class="col-md-6 col-capture">
										<div class="form-group form-md-line-input">
											<select class="selectpicker" name="bsource[]" id="bsourceid"
												multiple multiple title="Choose Data Source">

												<option value="154">J20T1</option>
												<!-- multiple alues from databse -->

												<option value="155">J20T2</option>
											</select>
											<!-- <label for="columnid">Data Template for Modification</label><br> -->
										</div>
									</div>
								</div>
							</div>

							<div class="form-actions noborder align-center">
								<button type="submit" id="blendcreatecolumnid" class="btn blue">Submit</button>
							</div>
							<!-- </form> -->
						</form>
					</div>
				</div>
				<div class="row">
					<div class="col-md-12">
						<!-- BEGIN EXAMPLE TABLE PORTLET-->
						<div class="portlet light bordered">
							<div class="portlet-body">
								<table class="table table-striped table-bordered table-hover"
									id="showDataTable">
									<thead>
										<tr>
											<th>Column Name</th>
											<th>Display Name</th>
											<th>Format</th>
											<th>Data Profile Check</th>
											<th>Group_By</th>
											<th>Duplicate_key</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td></td>
											<td>Id</td>
											<td>Long</td>
											<td>N</td>
											<td>N</td>
											<td>N</td>

										</tr>
									</tbody>

								</table>
								<!-- <a href="" class="btn blue" >Add DataBlend</a> -->

							</div>
						</div>
						<!-- END EXAMPLE TABLE PORTLET-->
					</div>
				</div>
				<!-- closing table row -->
			</div>
			<div class="note note-info hidden">Csv uploaded Successfully</div>
			<!-- END SAMPLE FORM PORTLET-->

		</div>
	</div>
</div>
<jsp:include page="footer.jsp" />