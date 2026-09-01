package com.example;

/**
 * 6章 型変換（自動型変換とキャスト演算子）
 */
public class Main_6_1 {
    public static void main(String[] args) {

        // 自動型変換（小さい型 → 大きい型は自動でOK）
        int   intValue    = 100;
        long  longValue   = intValue;      // int → long は自動変換
        double doubleValue = longValue;    // long → double も自動変換

        System.out.println("自動型変換の結果");
        System.out.println(longValue);
        System.out.println(doubleValue);

        // キャスト演算子（大きい型 → 小さい型は明示的に変換が必要）
        double price = 1234.567;
        int    intPrice = (int) price;     // 小数点以下切り捨て

        System.out.println("キャスト演算子の結果");
        System.out.println(intPrice);

        // 小数点以下まで正確に計算したい例
        int a = 7;
        int b = 2;
        System.out.println("int同士の割り算（切り捨てられる）: " + (a / b));
        System.out.println("キャストして正確に計算: " + ((double) a / b));
    }
}