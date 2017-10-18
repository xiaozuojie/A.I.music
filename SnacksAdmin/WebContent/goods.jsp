<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="utf-8"/>
<meta charset="utf-8">
<meta name="renderer" content="webkit|ie-comp|ie-stand">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport" content="width=device-width,initial-scale=1,minimum-scale=1.0,maximum-scale=1.0,user-scalable=no" />
<meta http-equiv="Cache-Control" content="no-siteapp" />
<link rel="Bookmark" href="favicon.ico" >
<link rel="Shortcut Icon" href="favicon.ico" />
<!--[if lt IE 9]>
<script type="text/javascript" src="lib/html5.js"></script>
<script type="text/javascript" src="lib/respond.min.js"></script>
<![endif]-->
<link rel="stylesheet" type="text/css" href="static/h-ui/css/H-ui.min.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/H-ui.admin.css" />
<link rel="stylesheet" type="text/css" href="lib/Hui-iconfont/1.0.8/iconfont.css" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/skin/default/skin.css" id="skin" />
<link rel="stylesheet" type="text/css" href="static/h-ui.admin/css/style.css" />

    <title>Datatable-serverSide 服务器分页例子 java</title>
    <!--  http://netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css-->
    <link rel="stylesheet" type="text/css" href="plugin/datatables/bootstrap.min.css"/>
    <!--<link rel="stylesheet" href="http://cdn.datatables.net/1.10.6/css/jquery.dataTables.min.css"/>-->
    <!--http://cdn.datatables.net/plug-ins/28e7751dbec/integration/bootstrap/3/dataTables.bootstrap.css-->
    <link rel="stylesheet" type="text/css" href="plugin/datatables/dataTables.bootstrap.css  "/>
    <!--http://cdn.gbtags.com/datatables/1.10.5/js/jquery.js-->
    <script src="plugin/datatables/jquery.js"></script>
    <!--http://cdn.gbtags.com/datatables/1.10.5/js/jquery.dataTables.min.js-->
    <script src="plugin/datatables/jquery.dataTables.min.js"></script>
    <!--<script src="dt.js"></script>-->
    <!--http://cdn.datatables.net/plug-ins/28e7751dbec/integration/bootstrap/3/dataTables.bootstrap.js-->
    <script type="text/javascript" language="javascript" src="plugin/datatables/dataTables.bootstrap.js"></script>
    <!--http://cdn.bootcss.com/bootstrap/3.3.4/js/bootstrap.min.js-->
    <script src="plugin/datatables/bootstrap.min.js"></script>
    <script src="plugin/date/bootstrap-datetimepicker.min.js"></script>
    <script src="plugin/handlebars-v3.0.1.js"></script>

    <!--<script type="text/javascript" src="/dt-page/extjs.js"></script>-->
