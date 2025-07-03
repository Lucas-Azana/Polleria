<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registro de Papas</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .form-control,
        .form-select {
            border: 1px solid #000 !important;
        }
    </style>
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h2 class="mb-4">Registrar Producto - Papas</h2>
        <form action="/registro-productos/registrar" method="post">
            <input type="hidden" name="categoria" value="Papas">
            <div class="mb-3">
                <label for="tipoPapa" class="form-label">Tipo de Papa</label>
                <select class="form-select" id="tipoPapa" name="tipoPapa" required>
                    <option value="" disabled selected>Seleccione una opción</option>
                    <option value="entera">Papa Entera</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="cantidad" class="form-label">Cantidad (kg)</label>
                <input type="number" class="form-control" id="cantidad" name="cantidad" min="0.1" step="0.1" required>
            </div>
            <div class="mb-3">
                <label for="fechaIngreso" class="form-label">Fecha de Ingreso</label>
                <input type="date" class="form-control" id="fechaIngreso" name="fechaIngreso" required>
            </div>
            <div class="mb-3">
                <label for="precioTotal" class="form-label">Precio Total (S/.)</label>
                <input type="number" class="form-control" id="precioTotal" name="precioTotal" min="0" step="0.01" required>
            </div>
            <div class="d-flex gap-2">
                <button type="submit" class="btn btn-primary">Registrar</button>
                <button type="button" class="btn btn-danger" onclick="window.history.back();">Volver</button>
                
            </div>
        </form>
    </div>
</body>
</html>