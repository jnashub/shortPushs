<%@ include file="./common/header.jspf" %>
<title>SarataTech Servlet</title>
<link href='https://unpkg.com/boxicons@2.1.2/css/boxicons.min.css' rel='stylesheet'>
</head>
<body style="min-height: 100vh;display: flex; justify-content: center; align-items: center;">
<div class="container" style="display: flex; justify-content: center; align-items: center;">
    <div class="card" style="width: 42rem;">
        <div class="card-body">
            <h1 class="card-title text-center">Login</h1>
            <h3 class="card-subtitle mb-2 text-muted text-center">To get in VitaGros Pharma's Web site</h3>
            <br/>
            <p class="card-text">
            <form action="/home" method="POST">
                <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1"><i class='bx bxs-user'></i></span>
                    </div>
                    <input type="text" class="form-control" placeholder="Username" aria-label="Username"
                           aria-describedby="basic-addon1" id="username" name="userName">
                </div>
                <br/>
                <div class="input-group mb-3">
                    <div class="input-group-prepend">
                        <span class="input-group-text" id="password"><i class='bx bxs-lock-alt'></i></span>
                    </div>
                    <input type="password" class="form-control" placeholder="Password" aria-label="Password-addon"
                           aria-describedby="password-addon" name="password" id="password">
                </div>
                <button type="submit" class="btn btn-primary">Login</button>
            </form>
            </p>
        </div>
    </div>
</div>

<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
<script src="webjars/popper.js/2.9.3/umd/popper.js"></script>
</body>
</html>