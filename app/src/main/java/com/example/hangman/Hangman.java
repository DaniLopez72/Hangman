package com.example.hangman;

import static androidx.core.content.ContextCompat.startActivity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Hangman {

    static private List<String> letters;
    static public String currentWord;
    static public  int errorCount;
    static public int ganar = 0;
    static  public void GetRandomWord(){
        ganar = 0;
        Random random = new Random();
        int indexRand = random.nextInt(Words.wordList.length);
        GetWordByIndex(indexRand);
    }
    static  public  void GetWordByIndex(int index){
        letters = new ArrayList<>();
        currentWord = Words.wordList[index];
        System.out.println(currentWord);
    }
    static public  String GetWordInGame(){
        String finalWord = "";
        for(int i=0 ; i <currentWord.length();i++){
            String lowerLetter = String.valueOf(currentWord.charAt(i)).toLowerCase();
            boolean hasLetters = letters.contains(lowerLetter);
            if (hasLetters){
                finalWord += String.valueOf(currentWord.charAt(i));
            }else
            {
                finalWord += "_";
            }
        }
        return finalWord;
    }
    static public void AddLetter(String letter){

        String lowerLetter = letter.toLowerCase();
        String lowerWord = currentWord.toLowerCase();
        if (letters.contains(lowerLetter)){

        }else{
            letters.add(letter);
            boolean hasLetter = lowerWord.contains(lowerLetter);
            boolean win =GetWordInGame().contains("_");
            if (win == false){
                ganar = 1;
            }

            if(hasLetter == false){
                errorCount++;
                if (errorCount >= Words.imageError.length){
                    ganar = 2;
                }
            }

        }

    }

}