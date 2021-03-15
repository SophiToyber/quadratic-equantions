# quadratic-equantions

## Installig

Insatll project:

```
$ git clone https://github.com/SophiToyber/quadratic-equantions.git
```


## Using project

To start working with the application, we need to raise the database, this was provided and you can raise it using the command: `docker-compose up --build`.
This will launch our database and application in docker containers.
To test the application without a visual environment, you can simply send a **POST** request for - with the request body: `http://localhost:8281/api/expression`

```
{
    "a":"1",
    "b":"6",
    "c":"9"
}
```

To test the application with a visual environment, you need to stop the docker container with the java application running.
This can be done with the command: `docker stop quadratic-equations`

To stop the container, you need to start the application as a regular Java application by any existing means, and then open the file:
`src/main/resources/static/index.html`
 