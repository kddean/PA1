# PA1

Belongs to Khadeidre Dean

Username: root
Password: cake

Run HomePage.html on Server to start.


Mysql isn't working.
This was the first error I was getting:
SQLException: No suitable driver found for jdbc:mysql://localhost/HRS?user=root&password=cake
SQLState: 08001
VendorError: 0
Mar 05, 2016 11:05:42 PM org.apache.catalina.core.StandardWrapperValve invoke
SEVERE: Servlet.service() for servlet [HRS] in context with path [/Hotel_Reservation_System] threw exception
java.lang.NullPointerException

Then I changed the path to "jdbc:mysql://localhost:8080/HRS?" instead of "jdbc:mysql://localhost/HRS?"

Now I get this error:

SEVERE: Servlet.service() for servlet [HRS] in context with path [/Hotel_Reservation_System] threw exception
java.lang.NullPointerException at HRS.doPost(HRS.java:116)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:648)
	at javax.servlet.http.HttpServlet.service(HttpServlet.java:729)