import java.util.HashMap;
import java.util.Map;

public class AlbumStore {
  private static final Map<String, Album> albums = new HashMap<>();

  public static void addAlbum(Album album) {
    albums.put(album.getId(), album);
  }

  public static Album getAlbum(String id) {
    return albums.get(id);
  }

  public static void remAlbum(String id) {
    albums.remove(id);
  }
}
