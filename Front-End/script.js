function login(){
    var cpf = document.getElementById("cpflogin").value;
    var password = document.getElementById("passwordlogin").value;

    if (cpf == "admin" && password == "admin"){
        window.location.href = "index.html";
    }else{
        alert("Usuario ou Senha incorretos")
    }
}

function ScreenHome(){
    window.location = "mainscreen.html";
}

function SignupClient(){
    window.location = "signupclient.html";
}

function Payment(){
    window.location = "payment.html";
}

function Order(){
    window.location = "order.html";
}

function Delivery(){
    window.location = "delivery.html";
}

function OrderConfirmation(){
    window.location = "confirmorder.html";
}






























