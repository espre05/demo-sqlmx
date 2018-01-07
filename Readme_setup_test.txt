1. install t4sqlmx jar in local maven
2. touch file:/var/tmp/${spring.application.name}/${DEMOSQLMX_PROFILE:h2}/conf/override.properties
touch  /var/tmp/demo-sqlmx/demo-sqlmx/conf/override.properties
3. add these two properties to that file (secret)
spring.datasource.username=
spring.datasource.password=
