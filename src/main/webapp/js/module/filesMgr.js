function FilesMgr() {

}

FilesMgr.prototype.init = function(container, params) {
    $div = $('#' + container).empty().addClass("templatemo-content-container");

    $div.appendAll(
        $('<div/>').addClass("templatemo-flex-row flex-content-row").appendAll(
            $('<div/>').addClass("templatemo-content-widget white-bg col-1").appendAll(
                $('<i/>').addClass("fa fa-times"),
                $('<div/>').addClass("media").appendAll(
                    $('<div/>').addClass("media-left").appendAll(
                        $('<a/>').attr("href", "#").appendAll(
                            $('<img/>').addClass("media-object img-circle").attr({"src": "images/sunset.jpg", "alt": "Sunset"})
                        )
                    ),
                    $('<div/>').addClass("media-body").appendAll(
                        $('<h2/>').addClass("media-heading text-uppercase").html("Consectur Fusce Enim"),
                        $('<p/>').html("Phasellus dapibus nulla quis risus auctor, non placerat augue consectetur.")
                    )
                )
            ),
            $('<div/>').addClass("templatemo-content-widget white-bg col-1").appendAll(
                $('<i/>').addClass("fa fa-times"),
                $('<div/>').addClass("media").appendAll(
                    $('<div/>').addClass("media-left").appendAll(
                        $('<a/>').attr("href", "#").appendAll(
                            $('<img/>').addClass("media-object img-circle").attr({"src": "images/sunset.jpg", "alt": "Sunset"})
                        )
                    ),
                    $('<div/>').addClass("media-body").appendAll(
                        $('<h2/>').addClass("media-heading text-uppercase").html("Consectur Fusce Enim"),
                        $('<p/>').html("Phasellus dapibus nulla quis risus auctor, non placerat augue consectetur.")
                    )
                )
            ),
            $('<div/>').addClass("templatemo-content-widget white-bg col-1").appendAll( // 如果需要隐藏 style 加上 visibility: hidden;
                $('<i/>').addClass("fa fa-times"),
                $('<div/>').addClass("media").appendAll(
                    $('<div/>').addClass("media-left").appendAll(
                        $('<a/>').attr("href", "#").appendAll(
                            $('<img/>').addClass("media-object img-circle").attr({"src": "images/sunset.jpg", "alt": "Sunset"})
                        )
                    ),
                    $('<div/>').addClass("media-body").appendAll(
                        $('<h2/>').addClass("media-heading text-uppercase").html("Consectur Fusce Enim"),
                        $('<p/>').html("Phasellus dapibus nulla quis risus auctor, non placerat augue consectetur.")
                    )
                )
            )
        )
    );
}