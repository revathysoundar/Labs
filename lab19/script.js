$(document).ready(function() {
	var cart=[];
	var total = 0;
	$(".add-button").click(function() {
		var p = $(this).parent();
		var gp = $(p).parent();
		var price = gp.children("#price").text();
		var fruit = gp.children("#fruit").text();
		cart.push({fruit:fruit, price:price});
	});
	
	$("#submit").click(printReceipt);
	
	function printReceipt()
	{
		
		for(var i = 0; i < cart.length; i++)
			{
				var item = cart[i];
				total += Number(item.price);
				console.log("$"+item.price + " "+item.fruit);
			}
		console.log("Total : $"+total);
		addToList();
	}
	
	function addToList()
	{
		for(var i = 0; i < cart.length; i++)
			{
				var item = cart[i];
				var listItem = document.createElement('li');
				$(listItem).append(document.createTextNode(item.fruit));
				$(listItem).append(document.createTextNode(item.price));
				$(listItem).hide();
				$("#list").append(listItem);
				$(listItem).slideDown();
			}
		$("#total").append("Total: ");
		$("#total").append(total);
		
		
	}
	
	
});
