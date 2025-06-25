## Running Database and other services locally 
Install Docker and make sure it is running
1. Pull the latest images
  ```shell
  docker-compose pull
  ``` 
2. Run the compose (using the detached flag to keep it running)
  ```shell
  docker-compose up -d
  ```
3. Tear down the compose when not using the services
  ```shell
  docker-compose down
  ```

## To start the application
`mvn spring-boot:run`


