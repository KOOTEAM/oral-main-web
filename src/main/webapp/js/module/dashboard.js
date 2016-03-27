function Dashboard() {

}

Dashboard.prototype.init = function(container, param) {
    $div = $('#' + container).empty().addClass("templatemo-content-container");

    $div.appendAll(
            $('<div/>').addClass("templatemo-flex-row flex-content-row").appendAll(
                $('<div/>').addClass("templatemo-content-widget white-bg col-1").appendAll(
                    $('<i/>').addClass("fa fa-times"),
                    $('<h2/>').addClass("text-uppercase").html("Dictum"),
                    $('<h3/>').addClass("text-uppercase").html("Sedvel Erat Non"),
                    $('<hr>'),
                    $('<div/>').addClass("progress").appendAll(
                        $('<div/>').addClass("progress-bar progress-bar-info").attr({"role": "progressbar", "aria-valuenow": "60", "aria-valuemin": "0", "aria-valuemax": "100"}).css({"width":"60%"})
                    ),
                    $('<div/>').addClass("progress").appendAll(
                        $('<div/>').addClass("progress-bar progress-bar-success").attr({"role": "progressbar", "aria-valuenow": "60", "aria-valuemin": "0", "aria-valuemax": "100"}).css({"width":"50%"})
                    ),
                    $('<div/>').addClass("progress").appendAll(
                        $('<div/>').addClass("progress-bar progress-bar-warning").attr({"role": "progressbar", "aria-valuenow": "60", "aria-valuemin": "0", "aria-valuemax": "100"}).css({"width":"60%"})
                    )
                ),
                $('<div/>').addClass("templatemo-content-widget white-bg col-2").appendAll(
                    $('<i/>').addClass("fa fa-times"),
                    $('<div/>').addClass("square"),
                    $('<h2/>').addClass("templatemo-inline-block").html(" Visual Admin Template"),
                    $('<hr/>'),
                    $('<p/>').html(
                        "Works on all major browsers. IE 10+. Visual Admin is " +
                        "           <a href=\"http://www.templatemo.com/tag/admin\" target=\"_parent\">" +
                        "               free responsive admin template" +
                        "           </a>" +
                        "            for everyone. Feel free to use this template for your backend user interfaces. Please tell your friends about " +
                        "           <a href=\"http://www.templatemo.com\" target=\"_parent\">" +
                        "               templatemo.com" +
                        "           </a>" +
                        "            website. You may " +
                        "           <a href=\"http://www.templatemo.com/contact\" target=\"_parent\">" +
                        "               contact us" +
                        "           </a>" +
                        "           if you have anything to say."
                    ),
                    $('<p/>').html(
                        "Nunc placerat purus eu tincidunt consequat. Lorem ipsum dolor sit amet, consectetur adipiscing elit. " +
                        "Phasellus dapibus nulla quis risus auctor, non placerat augue consectetur. " +
                        "Fusce mi lacus, semper sit amet mattis eu."
                    )
                )
            ),
            $('<div/>').addClass("templatemo-flex-row flex-content-row").appendAll(
                $('<div/>').addClass("col-1").appendAll(
                    $('<div/>').addClass("templatemo-content-widget orange-bg").appendAll(
                        $('<i/>').addClass("fa fa-times"),
                        $('<div/>').addClass("media").appendAll(
                            $('<div/>').addClass("media-left").appendAll(
                                $('<a/>').attr("href", "#").appendAll(
                                    $('<img/>').addClass("media-object img-circle").attr({"src": "images/sunset.jpg","alt": "Sunset"})
                                )
                            ),
                            $('<div/>').addClass("media-body").appendAll(
                                $('<h2/>').addClass("media-heading text-uppercase").html("Consectur Fusce Enim"),
                                $('<p/>').html("Phasellus dapibus nulla quis risus auctor, non placerat augue consectetur.")
                            )
                        )
                    ),
                    $('<div/>').addClass("templatemo-content-widget white-bg").appendAll(
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
                ),
                $('<div/>').addClass("col-1").appendAll(
                    $('<div/>').addClass("panel panel-default templatemo-content-widget white-bg no-padding templatemo-overflow-hidden").appendAll(
                        $('<i/>').addClass("fa fa-times"),
                        $('<div/>').addClass("panel-heading templatemo-position-relative").appendAll(
                            $('<h2/>').addClass("text-uppercase").html("User Table")
                        ),
                        $('<div/>').addClass("table-responsive").appendAll(
                            $('<table/>').addClass("table table-striped table-bordered").appendAll(
                                $('<thead/>').appendAll(
                                    $('<tr/>').appendAll(
                                        $('<td/>').html("No."),
                                        $('<td/>').html("First Name"),
                                        $('<td/>').html("Last Name"),
                                        $('<td/>').html("Username")
                                    )
                                ),
                                $('<tbody/>').appendAll(
                                    $('<tr/>').appendAll(
                                        $('<td/>').html("No."),
                                        $('<td/>').html("First Name"),
                                        $('<td/>').html("Last Name"),
                                        $('<td/>').html("Username")
                                    ),
                                    $('<tr/>').appendAll(
                                        $('<td/>').html("No."),
                                        $('<td/>').html("First Name"),
                                        $('<td/>').html("Last Name"),
                                        $('<td/>').html("Username")
                                    ),
                                    $('<tr/>').appendAll(
                                        $('<td/>').html("No."),
                                        $('<td/>').html("First Name"),
                                        $('<td/>').html("Last Name"),
                                        $('<td/>').html("Username")
                                    ),
                                    $('<tr/>').appendAll(
                                        $('<td/>').html("No."),
                                        $('<td/>').html("First Name"),
                                        $('<td/>').html("Last Name"),
                                        $('<td/>').html("Username")
                                    ),
                                    $('<tr/>').appendAll(
                                        $('<td/>').html("No."),
                                        $('<td/>').html("First Name"),
                                        $('<td/>').html("Last Name"),
                                        $('<td/>').html("Username")
                                    )
                                )
                            )
                        )
                    )
                )
            )
        );
}