<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Promo</title>
<link rel="stylesheet" href="./css/main.css" />
<link rel="stylesheet" href="./css/bootstrap.css" />
</head>
<body>
            <section class="container">
                <div>
                    <form action="ServletPromoAjouter">
                        <div class="form-group row">
     
                        	<label for="nomSession">nomSession</label>
                        	<input id="nomSession" class="form-control" placeholder="Entrer nomSession" type="text" name="nomSession" value="${nomSession}" required/>
                        </div>

                        <div class="form-group row">
                        	<label for="effectif">Effectif</label>
                        	<input id="effectif" class="form-control" placeholder="Entrer effectif" type="number" name="effectif" value="${effectif}" required/>
  						</div> 
						<div>
                            
                            <button type="submit" name="ajouter" >Valider</button>

						</div>
						<div>
                            
                            <button type="submit" name="modifier" >Modifier</button>

						</div>
	
					</form>
				</div>
            </section>
            <section class="container">
            <h2> Liste des Promo en BDD</h2>
            	<table class = "table">
            		<thead>
            		<tr>
            			<th>ID</th>
            			<th>NomSession</th>
            			<th>Effectif</th>
            			<th>SUPPRIMER</th>
            		</tr>
            		</thead>
            		<tbody>
            		<c:if test="${! empty promo}">
            			<c:forEach items="${promo}" var="x">
            			<tr>
            				<td><c:out value="${x.idPromo}"/></td>
            				<td><c:out value="${x.nomSession}"/></td>
            				<td><c:out value="${x.effectif}"/></td>
            				<td><a href="ServletPromoSupprimer?idPromo=${x.idPromo}">Supprimer</a></td>
            			</tr>
            			</c:forEach>
            			</c:if>
            		</tbody>
            	</table>
            </section>
</body>
</html>