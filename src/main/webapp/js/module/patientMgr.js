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
                            $('<td/>').html("1."),
                            $('<td/>').html("John"),
                            $('<td/>').html("Smith"),
                            $('<td/>').html("@js"),
                            $('<td/>').html("js@example.com"),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-edit-btn").attr("href", "").html("Edit")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Action")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Delete")
                            )
                        ),
                        $('<tr/>').appendAll(
                            $('<td/>').html("1."),
                            $('<td/>').html("John"),
                            $('<td/>').html("Smith"),
                            $('<td/>').html("@js"),
                            $('<td/>').html("js@example.com"),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-edit-btn").attr("href", "").html("Edit")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Action")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Delete")
                            )
                        ),
                        $('<tr/>').appendAll(
                            $('<td/>').html("1."),
                            $('<td/>').html("John"),
                            $('<td/>').html("Smith"),
                            $('<td/>').html("@js"),
                            $('<td/>').html("js@example.com"),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-edit-btn").attr("href", "").html("Edit")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Action")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Delete")
                            )
                        ),
                        $('<tr/>').appendAll(
                            $('<td/>').html("1."),
                            $('<td/>').html("John"),
                            $('<td/>').html("Smith"),
                            $('<td/>').html("@js"),
                            $('<td/>').html("js@example.com"),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-edit-btn").attr("href", "").html("Edit")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Action")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Delete")
                            )
                        ),
                        $('<tr/>').appendAll(
                            $('<td/>').html("1."),
                            $('<td/>').html("John"),
                            $('<td/>').html("Smith"),
                            $('<td/>').html("@js"),
                            $('<td/>').html("js@example.com"),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-edit-btn").attr("href", "").html("Edit")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Action")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Delete")
                            )
                        ),
                        $('<tr/>').appendAll(
                            $('<td/>').html("1."),
                            $('<td/>').html("John"),
                            $('<td/>').html("Smith"),
                            $('<td/>').html("@js"),
                            $('<td/>').html("js@example.com"),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-edit-btn").attr("href", "").html("Edit")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Action")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Delete")
                            )
                        ),
                        $('<tr/>').appendAll(
                            $('<td/>').html("1."),
                            $('<td/>').html("John"),
                            $('<td/>').html("Smith"),
                            $('<td/>').html("@js"),
                            $('<td/>').html("js@example.com"),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-edit-btn").attr("href", "").html("Edit")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Action")
                            ),
                            $('<td/>').appendAll(
                                $('<a/>').addClass("templatemo-link").attr("href", "").html("Delete")
                            )
                        )
                    )
                )
            )
        )
    );
}