</head>
<body>
<!--_header 作为公共模版分离出去-->
<header class="navbar-wrapper">
	<div class="navbar navbar-fixed-top">
		<div class="container-fluid cl"> <a class="logo navbar-logo f-l mr-10 hidden-xs" href="/aboutHui.shtml">H-ui.admin</a> <a class="logo navbar-logo-m f-l mr-10 visible-xs" href="/aboutHui.shtml">H-ui</a> <span class="logo navbar-slogan f-l mr-10 hidden-xs">v3.0</span> <a aria-hidden="false" class="nav-toggle Hui-iconfont visible-xs" href="javascript:;">&#xe667;</a>
			<nav class="nav navbar-nav">
				<ul class="cl">
					<li class="dropDown dropDown_hover"><a href="javascript:;" class="dropDown_A"><i class="Hui-iconfont">&#xe600;</i> 新增 <i class="Hui-iconfont">&#xe6d5;</i></a>
						<ul class="dropDown-menu menu radius box-shadow">
							<li><a href="javascript:;" onclick="article_add('添加资讯','article-add.html')"><i class="Hui-iconfont">&#xe616;</i> 资讯</a></li>
							<li><a href="javascript:;" onclick="picture_add('添加资讯','picture-add.html')"><i class="Hui-iconfont">&#xe613;</i> 图片</a></li>
							<li><a href="javascript:;" onclick="product_add('添加资讯','product-add.html')"><i class="Hui-iconfont">&#xe620;</i> 产品</a></li>
							<li><a href="javascript:;" onclick="member_add('添加用户','member-add.html','','510')"><i class="Hui-iconfont">&#xe60d;</i> 用户</a></li>
						</ul>
					</li>
				</ul>
			</nav>
			<nav id="Hui-userbar" class="nav navbar-nav navbar-userbar hidden-xs">
				<ul class="cl">
					<li>超级管理员</li>
					<li class="dropDown dropDown_hover"> <a href="#" class="dropDown_A">admin <i class="Hui-iconfont">&#xe6d5;</i></a>
						<ul class="dropDown-menu menu radius box-shadow">
							<li><a href="javascript:;" onClick="myselfinfo()">个人信息</a></li>
							<li><a href="#">切换账户</a></li>
							<li><a href="#">退出</a></li>
						</ul>
					</li>
					<li id="Hui-msg"> <a href="#" title="消息"><span class="badge badge-danger">1</span><i class="Hui-iconfont" style="font-size:18px">&#xe68a;</i></a> </li>
					<li id="Hui-skin" class="dropDown right dropDown_hover"> <a href="javascript:;" class="dropDown_A" title="换肤"><i class="Hui-iconfont" style="font-size:18px">&#xe62a;</i></a>
						<ul class="dropDown-menu menu radius box-shadow">
							<li><a href="javascript:;" data-val="default" title="默认（黑色）">默认（黑色）</a></li>
							<li><a href="javascript:;" data-val="blue" title="蓝色">蓝色</a></li>
							<li><a href="javascript:;" data-val="green" title="绿色">绿色</a></li>
							<li><a href="javascript:;" data-val="red" title="红色">红色</a></li>
							<li><a href="javascript:;" data-val="yellow" title="黄色">黄色</a></li>
							<li><a href="javascript:;" data-val="orange" title="橙色">橙色</a></li>
						</ul>
					</li>
					
				</ul>
			</nav>
		</div>
	</div>
</header>
<!--/_header 作为公共模版分离出去-->

<!--_menu 作为公共模版分离出去-->
<aside class="Hui-aside">
	
	<div class="menu_dropdown bk_2">
		<dl id="menu-article">
			<dt><i class="Hui-iconfont">&#xe616;</i> 资讯管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a href="article-list.html" title="资讯管理">资讯管理</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-picture">
			<dt><i class="Hui-iconfont">&#xe613;</i> 图片管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a href="picture-list.html" title="图片管理">图片管理</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-product">
			<dt><i class="Hui-iconfont">&#xe620;</i> 商品管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a href="goods.jsp" title="商品信息管理">商品信息管理</a></li>
					<li><a href="#" title="分类信息管理">分类信息管理</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-comments">
			<dt><i class="Hui-iconfont">&#xe622;</i> 评论管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a href="http://h-ui.duoshuo.com/admin/" title="评论列表">评论列表</a></li>
					<li><a href="feedback-list.html" title="意见反馈">意见反馈</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-member">
			<dt class="selected"><i class="Hui-iconfont">&#xe60d;</i> 会员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd style="display: block;">
				<ul>
					<li class="current"><a href="member-list.html" title="会员列表">会员列表</a></li>
					<li><a href="member-del.html" title="删除的会员">删除的会员</a></li>
					<li><a href="member-level.html" title="等级管理">等级管理</a></li>
					<li><a href="member-scoreoperation.html" title="积分管理">积分管理</a></li>
					<li><a href="member-record-browse.html" title="浏览记录">浏览记录</a></li>
					<li><a href="member-record-download.html" title="下载记录">下载记录</a></li>
					<li><a href="member-record-share.html" title="分享记录">分享记录</a></li>
				</ul>
			</dd>
		</dl>
		<dl id="menu-admin">
			<dt><i class="Hui-iconfont">&#xe62d;</i> 管理员管理<i class="Hui-iconfont menu_dropdown-arrow">&#xe6d5;</i></dt>
			<dd>
				<ul>
					<li><a href="admin-role.html" title="角色管理">角色管理</a></li>
					<li><a href="admin-permission.html" title="权限管理">权限管理</a></li>
					<li><a href="admin-list.html" title="管理员列表">管理员列表</a></li>
				</ul>
			</dd>
		</dl>
		
		
	</div>
