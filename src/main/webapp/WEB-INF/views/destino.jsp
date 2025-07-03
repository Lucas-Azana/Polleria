<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Pollitos - Destino</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/estilodestino.css">
</head>
<body>

<header>
 <img src="${pageContext.request.contextPath}/img/cabecera.jpeg" alt="cabecera" class="cabecera">

    <div class="user">
        <a href="#"><img src="${pageContext.request.contextPath}/img/ICOUser.png" alt="usuario" width="50px"></a>
    </div>

    <div class="texto-bienvenida">
        <h1>Bienvenido ${nombre}</h1>
    </div>
</header>

<main>
    <div class="frase">
        <h2>¿Qué necesitas hacer el día de hoy?</h2>
    </div>

    <div class="botones">
        <a href="${pageContext.request.contextPath}/registro-productos/"><button>Registro</button></a>
        <a href="#"><button>Asistencia</button></a>
        <a href="#"><button>Recursos Humanos</button></a>
    </div>
</main>

<footer>
    <div class="PDP">
        <h2>¿Necesitas ayuda?</h2>
        <p>Comunícate con Recursos Humanos o al WhatsApp 986 741 550</p>
    </div>
</footer>

</body>
</html>
