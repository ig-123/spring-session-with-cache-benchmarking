# spring-session-with-cache-benchmarking
Project made for the testing purposes of Spring Session with Redis, Geodoe (and PostgreSQL)
in a cluster environment.

## Steps for each individual project
Build image:
1.      gradle bootBuildImage
Run in Docker:
1.      docker-compose up
When done:
1.      docker-compose down
Example:
1.  Open "redis" subdirectory
2.  Build the image
3.  Run the cluster in Docker
4.  nginx is available at port 80 on your localhost

## Prerequisites
1. Docker
2. Java 17
