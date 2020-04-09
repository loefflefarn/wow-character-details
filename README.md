# wow-character-details

With World of Warcraft - Character details you can view all your 
characters on your personal Blizzard-Account with a single login. 
You can look for some character details, and your in-game auctions.

## How to use it

### Requirements
You need a [Blizzard-Developer](https://develop.battle.net/) Account 
and have set up a client app. Then fill the following properties with 
your personal `clientId` and `clientSercret`.
```
security.oauth2.client.clientId=YOUR_CLIENT_ID
security.oauth2.client.clientSecret=YOUR_CLIENT_SECRET
```

### Usage
Run the following command:
```
mvn clean install spring-boot:run
```
After that you can visit the web app with 
[http://localhost:8080](http://localhost:8080).
