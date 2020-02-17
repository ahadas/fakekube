FROM tomee:11-jre-8.0.0-M3-plume
RUN rm -Rf /usr/local/tomee/webapps/ROOT
COPY target/server*.war /usr/local/tomee/webapps/ROOT.war
