<%-- 
    Document   : index
    Created on : 28-ago-2018, 22:43:52
    Author     : Daniel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Catálogo Personajes</title>
    </head>
    <body>
        <h1>Catálogo de Personajes</h1>
        
        <form method="POST" action="ServletOperaciones">
            
            <input type="submit" name="btnHumano" value="Humano">
            <input type="submit" name="btnElfo" value="Elfo">
            <input type="submit" name="btnEnano" value="Enano">
            <input type="submit" name="btnOrco" value="Orco">
            <input type="submit" name="btnTrol" value="Trol">

            
        </form>
    </body>
</html>
