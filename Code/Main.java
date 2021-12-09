import java.util.Scanner;

public class Main {
   public static void main(String[] args) {

      System.out.println("Stock Movie");

      System.out.println("Mau Nonton Film Dengan Resolusi Apa?");
      System.out.println("4k / Bluray");
      System.out.println("-----------------");
      Scanner in = new Scanner(System.in);
      System.out.print("Input Resolusi : ");
      String media = in.next();
      System.out.println("-----------------");
      System.out.println("Resolusi Yang dipilih : " + media);

      MoviePlayer filmPlayer = new MoviePlayer();
      Player p = null;
      p = new Player();

      if( "4k".equalsIgnoreCase(media)){
         p.setPlayMethod(new PlayerFourK());
         p.playFilm();
         filmPlayer.play("4k", "Spiderman Far From Home");

      }else if("Bluray".equalsIgnoreCase(media)){
         p.setPlayMethod(new PlayerBluray());
         p.playFilm();
         filmPlayer.play("Bluray", "Spiderman No Way Home");
      }
   }
}