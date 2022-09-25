public class javalesson6 {
  public static void main(String[]ages){
    int m = 3100;
    int taxi = 610;
    int price = 0;
    if(m<1700){
      price = taxi;
    }else{
      double increase = m-1700;
      double number = increase/313;
      price = Double.valueOf(taxi + (Math.ceil(number) * 80)).intValue();
    }
    System.out.println("タクシー料金は"+price+"円です");
  }
}
