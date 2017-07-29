<%@page import="java.util.Base64"%>
<%@page import="com.sv.udb.controlador.PersCtrl"%>
<%@page import="com.sv.udb.modelo.Pers"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ID CARD</title>
        <link rel='stylesheet' href='webjars/Materialize/0.96.0/dist/css/materialize.min.css'>
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <script type="text/javascript" src="webjars/jquery/2.1.4/jquery.min.js"></script>
        <script type="text/javascript" src="webjars/Materialize/0.96.0/dist/js/materialize.min.js"></script>
        <meta name='viewport' content='width=device-width, initial-scale=1.0'/>
    </head>
    <body>
       <div class="row container z-depth-5">
            <h1 class="col s12 m6 offset-m3">${mensAler}</h1>
            <form method="POST" action="PersServ" name="Demo" class="col s12 m6 offset-m3" enctype="multipart/form-data">
                <div class="col s12 m6">
                    <div class="input-field col s12">
                        <input readonly type="text" name="codi" id="codi" value="${codi}" class="validate">
                        <label for="codi">Código</label>
                    </div>
                </div>
            <label>Nombre:&ensp;&ensp;&ensp; </label><input type="text" name="nomb" id="nomb" value="${nomb}"><br>
            <label>Descripción: </label><input type="text" name="desc" id="desc" value="${desc}"><br>
            <div class="file-field input-field">
                <div class="btn">
                  <span><i class="material-icons">image</i></span>
                  <input type="file" id="imag" name="imag" value="${imag}">
                </div>
                <div class="file-path-wrapper">
                  <input class="file-path validate" type="text">
                </div>
            </div>
            <input ${estGuar} type="submit" name="btonPers" value="Guardar">
            <input ${estModi} type="submit" name="btonPers" value="Modificar">
        </form>
        <h1 class="col s12 m6 offset-m3">La Tabla</h1>
        `<form method="POST" action="PersServ" name="Tabl" class="col s12 m6 offset-m3">
            <table class="highlight" border="1" width="500">
            <tr>
                <th>Cons</th>
                <th>Nombre</th>
                <th>Descripción</th>
                <th>Logo</th>
            </tr>
            <%
                for(Pers temp : new PersCtrl().consTodo())
                {  
            %>
            <tr>
                <td><p><input type="radio" name="codiPersRadi" class='with-gap' id="<%=temp.getCodiPers()%>" value="<%=temp.getCodiPers()%>"><label for="<%=temp.getCodiPers()%>"></label></p></td>
                <td><%=temp.getNombPers()%></td>
                <td><%=temp.getApelPers()%></td>
            </tr>
            <%
                }
            %>
        </table>
        <input type="submit" name="btonPers" value="Consultar">
        <input ${estElim} type="submit" onclick="return confirm('¿Desea proceder con la actualización del registro?');" name="btonPers" value="Eliminar">
        <input type="submit" name="btonPers" value="Nuevo">
        </form>
        </div>
    </body>
</html>