$(function() {
	
	const $console = $( "#console" );
	const container = document.querySelector('#learn');
	const hot = new Handsontable(container, {	
	data: [[]],
	rowHeaders: true,
	colHeaders: true,
	height: 'auto',
	licenseKey: 'non-commercial-and-evaluation' // for non-commercial use only
	});
	
	$( "#save" ).click(function() {	
		$.ajax({
			url: "/learn/save",
			data: JSON.stringify({"data": hot.getData()}),
			contentType: 'application/json; charset=utf-8',
			type: 'POST',
			success: function (res) {
				if (res.data !== undefined) {
					$console.text('Data saved');
				} else {
					$console.text('Save error');
				}
			},
			error: function () {
				$console.text('Save error');
			}
		});
	
	});
	
	$( "#load" ).click(function() {	
		$.ajax({
			url: "/learn/load",
			dataType: 'json',
			type: 'GET',
			success: function (res) {
				if (res.data !== undefined) {
					$console.text('Data loaded successfully');
					hot.loadData(res.data);
				} else {
					$console.text('Save error');
				}
			},
			error: function () {
				$console.text('Save error');
			}
		});
	
	});
	
	$( "#init" ).click(function() {	
		$.ajax({
			url: "/learn/init",
			dataType: 'json',
			type: 'GET',
			success: function (res) {
				if (res.data !== undefined) {
					hot.loadData(res.data);
					$console.text('Data inited successfully');
				} else {
					$console.text('Save error');
				}
			},
			error: function () {
				$console.text('Save error');
			}
		});
	
	});
	
	$( "#count" ).click(function() {
		alert( "Handler for .click() called." );
	});
});
