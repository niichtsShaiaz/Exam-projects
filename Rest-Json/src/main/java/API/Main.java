package API;


import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mathias
 */
public class Main {
    String testdData = generate(100,1000);
    
    
    
    
public static String generate(int samplesAmount, int startId) {

        String[] fNames = {"Ib", "Per", "Jens", "Karl", "Bente", "Lea","Lise", "Inger", "Niels", "Mads", "Rene", "Tove","Trine", "Lars", "Ole", "Einar", "Benny", "Signe","Kenny", "Lone", "Ida", "Beate", "Louise", "Sidsel"};
        String[] lNames = {"Jensen", "Hansen", "Madsen", "Persson", "Nielsen", "Skov","Edberg", "Flintholm", "Graversen", "Poulsen", "Torp", "Svendsen","Sørensen", "Ardberg", "Friis", "Larsem", "Bentholm", "Lehmann","Wiksøe", "Eilersen", "Rosenberg", "Kristensen", "Meinholt"};

        Random ran = new Random();
        String jsonArray = "[";
        for (int i = 0; i < samplesAmount; i++) {
            jsonArray += "{"
            + "\"fname\": \"" + fNames[ran.nextInt(fNames.length -1)] + "\", "
            + "\"lname\": \"" + lNames[ran.nextInt(lNames.length -1)] + "\", "
            + "\"id\": " + (startId+i) + ", "
            + "\"age\": " + (ran.nextInt(ran.nextInt(53)+17))
            + "}";
            if (i<samplesAmount-1) {
                jsonArray += ",";
            }
        }
        jsonArray += "]";
        return jsonArray;
    }
}
