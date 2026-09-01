package com.example;

/**
 * 8章 条件分岐（if文）の練習
 */
public class Main_8_1 {
    public static void main(String[] args) {

        int score = 75;

        // 単純なif文
        if (score >= 60) {
            System.out.println("合格です");
        }

        // if〜else文
        if (score >= 60) {
            System.out.println("結果: 合格");
        } else {
            System.out.println("結果: 不合格");
        }

        // if〜else if〜else文
        if (score >= 90) {
            System.out.println("評価: A");
        } else if (score >= 70) {
            System.out.println("評価: B");
        } else if (score >= 50) {
            System.out.println("評価: C");
        } else {
            System.out.println("評価: D");
        }

        // 論理演算子を使った複数条件の判定
        int age = 20;
        boolean hasTicket = true;

        if (age >= 18 && hasTicket) {
            System.out.println("入場できます");
        } else {
            System.out.println("入場できません");
        }
    }
}