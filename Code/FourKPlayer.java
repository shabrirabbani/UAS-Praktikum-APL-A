public class FourKPlayer implements AdvancedMediaPlayer{

   @Override
   public void playBluray(String fileName) {
      //do nothing
   }

   @Override
   public void playFourK(String fileName) {
      System.out.println("Memutar Film Dengan resolusi 4k. Judul Film: "+ fileName);		
   }
}