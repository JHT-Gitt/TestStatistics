package org.example;

public class Main {
    public static void main(String[] args) {

        int[] testScore = {
                95,98,99,90,85,83,89,91,87,100
        };
        int sum = 0, highScore = 0,lowScore = 0;
        int average;

        for( int total : testScore ){
            sum +=total;
        }
        for(int i = 1 ; i < testScore.length ; i++){
            if(testScore[i] > highScore){
                highScore = testScore[i];
            }
        }
        for(int a = 1 ; a < testScore.length ; a++){
            if(testScore[a] < highScore){
                lowScore = testScore[a];
            }
        }
        average = sum / testScore.length;
        System.out.println("Average score: " + average);
        System.out.println("Highest score: " + highScore);
        System.out.println("Lowest score: " + lowScore);



    }
}