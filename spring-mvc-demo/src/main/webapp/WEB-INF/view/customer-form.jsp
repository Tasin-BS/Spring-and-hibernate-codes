<%@ taglib prefix ="form"  uri="http://www.springframework.org/tags/form" %>
<html>

<head>
    <title>Customer Registration Form</title>
    
    <style>
       .error{color.red}
    </style>
</head>

<body>
   <form:form action = "processForm"  modelAttribute ="customer">
      First name: <form:input path = "firstname"/>
      <br><br>
      
      Last name(*): <form:input path= "lastname" value = "NOT NULL"/> 
      <form:errors path= "lastname"  cssClass = "error"/>
      
      <br><br>
      
      <input type = "submit" value = "submit" />
   
   </form:form>

</body>


</html> 