</aside>
<div class="dislpayArrow hidden-xs"><a class="pngfix" href="javascript:void(0);" onClick="displaynavbar(this)"></a></div>
<!--/_menu 作为公共模版分离出去-->
<section class="Hui-article-box">
	<nav class="breadcrumb"><i class="Hui-iconfont">&#xe67f;</i> 首页 <span class="c-gray en">&gt;</span> 员工中心 <span class="c-gray en">&gt;</span> 员工列表<a class="btn btn-success radius r" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href);" title="刷新" ><i class="Hui-iconfont">&#xe68f;</i></a></nav>
<div class="Hui-article">
	
		<article class="cl pd-20"> 
		<div class="text-c">
		        是否自动检索：<input type="checkbox" id="autoSearch">
		   商品名称：<input type="text" class="form-controlSearch input-text " placeholder="输入商品名称" data-column="2" id="col2_filter" style="width:100px;">
		     商品类别：<input type="text" class="form-controlSearch input-text " placeholder="输入商品类型" data-column="3" id="col3_filter" style="width:100px;">
  
   
		   </div>
		   <div class="cl pd-5 bg-1 bk-gray mt-20"> 
		   <span class="l">
		   <a href="javascript:;" onclick="datadel()" class="btn btn-danger radius123"><i class="Hui-iconfont">&#xe6e2;</i> 批量删除</a>
		   <a href="javascript:;" onclick="goodsadd()" class="btn btn-primary radius" id="btnadd"><i class="Hui-iconfont">&#xe600;</i> 添加用户</a>
		   </span>
		   </div>

<div class="container">
    <table id="example" class="table table-striped table-bordered">
        <thead>
            <tr>
                <th width="25"><input type="checkbox" name="" value="" id="employeeCheckAll"></th>
                <th>商品编号</th>
                <th>商品名称</th>
                <th>商品类型</th>
                <th>商品价格</th>
                <th>商品库存</th>
                <th>商品详情</th>
                <th>商品保质期</th>
                <th>商品生产日期</th>
                <th>商品规格</th>
                <th>商品状态</th>
                <th>操作</th>
            </tr>
        </thead>
    </table>
</div>
</article>
	</div>
</section>
<!-- Button trigger modal -->

</body>
</html>
<!--定义操作列按钮模板-->
<!--说下这里使用模板的作用，除了显示和数据分离好维护以外，绑定事件和传值也比较方便，希望大家能不拼接html则不拼接-->


<!-- 头部检索以及表格标题头结束 -->
<link rel="stylesheet" type="text/css" href="plugin/datatables/jquery.dataTables.min.css"/>
<script src="plugin/datatables/jquery.dataTables.min.js"></script>
<!--_footer 作为公共模版分离出去-->
<script type="text/javascript" src="lib/jquery/1.9.1/jquery.min.js"></script> 
<script type="text/javascript" src="lib/layer/2.4/layer.js"></script>
<script type="text/javascript" src="static/h-ui/js/H-ui.js"></script> 
<script type="text/javascript" src="static/h-ui.admin/js/H-ui.admin.page.js"></script>
<!--/_footer /作为公共模版分离出去-->

