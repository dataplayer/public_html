document.views = document.views || {};

(function() { 
    var TestView = Backbone.View.extend({
        "initialize": function() {
            console.log("Hello, Backbone!");
        }, 
        "defaults": {
            "fname": "Timothy",
            "lname": "Schumacher"
        },
        "render": function() {
            this.$el.html(this.template(this.defaults));
            console.log("Render...");
            console.log(this.$el);
            //this.$el.appendTo( $("body") );
        }, 
        "template": _.template("<p id=\"fname\">fname: <%= fname %>, lname: <%= lname %></p>")
    });

    document.views.TestView = TestView;
})(jQuery);
