public class Player{
    private PlayerMethod PlayerMethod;
    
    public void setPlayMethod(PlayerMethod play){
        this.PlayerMethod = play;
    }

    public PlayerMethod getPlayMethod(){
        return PlayerMethod;
    }

    public void playFilm(){
        PlayerMethod.playFilm();
    }
}