<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registro de Salsas</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .form-control, .form-select {
            border: 1px solid #000 !important;
        }
    </style>
</head>
<body>
    <div class="container mt-5">
        <h2 class="mb-4">Registrar Productos - Salsas</h2>
        <form action="/registro-productos/registrar" method="post">
            <input type="hidden" name="categoria" value="Salsas">
            <div class="mb-3">
                <label for="salsa" class="form-label">Tipo de Salsa</label>
                <select class="form-select" id="salsa" name="tipoSalsa" required>
                    <option value="" disabled selected>Seleccione una opción</option>
                    <option value="mayonesa">Mayonesa</option>
                    <option value="ketchup">Ketchup</option>
                    <option value="mostaza">Mostaza</option>
                    <option value="aji">Ají</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="cantidad" class="form-label">Cantidad (U)</label>
                <input type="number" class="form-control" id="cantidad" name="cantidad" min="1" required>
            </div>
            <div class="mb-3">
                <label for="precioTotal" class="form-label">Precio Total (S/.)</label>
                <input type="number" class="form-control campo-borde" id="precioTotal" name="precioTotal" min="0" step="0.01" required>
            </div>
            <div class="mb-3">
                <label for="fecha" class="form-label">Fecha de Ingreso</label>
                <input type="date" class="form-control" id="fecha" name="fechaIngreso" required>
            </div>
            <div class="d-flex gap-2">
                <button type="submit" class="btn btn-primary">Registrar</button>
                <button type="button" class="btn btn-danger" onclick="window.history.back();">Volver</button>
            </div>
        </form>
    </div>
</body>
</html>