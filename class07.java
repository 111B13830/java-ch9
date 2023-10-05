class Count {
    // 定義一個名為 "power" 的靜態方法，計算 i 的 n 次方
    public static void power(int i, int n) {
      // 使用 Math.pow 方法計算 i 的 n 次方，然後輸出結果
      System.out.println(Math.pow(i, n));
    }
  }
  
  public class class07  {
    public static void main(String[] args) {
      // 在 main 方法中呼叫 Count 類別的 power 方法，並傳遞不同的數字和指數
      Count.power(2, 5); // 計算 2 的 5 次方並輸出結果
      Count.power(3, 2); // 計算 3 的 2 次方並輸出結果
    }
  }
  