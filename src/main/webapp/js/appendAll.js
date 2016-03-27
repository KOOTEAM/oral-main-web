;(function($) {
    $.fn.extend({
        "appendAll" : function() {
            // code here
            var obj = this;
            for (var i = 0; i < arguments.length; i++) {
                obj = obj.append(arguments[i]);
            }
            return obj;
        }
    });
})(jQuery);