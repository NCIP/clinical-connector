Prerequisites:

-          caGrid

-          Globus

-          Ant

-          caGrid Installer 1.1 (if deploying using GUI)

 

Steps

 

1)      Copy 

 

\\Nci6116g.nci.nih.gov\group\NCICB\Ekagra\Vijay\DCAPI

Or 

L:\NCICB\Ekagra\Vijay\DCAPI folder to C: on your computer.

 

2)      Checkout C3DGridService from CVS

3)      Go to Command Prompt in folder .\C3DGridService

4)      Type ‘ant deployTomcat’ to deploy the service in Tomcat.

5)      Start Tomcat

6)      In web browser verify http://localhost:8080/wsrf/services/cagrid/C3DGridService url exists

7)      In Command prompt in folder .\C3DGridService

8)      Type ‘ant runClient –Dservice.url=http://localhost:8080/wsrf/services/C3DGridService’ to test the grid service functionality.

