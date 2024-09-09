package com.example.hangman;

public class Characters {
    public static SpecialCharacters[] specialCharacters= new SpecialCharacters[]{
            new SpecialCharacters("a",new String[]{"à","á","ä","ã","â"}),
            new SpecialCharacters("e",new String[]{"è","é","ë","ê"}),
            new SpecialCharacters("i",new String[]{"ì","í","ï","î"}),
            new SpecialCharacters("o",new String[]{"ò","ó","ö","õ","ô"}),
            new SpecialCharacters("u",new String[]{"ù","ú","ü","û"}),
            new SpecialCharacters("n",new String[]{"ñ"}),
    };
    public static SpecialCharacters GetSpecialChar(String letter){
        for (int i=0;i<specialCharacters.length;i++){
            if(specialCharacters[i].value.equals(letter)){
                return specialCharacters[i];
            }
        }
        return null;
    }

}

class SpecialCharacters{
    public String value;
    public String[] result;

    public SpecialCharacters(String value, String[] result) {
        this.value = value;
        this.result = result;
    }
}
