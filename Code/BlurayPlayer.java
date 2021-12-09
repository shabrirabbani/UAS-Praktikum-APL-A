public class BlurayPlayer implements AdvancedMediaPlayer{
   @Override
   public void playBluray(String fileName) {
      System.out.println("Memutar Film Dengan Resolusi Bluray. Judul Film: "+ fileName);		
   }

   @Override
   public void playFourK(String fileName) {
      //do nothing
   }
}