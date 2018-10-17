package be.pxl.ja.week4.oefening2;

import java.util.ArrayList;

public class GameBrowser {
    private GameCollection gameCollection;

    public GameBrowser(GameCollection gameCollection) {
        this.gameCollection = gameCollection;
    }

    public ArrayList<VideoGame> showGamesForSearch(String searshString){
        return gameCollection.selectGames(videoGame -> videoGame.getName().toLowerCase().contains(searshString.toLowerCase()));
    }

    public ArrayList<VideoGame> showFreeGames(){
        return gameCollection.selectGames(videoGame -> videoGame.getPrice() == 0);
    }

    public ArrayList<VideoGame> showGamesInGenre(String genre){
        return gameCollection.selectGames(videoGame -> videoGame.getGenres().contains(genre));
    }
}
