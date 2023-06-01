package Algorithms.Seminar4;

import java.util.Random;

public class Seminar4 {
    public static void main(String[] args) {

        Mapa<String, String> mapa = new Mapa<>();
        Random rand = new Random();

        for (int i = 0; i < 15; i++) {
            mapa.put(Integer.toString(i + 10), Integer.toString(i));
        }
        // System.out.println(mapa.get("10"));
        System.out.println(mapa.remove("14"));

        System.out.println(mapa.replace("13", "13333"));

        System.out.println(mapa.size());

        System.out.println(mapa.containsKey("14"));

        System.out.println(mapa.containsValue("0"));

    }
}
