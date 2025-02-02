<!DOCTYPE html>
<html>
<head>
    <title>SDFC Bank - Register</title>
    <style>
        /* Reset some default styles */
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

        /* Style the logo */
        .logo img {
            max-height: 70px;
        }

        /* Style the registration form (you can customize this further if needed) */

        h1 {
            color:  #17c3c3;
            margin-top: 20px;
            font-size: 25px;
            margin-bottom: 20px;
        }
        form {
            
            max-width: 600px;
            margin: 0 auto;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
        }
        label {
            display: contents;
            font-weight: bold;
            font-size: 1.2em;
            margin-bottom: 10px;
        }
        input[type="text"],[type="password"] {
            width: 90%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        input[type="radio"] {
            width: 20%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
        }
        button[type="submit"],button[type="reset"] {
            display: inline-block;
            width: 30%;
            padding: 10px;
            background-color:#1abbb5;
            color: #fff;
            border: none;
            border-radius: 5px;
            font-size: 1.2em;
            cursor: pointer;
            transition: background-color 0.3s, color 0.3s;
        }

        button[type="submit"]:hover {
            background-color: #1bc0cf;
            color: #fff;
        }
        button[type="reset"]:hover {
            background-color: #1bc0cf;
            color: #fff;
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
            <header>
                <div class="logo">
                    <img src="https://sdfc.mv/images/SDFC_Logo_B.png" alt="Bank Logo">
                </div>
            </header>
        
            <form action="/success" method="post" id="registrationForm">
        
                <h1>Create Your Account</h1>
        
                <label for="accno">Account No</label>
                <input type="text" name="accno" id="accno" required>
                
                <label for="name">Name</label>
                <input type="text" name="name" id="name" required>
                
                <label for="password">Password</label>
                <input type="password" name="password" id="password"required>
                
                <label for="cpassword">Confirm Password</label>
                <input type="password" name="password" id="c_password" required>
        
                <label for="gender">Gender</label>
                <input type="radio" name="gender" value="Male">Male
                <input type="radio" name="gender" value="Female">Female
                <input type="radio" name="gender" value="Other">Other
                
                <label for="amount">Amount</label>
                <input type="text" name="amount" id="amount" required>
                <h3 style="color: red;position: relative;left: 85px;font-size: small;bottom:20px;left:10px;">Please put Amount is more then 5000</h3>
                
                <label for="address">Address</label>
                <input type="text" name="address" id="address" required>
                
                <label for="mobile">Mobile No</label>
                <input type="text" name="mobile" id="mobile" required>
                
                <button type="submit" value="Register">Register</button>
                <button type="reset" value="Reset">Reset</button></td><br>
                If you already have an account then go on <a href="/login">Login</a> /<a href="/"> Home</a>
            </form>
            <br><br><br>
            <footer>
                <p>&copy; 2023 SDFC Bank. All rights reserved.</p>
            </footer>
        </body>
        </html>
