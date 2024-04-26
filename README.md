# ParkingSystem

### System Preparation

#### 1º Run the command:
```
mvn clean install
```
#### 2º Run the command:
```
mvn clean compile
```


#### 3º Run command to go up Server in terminal separete into project:

Server Parking Gatway
``` 
mvn exec:java -pl ParkingSystemManagement -Dexec.mainClass="com.smartparking.server.ParkingSystemServer" 
```

Server Finance
``` 
mvn exec:java -pl FinanceSystem -Dexec.mainClass="com.smartparking.server.FinanceSystemServer" 
```

Server Vancancy
``` 
mvn exec:java -pl VancacyManagement -Dexec.mainClass="com.smartparking.server.VancancyManagementServer"
```

Client Command Option
```
mvn exec:java -pl ParkingSystemManagement -Dexec.mainClass="com.smartparking.client.ParkingSystemManagementClient"
```