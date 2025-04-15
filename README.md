pour lancer l'application : 

dans un terminal au niveau de la racine du projet : sofwayMedicalProject
1- faire un : mvn clean package  (afin de recuperer les dependances)
2- faire un : ./mvnw spring-boot:run  (pour lancer l'application)

le project comprend : 

un Service ou il y a la logique metier
un Controller Rest pour appeller l'Endpoint : localhost://8080/display/{indexSante} par exemple localhost://8080/display/33  va retourné un abojet JSON { 	indexHealth	33, service	"Cardiologie" }
un model contenant la class ResultPatient
un TU : ServiceTest

et un DemoApllication qui permet de lancer l'application et qui traite un exemple du service

