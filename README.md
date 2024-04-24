# ParkingSystem

### System Preparation

1º Run the command:
```
mvn clean install
```
2º Run the command:
```
mvn clean compile
```


3º Run command to go up Server in terminal separete:
``` 
mvn exec:java -Dexec.mainClass="com.smartparking.server.ParkingSystemServer" 
```
``` 
mvn exec:java -Dexec.mainClass="com.smartparking.server.FinanceSystemServer" 
```
``` 
mvn exec:java -Dexec.mainClass="com.smartparking.server.VancancyManagementServer" 
```

