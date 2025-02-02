<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>SDFC Bank - Login</title>
    <style>
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

        /* Style the logo */
        .logo img {
            max-height: 70px;
        }

        h1 {
            color:  #17c3c3;
            margin-top: 20px;
            font-size: 25px;
            margin-bottom: 20px;
        }

        form {
            background-color: #fff;
            max-width: 400px;
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

        input[type="text"],input[type="password"] 
        {
            width: 90%;
            padding: 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        button[type="submit"],button[type="reset"] {
            display: inline block;
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
            background-color: #32e4ea;
            color: #fff;
        }

        button[type="reset"]:hover {
            background-color: #32e4ea;
            color: #fff;
        }
            /* Footer styles */
    footer {
        background-color: #218b87;
        color: #fff;
        text-align: center;
        padding: 10px 0;
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
    <form action="/dashbord" method="post">
        <h1>Login to Your Account</h1><br>
        <label for="Account Number">Account Number</label>
        <input type="text" id="accno" name="accno" required>

        <label for="name">Name</label>
        <input type="text" id="name" name="name" required>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>
        
        <button type="submit" value="Login">Login</button>
        <button type="reset" value="reset">Reset</button>
    </form>
    <br><br><br><br><br><br><br><br>
    <footer>
        <p>&copy; 2023 SDFC Bank. All rights reserved.</p>
    </footer>
</body>
</html>
