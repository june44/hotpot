<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>student.jsp</title>
<script type="text/javascript"
	src="js/jquery-easyui-1.2.6/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.2.6/jquery.easyui.min.js"></script>
<script type="text/javascript"
	src="js/jquery-easyui-1.2.6/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet"
	href="js/jquery-easyui-1.2.6/themes/default/easyui.css" type="text/css" />
<link rel="stylesheet" href="js/jquery-easyui-1.2.6/themes/icon.css"
	type="text/css" />
<link rel="stylesheet" href="css/css.css" type="text/css" />
<script type="text/javascript" src="js/searchInfo.js"></script>
<script type="text/javascript">
	$(function() {
		$('#tt').datagrid(
				{
					url : 'list.action', //url
					title : '会员列表',
					height : 480,
					fitColumns : true,
					pagination : true,
					striped : true,
					loadMsg : 'Loading...',
					pageSize : 10,
					pageList : [ 10, 20, 30, 40 ],
					onLoadSuccess : function(data) {
						var ddlMenu = $('.menuB').menubutton({
							menu : '#mn'
						});
						$('.menuB').click(
								function() {
									$('#tt').datagrid('unselectAll');
									$('#tt').datagrid(
											'selectRow',
											$(this).parent().parent().parent()
													.get(0).rowIndex);
								});
					}
				});
		//增加会员 
		$('#apply').click(function() {
			flag = 'add';
			$('#dlg').dialog({
				title : '添加会员',
				modal : true
			});
			$('#fm').get(0).reset();
			$('#stuId').addClass('hidden');
			$('#stuId').removeClass('show');
			$('#state').addClass('hidden');
			$('#state').removeClass('show');
			$('#dlg').dialog('open');
		});
		// 添加/修改按钮
		$('#btn').click(function() {
			$.ajax({
				url : flag == 'add' ? 'add.action' : 'updateStudent.action',
				type : 'POST',
				dataType : 'json',
				cache : false,
				data : $('#fm').serialize(),
				success : function(result) {
					$('#dlg').dialog('close');
					$('#tt').datagrid('reload');
					$.messager.show({
						title : '友情提示',
						msg : flag == 'add' ? '添加成功！' : '修改成功！'
					});
				},
				error : function(result) {
					$.messager.show({
						title : '友情提示',
						msg : '添加失败，请重试！'
					});
				}
			});
		});
		//搜索课程
		$('#searchCourse').click(function() {
			var arrs = $('#tt').datagrid('getSelections');
			if (arrs.length == 0) {
				$.messager.show({
					title : '友情提示',
					msg : '查看选课操作，要选一个。记住哦。。。'
				});
			} else {
				var id = arrs[0].student_id;
				alert(id);
				$('#xkkk').dialog('open');
				$('#xktable').datagrid({
					url : 'searchByStuId.action',
					fitColumns : true,
					pageSize : 10,
				// 								onLoadSuccess : function(data) {
				// 				var ddlMenu = $('.menuB').menubutton({
				// 					menu : '#mn'
				// 				});
				// 				$('.menuB').click(
				// 					function() {
				// 						$('#tt').datagrid('unselectAll');
				// 						$('#tt').datagrid('selectRow',$(this).parent().parent().parent().get(0).rowIndex);
				// 					});
				// 				}

				});
			}
		});
		//让下拉框不可编辑
		$('#stu_state').combobox({
			"editable" : false
		});
		$('#stu_teacher').combobox({
			"editable" : false
		});
		$('#IO_type').combobox({
			"editable" : false
		});

	});//load

	//时间格式化
	function dateFormat(value) {
		var d = new Date(value);
		var year = d.getFullYear();
		var month = d.getMonth() + 1;
		var day = d.getDate();
		return year + "年" + month + "月" + day + "日";
	}

	//学院列表--操作菜单
	function showOpMenu() {
		var s = '<a href="javascript:void(0)" class="menuB">查看</a>';
		return s;
	}

	$(function() {
		var url = "getAllCourse.action";
		$.getJSON(url, function(json) {
			$('#ccccc').combobox({
				data : json.rows,
				valueField : 'courseId',
				textField : 'courseName',
			});
		});
		$("#ccccc").combobox({
			"editable" : false
		});
	});

	function qq(value, name) {
		alert(value + ":" + name);
		$('#tt').datagrid(
				{
					url : name == 'xm' ? 'selectstuName.action?value=' + value
							: 'selectsate.action?value=' + value, //url
					title : '会员列表',
					height : 500,
					fitColumns : true,
					pagination : true,
					striped : true,
					loadMsg : 'Loading...',
					pageSize : 10,
					pageList : [ 10, 20, 30, 40 ],
					onLoadSuccess : function(data) {
						var ddlMenu = $('.menuB').menubutton({
							menu : '#mn'
						});
						$('.menuB').click(
								function() {
									$('#tt').datagrid('unselectAll');
									$('#tt').datagrid(
											'selectRow',
											$(this).parent().parent().parent()
													.get(0).rowIndex);
								});
					}
				});
	}
