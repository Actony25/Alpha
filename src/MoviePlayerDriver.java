public class MoviePlayerDriver {

  public static void testMoviePlayer() {

    MoviePlayer Movie1 = new MoviePlayer("DBPOWER MK101",new Screen("720x480", 40, 22), MonitorType.LCD);
    MoviePlayer Movie2 = new MoviePlayer("Pyle PDV156BK",new Screen("1366x768", 40, 22), MonitorType.LED);

    System.out.println(Movie1);
    System.out.println(Movie2);
  }
}
