1. create/register  endpoint a client in oauth2 app

    curl --location --request POST 'localhost:8081/createClient?client_id=abc1&client_secret=def1'

2. receive token endpoint

     curl --location --request POST 'localhost:8081/token?client_id=abc1&client_secret=def1&grant_type=CLIENT_CREDENTIALS'

     {
    "access_token": "3qAKlbaOeUxkxrIxaITozY2yo7nVb5KACH6UJGnQAWbqwm9yEdPRU3lxtDCKVfp3dRhsguKZERnMFVPwbCzfzA",
    "token_type": "Bearer",
    "expires_in": 3600
    }

3. validate token endpoint

    curl --location 'localhost:8081/validate' \
--header 'authorization: Bearer 3qAKlbaOeUxkxrIxaITozY2yo7nVb5KACH6UJGnQAWbqwm9yEdPRU3lxtDCKVfp3dRhsguKZERnMFVPwbCzfzA'

{
    "message": "Token validated successfully",
    "client_id": "abc1",
    "scopes": null,
    "expires_in": 3347
}

Need to configure this app endpoint in API manager oauth 2 policy