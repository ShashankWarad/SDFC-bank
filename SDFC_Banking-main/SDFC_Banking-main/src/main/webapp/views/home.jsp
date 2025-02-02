<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SDFC Online Banking Services</title>
    <style>
        /* Reset some default styles */
body, h1, p {
    margin: 0;
    padding: 0;
}

/* Style the front page container */
.front-page {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 50vh;
    background-color: #218b87;
    color: #fff;
}

/* Style the bank image */



/* Style the login/register container */
.login-register {
    text-align: center;
}

h1 {
    font-size: 2em;
    margin-bottom: 10px;
}

p {
    font-size: 1.2em;
    margin-bottom: 20px;
}

/* Style login and register buttons */
.login-button, .register-button {
    display: inline-block;
    padding: 10px 20px;
    background-color: #fff;
    color: #1b99cf;
    text-decoration: none;
    font-size: 1.2em;
    margin-right: 10px; /* Add spacing between buttons */
    border-radius: 5px;
    transition: background-color 0.3s, color 0.3s;
}

.login-button:hover, .register-button:hover {
    background-color: #14d7da;
    color: #fff;
}

    /* Features section styles */
    .features {
        background-color: #fff;
        text-align: center;
        padding: 40px 0;
    }

    .feature {
        display: inline-block;
        margin: 0 20px;
        padding: 20px;
        text-align: left;
        background-color: #f9f9f9;
        border-radius: 5px;
        box-shadow: 0px 4px 6px rgba(0, 0, 0, 0.1);
    }

    .feature h2 {
        font-size: 24px;
        font-weight: bold;
        color: #333;
        margin-bottom: 10px;
    }

    .feature p {
        font-size: 16px;
        color: #555;
    }

    /* Footer styles */
    footer {
        background-color: #218b87;
        color: #fff;
        text-align: center;
        padding: 20px 0;
    }

    footer p {
        font-size: 14px;
    }

    </style>
</head>
<body>
    <div class="front-page">
        <div class="bank-image">
            <img src="https://sdfc.mv/images/SDFC_Logo_B.png" height="320px" width="700px">
        </div>
        <div class="login-register">
            <h1>Welcome to SDFC Bank</h1>
            <h2>EXTRAORDANARY SERVICES</h2>
            <p>Login or register to access your account.</p>
            <a href="/login" class="login-button">Login</a>
            <a href="/register" class="register-button">Register</a>
        </div>
    </div>
    <section class="features">
        <div class="feature">
            <h2>Secure Banking</h2>
            <p>Our top priority is the security of your funds and personal information.</p>
        </div>
        <div class="feature">
            <h2>Convenient Services</h2>
            <p>Access your accounts, make transactions, and manage your finances online.</p>
        </div>
        <div class="feature">
            <h2>Customer Support</h2>
            <p>We are here to assist you. Contact us for any inquiries or assistance.</p>
        </div>
    </section>

    <footer>
        <p>&copy; 2023 SDFC Bank. All rights reserved.</p>
    </footer>
</body>
</html>
