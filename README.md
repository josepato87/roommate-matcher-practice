#Demo App Specifications

## Summary
Dempo App is a simple Java application for basic programming concepts learning.

The app lets users to find rooms based on the empathy with rooms owners.

## Objects
### User
This represents the User that searches for a room and the Owners of the rooms.
User has the following properties:
* idUser: To identify the current/desired user.
* name: Is the name of the User.
* likes...: Are the likes of the User to be used in the empathy verification 
between User and a room Owner.

### Room
This represents the rooms available for search.
Room has the following properties:
* idRoom: To identify the current/desired Room.
* idOwner: To identify the User that is the room Owner
* distance: Represents the distance from the User.


## Architecture

### Entity
This represents the entities from the source (DB).
### Service
This receives the needed parameters to execute the logic an return the desired
objects/result.
### Controller
This sends the parameters to the corresponding Service and triggers the 
logic inside them. 