# FakeKube

## Deploy and Run
    $ mvn clean package tomee:run

## Docker

### Build
    $ docker image build -t fakekube .

### Run
    $ docker run -it --publish 8080:8080 fakekube

## Cluster API
    $ http://localhost:8080/api/v1