# Music Band Console Application
Displays bands, music instruments and musicians.

### Description
Every night the below bands play. Also, iMine Creekes who plays a nine-stringed guitar made by Giol
with string-size of 1.8 mm is eager to join any band that would allow her since her previous band was
dissolved. 

![Bands](./bands.png?raw=true "Screenshot")

Each band can have any number of members as long as there are not more than one of each instrument
present. Every day each band randomly loses a band-member, if there are any, and recruits a musician
not already in a band.
#### Menu Options
1. List - Lists the name of all bands with their members and the properties of their instruments.
2. Play one night - Executes logic where each band loses a random member and musicians without a
   band try to join a random band. Prints all changes to the console. For example ”Musician Void left
   Spoke ‘n hub. Musician Xindea left Berats. Musician iMine Creekes joined Bomrass.”
3. Exit - Exit the program

### How to build

```bash
mvn compile
mvn package
```