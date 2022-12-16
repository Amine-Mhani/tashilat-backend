<%@ page import="ma.ensaj.tashilat.beans.Operator" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 05/12/2022
  Time: 22:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Phone</title>
    <!--link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous"-->


    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" rel="stylesheet">

    <!-- JavaScript Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
            crossorigin="anonymous"></script>

    <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

</head>
<body style="background-color: #C5CAE9;">
<style>
    .container-fluid {
        background-color: #C5CAE9
    }

    .heading {
        font-size: 40px;
        margin-top: 35px;
        margin-bottom: 30px;
        padding-left: 20px
    }

    .card {
        border-radius: 10px !important;
        margin-top: 60px;
        margin-bottom: 60px
    }

    .form-card {
        margin-left: 20px;
        margin-right: 20px
    }

    .form-card input, .form-card textarea {
        padding: 10px 15px 5px 15px;
        border: none;
        border: 1px solid lightgrey;
        border-radius: 6px;
        margin-bottom: 25px;
        margin-top: 2px;
        width: 100%;
        box-sizing: border-box;
        font-family: arial;
        color: #2C3E50;
        font-size: 14px;
        letter-spacing: 1px
    }

    .form-card input:focus, .form-card textarea:focus {
        -moz-box-shadow: 0px 0px 0px 1.5px skyblue !important;
        -webkit-box-shadow: 0px 0px 0px 1.5px skyblue !important;
        box-shadow: 0px 0px 0px 1.5px skyblue !important;
        font-weight: bold;
        border: 1px solid #304FFE;
        outline-width: 0
    }

    .input-group {
        position: relative;
        width: 100%;
        overflow: hidden
    }

    .input-group input {
        position: relative;
        height: 80px;
        margin-left: 1px;
        margin-right: 1px;
        border-radius: 6px;
        padding-top: 30px;
        padding-left: 25px
    }

    .input-group label {
        position: absolute;
        height: 24px;
        background: none;
        border-radius: 6px;
        line-height: 48px;
        font-size: 15px;
        color: gray;
        width: 100%;
        font-weight: 100;
        padding-left: 25px
    }

    input:focus + label {
        color: #304FFE
    }

    .btn-pay {
        background-color: #304FFE;
        height: 60px;
        color: #ffffff !important;
        font-weight: bold
    }

    .btn-pay:hover {
        background-color: #3F51B5
    }

    .fit-image {
        width: 100%;
        object-fit: cover
    }

    img {
        border-radius: 5px
    }

    .radio-group {
        position: relative;
        margin-bottom: 25px
    }

    .radio {
        display: inline-block;
        border-radius: 6px;
        box-sizing: border-box;
        border: 2px solid lightgrey;
        cursor: pointer;
        margin: 12px 25px 12px 0px
    }

    .radio:hover {
        box-shadow: 0px 0px 0px 1px rgba(0, 0, 0, 0.2)
    }

    .radio.selected {
        box-shadow: 0px 0px 0px 1px rgba(0, 0, 155, 0.4);
        border: 2px solid blue
    }

    .label-radio {
        font-weight: bold;
        color: #000000
    }
