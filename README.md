## How to run
> Tested on Springboot 3.2.0, maven 3.6.1, java 17

```
cd heapmate/heapmate
mvn clean install
java -jar target/heapmate-<version>.jar
```
### example of call
```sh
curl -X POST \
  'http://localhost:8080/memory/allocate?value=82345
```
