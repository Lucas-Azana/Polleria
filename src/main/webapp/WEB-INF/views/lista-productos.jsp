<!-- filepath: src/main/webapp/WEB-INF/views/lista-productos.jsp -->
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Lista de Productos - Pollería Gian Carlos</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
    <style>
        .table-container {
            background: white;
            border-radius: 10px;
            box-shadow: 0 0 10px rgba(0,0,0,0.1);
            padding: 20px;
        }
        .badge-categoria {
            font-size: 0.8em;
        }
    </style>
</head>
<body class="bg-light">
    <div class="container mt-4">
        <div class="row">
            <div class="col-12">
                <div class="table-container">
                    <div class="d-flex justify-content-between align-items-center mb-4">
                        <h2 class="mb-0">📋 Lista de Productos Registrados</h2>
                        <div>
                            <span class="badge bg-primary fs-6">
                                Total: ${productos.size()} productos
                            </span>
                        </div>
                    </div>
                    
                    <!-- tabla de productos -->
                    <c:choose>
                        <c:when test="${productos.size() > 0}">
                            <div class="table-responsive">
                                <table class="table table-striped table-hover">
                                    <thead class="table-dark">
                                        <tr>
                                            <th>ID</th>
                                            <th>Categoría</th>
                                            <th>Producto</th>
                                            <th class="d-none d-md-table-cell">Cantidad</th>
                                            <th>Precio</th>
                                            <th class="d-none d-lg-table-cell">F. Ingreso</th>
                                            <th class="d-none d-lg-table-cell">F. Registro</th>
                                        </tr>
                                    </thead>
                                    <tbody>
                                        <c:forEach var="producto" items="${productos}">
                                            <tr>
                                                <td class="fw-bold">${producto.id}</td>
                                                <td>
                                                    <span class="badge badge-categoria 
                                                        <c:choose>
                                                            <c:when test="${producto.categoria == 'Pollo'}">bg-warning text-dark</c:when>
                                                            <c:when test="${producto.categoria == 'Combustible'}">bg-danger</c:when>
                                                            <c:when test="${producto.categoria == 'Papas'}">bg-success</c:when>
                                                            <c:when test="${producto.categoria == 'Aceites'}">bg-info</c:when>
                                                            <c:when test="${producto.categoria == 'Condimentos'}">bg-secondary</c:when>
                                                            <c:when test="${producto.categoria == 'Guarniciones'}">bg-primary</c:when>
                                                            <c:when test="${producto.categoria == 'Salsas'}">bg-dark</c:when>
                                                            <c:otherwise>bg-light text-dark</c:otherwise>
                                                        </c:choose>
                                                    ">
                                                        ${producto.categoria}
                                                    </span>
                                                </td>
                                                <td class="fw-semibold">${producto.nombreEspecifico}</td>
                                                <td class="d-none d-md-table-cell">
                                                    <fmt:formatNumber value="${producto.cantidad}" maxFractionDigits="2"/>
                                                    <c:choose>
                                                        <c:when test="${producto.categoria == 'Pollo' || producto.categoria == 'Papas'}">kg</c:when>
                                                        <c:when test="${producto.categoria == 'Combustible'}">unidad</c:when>
                                                        <c:otherwise>unidad</c:otherwise>
                                                    </c:choose>
                                                </td>
                                                <td class="text-success fw-bold">
                                                    S/. <fmt:formatNumber value="${producto.precioTotal}" minFractionDigits="2" maxFractionDigits="2"/>
                                                </td>
                                                <td class="d-none d-lg-table-cell">
                                                    <fmt:formatDate value="${producto.fechaIngreso}" pattern="dd/MM/yyyy"/>
                                                </td>
                                                <td class="d-none d-lg-table-cell text-muted">
                                                    <fmt:formatDate value="${producto.fechaRegistro}" pattern="dd/MM/yyyy"/>
                                                </td>
                                            </tr>
                                        </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            
                            <!-- resumen -->
                            <div class="row mt-4">
                                <div class="col-md-6">
                                    <div class="card bg-light">
                                        <div class="card-body text-center">
                                            <h5 class="card-title">📊 Resumen</h5>
                                            <p class="card-text">
                                                <strong>Total de productos:</strong> ${productos.size()}<br>
                                                <strong>Valor total inventario:</strong> 
                                                <span class="text-success fw-bold">
                                                    S/. <c:set var="total" value="0"/>
                                                    <c:forEach var="p" items="${productos}">
                                                        <c:set var="total" value="${total + p.precioTotal}"/>
                                                    </c:forEach>
                                                    <fmt:formatNumber value="${total}" minFractionDigits="2" maxFractionDigits="2"/>
                                                </span>
                                            </p>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </c:when>
                        <c:otherwise>
                            <!-- mensaje cuando no hay productos -->
                            <div class="text-center py-5">
                                <div class="mb-4">
                                    <i class="fas fa-inbox fa-4x text-muted"></i>
                                </div>
                                <h4 class="text-muted">No hay productos registrados</h4>
                                <p class="text-muted mb-4">Comienza registrando tu primer producto</p>
                                <a href="${pageContext.request.contextPath}/registro-productos/" class="btn btn-primary">
                                    📝 Registrar Producto
                                </a>
                            </div>
                        </c:otherwise>
                    </c:choose>
                    
                    <!-- botones de accion -->
                    <div class="d-flex flex-column flex-md-row gap-2 mt-4">
                        <a href="${pageContext.request.contextPath}/registro-productos/" class="btn btn-secondary">
                            ← Volver al Menú
                        </a>
                        <a href="${pageContext.request.contextPath}/registro-productos/" class="btn btn-success">
                            ➕ Registrar Nuevo
                        </a>
                        <button onclick="window.print()" class="btn btn-outline-primary">
                            🖨️ Imprimir
                        </button>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>