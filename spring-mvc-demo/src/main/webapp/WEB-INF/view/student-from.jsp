<%@ taglib prefix ="form"  uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
        <title>Student Registation From</title>
</head>
<body>
     <form:form action = "processFrom"  modelAttribute="student" >
     
     First name : <form:input path="firstName"/>
     
     <br><br>
     
     Last name : <form:input path="lastName"/>
      
     <br><br>
     
     Country :
     <form:select path = "country">
        <form:options iteams ="${student.countryOptions}"/>
     </form:select>
     
     <br><br>
     <input type ="submit" value="submit">
     
     </form:form>
     

</body>
</html>