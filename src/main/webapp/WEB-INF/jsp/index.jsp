<%@ page import="ma.ensaj.tashilat.beans.Operator" %>
<%@ page import="java.util.List" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <!-- CSS only -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>
</head>
<body style="background-color: #C5CAE9;">
<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="/Phone-Internet/home">
            <img src="https://www.guide-metiers.ma/wp-content/uploads/2019/02/ensajdida.couleur-206x206.png" width="30" height="30"
                 class="d-inline-block align-top"
                 alt="">
            Tashilat
        </a>

        <div class="collapse navbar-collapse justify-content-md-center" id="navbarsExample08">
            <ul class="navbar-nav">
                <li class="nav-item active">
                    <a class="nav-link" href="#">Centered nav only <span class="sr-only">(current)</span></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">Link</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link disabled" href="#">Disabled</a>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="http://example.com" id="dropdown08" data-toggle="dropdown"
                       aria-haspopup="true" aria-expanded="false">Dropdown</a>
                    <div class="dropdown-menu" aria-labelledby="dropdown08">
                        <a class="dropdown-item" href="#">Action</a>
                        <a class="dropdown-item" href="#">Another action</a>
                        <a class="dropdown-item" href="#">Something else here</a>
                    </div>
                </li>
            </ul>
        </div>
    </nav>
</header>

<main style="padding: 5% 15% 5% 15%;">
    <div class="card-group">
        <div class="card bg-warning text-light m-2 border-warning rounded">
            <div class="card-body">
                <h3 class="card-title">Refill your phone</h3>
                <p class="card-text">Texte de la carte.</p>
                <a href="/Phone-Internet/phone" type="button" class="btn btn-dark">Pay</a>
            </div>
        </div>
        <div class="card bg-secondary text-light m-2 border-secondary rounded">
            <div class="card-body">
                <h3 class="card-title">Pay your Internet</h3>
                <p class="card-text">Texte de la carte.</p>
                <a href="/Phone-Internet/internet" type="button" class="btn btn-dark">Pay</a>
            </div>
        </div>
    </div>
    <!--img class="card-img-top" src="/images/iphone.png" alt="Card image cap"-->
    <%
        List<Operator> ops = (List<Operator>) request.getAttribute("ops");
    %>


</main>
</body>
</html>