package be.pxl.ja.week4.oefening2;

import java.util.ArrayList;

public class GameCollection {
    private ArrayList<VideoGame> videoGames = new ArrayList<>();

    public GameCollection() {
    }

    public void addGame(VideoGame videoGame) {
        videoGames.add(videoGame);
    }

    public ArrayList<VideoGame> selectGames(GameFilter gameFilter) {
        ArrayList<VideoGame> videoGames = new ArrayList<>();

        for (int i = 0; i < this.videoGames.size(); i++) {
            if (gameFilter.match(this.videoGames.get(i))) {
                videoGames.add(this.videoGames.get(i));
            }
        }

        return videoGames;
    }
}
