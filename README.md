# NisumRestAPI

This project is oriented to register users as a code evaluation for Nisum.

## Resources

This project will use an H2-embedded database to be tested, the endpoints to use in this test are:

- http://localhost:8080/userCreation

## Running

Just run the following command in  the terminal :

```sh
./gradlew bootRun
```
For request the main endpoint:
```
http://localhost:8080
```

if the service is running properly the response must be **Nisum API works!** 

## Expected Result
| Request                                        |
|------------------------------------------------|
| Post Method http://localhost:8080/userCreation ||
```javascript
{
    "name": "Juan Rodriguez",
    "email": "juan@rodriguez.org",
    "password": "hunter2",
    "phones": [
        {
            "number": "1234567",
            "cityCode": "1",
            "countryCode": "57"
        }
    ]
}
```

| Response  |
| ------  |
```javascript
{
    "message": "Success",
    "content": {
        "user": {
            "id": "784be662-c05c-42fb-a658-c56f3f6fc4a3",
            "name": "Juan Rodriguez",
            "email": "juan@rodriguez.org",
            "password": "hunter2",
            "phones": [
                {
                    "number": "1234567",
                    "cityCode": "1",
                    "countryCode": "57"
                }
            ]
        },
        "created": "Wed Jan 25 20:20:46 COT 2023",
        "modified": "Wed Jan 25 20:20:46 COT 2023",
        "lastLogin": "Wed Jan 25 20:20:46 COT 2023",
        "token": "f5f519ed-4d0b-4cd3-add4-24b62cf9b08f",
        "active": false
    }
}
```