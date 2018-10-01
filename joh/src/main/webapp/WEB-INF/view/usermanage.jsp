<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="sels" class="">
    <table id="tb_user" class=""></table>
</div>

<script type="text/javascript">
$(function () {
	$("#tb_user").bootstrapTable({
        url: "user/userList.do",         //请求后台的URL（*）
        method: 'post',                      //请求方式（*）
        //toolbar: toolbar,                //工具按钮用哪个容器
        striped: true,                      //是否显示行间隔色
        cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,                   //是否显示分页（*）
        sortable: false,                     //是否启用排序
        sortOrder: "asc",                   //排序方式
       
        sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
        pageNumber:1,                       //初始化加载第一页，默认第一页
        pageSize: 20,                       //每页的记录行数（*）
        pageList: [20],        //可供选择的每页的行数（*）
        search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
        strictSearch: false,
        showColumns: true,                  //是否显示所有的列
        showRefresh: true,                  //是否显示刷新按钮
        //minimumCountColumns: 2,             //最少允许的列数
        clickToSelect: true,                //是否启用点击选中行
        //height: 500,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "id",                     //每一行的唯一标识，一般为主键列
        //showToggle:true,                    //是否显示详细视图和列表视图的切换按钮
        cardView: false,                    //是否显示详细视图
        detailView: false,                   //是否显示父子表onEditableSave
        //sortOrder: "asc",                   //排序方式
        queryParams: function (params) {
            var PageParam = {   //这里的键的名字和控制器的变量名必须一致，这边改动，控制器也需要改成一样的
            	currPage : params.offset / params.limit + 1,
            	pageSize : params.limit
            };
            return PageParam;
        },//传递参数（*）  
        columns: [
        	{
                checkbox: true
            },
        	{
                field: 'account',
                align: 'center',
                title: '登录名'
            },
            {
                field: 'createDate',
                align: 'center',
                title: '创建时间'
            },
            {
                field: 'id',
                align: 'center',
                title: 'Id'
            },
            {
                field: 'isDel',
                align: 'center',
                title: 'IsDel'
            },
            {
                field: 'password',
                align: 'center',
                title: 'Password'
            },
            {
                field: 'realName',
                align: 'center',
                title: '用户名'
            }, 
            {
                field: 'operate',
                align: 'center',
                title: '操作'
            }
        ],
        onPageChange: function (number, size) {

        },
        onClickRow: function (row, element, field) {
			
        },
        onDblClickRow: function (row, obj) {

        }
    });
/* 	class UserParam {
		constructor(currPage, pageSize) {
			this.currPage = currPage;
			this.pageSize = pageSize;
		}
	};
	var userinfoRef = new UserParam(1, 20);
	var jsonString = JSON.stringify(userinfoRef);
	$.ajax({  
        url : "user/userList.do",  
        type: "POST",
        dataType: "json",
        contentType: "application/json", //必须有
        data:jsonString, 
        success : function(data) {
        	console.log(data);
        },  
        error : function(data) {  
            console.log(data);
        }  
    });  */ 
});
</script>