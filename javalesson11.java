public class javalesson11 {
  public static void main(String[] ages) {
    for (int i = 1; i < 100; i++) {
      if (i % 3 == 0 && i % 5 == 0) {
        System.out.println("foober");
      } else if (i % 3 == 0) {
        System.out.println("foo");
      } else if (i % 5 == 0) {
        System.out.println("ber");
      } else {
        System.out.println(i);
      }
    }
  }
}
