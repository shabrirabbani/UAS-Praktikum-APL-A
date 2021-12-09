public class MoviePlayer implements MediaPlayer {
   MediaAdapter mediaAdapter; 

   @Override
   public void play(String filmType, String fileName) {		
      
      //mediaAdapter is providing support to play other file formats
      if(filmType.equalsIgnoreCase("Bluray") || filmType.equalsIgnoreCase("4k")){
         mediaAdapter = new MediaAdapter(filmType);
         mediaAdapter.play(filmType, fileName);
      }
      
      else{
         System.out.println("Media Tidak Sesuai yang Tersedia" + filmType);
      }
   }   
}