import java.util.ArrayList;
/* This class encapsulates a list of songs in a user's collection and several
 * operations that can be performed on that list. A song is represented 
 * by an instance of the Song class. Each song has the following fields:
 * a title, an (optional) album, an artist, and a playing time.
*/
public class SongList {
   //Class member variable declaration(s):
    ArrayList<Song> songList;


   /* Constructor that initializes the list and any other 
   *  variables.
   */    
   public SongList(){
   // TODO 1: Implement this method.
      songList = new ArrayList<Song>();
      
   }
   
   /* Returns true if the song list contains no songs, false otherwise.
    */
   public boolean isEmpty(){
   // TODO 2: Implement this method.
      if (songList.size() == 0)
         return true;
      else
         return false;
   }
   
   /* Add the song passed in to the end of the list. 
    * For example, if the list contained: song1, song2,
    * the next song added, song3, would result in this list:
    * song1, song2, song3.
   */
   public void addSong(Song newSong){
      // TODO 3: Implement this method.
      if(newSong != null)
         songList.add(newSong);
   }
   
      /* This method returns a String which consists of the String
    * representation of each song in the list. A line break is
    * inserted between each song String.
    * If the song list is empty, the String "no songs" is returned.
   */
   public String getSongListAsString(){
   // TODO 4: Implement this method.
      String rep = "";
      if (songList.isEmpty() == true)
         rep = "no songs";
      else{
         for (Song song: songList){
            rep += (songList.indexOf(song)+1) + " " + song.toString() + "\n";
         }
      }
      return rep;
   }
   
  /* Remove the song in the songList with the targetTitle.
   * First, the method searches for a song in the list with a title that 
   * matches the targetTitle. If it is found, that song is removed from 
   * the list. If the targetTitle is not matched, the list remains the same and false is returned.
   * Note that there should not be any null values between songs in the list.
   * For example, if the list contained: song1, song2, song3,
   * and the title of song2 was "MyTitle", this call:  
   *          removeSongByTitle("MyTitle");
   * would result in this list:  song1, song3.
   * This method returns true if the targetTitle matches the title of a song in the list,
   * false otherwise.
   */
   public boolean removeSongByTitle(String targetTitle){
   // TODO 5: Implement this method.
      for (Song song:songList){
         if (song.getTitle().equalsIgnoreCase(targetTitle)){
            songList.remove(songList.indexOf(song));
            return true;
         }
      }
       return false;  
   }
   
  /* 
   * Return the song list object.
   */
   public ArrayList<Song> getSongList(){
      return songList;
   }
   
   /* Remove all songs from the list, resulting in an empty list.
    */
   public void clearSongList(){
      // TODO 6: Implement this method.
      songList.clear();
      
   }
    
}