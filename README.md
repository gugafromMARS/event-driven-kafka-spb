# event-driven-kafka-spb

![Logo](https://github.com/gugafromMARS/sb-rabbitmq-mcs/assets/116969206/0e81fe59-45cf-43b3-bb5d-14f75813b434)


Welcome, this is a simple exercise for pratice Rabbitmq with exchange in microservices, the theme of exercise is orders are sent to exchange and exchange choose with the routing keys for which queue is going to send email or stock service.


## Architecture

![ArchitectureImg](https://github.com/gugafromMARS/sb-rabbitmq-mcs/assets/116969206/10918db4-042d-4178-b261-0d0d9ca08827)


## Technology

Here are some technologys used on this project.

* Java version 17
* RabbitMQ

## Services

Services used.

* Github
  
## Getting started

1- Download Kafka for your pc 

[Kafka download](https://kafka.apache.org/downloads)

2- Run this command on terminal for start Kafka Zookeeper Service
```shell script
bin/zookeeper-server-start.sh config/zookeeper.properties
```
3- At the same time run this command on other terminal tab for start Kafka Broker Service
```shell script
bin/kafka-server-start.sh config/server.properties
```

## App functionalitys

In this project you have only on option :

* **Send Order**
  
You have a controller in order microservice thats your kafka producer who going to send order to kafka broker for the choosed topic.

## Authors

**gugafromMars**

[Github-gugafromMars](https://github.com/gugafromMARS)

Thanks to visiting and happy coding!
