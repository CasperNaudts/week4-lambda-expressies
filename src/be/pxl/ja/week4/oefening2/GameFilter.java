package be.pxl.ja.week4.oefening2;

@FunctionalInterface
public interface GameFilter {
    boolean match(VideoGame videoGame);
}