<!--请在下方写此页面业务相关的脚本-->
<script type="text/javascript" src="lib/My97DatePicker/4.8/WdatePicker.js"></script>
<script type="text/javascript" src="lib/datatables/1.10.0/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="lib/laypage/1.2/laypage.js"></script>
<script type="text/javascript">
$(function(){
	/*暂时注释掉hui自带的dt访问	
	$('.table-sort').dataTable({
		"aaSorting": [[ 1, "desc" ]],//默认第几个排序
		"bStateSave": true,//状态保存
		"aoColumnDefs": [
		  //{"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
		  {"orderable":false,"aTargets":[0,8,9]}// 制定列不参与排序
		]
	});
	*/
    /*单击数据行 被选中，再次单击取消选中*/
	$('.table-sort tbody').on( 'click', 'tr', function () {
		if ( $(this).hasClass('selected') ) {
			$(this).removeClass('selected');
		}
		else {
			table.$('tr.selected').removeClass('selected');
			$(this).addClass('selected');
		}
	});
});
/*用户-添加*/
function member_add(title,url,w,h){
	layer_show(title,url,w,h);
}
/*用户-查看*/
function member_show(title,url,id,w,h){
	layer_show(title,url,w,h);
}

/*用户-编辑*/
function member_edit(title,url,id,w,h){
	layer_show(title,url,w,h);
}
/*密码-修改*/
function change_password(title,url,id,w,h){
	//layer_show(title,url,w,h);	

	layer.open({
		type: 2,
		area: ['600px', '270px'],
		fix: false, //不固定
		maxmin: true,
		shade:0.4,
		title: title,
		content: url,
		success: function(layero, index){
            var body = layer.getChildFrame('body',index);//建立父子联系
            var iframeWin = window[layero.find('iframe')[0]['name']];
            // console.log(arr); //得到iframe页的body内容
            // console.log(body.find('input'));
            var inputList = body.find('input');
            for(var j = 0; j< inputList.length; j++){
                $(inputList[j]).val(arr[j]);
            }
        }
	});
}

</script>

