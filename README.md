#Docker commands to build image and run

Create JAR file using gradle
```
./gradlew build
```

Build image
```
docker build -t <any-image-name> .
```

Run container
```
 docker run -p 8080:8080 -t <any-image-name>
```