<%-- 
    Document   : AddCar
    Created on : Apr 15, 2024, 1:28:01 PM
    Author     : LTC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add new car Page</title>
    </head>
    <body>
        <form action="mainController" method="post">
            <input type="hidden" value="Create" placeholder="action">
            <h1>Add New Car</h1>
            <p>Car ID</p>
            <input type="text" name="txtCarID" placeholder="CarID">
            <p>Car Name</p>
            <input type="text" name="txtCarName" placeholder="CarName">
            <p>Manufacturer</p>
            <input type="text" name="txtManufacturer" placeholder="Manufacturer">
            <p>Price</p>
            <input type="text" name="txtPrice" placeholder="Price">
            <p>Released Year</p>
            <input type="text" name="txtReleasedYear" placeholder="Released Year" ><br>
        
        <input type="submit" value="Create!">
        </form>
    </body>
</html>
 