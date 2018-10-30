docker run \
 --name db2 \
 -p 50000:50000 \
 -e DB2INST1_PASSWORD=db2inst1-pwd \
 -e LICENSE=accept \
 -d ibmcom/db2express-c db2start

