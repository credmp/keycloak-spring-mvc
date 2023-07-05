# Example of Spring MVC and Keycloak with RBAC

## Keycloak

To run, first start keycloak:

``` shell
./start-keycloak.sh
```

Go to the url (http://localhost:9080)[http://localhost:9080] and create a user in the loaded domain. Join the user with the *SimpleUIAdmins* group.

Under the Clients tab, regenerate the client secret for the *simple-ui* client. Copy it for the next step.

## Spring

Start the spring application using maven:

``` shell
export KEYCLOAK_CLIENT_SECRET=PUTTHESECRETHERE
./mvnw spring-boot:run
```

You are ready to rock.

# Source

This example is taken from: https://medium.com/spring-boot/how-to-secure-a-simple-spring-boot-ui-thymeleaf-rbac-with-keycloak-ba9f30b9cb2b
