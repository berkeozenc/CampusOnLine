<%-- 
    Document   : dtableDnm
    Created on : 01.Ara.2015, 20:46:44
    Author     : LabTek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
    <script>
        $(document).ready(function() {
    var table = $('#example').DataTable();
    var tt = new $.fn.dataTable.TableTools( table );
 
    $( tt.fnContainer() ).insertBefore('div.dataTables_wrapper');
} );
    </script>
    <style>
        body { font-size: 140%; }
    div.DTTT { margin-bottom: 0.5em; float: right; }
    div.dataTables_wrapper { clear: both; }
    </style>
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css"/>
      <link rel="stylesheet" href="css/animate.min.css" type="text/css"/>

    <!-- Custom CSS -->
    <link rel="stylesheet" href="css/creative.css" type="text/css"/>
    
     <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    <script src="js/jquery.easing.min.js"></script>
    <script src="js/jquery.fittext.js"></script>
    <script src="js/wow.min.js"></script>

    <!-- Custom Theme JavaScript -->
    <script src="js/creative.js"></script>
    
     <script src="dtjs/dataTables.bootstrap.js"></script>
     <script src="dtjs/dataTables.tableTools.js"></script>
     <script src="dtjs/jquery.dataTables.js"></script>
     <link rel="stylesheet" href="dtcss/dataTables.bootstrap.css" type="text/css"/>
    
</head>
<body>
    <div class="DTTT btn-group"><a class="btn btn-default DTTT_button_copy" id="ToolTables_example_0" tabindex="0" aria-controls="example"><span>Copy</span><div style="position: absolute; left: 0px; top: 0px; width: 59px; height: 34px; z-index: 99;"><embed id="ZeroClipboard_TableToolsMovie_1" src="../swf/copy_csv_xls_pdf.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="59" height="34" name="ZeroClipboard_TableToolsMovie_1" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=1&amp;width=59&amp;height=34" wmode="transparent"></div></a><a class="btn btn-default DTTT_button_csv" id="ToolTables_example_1" tabindex="0" aria-controls="example"><span>CSV</span><div style="position: absolute; left: 0px; top: 0px; width: 54px; height: 34px; z-index: 99;"><embed id="ZeroClipboard_TableToolsMovie_2" src="../swf/copy_csv_xls_pdf.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="54" height="34" name="ZeroClipboard_TableToolsMovie_2" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=2&amp;width=54&amp;height=34" wmode="transparent"></div></a><a class="btn btn-default DTTT_button_xls" id="ToolTables_example_2" tabindex="0" aria-controls="example"><span>Excel</span><div style="position: absolute; left: 0px; top: 0px; width: 60px; height: 34px; z-index: 99;"><embed id="ZeroClipboard_TableToolsMovie_3" src="../swf/copy_csv_xls_pdf.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="60" height="34" name="ZeroClipboard_TableToolsMovie_3" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=3&amp;width=60&amp;height=34" wmode="transparent"></div></a><a class="btn btn-default DTTT_button_pdf" id="ToolTables_example_3" tabindex="0" aria-controls="example"><span>PDF</span><div style="position: absolute; left: 0px; top: 0px; width: 54px; height: 34px; z-index: 99;"><embed id="ZeroClipboard_TableToolsMovie_4" src="../swf/copy_csv_xls_pdf.swf" loop="false" menu="false" quality="best" bgcolor="#ffffff" width="54" height="34" name="ZeroClipboard_TableToolsMovie_4" align="middle" allowscriptaccess="always" allowfullscreen="false" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" flashvars="id=4&amp;width=54&amp;height=34" wmode="transparent"></div></a><a class="btn btn-default DTTT_button_print" id="ToolTables_example_4" title="View print view" tabindex="0" aria-controls="example"><span>Print</span></a></div>
   <table id="example" class="table table-striped table-bordered dataTable" cellspacing="0" width="100%" role="grid" aria-describedby="example_info" style="width: 100%;">
				<thead>
					<tr role="row"><th class="sorting_asc" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="Name: activate to sort column descending" style="width: 150px;">Name</th><th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Position: activate to sort column ascending" style="width: 236px;">Position</th><th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Office: activate to sort column ascending" style="width: 109px;">Office</th><th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Age: activate to sort column ascending" style="width: 51px;">Age</th><th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Start date: activate to sort column ascending" style="width: 105px;">Start date</th><th class="sorting" tabindex="0" aria-controls="example" rowspan="1" colspan="1" aria-label="Salary: activate to sort column ascending" style="width: 83px;">Salary</th></tr>
				</thead>

				<tfoot>
					<tr><th rowspan="1" colspan="1">Name</th><th rowspan="1" colspan="1">Position</th><th rowspan="1" colspan="1">Office</th><th rowspan="1" colspan="1">Age</th><th rowspan="1" colspan="1">Start date</th><th rowspan="1" colspan="1">Salary</th></tr>
				</tfoot>

				<tbody>
			
				<tr role="row" class="odd">
						<td class="sorting_1">Airi Satou</td>
						<td>Accountant</td>
						<td>Tokyo</td>
						<td>33</td>
						<td>2008/11/28</td>
						<td>$162,700</td>
					</tr><tr role="row" class="even">
						<td class="sorting_1">Angelica Ramos</td>
						<td>Chief Executive Officer (CEO)</td>
						<td>London</td>
						<td>47</td>
						<td>2009/10/09</td>
						<td>$1,200,000</td>
					</tr><tr role="row" class="odd">
						<td class="sorting_1">Ashton Cox</td>
						<td>Junior Technical Author</td>
						<td>San Francisco</td>
						<td>66</td>
						<td>2009/01/12</td>
						<td>$86,000</td>
					</tr><tr role="row" class="even">
						<td class="sorting_1">Bradley Greer</td>
						<td>Software Engineer</td>
						<td>London</td>
						<td>41</td>
						<td>2012/10/13</td>
						<td>$132,000</td>
					</tr><tr role="row" class="odd">
						<td class="sorting_1">Brenden Wagner</td>
						<td>Software Engineer</td>
						<td>San Francisco</td>
						<td>28</td>
						<td>2011/06/07</td>
						<td>$206,850</td>
					</tr><tr role="row" class="even">
						<td class="sorting_1">Brielle Williamson</td>
						<td>Integration Specialist</td>
						<td>New York</td>
						<td>61</td>
						<td>2012/12/02</td>
						<td>$372,000</td>
					</tr><tr role="row" class="odd">
						<td class="sorting_1">Bruno Nash</td>
						<td>Software Engineer</td>
						<td>London</td>
						<td>38</td>
						<td>2011/05/03</td>
						<td>$163,500</td>
					</tr><tr role="row" class="even">
						<td class="sorting_1">Caesar Vance</td>
						<td>Pre-Sales Support</td>
						<td>New York</td>
						<td>21</td>
						<td>2011/12/12</td>
						<td>$106,450</td>
					</tr><tr role="row" class="odd">
						<td class="sorting_1">Cara Stevens</td>
						<td>Sales Assistant</td>
						<td>New York</td>
						<td>46</td>
						<td>2011/12/06</td>
						<td>$145,600</td>
					</tr><tr role="row" class="even">
						<td class="sorting_1">Cedric Kelly</td>
						<td>Senior Javascript Developer</td>
						<td>Edinburgh</td>
						<td>22</td>
						<td>2012/03/29</td>
						<td>$433,060</td>
					</tr></tbody>
			</table>
  
</body>
</html>
