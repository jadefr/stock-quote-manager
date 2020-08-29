# stock-quote-manager

## Estrutura Base
      
      src
        ├── java
        |    ├── client
        |    |  └── StockManagerClient.java 
        |    |
        |    ├── controller
        |    |  └── StockQuotesController.java 
        |    |
        |    ├── dto
        |    |  └── StockQuotesDTO.java 
        |    |
        |    ├── model
        |    |  └── StockQuotes.java 
        |    |  
        |    ├── repository
        |    |  └── StockQuotesRepository.java
        |    |       
        |    ├── service
        |    |  └── StockQuotesService.java 
        |    |
        |    └──StockQuotesApiApplication.java
        |  
        └── resources 
        |     └── application.properties
        └── Dockerfile 


## API

| HTTP  | Métodos do Controller | URI | Parâmetros |
| ------------- | ------------- | ------------- | ------------- | 
| GET  | getAllStockQuotes  | localhost:8081/stock-quotes/  | |
| GET  | getById  | localhost:8081/stock-quotes/{id}  | |
| POST  | addCity  | localhost:8081/stock-quotes/primeira-etapa  | |
| POST  | addStockQuotes  | localhost:8081/stock-quotes  | |


## application.propertie
  
            ## Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
		spring.datasource.url=jdbc:mysql://192.168.99.100:3306/bootdb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
		spring.datasource.username=root
		spring.datasource.password=root
		spring.batch.initialize-schema=ALWAYS
		spring.batch.job.enabled=false

		# Dialeto SQL para melhorar o SQL gerado pelo Hibernate
		spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL5InnoDBDialect

		# Hibernate ddl auto (create, create-drop, validate, update)
		spring.jpa.hibernate.ddl-auto=update

		server.port=8081

		eureka.client.register-with-eureka=false
		eureka.client.fetch-registry=false