<script>
  $(function(){
	  //修改密码的超链接单击事件
	 $(document).on("click",'.changepwd',function()
	 {
		 var _this = $(this);
	      data =_this.parent().siblings();
	      var arr = [];
	     for(var i = 1; i< data.length; i++){
	        // console.log($(data[i]).text());
	        arr.push($(data[i]).text());//拿到点击按钮的当前那条信息的内容 放到一个数组里
	    }
	     console.log(arr);
		 //change-em-password.html
		 
	     layer.open({
	 		type: 2,
	 		area: ['600px', '270px'],
	 		fix: false, //不固定
	 		maxmin: true,
	 		shade:0.4,
	 		title: '修改密码',
	 		content: 'change-emp-password.html',
	 		success: function(layero, index){
	             var body = layer.getChildFrame('body',index);//建立父子联系
	             var iframeWin = window[layero.find('iframe')[0]['name']];

	             var _ename = body.find('#ename');
	             console.log(_ename+","+arr[1]);
	             $(_ename).html(arr[1]);
	            
	         }
	 	});
		 
		 
	 });
	  //添加商品信息
	  $(document).on("click",'#btnadd',function()
	 {
		
	     layer.open({
	 		type: 2,
	 		area: ['600px', '600px'],
	 		fix: false, //不固定
	 		maxmin: true,
	 		shade:0.4,
	 		title: '添加商品信息',
	 		content: 'goodsadd.html',
	 		success: function(layero, index){
	             var body = layer.getChildFrame('body',index);//建立父子联系
	             var iframeWin = window[layero.find('iframe')[0]['name']];
	         }
	 	});
		 
		 
	 });
	  //删除用户商品信息
	  $(document).on("click",'.goods_del',function(){
		  if (confirm("你确认要删除吗")) {
			
		  var _this1=$(this);
		  data=_this1.parent().siblings();
		  var arr=[];
		  for(var i = 1; i< data.length; i++){ //1 从1开始 从姓名开始
		        arr.push($(data[i]).text());//每一个td中的内容() 放到一个数组里
		     }
		  var goodsid=arr[0];
		  location.href="GoodsServlet?op=deletegoods&goodsid="+goodsid;
		  }
		  
		  
		  
	  });
	  //全选删除
	  $(function() {
		     $(".radius123").click(function(){ 
		     	var str=""; 
		     	//var _checklist = $("input[name=checkList]:checked");
		     	//alert(_checklist.length);
		     	if ($("input[name=checkList]:checked").length==0) {
		     		 alert(eloancn.table.statusTitle);
				}
		     	else{
		     	 $("input[name=checkList]:checked").each(function(){ 
		     	    //str+=$(this).val()+"/r/n";  
		     	    str+=$(this).parents("tr").find("td").eq(1).text()+",";
		     	}) 
		     	    location.href="GoodsServlet?op=deleteAll&str="+str;
		     	}
		     	})  
		  }); 
	  
	 //修改商品状态信息的超链接单击事件
	 $(document).on("click",'.empedit',function()
	 {
		 var _this = $(this); //当前对象 编辑的超链接
	      data =_this.parent().siblings(); //_this.parent() 得到td   siblings(); 当前行的其他td
	      var arr = [];
	         arr.push($(data[1]).text());
 	    	 arr.push($(data[2]).text());
	    	 arr.push($(data[3]).text());
	    	 arr.push($(data[5]).text());
	    	
	     
	    // console.log(arr);
		 //change-password.html
		 
		 //打开新窗口 编辑窗口
	     layer.open({
	 		type: 2,
	 		area: ['710px', '510px'], //窗口大小
	 		fix: false, //不固定
	 		maxmin: true,
	 		shade:0.4,
	 		title: '修改商品状态信息', //显示的标题
	 		content: 'change_status.html', //很多种写法 其中之一直接写目标窗口(要弹出来窗口)
	 		success: function(layero, index){ //success可以不写
	             var body = layer.getChildFrame('body',index);//建立父子联系
	             var iframeWin = window[layero.find('iframe')[0]['name']];
	             
	             var inputList = body.find('input'); //找所有的input
	             for(var j = 0; j< arr.length; j++){
	                 $(inputList[j]).val(arr[j]); //arr[j] 数组中的值 赋值给  $(inputList[j])
	             }
	            
	         }
	 	});
		  
		 
	 });
	  
	  
  });
</script>

