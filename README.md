
## Start authorization server and resource server

Authorization server running on port 8080

Resource server running on port 9000

- Firstly sent request

```curl

  http://localhost:8080/oauth2/authorize?
  response_type=code
  &client_id=client
  &scope=openid
  &redirect_uri=http://127.0.0.1:3000/authorized
  &code_challenge=QYPAZ5NU8yvtlQ9erXrUYR-T5AGCjCF47vN-KsaI2A8&code_challenge_method=S256

```

- After it will redirect to http://127.0.0.1:3000/authorized with response code like this

```curl

  http://127.0.0.1:3000/authorized?
  code=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX


```

- Copy Code from Query Parameter
  `code`:
  XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX

- Sent request again via

```curl

  http://localhost:8080/oauth2/token?
    client_id=client
    &redirect_uri=http://127.0.0.1:3000/authorized
    &grant_type=authorization_code
    &code=XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
    &code_verifier=qPsH306-ZDDaOE8DFzVn05TkN3ZZoVmI_6x4LsVglQI

```

`Note:` Choose Basic Auth for that request and past username and password with that URL (username: client, password: secret )

- Now we successfully authorized request, next copy id_token and past when request to resource server

```curl
  http://localhost:9000/user
```

Authorization: Bearer XXXXXX