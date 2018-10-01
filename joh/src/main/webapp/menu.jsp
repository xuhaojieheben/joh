 <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<script type="text/javascript" src="static/Js/operation.js"></script>
 <div id="tree-wrap">
     <div class="side-bar">
         <ul class="topnav menu-left-nest">
             <li>
                 <a href="#" style="border-left:0px solid!important;" class="title-menu-left">
                     <!-- <span class="widget-menu"></span> -->
                     <span class="">用户管理</span>
                     <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>
                 </a>
             </li>
             <li>
                 <a class="tooltip-tip ajax-load" href="#" title="Blog App">
                     <i class="icon-document-edit"></i>
                     <span>用户管理</span>
                 </a>
                 <ul>
                     <li>
                     	 <!-- <div onclick="showPage('menu/UserManage.do', '0', '管理',  '用户•管理', this)">列表</div> -->
                         <a class="tooltip-tip2 ajax-load" href="javascript:void(0)" title="列表"  onclick="showPage('menu/userManage.do', '0', '管理',  '用户•管理', this)">
                         	<i class="entypo-doc-text"></i>
                         	<span>列表</span>
                         </a>
                     </li>
                     <li>
                         <a class="tooltip-tip ajax-load" href="#" title="Blog App">
                     	 	<i class="icon-document-edit"></i>
                     	 	<span>用户管理</span>
                 		</a>
                 	<ul>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="blog-list.html" title="Blog List"><i class="entypo-doc-text"></i><span>Blog List</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="blog-detail.html" title="Blog Detail"><i class="entypo-newspaper"></i><span>Blog Details</span></a>
                     </li>
                 </ul>
                     </li>
                 </ul>
             </li>
             <li>
                 <a class="tooltip-tip ajax-load" href="javascript:void(0)" title="Social" onclick="showPage('menu/power.do', '0', '管理',  '用户•权限', this)">
                     <i class="icon-feed"></i>
                     <span>Social</span>
                 </a>
             </li>
             <li>
                 <a class="tooltip-tip ajax-load" href="media.html" title="Media">
                     <i class="icon-camera"></i>
                     <span>Media</span>
                 </a>
             </li>
         </ul>
         <ul class="topnav menu-left-nest">
             <li>
                 <a href="#" style="border-left:0px solid!important;" class="title-menu-left">

                     <span class="design-kit"></span>
                     <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>
                 </a>
             </li>
             <li>
                 <a class="tooltip-tip ajax-load" href="index.html" title="Dashboard">
                     <i class="icon-window"></i>
                     <span>Dashboard</span>
                 </a>
             </li>
             <li>
                 <a class="tooltip-tip ajax-load" href="mail.html" title="Mail">
                     <i class="icon-mail"></i>
                     <span>mail</span>
                     <div class="noft-blue">289</div>
                 </a>
             </li>
             <li>
                 <a class="tooltip-tip ajax-load" href="icon.html" title="Icons">
                     <i class="icon-preview"></i>
                     <span>Icons</span>
                     <div class="noft-blue" style="display: inline-block; float: none;">New</div>
                 </a>
             </li>
             <li>
                 <a class="tooltip-tip" href="#" title="Extra Pages">
                     <i class="icon-document-new"></i>
                     <span>Extra Page</span>
                 </a>
                 <ul>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="blank_page.html" title="Blank Page"><i class="icon-media-record"></i><span>Blank Page</span></a>
                     </li>
                      <li>
                         <a class="tooltip-tip2 ajax-load" href="profile.html" title="Profile Page"><i class="icon-user"></i><span>Profile Page</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="invoice.html" title="Invoice"><i class="entypo-newspaper"></i><span>Invoice</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="pricing_table.html" title="Pricing Table"><i class="fontawesome-money"></i><span>Pricing Table</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="time-line.html" title="Time Line"><i class="entypo-clock"></i><span>Time Line</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2" href="404.html" title="404 Error Page"><i class="icon-thumbs-down"></i><span>404 Error Page</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2" href="500.html" title="500 Error Page"><i class="icon-thumbs-down"></i><span>500 Error Page</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2" href="lock-screen.html" title="Lock Screen"><i class="icon-lock"></i><span>Lock Screen</span></a>
                     </li>
                 </ul>
             </li>
             <li>
                 <a class="tooltip-tip " href="login.html" title="login">
                     <i class="icon-download"></i>
                     <span>Login</span>
                 </a>
             </li>
         </ul>
         <ul id="menu-showhide" class="topnav menu-left-nest">
             <li>
                 <a href="#" style="border-left:0px solid!important;" class="title-menu-left">
                     <span class="component"></span>
                     <i data-toggle="tooltip" class="entypo-cog pull-right config-wrap"></i>
                 </a>
             </li>
             <li>
                 <a class="tooltip-tip" href="#" title="UI Element">
                     <i class="icon-monitor"></i>
                     <span>UI Element</span>
                 </a>
                 <ul>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="element.html" title="Element"><i class="icon-attachment"></i><span>Element</span></a>
                     </li>
                     <li><a class="tooltip-tip2 ajax-load" href="button.html" title="Button"><i class="icon-view-list-large"></i><span>Button</span> <div class="noft-blue-number">10</div></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="wizard.html" title="Tab & Accordion"><i class="icon-folder"></i><span>Wizard</span><div class="noft-purple-number">3</div></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="calendar.html" title="Calender"><i class="icon-calendar"></i><span>Calendar</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="tree.html" title="Tree View"><i class="icon-view-list"></i><span>Tree View</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="grids.html" title="Grids"><i class="icon-menu"></i><span>Grids</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="chart.html" title="Chart"><i class="icon-graph-pie"></i><span>Chart</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip ajax-load" href="typhography.html" title="Typhoghrapy">
                             <i class="icon-information"></i>
                             <span>Typhoghrapy</span>
                         </a>
                     </li>
                 </ul>
             </li>
             <li>
                 <a class="tooltip-tip" href="#" title="Form">
                     <i class="icon-document"></i>
                     <span>Form</span>
                 </a>
                 <ul>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="form-element.html" title="Form Elements"><i class="icon-document-edit"></i><span>Form Elements</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="andvance-form.html" title="Andvance Form"><i class="icon-map"></i><span>Andvance Form</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="text-editor.html" title="Text Editor"><i class="icon-code"></i><span>Text Editor</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="file-upload.html" title="File Upload"><i class="icon-upload"></i><span>File Upload</span></a>
                     </li>
                 </ul>
             </li>
             <li>
                 <a class="tooltip-tip" href="#" title="Tables">
                     <i class="icon-view-thumb"></i>
                     <span>Tables</span>
                 </a>
                 <ul>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="table-static.html" title="Table Static"><i class="entypo-layout"></i><span>Table Static</span></a>
                     </li>
                     <li>
                         <a class="tooltip-tip2 ajax-load" href="table-dynamic.html" title="Table Dynamic"><i class="entypo-menu"></i><span>Table Dynamic</span></a>
                     </li>
                 </ul>
             </li>
             <li>
                 <a class="tooltip-tip ajax-load" href="map.html" title="Map">
                     <i class="icon-location"></i>
                     <span>Map</span>
                 </a>
             </li>
         </ul>
     </div>
 </div>