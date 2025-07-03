<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ingreso de Utensilios y Desechables</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .form-control, .form-select {
            border: 1px solid #000 !important;
            box-shadow: none !important;
        }
    </style>
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Registrar Productos - Utensilios y Desechables</h2>
    <form action="/registro-productos/registrar" method="post">
        <input type="hidden" name="categoria" value="Utensilios Desechables">
        
        <div class="mb-3">
            <label for="tipoUtensilio" class="form-label">Tipo de Utensilio</label>
            <select class="form-select" name="tipoUtensilio" id="tipoUtensilio" required>
                <option value="" selected disabled>Seleccione una opción</option>
                <option value="tapers">Tapers descartables</option>
                <option value="bolsas">Bolsas</option>
                <option value="servilletas">Servilletas</option>
                <option value="cubiertos">Cubiertos descartables</option>
                <option value="vasos">Vasos descartables</option>
                <option value="guantes">Guantes</option>
                <option value="bandejas">Bandejas</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="cantidad" class="form-label">Cantidad (u)</label>
            <input type="number" class="form-control" name="cantidad" id="cantidad" min="1" required>
        </div>
        <div class="mb-3">
            <label for="fechaIngreso" class="form-label">Fecha de ingreso</label>
            <input type="date" class="form-control" name="fechaIngreso" id="fechaIngreso" required>
        </div>
        <div class="mb-3">
            <label for="precioTotal" class="form-label">Precio total (S/.)</label>
            <input type="number" class="form-control" name="precioTotal" id="precioTotal" min="0" step="0.01" required>
        </div>
        <button type="submit" class="btn btn-primary">Registrar</button>
        <button type="button" class="btn btn-danger" onclick="window.history.back();">Volver</button>
    </form>
</div>
</body>
</html>