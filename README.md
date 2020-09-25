# customer-transaction
1. add eureka server for microservice host;
2. test using postman
3. first run /users/signup with body {"username":"admin","password":"admin", "email":"admin@test", "roles":["ROLE_ADMIN"]}
4. run /users/signin?username=admin&password=admin
5. copy the generated token
6. try running /customer/transation/12345
