package com.deezer.research.language;

import java.io.IOException;

/**
 * Created by sc9 on 10/02/16.
 */
public class Main {

    public static void main(String args[]){
        DetectionServiceImplLanguageDetection service = null;
        try {
            service = new DetectionServiceImplLanguageDetection();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            System.out.println(service.detect("je suis Donal et j'ai trente ans"));
        } catch (LangDetectException e) {
            e.printStackTrace();
        }
    }
}
