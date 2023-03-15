
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Edit Profile</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto|Varela+Round">
        <link rel="stylesheet" href="https://fonts.googleapis.com/icon?family=Material+Icons">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link href="css/manager.css" rel="stylesheet" type="text/css"/>
        <style>
            img{
                width: 200px;
                height: 120px;
            }
        </style>
    <body>       
        
        <form action="editprofile" method="post">
            <div class="modal-header">						
                <h4 class="modal-title">My Profile</h4>
                <a href="home"><button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button></a>
            </div>
            <div class="modal-body">
                <div class="form-group">
                    <label hidden>
                    <input value="${sessionScope.user.getUserId()}" name="id" type="text" class="form-control" 'hidden="hidden"' required>
                    </label>
                </div>
                <div class="form-group">
                    <label>Name</label>
                    <input value="${sessionScope.account.name}" name="balance" type="text" class="form-control"  >
                </div>
                <div class="form-group">
                    <label>Date of birth</label>
                    <input value="${sessionScope.account.dob}" name="address" type="text" class="form-control" >
                </div>
                <div class="form-group">
                    <label>Phone Number</label>
                    <input value=${sessionScope.account.phone} name="phone" type="text" class="form-control" >
                </div>
                <div class="form-group">
                    <label>User Name</label>
                    <input value=${sessionScope.account.username} name="phone" type="text" class="form-control" readonly >
                </div>
                <div class="form-group">
                    <label>Password</label>
                    <input value=${sessionScope.account.password} name="phone" type="password" class="form-control" >
                    <a href="change.jsp"/> Change password
                </div>
            </div>
<!--            <div class="modal-footer">
                <input type="submit" class="btn btn-success" value="Edit">
            </div>-->
        </form>
    </body>
</html>