</script>
</head>


<body>
	<div id="tb" style="padding:5px;width:auto;height:auto">
		<div style="margin-bottom:3px">
			<a href="javascript:void(0)" class="easyui-linkbutton"
				iconCls="icon-add" plain="true" id="apply">增加会员</a>
			<!-- 搜索 -->
			<div id="mm" style="width:60px">
				<div name="xm">姓名</div>
				<div name="zt">状态</div>
			</div>
			<input id="sousuo2" class="easyui-searchbox" searcher="qq"
				prompt="请输入" menu="#mm" style="width:150px"></input>
			<div class="riqi">
				按日期 从：<input class="easyui-datebox" style="width:100px" id="start"
					name="start"> 至:<input class="easyui-datebox"
					style="width:100px" id="end" name="end"> <a href="#"
					id="ss" class="easyui-linkbutton" iconCls="icon-search">搜索</a>
			</div>
		</div>
	</div>
	<table id="tt" class="easyui-datagrid" style="width:auto;height:auto;"
		title="学员管理" toolbar="#tb" fitColumns="true">
		<thead>
			<tr>
				<th field="ck" width="30" align='center' checkbox="true"></th>
				<th field="vipId" width="20" align='center'>会员编号</th>
				<th field="vipName" width="40" align='center'>会员名称</th>
				<th field="level.levelName" align='center' width="40">会员等级</th>
				<th field="level.levelagio" align='center' width="50" formatter="dateFormat">会员折扣</th>
			</tr>
		</thead>
		<tbody>


		</tbody>
	</table>
	<!-- 添加会员   -->
	<div id="dlg" class="easyui-dialog"
		style="width:360px; height:470px; padding: 10px 20px;" closed="true"
		buttons="#dlg-buttons">
		<form id="fm" method="post">
			<table>
				<tr id="stuId" class="hidden">
				</tr>
				<tr>
					<td>会员名称:</td>
					<td><input name="vip.vipName" class="easyui-validatebox"
						required="true" />
					</td>
				</tr>
				<tr>
					<td>会员电话:</td>
					<td><input name="vip.vipPhone" class="easyui-validatebox"
						required="true" />
					</td>
				</tr>
				<tr>
					<td>身份证:</td>
					<td><input name="vip.vipIdcard" class="easyui-validatebox"
						required="true" />
					</td>
				</tr>

			</table>
		</form>
	</div>
	<div id="dlg-buttons">
		<a href="javascript:void(0)" class="easyui-linkbutton" id="btn">确定</a>
		<a href="javascript:void(0)" class="easyui-linkbutton"
			onclick="javascript:$('#dlg').dialog('close')">取消</a>
	</div>
	<div id="sousuo1" style="width: 350px;height: 70px;"
		class="easyui-dialog" closed="true" title="搜索">
		<form id="sousuofm" method="post">
			<div id="mm" style="width:120px">
				<div name="studentName">姓名</div>
				<div name="sports">Sports News</div>
			</div>
			<input id="sousuo2" class="easyui-searchbox" searcher="qq"
				prompt="Please Input Value" menu="#mm" style="width:300px"></input>
		</form>
	</div>
	


</body>
</html>
