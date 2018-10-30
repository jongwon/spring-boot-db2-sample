# spring-boot-db2-sample
---
DB2 데이터 베이스에 접속하는 spring boot jpa 샘플입니다.

먼저 DB2 데이터 베이스를 준비해야 합니다. 

* DB2 인스턴스가 없다면, db2-express-c docker 를 설치하는 것이 좋습니다.
* docker site : https://hub.docker.com/r/ibmcom/db2express-c/
* 설치후 작업해야 할 설명을 잘 설명한 사이트 : https://vladmihalcea.com/how-to-install-db2-express-c-on-docker-and-set-up-the-jdbc-connection-properties/
* 이 사이트의 내용을 따라하시면 됩니다.


DB 인스턴스는 위 사이트에서 설명한 대로 hibern8 로 만들고 spring jpa 로 db2에 접근하는 것은 db2-test 의 스프링 프로젝트를 참고하십시오.
