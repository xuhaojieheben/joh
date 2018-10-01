function showPage(url, id, name, parentname, props) {
    //如果id 存在 则显示否则打开
    /*if($("#righttab_"+id).length>0){
      $("#tabul").find("li").removeClass("active");
      var  nid="#righttab_"+id;
      $("a[href='"+nid+"']").parent().addClass("active");
      $("#tab-content").find("div").removeClass("active");
      $("#righttab_"+id).addClass("active");
    return;
    }*/
    //$ajax.loading();
    //$(".list-unstyled").find("li").removeClass("active");
    //$(props).parent().addClass("active");
    $("#home").text(name);
    $("#page").text(parentname);
   
    //$("#iFrame").attr("src", url);
/*    if (name != "主页") {
        $("#menuBar").show();
        $("#tree").hide();
        $("#pageTitle").show();
        $("#pageTitle").text(parentname);
        $("#breadcrumb").show();
    }*/
    $.ajax({
        url: url, 
        dataType: "html",
        beforeSend: function () {
            $("#loading").show();
        },
        success: function (e) {
            /*  $("#tabul").find("li").removeClass("active");
              $("#tabul").append('<li class="active"><a href="#righttab_'+id+'" data-toggle="tab" aria-expanded="true">'+name+'<button  onclick="closetab(this)"  type="button" class="close closetab" data-dismiss="alert" aria-hidden="true">×</button></a></li>');
              $("#tab-content").find("div").removeClass("active");
              $("#tab-content").append('<div class="tab-pane active" id="righttab_'+id+'">'+e+'</div>');*/
            
            $("#blockArea").html('<div class="tab-panel active" id="righttab_' + id + '" name="' + name + '" parentname="' + parentname + '">' + e + '</div>');
            //$("#loading").hide();
            //$ajax.loadingClose();
        }, error: function () {
            //ajax.loadingClose();
        }
    });
}