<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Formation</title>
<link rel="stylesheet" href="./css/main.css" />
<link rel="stylesheet" href="./css/bootstrap.css" />
</head>
<body>
            <section class="container">
                <div>
                    <form action="ServletFormationAjouter">
                        <div class="form-group row">
     
                        	<label for="nomFormation">nomFormation</label>
                        	<input id="nomFormation" class="form-control" placeholder="Entrer nomFormation" type="text" name="nomFormation" value="${nomFormation}" required/>
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
            <h2> Liste des Formation en BDD</h2>
            	<table class = "table">
            		<thead>
            		<tr>
            			<th>ID</th>
            			<th>NomFormation</th>
            			<th>SUPPRIMER</th>
            		</tr>
            		</thead>
            		<tbody>
            		<c:if test="${! empty formation}">
            			<c:forEach items="${formation}" var="x">
            			<tr>
            				<td><c:out value="${x.idFormation}"/></td>
            				<td><c:out value="${x.nomFormation}"/></td>
            				<td><a href="ServletFormationSupprimer?idFormation=${x.idFormation}">Supprimer</a></td>
            			</tr>
            			</c:forEach>
            			</c:if>
            		</tbody>
            	</table>
            </section>
</body>
</html>