# ScreenScrapping
This project is used for fetching the details of the open classes from ASU website

#Installation Steps.

1. This project runs with the jSessionId and if the jSessionId gets changed, then it needs to be updated in the code. 
2. Open CheckClass.java and provide your jSessionID in line number 39.
3. Currently this code fetches the classes based on the days Mon, Tue, Wed, Thu, Fri. If you need to include more search conditions update the search condition in url in CheckClass.java
4. This code checks for the open classes based on the names. You could include your subject names as in line number 160.
5. If there is an open seat in that course an output is printed in the console. 

#Future word:
1. Including the other search conditons and user can provide the search conditon through system input.
2. Instead of using jSessionId, check for a better authentication like using a token for authentication every time. 
3. Added it to a Cron job scheduler so that it could run on a server and send notifications to mobile as sms or email. 
4. Apart from sending notifications make changes such that this system registers when the subject is open by swapping with the course in your bucket. 
