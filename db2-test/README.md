# db2-test 스프링 부트 샘플
---

스프링 부트 JPA 를 이용해 DB2 데이터 베이스에 대한 기본적인 테스트를 하기 위한 샘플 프로젝트 입니다.

먼저 pom.xml 파일에서 db2jcc4 드라이버는 10.1 버전을 사용했습니다.
```
      <dependency>
         <groupId>com.ibm.db2.jcc</groupId>
         <artifactId>db2jcc4</artifactId>
         <version>10.1</version>
      </dependency>
```

다른 버전은 별도로 repository 를 설정해야 하기 때문에 번거롭습니다.

jpa 는 가장 간단한 Person 객체를 DB에 넣어주는 코드만 작성을 했습니다.
데이터 조회는 docker 를 통해 직접 db2 클라이언트 툴로 쿼리를 해볼 수 있습니다.

주의해야 했던 점은 
* application.yml 에서 generate-ddl 을 초기에 true 로 설정하고 테이블을 먼저 만들어야 합니다. 그렇지 않으면 SQL 오류가 납니다.
* database-platform 옵션이나 naming-strategy 옵션은 반드시 필요한 건 아니니, 필요에 따라 삭제해도 됩니다. 

```
spring:
  datasource:
    url: jdbc:db2://127.0.0.1:50000/hibern8
    username: "db2inst1"
    password: "db2inst1-pwd"
    driverClassName: com.ibm.db2.jcc.DB2Driver
    testWhileIdle: true
    validationQuery: SELECT 1
  jpa:
    show-sql: true
    generate-ddl: false
    database-platform: DB2Platform
    hibernate:
      ddl-auto: none
      naming-strategy: org.hibernate.cfg.ImprovedNamingStrategy
    properties:
      hibernate:
        dialect: org.hibernate.dialect.DB2Dialect
```

