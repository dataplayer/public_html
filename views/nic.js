document.views = document.views || {};

(function() { 
    var NicView = Backbone.View.extend({
        "initialize": function() {
            console.log("Hello, Nic Backbone!");
        }, 
        "defaults": {
            "fname": "Nicandro",
            "lname": "Flores"
        }
    });

    document.views.NicView = NicView;
})(jQuery);
