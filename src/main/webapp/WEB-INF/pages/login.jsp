<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<body>

<form action="resultPage" method="get">

    <div> А ты платишь налоги? </div>
    <br>
    <div>
        <img src="resources/images/somepic.jpg" alt="picture">
    </div>
    <input type="radio" name="answer" value="Option 1"> Да <br>
    <input type="radio" name="answer" value="Option 2"> Да <br>
    <input type="radio" name="answer" value="Option 3"> Да <br>
    <input type="radio" name="answer" value="Option 4"> Да <br>
    <br>
    <input type="submit" value="Следующий">
</form>

</body>
</html>