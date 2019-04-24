<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Stagiaire</title>
<link rel="stylesheet" href="./css/main.css" />
<link rel="stylesheet" href="./css/bootstrap.css" />
</head>
<body>
            <section class="container">
                <div>
                    <form action="ServletStagiaireAjouter">
                        <div class="form-group row">
     
                        	<label for="prenom">Prenom</label>
                        	<input id="prenom" class="form-control" placeholder="Entrer prenom" type="text" name="prenom" value="${prenom}" required/>
                        </div>
                        <div class="form-group row">
                        	<label for="nom">Nom</label>
                        	<input id="nom" class="form-control" placeholder="Entrer nom" type="text" name="nom" value="${nom}" required/>
                        </div>
                        <div class="form-group row">
                        	<label for="age">Age</label>
                        	<input id="age" class="form-control" placeholder="Entrer age" type="number" name="age" value="${age}" required/>
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
            <h2> Liste des Stagiaires en BDD</h2>
            	<table class = "table">
            		<thead>
            		<tr>
            			<th>ID</th>
            			<th>Nom</th>
            			<th>Prénom</th>
            			<th>Age</th>
            			<th>SUPPRIMER</th>
            		</tr>
            		</thead>
            		<tbody>
            		<c:if test="${! empty stagiaire}">
            			<c:forEach items="${stagiaire}" var="x">
            			<tr>
            				<td><c:out value="${x.idStagiaire}"/></td>
            				<td><c:out value="${x.nom}"/></td>
            				<td><c:out value="${x.prenom}"/></td>
            				<td><c:out value="${x.age}"/></td>
            				<td><a href="ServletStagiaireSupprimer?idStagiaire=${x.idStagiaire}">Supprimer</a></td>
            			</tr>
            			</c:forEach>
            			</c:if>
            		</tbody>
            	</table>
            </section>
</body>
</html>