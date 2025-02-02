<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>About Us - SDFC Bank</title>
    
    <style>
        /* Style the navigation buttons */
.nav-button.active a {
  background-color: #fff;
  color: #67d9d0;
}
    /* Internal CSS Styles */
    body, h1, form, label, input, button, ul, li, a {
            margin: 0;
            padding: 0;
        }
        header {
            display: flex;
            justify-content: space-between;
            align-items: center;
            background-color: #218b87;
            color: #fff;
            padding: 10px 20px;
        }

/* Style the navigation bar */
.navbar {
    display: flex;
    justify-content: center;
    background-color: #2cbebc;
    color: #fff;
    padding: 10px 0;
}

/* Style the navigation buttons */
.nav-button {
    background: none;
    border: none;
    margin: 0 10px;
    cursor: pointer;
}

.nav-button a {
    text-decoration: none;
    color: #fff;
    font-weight: bold;
    padding: 10px 15px;
    border-radius: 5px;
    transition: background-color 0.3s, color 0.3s;
}

.nav-button a:hover {
    background-color: #fff;
    color: #67d9d0;
}
/* Style the navigation buttons */
.nav-button.active a {
  background-color: #fff;
  color: #67d9d0;
}

img{
    max-height: 70px;
}
.container {
            max-width: 800px;
            margin: 20px auto;
            padding: 20px;
            background-color: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
        }
        h1 {
            text-align: center;
        }
        p {
            line-height: 1.6;
        }
        footer {
            text-align: center;
            padding: 10px 0;
            background-color: #2cbebc;
            color: #fff;
        }
    </style>
</head>
<body>
    <header>
        <div class="logo">
            <img src="https://sdfc.mv/images/SDFC_Logo_B.png" alt="Bank Logo">
        </div>
        <nav class="navbar">
            <button class="nav-button"  id="aboutUs"><a href="/aboutUs">ABOUT US</a></button>
            <button class="nav-button"  id="deposit"><a href="/deposit">DEPOSIT</a></button>
            <button class="nav-button"  id="withdraw"><a href="/withdraw">WITHDRAW</a></button>
            <button class="nav-button"  id="transfer"><a href="/transfer">TRANSFER</a></button>
            <button class="nav-button"  id="contact"><a href="/contact">CONTACT US</a></button>
            <button class="nav-button"><a href="/">LOGOUT</a></button>
        </nav>
        
    </header>
    <div class="container">
        <h1>About SDFC Bank</h1>
        <h2>Our Vision</h2>
        <p>Our vision is to be a leading financial partner that empowers individuals and businesses to prosper. We strive to create innovative banking solutions that make banking more accessible, convenient, and rewarding for our customers.</p>
        
        <h2>Core Values</h2>
        <ul>
            <li><strong>Customer-Centric:</strong> Our customers are at the heart of everything we do. We are committed to understanding their needs and providing tailored financial solutions that help them succeed.</li>
            <li><strong>Integrity:</strong> We uphold the highest ethical standards in all our interactions. Trust and transparency are the foundations of our relationships with customers, employees, and stakeholders.</li>
            <li><strong>Innovation:</strong> We embrace innovation to stay at the forefront of the banking industry. We continuously invest in technology and processes to enhance our services and deliver a seamless banking experience.</li>
            <li><strong>Community Engagement:</strong> We are more than just a bank; we are a part of the communities we serve. We actively engage in initiatives that contribute to the betterment of society and promote financial literacy.</li>
        </ul>
        
        <h2>Our Services</h2>
        <p>SDFC Bank offers a comprehensive range of financial services, including:</p>
        <ul>
            <li>Personal Banking: From savings accounts to home loans, we provide a wide array of financial products tailored to meet your individual needs.</li>
            <li>Business Banking: We support businesses of all sizes with specialized banking solutions, including corporate accounts, business loans, and treasury management services.</li>
            <li>Digital Banking: Our user-friendly online and mobile banking platforms make it convenient for you to manage your finances anytime, anywhere.</li>
            <li>Investment and Wealth Management: Our experienced team of financial experts can help you plan for your future and make informed investment decisions.</li>
        </ul>
        
        <h2>Our Commitment to Sustainability</h2>
        <p>SDFC Bank is committed to sustainability and responsible banking practices. We actively work towards reducing our environmental footprint, supporting renewable energy initiatives, and promoting sustainable finance options for our customers.</p>
        
        <h2>Join Us</h2>
        <p>We invite you to experience the SDFC Bank difference. Whether you are an individual seeking personal financial solutions or a business looking for a trusted banking partner, we are here to help you achieve your financial goals.</p>
        
        <p>Thank you for choosing SDFC Bank as your financial partner. We look forward to serving you and being a part of your financial journey.</p>
    </div>
    <footer>
        <p>&copy; 2023 Your Bank. All rights reserved.</p>
    </footer>
    <script>
        // Get all the navigation buttons
        const navButtons = document.querySelectorAll('.nav-button');
      
        // Function to remove the 'active' class from all buttons
        function removeActiveClass() {
          navButtons.forEach((btn) => {
            btn.classList.remove('active');
          });
        }
      
        // Add a click event listener to each button
        navButtons.forEach((button) => {
          button.addEventListener('click', (event) => {
            // Remove the 'active' class from all buttons
            removeActiveClass();
      
            // Add the 'active' class to the clicked button
            button.classList.add('active');
          });
      
          // Add mouseout event listener to each button
          button.addEventListener('mouseout', (event) => {
            // Add the 'active' class to the button when the cursor leaves
            button.classList.add('active');
          });
        });
      </script>
      
      
</body>
</html>
