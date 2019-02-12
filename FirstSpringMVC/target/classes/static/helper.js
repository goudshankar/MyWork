	var helpers =
	{
	    buildDropdown: function(result, dropdown, emptyMessage)
	    {
	        dropdown.html('');
	        dropdown.append('<option value="">' + emptyMessage + '</option>');
	        if(result != '')
	        {
	            $.each(result, function(k, v) {
	                dropdown.append('<option value="' + v.id + '">' + v.value + '</option>');
	            });
	        }
	    },
	    ajaxhelpers:function(data,url,httpmethod){
			$.ajax({
				type : httpmethod,
				contentType : "application/json",
				url : url,
				data : JSON.stringify(data),
				dataType : 'json',
				timeout : 100000,
				//crossDomain: true,
				//headers: {"X-My-Custom-Header": "some value"},
				//async: false,
		        crossDomain: true,
				success : function(data) {
					var trHTML = '<tbody><tr> <th>Name </th> <td>'+data.name+'</td> </tr> <tr> <th>Email</th> <td>'+data.email+'</td> </tr> <tr> <th>Mobile</th> <td>'+data.mobile+'</td> </tr> <tr> <th>UserRole</th> <td>'+data.role+'</td> </tr> <tr></tbody>';
					 $('#records_table').append(trHTML);
					// alert(trHTML);
					
					
				},
				error : function(e) {
					console.log("ERROR: ", e);
				//	display(e);
				},
				done : function(e) {
					console.log("DONE");
				}
			});
			
		}
	}