<script>

    var employee = {};

    employee.property = {
        version:"v1.0",
        name:"employee",
        tableId:"example",//显示数据的容器表格的id
        checkAllId:"employeeCheckAll",
        buttonId:"employeeButtonId",
        formId:"employeeForm",
        corporateFormId:"employeeForm",
        returnStatus:"SUCCESS",
        returnTitle:"操作成功",
        statusTitle:"请选择一条数据！",
        idFailure:"获取id失败",
        prompt:"提示",
        pleaseConfirm:"请确认！",
        wantToDelete:"您确定要删除吗?",
        sexMan:"男",
        sexWoman:"女",
        isTest:"是",
        noTest:"否",
        banned:"禁用",
        enable:"启用"
    };

    //初始化配置
    employee.gridInit = {
        searching:true,
        lengthChange:true,
        paging:true,
        scrollCollapse:true,
        serverSide:false,
        search:true,
        processing:true,
        scrollY:500,
        scrollX:"100%",
        scrollXInner:"100%",
        scrollCollapse:true,
        jQueryUI:false,
        autoWidth:true,
        autoSearch:false
    };

    //路径配置,此处配置的路径是获取数据的重要手段;
    employee.url=""; //  这里 / 表示的是localhost/
    employee.requestUrl = {
        queryList:employee.url+"GoodsServlet?op=queryall"  //数据是从servlet一侧返回的 json格式
    };

    employee.search={
        uuid:""
    };

    employee.status = [
        {"searchable": false, "orderable": false, "targets": 0},//第一行不进行排序和搜索
//        {"targets": [12], "visible": false},    //设置第13列隐藏/显示
//        {"width": "10%", "targets": [1]},  //设置第2列宽度
//        {
//            对第7列内容进行替换处理
//            targets: 6,
//            render: function (data, type, row, meta) {
//                if (data == "1") {
//                    return employee.table.sexMan;
//                }
//                if (data == "0") {
//                    return employee.table.sexWoman;
//                }
//            }
//        },
        {defaultContent: '',targets: ['_all']} //所有列设置默认值为空字符串
    ];
    //对应的返回数据格式
    
    employee.filed =[
        {   //第一个列
        	"data": "extn",
            "createdCell": function (nTd, sData, oData, iRow, iCol) {
                $(nTd).html("<input type='checkbox' name='checkList' value='" + sData + "'>");
            }
        }, //这里是返回的json对象中的 属性值   {data : }
        {"data": "GOODS_ID"},
        {"data": "GOODS_NAME"},
        {"data": "GOODS_TYPE"},
        {"data": "GOODS_PRICE"},
        {"data": "GOODS_NUMBER"},
        {"data": "GOODS_DETAIL"},
        {"data": "GOODS_DATE"},
        {"data": "GOODS_TIME"},
        {"data": "GOODS_SPEC"},
        {"data": "GOODS_STATUS"},
        {    //创建操作那个列
        	"data":"extn",
        	"createdCell":function(nTd)
        	{
        		//表格最后一个列增加很多超链接 启用禁用。 编辑   删除 修改密码
        		$(nTd).html('<a title="修改审核状态" href="javascript:;" class="empedit ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a title="删除" href="javascript:;" onclick="goods_del (this,\'1\')" class="goods_del ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>');
        		//$(nTd).html('<a onClick="member_stop(this,\'10001\')">xx<a>');
        		//$(nTd).html('<a style="text-decoration:none" onClick="member_stop(this,\'10001\')" href="javascript:;" title="停用"><i class="Hui-iconfont">&#xe631;</i></a> <a title="编辑" href="javascript:;" onclick="member_edit(\'编辑\',\'member-add.html\',\'4\',\'\',\'510\')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6df;</i></a> <a style="text-decoration:none" class="ml-5" onClick="change_password(\'修改密码\',\'change-password.html\',\'10001\',\'600\',\'270\')" href="javascript:;" title="修改密码"><i class="Hui-iconfont">&#xe63f;</i></a> <a title="删除" href="javascript:;" onclick="member_del(this,\'1\')" class="ml-5" style="text-decoration:none"><i class="Hui-iconfont">&#xe6e2;</i></a>');
        		//$(nTd).html("<td class='td-manage'><a style='text-decoration:none' onClick='member_stop(this,'10001')' href='javascript:;' title='停用'><i class='Hui-iconfont'>&#xe631;</i></a> <a title='编辑' href='javascript:;' onclick='member_edit('编辑','member-add.html','4','','510')' class='ml-5' style='text-decoration:none'><i class='Hui-iconfont'>&#xe6df;</i></a> <a style='text-decoration:none' class='ml-5' onClick='change_password('修改密码','change-password.html','10001','600','270')' href='javascript:;' title='修改密码'><i class='Hui-iconfont'>&#xe63f;</i></a> <a title='删除' href='javascript:;' onclick='member_del(this,'1')' class='ml-5' style='text-decoration:none'><i class='Hui-iconfont'>&#xe6e2;</i></a></td>");
        	}
        
        }
    ];

     //导航按钮操作
    employee.buttons =
            '<button class="btn btn-default"  type="button" id="reload" data-toggle="modal" data-target="#employeeModal">刷新表格</button>'
            

</script>

