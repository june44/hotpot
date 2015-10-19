//时间戳转yyyy年MM月dd日格式
function numberToDate(num){
	var d = new Date(num);
	var year = d.getFullYear();
    var month = d.getMonth() + 1;
    var day = d.getDate();
    return year + "年" + month + "月" + day + "日";
}
//时间戳转yyyy-MM-dd hh:mm:ss格式
function StringDateTypeOne(num){
	var d = new Date(num);
	var year = d.getFullYear();
	var month = d.getMonth()+1;
	var day = d.getDate();
	var hour = d.getHours();
	var minute = d.getMinutes();
	var seconds = d.getSeconds();
	return year +"-"+month+"-"+day+" "+hour+":"+minute+":"+seconds;
}

/**
 * 时间戳转yyyy-MM-dd格式或yyyy/MM/dd格式
 * @param num
 * @param sign 符号例如-或/
 * @returns
 */
function numberToDateFormat(num, sign){
	var d = new Date(num);
	var year = d.getFullYear();
    var month = d.getMonth() + 1;
    var day = d.getDate();
    return year + sign + month + sign + day;
}

function StringDateTypetwo(num){
	var d = new Date(num);
	var year = d.getFullYear();
	var month = d.getMonth()+1;
	var day = d.getDate();
	return year +"-"+month+"-"+day;
}


/**
 * 提示要选择数据，且只能选择一条
 *  @param tbId	表示datagrid中显示数据的表格id
 */
function isSingleSelect(tbId){
	var selectedRows = $('#' + tbId).datagrid("getSelections");
	if(selectedRows.length < 1){
		$.messager.alert("操作提示", "请先选择一条数据", "info");
		return false;
	}else if(selectedRows.length > 1){
		$.messager.alert("操作提示", "只能选择一条数据, 你多选了", "info");
		return false;
	}else{
		return selectedRows;
	}
}

/**
 * 提示要选择数据，且可多选
 *  @param tbId	表示datagrid中显示数据的表格id
 */
function isMultiSelect(tbId){
	var selectedRows = $('#' + tbId).datagrid("getSelections");
	if(selectedRows.length < 1){
		$.messager.alert("操作提示", "请先选择数据(可多条)", "info");
		return false;
	}else{
		return selectedRows;
	}
}
/**
 * 判断某一行是否可以被操作（选中）
 * @param row	某一行
 * @param status 满足的状态
 * @param tbId	表示datagrid中显示数据的表格id
 * @returns.
 */
function canSelect(tbId, rowStatus, status){
	if(rowStatus == status){
		return true;
	}
	else{
		$.messager.alert("操作提示", "该会员当前状态不可进行此操作", "info");
		return false;
	}
}

function loadData2Combobox(id, url, prop){
	$.ajax({
		url:url,
		async:true,
		dataType:"json",
		success:function(result){
			var array = result;
			if(prop){
				array = [];
				for(var i = 0; i < result.length; i++){
					var v = result[i];
					array[i] = v[prop];
				  }
			}
			console.log("id:" + id + ",array:" + array);
			$('#' + id).combobox('loadData', array);
		}
	});
}
