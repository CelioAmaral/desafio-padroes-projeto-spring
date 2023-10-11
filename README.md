# desafio-padroes-projeto-spring
Desafio Explorando Padrões de Projetos na Prática com Java/SpringBoot

Repositório com as implementações dos padrões de projeto explorados no Lab "Explorando Padrões de Projetos na Prática com Java". 
Especificamente, este projeto explorou alguns padrões usando o Spring Framework, são eles:
- Singleton: @Bean e @Autowired;
- Strategy/Repository: @Service e @Repository;
- Facade: construção de uma API REST com o mesmo objetivo desse padrão, abstrair a complexidade das seguintes integrações: Spring Data JPA e ViaCEP (Feign).
Spring Data JPA em memória (usando o "H2").

Obs: O Java EE passou da tutela da Oracle para a Eclipse Foundation ( Jakarta EE ), com isso os imports do Java EE (javax.servlet) foram substituídos pelo novo Jakarta EE.

### Configuração do Banco de Dados H2
### Caso não utilize o OpenAPI, e opte pelo Postman/Insomnia

```
# H2 Connection
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.drverClassName=org.h2.Driver
spring.datasource.username=admin
spring.datasource.password=admin
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.h2.console.enabled=true
```

### Acesso:
localhost:8080/h2-console

![img1](https://github.com/CelioAmaral/desafio-padroes-projeto-spring/blob/main/src/main/resources/img/design_patterns.png)

## 👨🏽‍💻 Desafio Realizado por:

<img src="https://avatars.githubusercontent.com/u/85323953?v=4" width="100px;" alt="foto do desenvolvedor"/>

- [@CelioAmaral](https://github.com/CelioAmaral)

<sup>Systems Analyst</sup>
</br>

<div>
  <a href="https://www.linkedin.com/in/celioamaral20" target="_blank"><img align="center" alt="Celio-Link" height="30" width="90" src="https://img.shields.io/badge/-LinkedIn-%230077B5?style=flat&logo=linkedin&logoColor=white" target="_blank"></a> 
</div>
