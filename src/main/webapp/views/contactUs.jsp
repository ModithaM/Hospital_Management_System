<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Contact Us | Health Lanka</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/contact.css">
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

    <section class="sec1">
        <div class="wrapper">
        
    </div>
    </section>
      <div class="container">
    	<div class="content">
      		<div class="left-section scroll-animate-left">
        		<h4 class="heading-main">Contact Us</h4>
       		    <h4 class="heading-sub">Have questions, feedback, or need support? Our team is ready to assist you.</h4>
        		<img src="assets/images/assist4.png" alt="Patient Image" class="patient-img">
      		</div>
      		<div class="right-section scroll-animate-right">
        	<form action="${pageContext.request.contextPath}/contactUsController"  method="post" class="form-contact">
            <h1 class="head-contact">Send Us Massage</h1>
            <label for="Name">Name</label>
            <input type="text" class="input-contact" name="name" placeholder="G M S SUNTHUSH" required>
            <br>
            <label for="Email">Email</label>
            <input type="email" class="input-contact" name="email" placeholder="SANTHUSH@example.com" required>
            <br>
            <label for="Contact">Contact</label>
            <input type="tel" class="input-contact" name="contact" placeholder="07XXXXXXXX">
            <br>
            <label for="Name">Massage</label>
            <textarea class="input-contact" name="message" placeholder="Your Message" required></textarea>
            <br>
            <input type="submit" class="btn-submit">
            </form>
      		</div>
    	</div>
  </div>
   
    <section class="sec3">
        <div class="wrapper3">
            <div class="sub-wrap">
                <img src="${pageContext.request.contextPath}/assets/images/24.png" alt="" class="imgSec3">
            </div>
            <div class="sub-wrap">
                <div class="head-emerg">Emergency Hotline</div>
          
                <h1 class="emergencyLine">1967</h1>
            </div>
            <div class="sub-wrap">
                <img src="${pageContext.request.contextPath}/assets/images/ambulance.png" alt="" class="imgSec3">
            </div>
        </div>
    </section>
    
    <jsp:include page="/views/partials/footer.jsp"/>
</body>
</html>
