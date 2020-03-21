# Adapter

## Implementation - Contextualization

We have a system that play mp3, recently new tecnologies (MP4 and VLC) are been using as music formats.
 
Or current system has a player that just supports medias that implements MediaPlayer. Although, the new formats are not compatible because they implement a new interface MediaPackage. 
 
In order to update or system that only accepts formats which implements MediaPlayer (MP3), we are going to create an adapter that implement MediaPlayer but wraps the new formats from MediaPackage (MP4 and VLC).  