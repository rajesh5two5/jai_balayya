<html>
<head>
<title>DataBuck</title>
</head>
<body>







	
	<!-- BEGIN CONTAINER -->
	<div class="page-container">
		<!-- BEGIN SIDEBAR -->
		<div class="page-sidebar-wrapper">
			<!-- BEGIN SIDEBAR -->
			<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
			<!-- DOC: Change data-auto-speed="200" to adjust the sub menu slide up/down speed -->
			<div class="page-sidebar navbar-collapse collapse">
				<!-- BEGIN SIDEBAR MENU -->
				<!-- DOC: Apply "page-sidebar-menu-light" class right after "page-sidebar-menu" to enable light sidebar menu style(without borders) -->
				<!-- DOC: Apply "page-sidebar-menu-hover-submenu" class right after "page-sidebar-menu" to enable hoverable(hover vs accordion) sub menu mode -->
				<!-- DOC: Apply "page-sidebar-menu-closed" class right after "page-sidebar-menu" to collapse("page-sidebar-closed" class must be applied to the body element) the sidebar sub menu mode -->
				<!-- DOC: Set data-auto-scroll="false" to disable the sidebar from auto scrolling/focusing -->
				<!-- DOC: Set data-keep-expand="true" to keep the submenues expanded -->
				<!-- DOC: Set data-auto-speed="200" to adjust the sub menu slide up/down speed -->
				<ul class="page-sidebar-menu  page-header-fixed "
					data-keep-expanded="false" data-auto-scroll="true"
					data-slide-speed="200" style="padding-top: 20px">
					<!-- DOC: To remove the sidebar toggler from the sidebar you just need to completely remove the below "sidebar-toggler-wrapper" LI element -->
					<li class="sidebar-toggler-wrapper hide">
						<!-- BEGIN SIDEBAR TOGGLER BUTTON -->
						<div class="sidebar-toggler"></div> <!-- END SIDEBAR TOGGLER BUTTON -->
					</li>
					<!-- DOC: To remove the search box from the sidebar you just need to completely remove the below "sidebar-search-wrapper" LI element -->
					<li class="nav-item"><a href="javascript:;"
						class="nav-link nav-toggle"> <i class="fa fa-gears"></i> <span
							class="title">Administration</span> <span class="arrow "></span>
					</a>

						<ul class="sub-menu">
							<li class="nav-item"><a href="javascript:;"
								class="nav-link nav-toggle"> <i class="fa fa-cubes"></i>
									Modules <span class="arrow"></span>
							</a>
								<ul class="sub-menu">
									<li class="nav-item"><a
										href="http:/localhost/databuck/task" class="nav-link "> <span
											class="title">View Modules</span>
									</a></li>

									<li class="nav-item"><a
										href="http:/localhost/databuck/task/create" class="nav-link ">
											<span class="title">Add New Module</span>
									</a></li>
								</ul></li>


							<li class="nav-item"><a href="javascript:;"
								class="nav-link nav-toggle"> <i class="fa fa-users"></i>
									Groups <span class="arrow"></span>
							</a>
								<ul class="sub-menu">
									<li class="nav-item"><a
										href="http:/localhost/databuck/role" class="nav-link "> <span
											class="title">View Groups</span>
									</a></li>
									<li class="nav-item"><a
										href="http:/localhost/databuck/role/create" class="nav-link ">
											<span class="title">Add New Group</span>
									</a></li>
								</ul></li>
							<!--  User navigation Starts here -->
							<li class="nav-item"><a href="javascript:;"
								class="nav-link nav-toggle"> <i class="fa fa-user"></i>
									Users <span class="arrow"></span>
							</a>
								<ul class="sub-menu">
									<li class="nav-item"><a
										href="http:/localhost/databuck/user" class="nav-link "> <span
											class="title">View Users</span>
									</a></li>

									<li class="nav-item"><a
										href="http:/localhost/databuck/user/create" class="nav-link ">
											<span class="title">Add New User</span>
									</a></li>
								</ul></li>

						</ul></li>

					<li class="nav-item active open"><a href="javascript:;"
						class="nav-link nav-toggle"> <i class="fa fa-cloud-download"></i>
							<span class="title">Data Template</span> <span class="arrow"></span>
					</a>
						<ul class="sub-menu">

							<li class="nav-item active"><a
								href="http:/localhost/databuck/datasource" class="nav-link ">
									<span class="title">View </span>
							</a></li>


							<li class="nav-item"><a
								href="http:/localhost/databuck/datasource/create"
								class="nav-link "> <span class="title">Add New</span>
							</a></li>
						</ul></li>

					<li class="nav-item"><a href="javascript:;"
						class="nav-link nav-toggle"> <i class="fa fa-edit"></i> <span
							class="title">Extend Template</span> <span class="arrow"></span>
					</a>
						<ul class="sub-menu">
							<li class="nav-item"><a
								href="http:/localhost/databuck/datablend" class="nav-link ">
									<span class="title">View </span>
							</a></li>

							<li class="nav-item"><a
								href="http:/localhost/databuck/datablend/create"
								class="nav-link "> <span class="title">Add New</span>
							</a></li>
						</ul></li>

					<li class="nav-item"><a href="javascript:;"
						class="nav-link nav-toggle"> <i class="fa fa-check-square-o"></i>
							<span class="title">Validation Check</span> <span class="arrow"></span>
					</a>
						<ul class="sub-menu">
							<li class="nav-item"><a
								href="http:/localhost/databuck/dataapp" class="nav-link ">
									<span class="title">View </span>
							</a></li>

							<li class="nav-item"><a
								href="http:/localhost/databuck/dataapp/create"
								class="nav-link "> <span class="title">Add New</span>
							</a></li>
						</ul></li>

					<li class="nav-item"><a href="javascript:;"
						class="nav-link nav-toggle"> <i class="fa fa-calendar"></i> <span
							class="title">Schedule</span> <span class="arrow"></span>
					</a>
						<ul class="sub-menu">
							<li class="nav-item"><a
								href="http:/localhost/databuck/schedule" class="nav-link ">
									<span class="title">View </span>
							</a></li>

							<li class="nav-item"><a
								href="http:/localhost/databuck/schedule/create"
								class="nav-link "> <span class="title">Add New</span>
							</a></li>

							<li class="nav-item"><a
								href="http:/localhost/databuck/schedule/assign"
								class="nav-link "> <span class="title">Assign
										Schedule</span>
							</a></li>
						</ul></li>

					<li class="nav-item"><a href="javascript:;"
						class="nav-link nav-toggle"> <i class="fa fa-tasks"></i> <span
							class="title">Tasks</span> <span class="arrow"></span>
					</a>
						<ul class="sub-menu">
							<li class="nav-item"><a
								href="http:/localhost/databuck/scheduledtask" class="nav-link ">
									<span class="title">View </span>
							</a></li>

							<li class="nav-item"><a
								href="http:/localhost/databuck/scheduledtask/runtask"
								class="nav-link "> <span class="title">Run Task </span>
							</a></li>
						</ul></li>


					<li class="nav-item"><a href="javascript:;"
						class="nav-link nav-toggle"> <i class="icon-layers"></i> <span
							class="title">Results</span> <span class="arrow"></span>
					</a>
						<ul class="sub-menu">
							<li class="nav-item"><a
								href="http:/localhost/databuck/forensicsresults/view"
								class="nav-link "> <span class="title">Quality
										Profiling</span>
							</a></li>

							<li class="nav-item"><a
								href="http:/localhost/databuck/matchingresults/view"
								class="nav-link "> <span class="title">Matching</span>
							</a></li>
							<!-- </ul>

                            <ul class="sub-menu"> -->
							<li class="nav-item"><a
								href="http:/localhost/databuck/anomalyresults/view"
								class="nav-link "> <span class="title">Anomaly</span>
							</a></li>

						</ul></li>

					<li class="nav-item"><a href="javascript:;"
						class="nav-link nav-toggle"> <i class="fa fa-gear"></i> <span
							class="title">User Settings</span> <span class="arrow"></span>
					</a>
						<ul class="sub-menu">
							<li class="nav-item"><a
								href="http:/localhost/databuck/change_password"
								class="nav-link "> <span class="title">Change
										Password </span>
							</a></li>
							<!--  </ul>
                            <ul class="sub-menu"> -->

						</ul></li>

				</ul>
				<!-- END SIDEBAR MENU -->
				<!-- END SIDEBAR MENU -->
			</div>
		</div>
		<!-- END SIDEBAR -->


		<!-- ********************BEGIN CONTENT *************************************************-->
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
									<span class="caption-subject bold "> Data Templates </span>
								</div>
							</div>
							div class="portlet-body">
				<table class="table table-striped table-bordered table-hover"
					id="showDataTable">
					<thead>
						<tr>
							<th>Name</th>
							<th>Description</th>
							<th>Location</th>
							<th>Source</th>
							<th>Created At</th>
                             <th></th>
							<th>Delete</th>
						</tr>
					</thead>
					<tbody>
					 <c:forEach var="listdatasource" items="${listdatasource}">
					
						
						 <td>${listdatasource.name}</td>
                         <td>${listdatasource.description}</td>
                         <td>${listdatasource.dataLocation}</td>
                        <td>${listdatasource.dataSource}</td>
                         <td>${listdatasource.createdAt}</td>
                        <td>
                        
                        <a href="/deletelistdatasource?idData=${listdatasource.idData}">Delete</a>
                             </td>
                           </c:forEach>  
                
                       
						
						</tbody>
						</table>
						
						<!-- END EXAMPLE TABLE PORTLET-->
						<!-- END EXAMPLE TABLE PORTLET-->
					</div>
				</div>
			</div>

<!--  !*****************************   Ending     ********************************* -->














			
</body>



</html>