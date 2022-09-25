public class javalesson9 {
  public static void main(String[]ages){
    int number = 2;
    System.out.println("number"+number);
    for(int i=1,answer=number; answer != 1; i++){
      answer = answer % 2 == 0? answer/2:answer*3+1;
      System.out.println(i+":"+answer);
    }
  }
}
