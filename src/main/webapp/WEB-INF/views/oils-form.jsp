<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Registrar Aceite</title>
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
        <h2 class="mb-4">Registrar Productos - Aceites</h2>
        <form action="/registro-productos/registrar" method="post">
            <input type="hidden" name="categoria" value="Aceites">
            <div class="mb-3">
                <label for="tipoAceite" class="form-label">Tipo de Aceite</label>
                <select class="form-select" id="tipoAceite" name="tipoAceite" required>
                    <option value="" disabled selected>Seleccione un aceite</option>
                    <option value="girasol">Aceite Vegetal</option>
                    <option value="soya">Aceite Industrial</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="unidad" class="form-label">Cantidad(L)</label>
                <input type="number" class="form-control" id="unidad" name="cantidad" min="1" required>
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