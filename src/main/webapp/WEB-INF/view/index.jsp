<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<head>
    <meta charset="utf-8">
    <title>Java + Spring Framework + Bootstrap</title>
    <link href="/resources/lib/bootstrap/dist/css/bootstrap.min.css" rel="stylesheet" />
    <link href="/resources/css/site.css" rel="stylesheet" />
</head>
<body>

<!-- Navigation -->
<div class="container">
    <h2 class="text-center alert-secondary">
        Записная книжка
    </h2>
    <div class="row m-1 p-1">
        <div class="col-2">
            <form action="viewAddRecord">
            <button type="submit" class="btn btn-block btn-primary">
                Добавить запись
            </button>
            </form>
        </div>
        <div class="col-10">
            <div class="card card-outline-primary m-1 p-1">
                <div>
                    <form action="ViewRecord"
                          asp-controller="Record" method="post" class="d-inline-flex">
                        <input type="hidden" name="id"
                               value="@p.PhoneBookID" />
                        <button type="submit"
                                class="btn btn-secondary btn-sm">
                            @p.PhoneBookID
                        </button>
                    </form>
                    <!--
                    <div class="d-inline-flex">
                        @p.LastName @p.FirstName @p.ThreeName
                    </div>
                    <form id="@p.PhoneBookID" asp-action="DeleteRecord"
                          asp-controller="PhoneBook" method="post" class="d-inline-flex pull-right" style="float:right">
                        <input type="hidden" name="id"
                               value="@p.PhoneBookID" />
                        <button type="submit"
                                class="btn btn-danger btn-sm">
                            Удалить
                        </button>
                    </form>
                    <form id="@p.PhoneBookID" asp-action="ViewEditRecord"
                          asp-controller="Record" method="post" class="d-inline-flex pull-right" style="float:right">
                        <input type="hidden" name="id"
                               value="@p.PhoneBookID" />
                        <button type="submit"
                                class="btn btn-success btn-sm">
                            Редактировать
                        </button>
                    </form>
                    -->
                </div>
            </div>
        </div>
    </div>
</div>
<script src="/resources/lib/jquery/dist/jquery.min.js"/>
<script src="/resources/lib/bootstrap/dist/js/bootstrap.bundle.min.js"/>
<script src="/resources/js/site.js"/>

</body>
</html>
