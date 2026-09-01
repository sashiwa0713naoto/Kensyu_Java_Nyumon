package com.example;

/**
 * 10章 繰り返し処理（for文）の練習
 */
public class Main_10_1 {
    public static void main(String[] args) {

        // 1から10までの数字を出力
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        // 偶数だけ出力
        System.out.println("--- 偶数のみ ---");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}