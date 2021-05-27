						 **Traffic Offence Microservice **
						-----------------------------

This repo is for a spring boot App is a solution for catching previous traffic light violators.  A cameras fixed at a traffic light reads the vehicle number plates stopped at traffic lights and sends the list of vehicle no.s along with traffic signal details to traffic-offenders microservice. Traffic-offenders microservice looks up the data base of offenders. If any vehicle with pending fines is found, it informs the police standing at the traffic using an SMS. The application uses Twilio to send messages.
The police personal when reaches a traffic signal, he enrols with the application for SMS notification along with the traffic signal details .

Postman export is also included along with the project. 

#### Design:
The design has 2 microservices:
**TrafficAffence microservice**: For interacting with the application in traffic light. This application receives an API call with the list of vehicles stopped at the signal lights. The microservice scans it's data base to find if any of the vehicles have a pending fine. If yes, it calls the Notification microservice to send notification to the police at the traffic signal. 
**Notification Microservice**: As soon as a police reaches a traffic signal, he registers with the notification microservice to receive notification. When the first microservice finds any violating vehicle number, it requests notification microservice to send a sms to the police at the traffic signal with vehicle no. and pending fine details. Notification microservice uses Twilio's free account to send sms. 

#### Instructions to run the application:
The application is tested on a mac OS. 

*Requirements*:  Make sure below softwares are installed on your system.
	- [JDK 11](https://www.oracle.com/in/java/technologies/javase-jdk11-downloads.html) 
	- [Maven](https://maven.apache.org/download.cgi)
	- [Git](https://git-scm.com/book/en/v2/Getting-Started-Installing-Git)
	
#### Pending work or TO-DOs:
	- There are some secret keys used in the application. For example, Twilio key of which are hard coded. This needs to be made configurable and moved out in a secure place. Preferably as an environment variable.
	- Test cases are not written. 
	- Exception handling needs to be enhanced to present the exception in a user friendly way. 




