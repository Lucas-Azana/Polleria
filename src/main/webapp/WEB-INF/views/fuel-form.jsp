<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registro de Combustibles</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .input-border {
            border: 1px solid #000 !important;
        }
    </style>
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h2 class="mb-4">Registrar Producto - Combustibles</h2>
        <form id="fuelForm" class="p-4 bg-white rounded shadow-sm" action="/registro-productos/registrar" method="post">
            <input type="hidden" name="categoria" value="Combustible">
            <div class="mb-3">
                <label for="categoria" class="form-label">Categoría</label>
                <select class="form-select input-border" id="categoria" name="categoria" required>
                    <option value="" disabled selected>Seleccione una opción</option>
                    <option value="carbon">Carbón</option>
                    <option value="encendedores">Encendedores</option>
                    <option value="balon_gas">Balón de gas</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="cantidad" class="form-label" id="cantidadLabel">Cantidad (u)</label>
                <input type="number" min="1" class="form-control input-border" id="cantidad" name="cantidad" required>
            </div>
            <div class="mb-3">
                <label for="fecha" class="form-label">Fecha de ingreso</label>
                <input type="date" class="form-control input-border" id="fecha" name="fechaIngreso" required>
            </div>
            <div class="mb-3">
                <label for="precio" class="form-label">Precio total (S/.)</label>
                <input type="number" min="0" step="0.01" class="form-control input-border" id="precio" name="precioTotal" required>
            </div>
            <div class="d-flex justify-content-start gap-2">
                <button type="submit" class="btn btn-primary">Registrar</button>
                <button type="button" class="btn btn-danger" onclick="window.history.back();">Volver</button>
            </div>
        </form>
    </div>
    <script>
        const categoria = document.getElementById('categoria');
        const cantidadLabel = document.getElementById('cantidadLabel');

        categoria.addEventListener('change', function() {
            if (this.value === 'carbon') {
                cantidadLabel.textContent = 'Cantidad (kg)';
            } else {
                cantidadLabel.textContent = 'Cantidad (u)';
            }
        });
    </script>
</body>
</html>