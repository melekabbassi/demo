<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Test</title>
    </head>
    <body>
        <p>This page is generated from a servlet</p>
        <p>
            <% 
                String name = request.getParameter("name");
                System.out.println("Hello " + name);
            %>
        </p>        
    </body>
</html>
