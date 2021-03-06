﻿<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="UTF-8">
    <title>授权</title>
</head>
<style>

    html{
        padding: 0px;
        margin: 0px;
    }

    .title {
        background-color: #686BE9;
        height: 50px;
        padding-left: 20%;
        padding-right: 20%;
        color: white;
        line-height: 50px;
        font-size: 18px;
    }
    .title-center{
        text-align: center;
    }
    .title-left{
        float: right;
    }
    .title-right{
        float: left;
    }
    .title-left a{
        color: white;
    }
    .container{
        clear: both;
        text-align: center;
    }
    .btn {
        width: 350px;
        height: 35px;
        line-height: 35px;
        cursor: pointer;
        margin-top: 20px;
        border-radius: 3px;
        background-color: #686BE9;
        color: white;
        border: none;
        font-size: 15px;
    }
</style>
<body style="margin: 0px">
<div class="title">
    <div class="title-center">用户授权</div>
    <div class="title-left">
        
    </div>
</div>
    <div class="container">
         <h3 th:text="">${clientId}请求授权，该应用将获取你的信息</h3>
         授权后表明你已同意
        <form method="post" action="/oauth/authorize">
            <input type="hidden" name="user_oauth_approval" value="true">
            <input type="hidden" name="scope.server" value="true">
            <button class="btn" type="submit">同意/授权</button>
        </form>
        <form method="post" action="/oauth/authorize">
            <input type="hidden" name="user_oauth_approval" value="true">
            <input type="hidden" name="scope.server" value="false">
            <button class="btn" type="submit">拒绝</button>
        </form>
    </div>
</body>
</html>
