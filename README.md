# OrangeHRMlive
This project consists of login validations
here i have used testng framework,maven for dependancy management,utils for screenshots and extent report for failures
the project design ia as follows 
src/main/java >> page >> loginpage.java >> a page repository as of Page object model used to store address of webelements.
src/test/java >> Base >> BaseTest.java >> consists of base class for opening and closing the application, also used method to setup extent report,method calling for screenshot upon failure
src/test/java >> Tests >> consists of testruns for testcase execution
src/test/java >> Utils >> extentreportmanager.java >> for handling extent reports
src/test/java >> Utils >> ScreenshotUtils.java >> for taking screenshot upon failure
test-output >> consists of screenshots folder with screenshots of failures and extentreport.html file with the detailed report on the failures.
