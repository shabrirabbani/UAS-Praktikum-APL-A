public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedFilmPlayer;

   public MediaAdapter(String filmType){
   
      if(filmType.equalsIgnoreCase("Bluray") ){
         advancedFilmPlayer = new BlurayPlayer();			
         
      }else if (filmType.equalsIgnoreCase("4k")){
         advancedFilmPlayer = new FourKPlayer();
      }	
   }

   @Override
   public void play(String filmType, String fileName) {
   
      if(filmType.equalsIgnoreCase("Bluray")){
         advancedFilmPlayer.playBluray(fileName);
      }
      else if(filmType.equalsIgnoreCase("4k")){
         advancedFilmPlayer.playFourK(fileName);
      }
   }
}