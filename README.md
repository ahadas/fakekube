# FakeKube

## Deploy and Run
Java JDK 11 is required.

    $ mvn clean package tomee:run

## Docker

### Build
    $ docker image build -t fakekube .

### Run
    $ docker run -it --publish 8080:8080 fakekube

## Cluster API
    $ http://localhost:8080/api/v1

Or use provided kubeconfig file:

    $ kubectl --kubeconfig=./.kube/config get nodes
