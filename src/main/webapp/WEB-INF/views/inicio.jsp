<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Pollos a la brasa</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Tu estilo personalizado -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CSS/iniciostyle.css">
</head>
<body>

    <div class="container min-vh-100 d-flex align-items-center justify-content-center">
        <div class="wrapper p-4 rounded shadow bg-white w-100" style="max-width: 400px;">
            <form action="/redirigir" method="get">
                <h1 class="text-center mb-4">Inicio de sesión</h1>

                <div class="mb-3">
                    <input type="text" name="nombre" class="form-control" placeholder="Usuario o correo" required>
                </div>
                <div class="mb-3">
                    <input type="password" name="contrasena" class="form-control" placeholder="Contraseña" required>
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-danger">Iniciar sesión</button>
                </div>
            </form>
        </div>
    </div>

    <!-- Bootstrap JS (opcional) -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
