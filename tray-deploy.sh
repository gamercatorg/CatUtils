JAR_VERSION=$1
curl -H "Content-Type: application/json" -X POST -u gamer4life:29ce028e88c860e37602a1e9deab1bffe4ea91a0 https://api.bintray.com/packages/gamercatorg/CatUtils/CatUtils/versions --data "{\"name\" : \"${JAR_VERSION}\", \"desc\": \"A new version.\"}"
curl -X DELETE -u gamer4life:29ce028e88c860e37602a1e9deab1bffe4ea91a0 https://api.bintray.com/content/gamercatorg/CatUtils/CatUtils-$JAR_VERSION.jar
curl -T target/*.jar -u gamer4life:29ce028e88c860e37602a1e9deab1bffe4ea91a0 https://api.bintray.com/content/gamercatorg/CatUtils/CatUtils/$JAR_VERSION/CatUtils-$JAR_VERSION.jar
curl -H "Content-Type: application/json" -X POST -u gamer4life:29ce028e88c860e37602a1e9deab1bffe4ea91a0 https://api.bintray.com/content/gamercatorg/CatUtils/CatUtils/$JAR_VERSION/publish -d "{ \"discard\": \"false\" }"
