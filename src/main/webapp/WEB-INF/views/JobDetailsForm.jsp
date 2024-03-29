<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Job Form</title>
</head>
<body>

    <form action="processJobForm" method="post">
        <!-- Job Information -->
        <label for="jobName">Job Name:</label>
        <input type="text" name="jobName" required><br><br>

        <label for="expReq">Experience Required:</label>
        <input type="text" name="expReq" required><br><br>

        <label for="location">Location:</label>
        <input type="text" name="location" required><br><br>

        <label for="postedAgo">Posted Ago:</label>
        <input type="text" name="postedAgo" required><br><br>

        <!-- Other Information -->
        <label for="noOfApplicant">Number of Applicants:</label>
        <input type="number" name="noOfApplicant" required><br><br>

        <label for="jobDesc">Job Description:</label>
        <textarea name="jobDesc" required></textarea><br><br>

        <label for="role">Role:</label>
        <input type="text" name="role" required><br><br>

        <label for="industryType">Industry Type:</label>
        <input type="text" name="industryType" required><br><br>

        <label for="department">Department:</label>
        <input type="text" name="department" required><br><br>

        <label for="empType">Employment Type:</label>
        <input type="text" name="empType" required><br><br>

        <label for="roleCategory">Role Category:</label>
        <input type="text" name="roleCategory" required><br><br>

        <label for="education">Education:</label>
        <input type="text" name="education" required><br><br>

        <label for="keySkills">Key Skills:</label>
        <input type="text" name="keySkills" required><br><br>

        <label for="salRangeMin">Salary Range (Min):</label>
        <input type="number" name="salRangeMin" required><br><br>

        <label for="salRangeMax">Salary Range (Max):</label>
        <input type="number" name="salRangeMax" required><br><br>

        <label for="workMode">Work Mode:</label>
        <input type="text" name="workMode" required><br><br>

        <label for="compType">Company Type:</label>
        <input type="text" name="compType" required><br><br>

        <label for="compId">Company ID:</label>
        <input type="number" name="compId" required><br><br>

        <!-- Submit Button -->
        <input type="submit" value="Submit">
    </form>

</body>
</html>
