<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
        "http://www.w3.org/TR/html4/loose.dtd">
<#include "/include.ftl" />
<html>
<head>
    <script type="text/javascript" src="<@spring.url'/js/review/Car.js'/>"></script>
    <script type="text/javascript" src="<@spring.url'/js/review/review.js'/>"></script>
    <script type="text/javascript">
        $(function() {
            $('#aa').html('2aa' + '${content}');

            var col = $('#aa').color("red");

            $.ltrim("   aa   ");
            var array = [];
            $('p:between(2, 4)').each(function(i, n) {
                array.push(n);
            });

            var jsonData = {};
            jsonData.key1 = "value1";
            jsonData.key2 = "value2";

            var url = "<@spring.url'/show.json'/>";

            $('#btn').click(function () {
                $.ajax({
                    contentType : "application/json",
                    url     : url,
                    type    : "POST",
                    async   : false,
                    data    : JSON.stringify(jsonData),
                    success : function(result, st) {
                        $('#btn').html(result.code);
                    }
                });
            });

        });
    </script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>${title}</title>
</head>
<body>
<p id="aa">0</p>
<p>1</p>
<p>2</p>
<p>3</p>
<p>4</p>
<p>5</p>
<p>6</p>
<p>7</p>
<button id="btn" type="button">testAjax</button>
</body>
</html>