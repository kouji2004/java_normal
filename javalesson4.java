public class javalesson4 {
  public static void main(String[]ages){
    int a = 1;
    int b = 1;
    int c = 1;
    int d = b*b-2*a*c;
  if(d>0){
    System.out.println("二つの実数解");
  }else if(d==0){
    System.out.println("重解");
  }else{
    System.out.println("虚数解");
  }
 }
}
