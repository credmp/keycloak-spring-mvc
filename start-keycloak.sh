#!/usr/bin/env sh

echo "Based on https://medium.com/spring-boot/how-to-secure-a-simple-spring-boot-ui-thymeleaf-rbac-with-keycloak-ba9f30b9cb2b"

docker run --rm \
  --name keycloak \
  -p 9080:8080 \
  -e KEYCLOAK_ADMIN=admin \
  -e KEYCLOAK_ADMIN_PASSWORD=admin \
  -v "$(pwd)"/data/:/opt/keycloak/data/import/ \
  quay.io/keycloak/keycloak:21.1.1 start-dev --import-realm
