<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registro de Pollos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .campo-borde {
            border: 1px solid #000 !important;
            border-radius: 4px;
            padding: 0.375rem 0.75rem;
            background-color: #fff;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h2>Registrar Producto - Pollos</h2>
        <form action="/registro-productos/registrar" method="post">
            <input type="hidden" name="categoria" value="Pollo">
            <div class="mb-3">
                <label for="tipoPollo" class="form-label">Tipo de Pollo</label>
                <select class="form-select campo-borde" name="tipoPollo" id="tipoPollo" required>
                    <option value="">Seleccione una opcion</option>
                    <option value="entero">Pollo Entero</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="cantidad" class="form-label">Cantidad (Kg)</label>
                <input type="number" class="form-control campo-borde" name="cantidad" id="cantidad" min="0.1" step="0.1" required>
            </div>
            <div class="mb-3">
                <label for="fechaIngreso" class="form-label">Fecha de Ingreso</label>
                <input type="date" class="form-control campo-borde" name="fechaIngreso" id="fechaIngreso" required>
            </div>
            <div class="mb-3">
                <label for="precioTotal" class="form-label">Precio Total (S/.)</label>
                <input type="number" class="form-control campo-borde" name="precioTotal" id="precioTotal" min="0" step="0.01" required>
            </div>
            <button type="submit" class="btn btn-primary">Registrar</button>
            <button type="button" class="btn btn-danger" onclick="window.history.back();">Volver</button>
        </form>
    </div>
</body>
</html>