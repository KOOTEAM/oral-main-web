function PatientMgr() {

}

PatientMgr.prototype.init = function(container, params) {
    $div = $('#' + container).empty().addClass("templatemo-content-container");

    $div.appendAll(
        $('<div/>').addClass("templatemo-content-widget no-padding").appendAll(
            $('<div/>').addClass("panel panel-default table-responsive").appendAll(
                $('<table/>').addClass("table table-striped table-bordered templatemo-user-table").appendAll(
                    $('<thead/>').appendAll(
                        $('<tr/>').appendAll(
                            $('<td/>').appendAll(
                                $('<a/>').addClass("white-text templatemo-sort-by").attr("href", "").html("#").appendAll(
                                    $('<span/>').addClass("caret")
                                )
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("white-text templatemo-sort-by").attr("href", "").html("First Name").appendAll(
                                    $('<span/>').addClass("caret")
                                )
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("white-text templatemo-sort-by").attr("href", "").html("Last Name").appendAll(
                                    $('<span/>').addClass("caret")
                                )
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("white-text templatemo-sort-by").attr("href", "").html("User Name").appendAll(
                                    $('<span/>').addClass("caret")
                                )
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("white-text templatemo-sort-by").attr("href", "").html("Email").appendAll(
                                    $('<span/>').addClass("caret")
                                )
                            ),
                            $('<td/>').html("Edit"),
                            $('<td/>').html("Action"),
                            $('<td/>').html("Delete")
                        )
                    ),
                    $('<tbody/>').appendAll(
                        $('<tr/>').appendAll(

                        ),
                        $('<tr/>').appendAll(

                        ),
                        $('<tr/>').appendAll(

                        ),
                        $('<tr/>').appendAll(

                        ),
                        $('<tr/>').appendAll(

                        ),
                        $('<tr/>').appendAll(

                        ),
                        $('<tr/>').appendAll(

                        )
                    )
                )
            )
        )
    );
}