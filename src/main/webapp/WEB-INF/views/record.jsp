<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Polleria Gian Carlos - Ingreso de Productos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container py-4">
        <h1 class="mb-5 text-center">Registro de Ingresos</h1>
        <div class="row row-cols-1 row-cols-md-3 g-5">
            <div class="col">
                <div class="card h-100 text-center">
                    <div class="d-flex justify-content-center align-items-center" style="height: 140px;">
                        <img src="${pageContext.request.contextPath}/img/pollo.png" class="card-img-top mx-auto" alt="Pollo" style="width:100px; height:100px; object-fit:contain;">
                    </div>
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/registro-productos/chicken-form" class="btn btn-primary">Registrar Pollo</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card h-100 text-center">
                    <div class="d-flex justify-content-center align-items-center" style="height: 140px;">
                        <img src="${pageContext.request.contextPath}/img/combustible.png" class="card-img-top mx-auto" alt="Combustibles" style="width:100px; height:100px; object-fit:contain;">
                    </div>
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/registro-productos/fuel-form" class="btn btn-primary">Registrar Combustibles</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card h-100 text-center">
                    <div class="d-flex justify-content-center align-items-center" style="height: 140px;">
                        <img src="${pageContext.request.contextPath}/img/papas.png" class="card-img-top mx-auto" alt="Papas" style="width:100px; height:100px; object-fit:contain;">
                    </div>
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/registro-productos/potatoes-form" class="btn btn-primary">Registrar Papas</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card h-100 text-center">
                    <div class="d-flex justify-content-center align-items-center" style="height: 140px;">
                        <img src="${pageContext.request.contextPath}/img/aceites.png" class="card-img-top mx-auto" alt="Aceites" style="width:100px; height:100px; object-fit:contain;">
                    </div>
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/registro-productos/oils-form" class="btn btn-primary">Registrar Aceites</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card h-100 text-center">
                    <div class="d-flex justify-content-center align-items-center" style="height: 140px;">
                        <img src="${pageContext.request.contextPath}/img/condimentos.jpg" class="card-img-top mx-auto" alt="Condimentos" style="width:100px; height:100px; object-fit:contain;">
                    </div>
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/registro-productos/condiments-form" class="btn btn-primary">Registrar Condimentos</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card h-100 text-center">
                    <div class="d-flex justify-content-center align-items-center" style="height: 140px;">
                        <img src="${pageContext.request.contextPath}/img/guarniciones.png" class="card-img-top mx-auto" alt="Guarniciones" style="width:100px; height:100px; object-fit:contain;">
                    </div>
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/registro-productos/fittings-form" class="btn btn-primary">Registrar Guarniciones</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card h-100 text-center">
                    <div class="d-flex justify-content-center align-items-center" style="height: 140px;">
                        <img src="${pageContext.request.contextPath}/img/salsas.jpg" class="card-img-top mx-auto" alt="Salsas" style="width:100px; height:100px; object-fit:contain;">
                    </div>
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/registro-productos/sauces-form" class="btn btn-primary">Registrar Salsas</a>
                    </div>
                </div>
            </div>
            <div class="col">
                <div class="card h-100 text-center">
                    <div class="d-flex justify-content-center align-items-center" style="height: 140px;">
                        <img src="${pageContext.request.contextPath}/img/desechables.jpg" class="card-img-top mx-auto" alt="Desechables" style="width:100px; height:100px; object-fit:contain;">
                    </div>
                    <div class="card-body">
                        <a href="${pageContext.request.contextPath}/registro-productos/utensils-disposables-form" class="btn btn-primary">Registrar Utensilios y Desechables</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <div class="text-center mt-3">
        <a href="${pageContext.request.contextPath}/destino" class="btn btn-danger">Volver</a>
    </div>
</body>
</html>