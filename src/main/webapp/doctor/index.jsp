<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Doctor Dashboard</title>
    <%@include file="../component/allcss.jsp"%>
    <style>
        .paint-card {
            box-shadow: 0 0 10px 0 rgba(0, 0, 0, 0.3);
        }
    </style>
</head>
<body>
    <%@include file="navbar.jsp"%>

    <c:if test="${empty doctorObj}">
        <c:redirect url="../doctor_login.jsp" />
    </c:if>

    <div class="container p-5">
        <p class="text-center fs-3">Doctor Dashboard</p>

        <div class="row">
            <div class="col-md-4 offset-md-2">
                <div class="card paint-card">
                    <div class="card-body text-center text-success">
                        <i class="fas fa-user-md fa-3x"></i><br>
                        <p class="fs-4 text-center">
                            Doctor <br> ${doctorCount}
                        </p>
                    </div>
                </div>
            </div>

            <div class="col-md-4">
                <div class="card paint-card">
                    <div class="card-body text-center text-success">
                        <i class="far fa-calendar-check fa-3x"></i><br>
                        <p class="fs-4 text-center">
                            Total Appointments <br> ${appointmentCount}
                        </p>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>
