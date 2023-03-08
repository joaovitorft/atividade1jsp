<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
          pageEncoding="ISO-8859-1"%>
      <html>
        <head>
         <title>Cadastro de Usuários</title>
        </head>
        <body>
         <form action="cadastraUsuario">
           <h1>Cadastro de Usuários no Sistema</h1>
        <table>
            <tr>
             <td>Nome:</td>
              <td><input name="nome"></td>
            </tr>
           <tr>
             <td>Endereço:</td>
           <td><input name="endereco"></td>
           </tr>
           <tr>
            <td>
                <input type="submit" value="Salvar">
            </td>
           </tr>
         </table>
      </form>
        </body>
      </html>