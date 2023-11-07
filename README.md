# event-driven-kafka-spb

![Logo](https://github.com/gugafromMARS/event-driven-kafka-spb/assets/116969206/ac5ddbc5-ee5c-47e2-b246-6b598420efd0)

Welcome, this is a simple exercise for pratice Apache Kafka with microservices, the theme of exercise is orders are sent from kafka producer (order service) to Kafka broker with choosed topic for stock and email services consume the order event.

## Architecture

![ArchitectureImg](https://github.com/gugafromMARS/event-driven-kafka-spb/assets/116969206/9e26993c-a223-4404-a88b-d88f9ae4b818)


## Technology

Here are some technologys used on this project.

* Java version 17
* Apache Kafka

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
