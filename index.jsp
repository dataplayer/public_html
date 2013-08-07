<!DOCTYPE HTML>
<%@taglib tagdir="/WEB-INF/tags" prefix="tschumacher" %>

<html>
    <head>
        <title>Timothy Schumacher, Ph.D.</title>
        <script language="javascript" type="text/javascript" src="js/jquery-1.10.2.js"></script>
        <script language="javascript" type="text/javascript" src="js/underscore-1.5.1.js"></script>
        <script language="javascript" type="text/javascript" src="js/backbone-1.0.0.js"></script>
        <script language="javascript" type="text/javascript" src="views/test.js"></script>
        <script language="javascript" type="text/javascript" src="views/nic.js"></script>
        <script>
            $(function() {
                console.log("Loaded...");
                var testView = new document.views.TestView({"el": "#testView"});
                testView.render();
            });
        </script>
    </head>
    <body>
        <div id="testView"></div>
        <%= new java.util.Date() %>
        
        <tschumacher:portal title="My Portal Test">Welcome to my home page.</tschumacher:portal>
    </body>
</html>
