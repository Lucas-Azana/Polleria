<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registro de Condimentos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .border-black {
            border: 1px solid #000 !important;
        }
    </style>
</head>
<body>
<div class="container mt-5">
    <h2 class="mb-4">Registrar Productos - Condimentos</h2>
    <form action="/registro-productos/registrar" method="post">
        <input type="hidden" name="categoria" value="Condimentos">
        <div class="mb-3">
            <label for="condimento" class="form-label">Condimento</label>
            <select class="form-select border-black" name="tipoCondimento" id="condimento" required>
                <option value="" selected disabled>Seleccione un condimento</option>
                <option>Sal</option>
                <option>Pimienta</option>
                <option>Comino</option>
                <option>Ajo molido</option>
                <option>Orégano</option>
                <option>Ají panca</option>
                <option>Vinagre</option>
                <option>Sillao</option>
                <option>Chicha</option>
            </select>
        </div>
        <div class="mb-3">
            <label for="cantidad" class="form-label">Cantidad (kg)</label>
            <input type="number" step="0.01" min="0" class="form-control border-black" name="cantidad" id="cantidad" required>
        </div>
        <div class="mb-3">
            <label for="fecha" class="form-label">Fecha de ingreso</label>
            <input type="date" class="form-control border-black" name="fechaIngreso" id="fecha" required>
        </div>
        <div class="mb-3">
            <label for="precio" class="form-label">Precio total (S/.)</label>
            <input type="number" step="0.01" min="0" class="form-control border-black" name="precioTotal" id="precio" required>
        </div>
        <div class="d-flex justify-content-start gap-2">
            <button type="submit" class="btn btn-primary">Registrar</button>
            <button type="button" class="btn btn-danger" onclick="window.history.back();">Volver</button>
        </div>
    </form>
</div>
<script>
    document.addEventListener('DOMContentLoaded', function() {
        const condimento = document.getElementById('condimento');
        let cantidadLabel = document.querySelector('label[for="cantidad"]');
        condimento.addEventListener('change', function() {
            if (this.value === 'Sillao' || this.value === 'Chicha') {
                cantidadLabel.textContent = 'Cantidad (L)';
            } else {
                cantidadLabel.textContent = 'Cantidad (Kg)';
            }
        });
    });
    </script>
</body>
</html>