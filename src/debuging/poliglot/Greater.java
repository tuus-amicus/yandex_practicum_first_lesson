package debuging.poliglot;

import javax.sound.midi.Soundbank;

public class Greater {

    public static String sayHello(String language) {
        switch (language) {
            case "ru":
                return "Привет!";
            case "en":
                return "Hello!";
            case "fr":
                return "Bonjour!";
            case "es":
                return "¡Hola!";
            default:
                return "NOT_IMPLEMENTED";
        }
    }
}
