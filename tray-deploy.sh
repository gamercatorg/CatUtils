JAR_VERSION=$1
mvn $MAVEN_CLI_OPTS clean package
curl -X POST -u gamer4life:29ce028e88c860e37602a1e9deab1bffe4ea91a0 https://api.bintray.com/packages/gamer4life/CatUtils/CatUtils/versions --data {\"name\" : \"${JAR_VERSION}\", \"desc\": \"Next version.\"}
curl -T target/*.jar -u gamer4life:29ce028e88c860e37602a1e9deab1bffe4ea91a0 https://api.bintray.com/content/gamer4life/CatUtils/CatUtils/$JAR_VERSION/CatUtils-$JAR_VERSION.jar
curl -X POST -u gamer4life:29ce028e88c860e37602a1e9deab1bffe4ea91a0 https://api.bintray.com/content/gamer4life/CatUtils/CatUtils/$JAR_VERSION/publish -d "{ \"discard\": \"false\" }"
