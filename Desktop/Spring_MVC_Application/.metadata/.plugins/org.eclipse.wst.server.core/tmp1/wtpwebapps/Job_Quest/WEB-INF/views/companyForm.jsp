<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Company Information Form</title>
</head>
<body>
    <h2>Company Information Form</h2>
    <form action="CompanyRegistrationServlet" method="post">
        <label for="compName">Company Name:</label>
        <input type="text" id="compName" name="compName"><br><br>
        
        <label for="compDesc">Company Description:</label>
        <textarea id="compDesc" name="compDesc"></textarea><br><br>
        
        <label for="tag1">Tag 1:</label>
        <input type="text" id="tag1" name="tag1"><br><br>
        
        <label for="tag2">Tag 2:</label>
        <input type="text" id="tag2" name="tag2"><br><br>
        
        <label for="tag3">Tag 3:</label>
        <input type="text" id="tag3" name="tag3"><br><br>
        
        <label for="tag4">Tag 4:</label>
        <input type="text" id="tag4" name="tag4"><br><br>
        
        <label for="compVideoUrl">Company Video URL:</label>
        <input type="text" id="compVideoUrl" name="compVideoUrl"><br><br>
        
        <label for="compTagLine">Company Tagline:</label>
        <input type="text" id="compTagLine" name="compTagLine"><br><br>
        
        <label for="compWebsiteUrl">Company Website URL:</label>
        <input type="text" id="compWebsiteUrl" name="compWebsiteUrl"><br><br>
        
        <label for="foundedAt">Founded At:</label>
        <input type="text" id="foundedAt" name="foundedAt"><br><br>
        
        <label for="compType">Company Type:</label>
        <input type="text" id="compType" name="compType"><br><br>
        
        <label for="compHeadquaters">Company Headquarters:</label>
        <input type="text" id="compHeadquaters" name="compHeadquaters"><br><br>
        
        <label for="compRating">Company Rating:</label>
        <input type="number" id="compRating" name="compRating"><br><br>
        
        <label for="noOfFollower">Number of Followers:</label>
        <input type="number" id="noOfFollower" name="noOfFollower"><br><br>
        
        <label for="compBannerImg">Company Banner Image:</label>
        <input type="file" id="compBannerImg" name="compBannerImg"><br><br>
        
        <label for="compPosterImg">Company Poster Image:</label>
        <input type="file" id="compPosterImg" name="compPosterImg"><br><br>
        
        <input type="submit" value="Submit">
    </form>
</body>
</html>
