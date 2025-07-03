<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <title>Ingreso de Guarniciones</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .form-control,
        .form-select {
            border: 1px solid #000 !important;
        }
        .form-control:focus,
        .form-select:focus {
            border: 2px solid #000 !important;
            box-shadow: none;
        }
    </style>
</head>
<body class="bg-light">
    <div class="container mt-5">
        <h2 class="mb-4">Registrar Productos - Guarniciones</h2>
        <form action="/registro-productos/registrar" method="post">
            <input type="hidden" name="categoria" value="Guarniciones">
            
            <div class="mb-3">
                <label for="tipoGuarnicion" class="form-label">Tipo de Guarnición</label>
                <select class="form-select" id="tipoGuarnicion" name="tipoGuarnicion" required>
                    <option value="" selected disabled>Seleccione una opción</option>
                    <option value="verduras">Verduras</option>
                    <option value="arroz">Arroz</option>
                </select>
            </div>
            <div class="mb-3">
                <label for="cantidad" class="form-label">Cantidad (kg)</label>
                <input type="number" class="form-control" id="cantidad" name="cantidad" min="0" step="0.01" required>
            </div>
            <div class="mb-3">
                <label for="fechaIngreso" class="form-label">Fecha de ingreso</label>
                <input type="date" class="form-control" id="fechaIngreso" name="fechaIngreso" required>
            </div>
            <div class="mb-3">
                <label for="precioTotal" class="form-label">Precio total</label>
                <input type="number" class="form-control" id="precioTotal" name="precioTotal" min="0" step="0.01" required>
            </div>
            <div class="d-flex justify-content-start gap-2">
                <button type="submit" class="btn btn-primary">Registrar</button>
                <button type="button" class="btn btn-danger" onclick="window.history.back();">Volver</button>
            </div>
        </form>
    </div>
</body>
</html>