</style>
<header>
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <a class="navbar-brand" href="/Phone-Internet/home">
            <img src="https://www.guide-metiers.ma/wp-content/uploads/2019/02/ensajdida.couleur-206x206.png" width="30"
                 height="30"
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
<main>
    <div class="container-fluid">
        <div class="row justify-content-center">
            <div class=" col-lg-6 col-md-8">
                <div class="card p-3">
                    <div class="row justify-content-center">
                        <div class="col-12">
                            <h2 class="heading text-center">Phone</h2>
                        </div>
                    </div>
                    <form class="form-card" method="post" action="/create-phone-bill">
                        <div class="row justify-content-center mb-4 radio-group">
                            <div class="col-sm-3 col-5 text-center">
                                <div class='radio selected mx-auto text-center' data-value="dk"><img alt="Responsive image" class="rounded mx-auto d-block"
                                                                                         src="https://paiement.iam.ma/imgs/logo.png"
                                                                                         width="105px" height="55px">
                                </div>
                            </div>
                            <div class="col-sm-3 col-5 text-center">
                                <div class='radio mx-auto text-center' data-value="visa"><img alt="Responsive image" class="rounded mx-auto d-block"
                                                                                  src="https://inwi.ma/assets/logo/logo.svg"
                                                                                  width="105px" height="55px"></div>
                            </div>
                            <div class="col-sm-3 col-5 text-center">
                                <div class='radio mx-auto text-center' data-value="master"><img class="img-thumbnail fit-image rounded mx-auto d-block" alt="Responsive image"
                                                                                    src="https://www.orange.ma/img/contenus/logo.png"
                                                                                    width="105px" height="55px"></div>
                            </div>
                            <!--div class="col-12">
                                <div class="input-group">
                                    <select class="form-select" aria-label="Default select example">
                                        <option selected hidden>United States</option>
                                        <option value="1">India</option>
                                        <option value="2">Australia</option>
                                        <option value="3">Canada</option>
                                    </select>
                                </div>
                            </div-->
                            <br>
                        </div>

                        <div class="row justify-content-center">
                            <div class="col-12">
                                <select class="selectpicker" name="operator">
                                    <%
                                        List<Operator> ops = (List<Operator>) request.getAttribute("ops");
                                        for(Operator op:ops){
                                    %>
                                    <option value="<%=op.getOperatorId()%>"><%=op.getName()%></option>
                                    <%}%>
                                </select>
                            </div>
                        </div>

                        <div class="row justify-content-center">
                            <div class="col-12">
                                <div class="input-group"><input type="text" name="phone_num" placeholder="+212-...">
                                    <label>Numero</label>
                                </div>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-12">
                                <div class="input-group"><input type="text" name="email" placeholder="email@gmail.com">
                                    <label>Email</label>
                                </div>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-12">
                                <div class="row">
                                    <div class="col-6">
                                        <div class="input-group"><input type="text" id="exp" class="expdate"
                                                                        placeholder="*" minlength="5" maxlength="5">
                                            <label>Forfait</label></div>
                                    </div>
                                    <div class="col-6">
                                        <div class="input-group"><input type="text" name="montant"
                                                                        placeholder="DH"
                                                                        minlength="2" maxlength="4">
                                            <label>Montant</label>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <div class="row justify-content-center">
                            <div class="col-md-12"><input type="submit" value="Fill"
                                                          class="btn btn-warning placeicon"/></div>
                        </div>
                    </form>
                </div>
            </div>
        </div>
    </div>
</main>

</body>
<script>
    $(document).ready(function () {
        $('.select').selectpicker();

//For Card Number formatted input
        var cardNum = document.getElementById('cr_no');
        cardNum.onkeyup = function (e) {
            if (this.value == this.lastValue) return;
            var caretPosition = this.selectionStart;
            var sanitizedValue = this.value.replace(/[^0-9]/gi, '');
            var parts = [];

            for (var i = 0, len = sanitizedValue.length; i < len; i += 4) {
                parts.push(sanitizedValue.substring(i, i + 4));
            }

            for (var i = caretPosition - 1; i >= 0; i--) {
                var c = this.value[i];
                if (c < '0' || c > '9') {
                    caretPosition--;
                }
            }
            caretPosition += Math.floor(caretPosition / 4);

            this.value = this.lastValue = parts.join('-');
            this.selectionStart = this.selectionEnd = caretPosition;
        }

//For Date formatted input
        var expDate = document.getElementById('exp');
        expDate.onkeyup = function (e) {
            if (this.value == this.lastValue) return;
            var caretPosition = this.selectionStart;
            var sanitizedValue = this.value.replace(/[^0-9]/gi, '');
            var parts = [];

            for (var i = 0, len = sanitizedValue.length; i < len; i += 2) {
                parts.push(sanitizedValue.substring(i, i + 2));
            }

            for (var i = caretPosition - 1; i >= 0; i--) {
                var c = this.value[i];
                if (c < '0' || c > '9') {
                    caretPosition--;
                }
            }
            caretPosition += Math.floor(caretPosition / 2);

            this.value = this.lastValue = parts.join('/');
            this.selectionStart = this.selectionEnd = caretPosition;
        }

        // Radio button
        $('.radio-group .radio').click(function () {
            $(this).parent().parent().find('.radio').removeClass('selected');
            $(this).addClass('selected');
        });
    })
</script>
</html>
