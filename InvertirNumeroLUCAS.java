public class InvertirNumeroLUCAS {
  public static int longitudNumero(int num) {
    if (num == 0) 
      return 0;
    else
    return 1 + longitudNumero(num / 10); }
  public static int invertirNumero(int num) {
    if ((-9 <= num) && (num <= 9)) 
      return num;
    // 123 -> 3 * 100 + inv(12)
    else
    return (num % 10) * (int) Math.pow(10, longitudNumero(num / 10)) + invertirNumero(num / 10); }
  public static void main(String[] args) {
    System.out.println(invertirNumero(123));
  }
}