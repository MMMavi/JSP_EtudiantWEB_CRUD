<%-- 
    Document   : Etudiant
    Created on : Jun 21, 2023, 9:26:46 AM
    Author     : user
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
 
           <form action = "EtudiantController" method="POST"> 
            <table>
                <tr>
                    <td>
                        Id<input type="text" name ="id1"  value="${x.id}"  readonly>
                    </td>
                </tr>
                <tr>
                    <td>
                        Name <input type="text" name ="name1" value=${x.name}>
                    </td>        
                </tr>
                <tr>  
                <td> </td>
                    <td>
                       <input type="submit" value ="save">
                    </td>
                </tr>
                <tr>  
                <td> </td>
                    <td>
                       <input type="submit" value ="delete">
                    </td>
                </tr>
                <tr>  
                <td> </td>
                    <td>
                       <input type="submit" value ="update">
                    </td>
                </tr>
            </table>
            
                    <input type="text" name ="act" value="miseAjour" hidden>
            
        </form>
        
        
    </body>
</html>
