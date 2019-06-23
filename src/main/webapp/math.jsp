<%--
  Created by IntelliJ IDEA.
  User: romanv.
  Date: 2019-05-31
  Time: 17:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<div style="display: flex; flex-direction: column; justify-content: center">
    <h1>Result of division 59 •/• 892.21 is:</h1>
    <h1>${name}</h1>
    <div>-------------------</div>
    <div>-------------------</div>
    <div>-------------------</div>
    <div>-------------------</div>
    <div>-------------------</div>
    <div>-------------------</div>
    <div>file input test... in progress</div>
    <form>
        <input type="file" name="file input" title="choose file">
    </form>

    <form action = "UploadServlet" method = "post"
          enctype = "multipart/form-data">
        <input type = "file" name = "file" size = "50" />
        <br />
        <input type = "submit" value = "Upload File" />
    </form>

</div>
</body>
</html>
