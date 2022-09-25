public class javalesson13 {
  public static void main(String[]ages){
    boolean check = false;
    int year = 2;
    if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
      check = true;
} else {
  check = true;
}
System.out.println(check ? "うるう年です。" : "うるう年ではありません。");
  }
}
