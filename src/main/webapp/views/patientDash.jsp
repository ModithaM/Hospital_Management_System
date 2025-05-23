<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Patient Dashboard | Health Lanka</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/patientDash.css">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link rel="icon" type="image/png" href="${pageContext.request.contextPath}/assets/images/Fav-Icon.png">
    <script src="${pageContext.request.contextPath}/assets/vendor/tailwind.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/main.css">
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:ital,wght@0,100..900;1,100..900&display=swap" rel="stylesheet">
</head>
<body>

    <jsp:include page="/views/partials/header.jsp"/>

    <main class="container">
        <h1 class="main-title">Patient Dashboard</h1>

        <!-- Profile Section -->
     

        <!-- Info Cards Section -->
        <section class="cards">
            <div class="card">
                <img src="${pageContext.request.contextPath}/assets/images/first-aid-kit.png" alt="Emergency">
                <h2>Emergency</h2>
                <p class="status">No Emergency</p>
            </div>

            <div class="card">
                <img src="${pageContext.request.contextPath}/assets/images/appointment.png" alt="Appointments">
                <h2>Appointment History</h2>
                <a href="${pageContext.request.contextPath}/AppointmentHistory" class="btn">View</a>
            </div>

            
              <div class="card">
                <img src="${pageContext.request.contextPath}/assets/images/credit-card.png" alt="payments">
                <h2>Payments</h2>
                <a href="${pageContext.request.contextPath}/PaymentHistory" class="btn">View</a>
            </div>
            <div class="card">
                <img src="${pageContext.request.contextPath}/assets/images/receipt.png" alt="prescriptions">
                <h2>Prescriptions</h2>
                <a href="${pageContext.request.contextPath}/ShowPrescription" class="btn">View</a>
            </div>
        </section>

        <!-- Lab Reports and Payments -->
       
    </main>

    <jsp:include page="/views/partials/footer.jsp"/>
</body>
</html>
