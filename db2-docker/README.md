# db2-docker
---

앞서 설명드린 사이트에서 db2-docker 를 실행시키기 위한 스크립트를 start.sh 에 옮겨놓았습니다.

```
docker run \
 --name db2 \
 -p 50000:50000 \
 -e DB2INST1_PASSWORD=db2inst1-pwd \
 -e LICENSE=accept \
 -d ibmcom/db2express-c db2start

```

그런 다음 아래와 같은 작업을 합니다.

```
> docker exec -i -t db2 /bin/bash
> su - db2inst1
> db2 create db hibern8
```

데이터 베이스가 만들어지면, db2를 이용해 쿼리를 할 수 있습니다.

db2-test 스프링 프롤젝트의 프로그램을 돌려서 데이터를 넣습니다.
그런 다음 다음과 같이 쿼리를 하면 데이터들이 나옵니다.

```
> db2 connect to hibern8
> db2 "select * from tbl_person"
```

