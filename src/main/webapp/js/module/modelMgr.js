function ModelMgr() {

}

ModelMgr.prototype.init = function (container, params) {
    $div = $('#' + container).empty().addClass("templatemo-content-container");

    $div.appendAll(
        $('<div/>').addClass("templatemo-content-widget white-bg").appendAll(
            $('<h2/>').addClass("margin-bottom-10").html("Geo Charts"),
            $('<p/>').addClass("margin-bottom-0").html("Credit goes to ")
        ),
        $('<div/>').addClass("templatemo-flex-row flex-content-row").appendAll(
            $('<div/>').addClass("templatemo-content-widget white-bg col-1").appendAll(

            ),
            $('<div/>').addClass("templatemo-content-widget white-bg col-1").appendAll(

            )
        )
    );
}