<script>

    var eloancn = {};

    eloancn.table={
        grid:"",
        statusTitle:"请选择一条数据！"
    };

    //dataTables方法封装
    function dataTablesInit(elo){

        eloancn.table.grid = $('#'+elo.property.tableId).DataTable({
            ajax: {
                url: elo.requestUrl.queryList,//请求后台路径
                type: 'get', //ajax的get	请求获取数据
                data: elo.search,
                dataType:'json',//获取数据格式为json
                error: function(jqXHR, textStatus, errorMsg){
                    alert("请求失败"+errorMsg);
                }

            },
            "searching":elo.gridInit.searching,//搜索框，默认是开启
            "lengthChange": elo.gridInit.lengthChange,//是否允许用户改变表格每页显示的记录数，默认是开启
            "paging": elo.gridInit.paging,//是否开启本地分页，默认是开启
            "processing": elo.gridInit.processing,//是否显示中文提示
            "scrollCollapse" : elo.gridInit.scrollCollapse,  //是否开启DataTables的高度自适应，当数据条数不够分页数据条数的时候，插件高度是否随数据条数而改变
            "serverSide": elo.gridInit.serverSide, //开启服务器模式，默认是关闭
            "scrollY": elo.gridInit.scrollY,//设置高
            "scrollX": elo.gridInit.scrollX,//设置宽度
            "scrollXInner": elo.gridInit.scrollXInner,//设置内宽度
            "scrollCollapse": elo.gridInit.scrollCollapse,//设置折叠
            "jQueryUI": elo.gridInit.jQueryUI,//jquery 风格
            "autoWidth" : elo.gridInit.autoWidth, //是否自适应宽度
            "columns":elo.filed,//字段
            "columnDefs":elo.status,//列表状态
            "language": {
                "sProcessing": "处理中...",
                "sLengthMenu": "显示 _MENU_ 项结果",
                "sZeroRecords": "没有匹配结果",
                "sInfo": "显示第 _START_ 至 _END_ 项结果，共 _TOTAL_ 项",
                "sInfoEmpty": "显示第 0 至 0 项结果，共 0 项",
                "sInfoFiltered": "(由 _MAX_ 项结果过滤)",
                "sInfoPostFix": "",
                "sSearch": "搜索:",
                "sUrl": "",
                "sEmptyTable": "未搜索到数据",
                "sLoadingRecords": "载入中...",
                "sInfoThousands": ",",
                "oPaginate": {
                    "sFirst": "首页",
                    "sPrevious": "上页",
                    "sNext": "下页",
                    "sLast": "末页"
                },
                "oAria": {
                    "sSortAscending": ": 以升序排列此列",
                    "sSortDescending": ": 以降序排列此列"
                }
            },
            "dom": "<'row'<'col-sm-2'l><'#"+elo.property.buttonId+".col-sm-10'><'col-sm-6'f>r>t<'row'<'col-sm-6'i><'col-sm-6'p>>",
            "initComplete":function(){
                $("#"+elo.property.buttonId).append(elo.buttons);
                if(elo.gridInit.search){
                    $search = $("input[type='search']");
                    //隐藏默认的搜索框
                    $search.parent().hide();
                }
                //加载完成之后 初始化checkbox
                checkbox(elo.property.tableId);


                $("#reload").click(function(){
                    reload();
                });

                $("#batchIds").click(function () {
                    batchIds();
                });

                $("#selection").click(function () {
                    selection();
                });
                $("#search").click(function () {
                    search();
                });
                $("#clearSearch").click(function () {
                    clearSearch("form-controlSearch");
                });


                //checkbox全选
                $("#"+elo.property.checkAllId).click(function () {
                    if ($(this).prop("checked")) {
                        $("input[name='checkList']").prop("checked",true);
                        $("tr").addClass('selected');
                    } else {
                        $("input[name='checkList']").prop("checked",false);
                        $("tr").removeClass('selected');
                    }
                });

            }
        });

        //错误信息提示
        $.fn.dataTable.ext.errMode = function(s,h,m){
            if(h==1){
                alert("连接服务器失败！");
            }else if(h==7){
                alert("返回数据错误！");
            }
        };

        //回调，如果返回的时候有问题提示信息
        eloancn.table.grid.on('xhr.dt', function ( e, settings, json, xhr ) {
            console.log("重新加载了数据");
            if(typeof(json.code)!="undefined"	&&	json.code!="0"){
            	 eloancn.table.ajax.reload();
            }
        } );

        //鼠标经过高亮
        var lastIdx = null;
        eloancn.table.grid.on( 'mouseover', 'td', function () {

            if(typeof(eloancn.table.grid.cell(this).index())!="undefined"){
                var colIdx = eloancn.table.grid.cell(this).index().column;
                if ( colIdx !== lastIdx ) {
                    $( eloancn.table.grid.cells().nodes() ).removeClass( 'highlight' );
                    $( eloancn.table.grid.column( colIdx ).nodes() ).addClass( 'highlight' );
                }
            }
        } );

        eloancn.table.grid.on( 'mouseleave', function () {
            $(eloancn.table.grid.cells().nodes()).removeClass( 'highlight' );
        } );



        //自动搜索方法
        $('.form-controlSearch').on('keyup change', function () {
            elo.gridInit.autoSearch = $("#autoSearch").prop("checked");
            if(elo.gridInit.autoSearch){
                filterColumn( $(this).attr('data-column') );
            }
        } );
    }

    //选中一行 checkbox选中
    function checkbox(tableId){
        //每次加载时都先清理
        $('#'+tableId+' tbody').off("click","tr");
        $('#'+tableId+' tbody').on("click", "tr", function () {
            $(this).toggleClass('selected');
            if($(this).hasClass("selected")){
                $(this).find("input").prop("checked",true);
            }else{
                $(this).find("input").prop("checked",false);
            }
        });


    }

    //按钮搜索方法
    function search(){

        var oSettings = "";
        $("[data-column]").each(function(){
            var filedValue = $(this).attr('data-column');
            if(filedValue!=""){
                console.log($('#col'+filedValue+'_filter').val());
                oSettings = eloancn.table.grid.column(filedValue).search(
                        $('#col'+filedValue+'_filter').val()
                );
            }
        });
        //搜索的数据一次条件，节省资源
        eloancn.table.grid.draw(oSettings);
    }

    //搜索
    function filterColumn(i) {

        eloancn.table.grid.column(i).search(
                $('#col'+i+'_filter').val()
        ).draw();
    }

    //清理搜索数据
    function clearSearch(id){

        $("."+id).each(function(){
            $(this).val("");
        });
        //清空查询条件重新读取数据
        eloancn.table.grid.columns().search("").draw();
    }

    //获取所有选中行的UUID
    function batchIds(){

        var uuid = '';
        var uuids =eloancn.table.grid.rows(".selected").data();
        if(uuids.length==0){
            alert(eloancn.table.statusTitle);
        }else{
            for(var i=0;i<uuids.length;i++){
                uuid = uuid+uuids[i].extn+",";
            }
            alert(uuid);
        }
    }

    //单选
    function selection(){

        if (eloancn.table.grid.rows(".selected").data().length==1) {
            var uuid =eloancn.table.grid.row(".selected").data().extn;

            if(uuid==""){
                alert(eloancn.table.statusTitle);
            }else{
                alert(uuid);
            }

        }else{
            alert(eloancn.table.statusTitle);
        }
    }

    //刷新页面
    //重新加载数据
    function reload(){
        eloancn.table.grid.ajax.reload();
    }

    //销毁table
    function destroyDataTable(tableId){

        var dttable =  $('#'+tableId).DataTable();
        dttable.destroy();
    }


</script>

<script>
    $(document).ready(function(){
        dataTablesInit(employee);
    });
</script>
</body>
</html>