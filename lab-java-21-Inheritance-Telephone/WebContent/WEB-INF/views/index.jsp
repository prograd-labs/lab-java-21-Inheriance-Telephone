<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <meta http-equiv="X-UA-Compatible" content="ie=edge" />
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <link rel="stylesheet" href="/lab-java-inheritance-card-viewer/assets/style.css" />
    <title>Evolution of Telephone</title>
</head>

<body>
    <form action="/lab-java-inheritance-card-viewer/TelephoneApplication" method="post">
        <div class="header">EVOLUTION OF TELEPHONE</div>
        <div class="container">
            <button class="card" name="phone" value="basic">
                Basic
                <div class="card-info">${message1}</div>
            </button>
            <button class="card" name="phone" value="cordless">
                Cordless
                <div class="card-info">${message2}</div>
            </button>
            <button class="card" name="phone" value="handset">
                Handset
                <div class="card-info">${message3}</div>
            </button>
            <button class="card" name="phone" value="smartphone">
                Smartphone
                <div class="card-info">${message4}</div>
            </button>
        </div>
    </form>
</body>

</html>