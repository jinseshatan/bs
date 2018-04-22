
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>

<script type="text/javascript">

    //var url='?id='+'${param.id}';

    //$("#detailInput").form('load',url);
    $(function(){

        $.getJSON("/dlib/book/oneBook","id=${param.id}",function(result){

            $("#ima").prop('src',result.photo);
            $("#name").html(result.name);
            $("#publishdate").html(result.publishdate);
            $("#readNumber").html(result.readNumber)
            $("#author").html(result.author);
            $("#isbn").html(result.isbn);
            $("#publish").html(result.publish);
            $("#sketch").html(result.sketch);
            $("#id").val(result.id);
        });

    });

</script>
    <div>

        <form id="detailInput" method="post" enctype="multipart/form-data">
            <div style="float: left;border:1px;width:50%;height:50%">

                <img id="ima" st style="margin-left: 30px"><br/>
                修改书籍封面:<br/>
                <input class="easyui-filebox" name="file" data-options="width:150">
            </div>

            <div style="float: left;border:1px;width:50%;height:100%">
                <input type="hidden" name="id" id="id">
                书籍名称：<a id="name"></a><br/>
                书籍上架时间：<a id="publishdate"></a><br/>
                书籍阅读量：<a id="readNumber"></a><br/>
                书籍作者：<a id="author"></a><br/>
                书籍isbn:<a id="isbn"></a><br/>
                书籍出版社：<a id="publish"></a><br/>
                书籍简介：<a id="sketch"></a><br/>
            </div>

        </form>
    </div>

