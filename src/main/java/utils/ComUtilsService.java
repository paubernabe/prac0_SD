package utils;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ComUtilsService {
    private ComUtils comUtils;

    public ComUtilsService(InputStream inputStream, OutputStream outputStream) throws IOException {
        comUtils = new ComUtils(inputStream, outputStream);
    }

    public void writeTest() throws IOException {
        comUtils.write_string("Pau");
        comUtils.write_int32(20);
        comUtils.write_string_variable(1,"hola");
    }

    public String readTest() throws IOException {
        String result = "";
        result += comUtils.read_string();
        result += comUtils.read_int32();
        result += comUtils.read_string_variable(1);

        return result;
    }

    /*
     * Executeu el programa i responeu-vos les següents preguntes:
     *
     * 1 - Si canvieu el format o l’ordre en el writeTest i no en el readTest, quin error dóna?
     * R: i canviem l'ordre no obtenim cap error d'execució, però no tenim l'output esperat.
     *
     * 2 - Si obriu el fitxer test amb un editor com el vi hi veieu exactament el mateix que heu escrit? Quins caràcters són els que no veieu?
     * R: No, unicament no podem veure l'enter
     *
     * 3 - El nombre de bytes que ocupa el fitxer és exactament igual al nombre de bytes que hi heu escrit?
     * R: sí, 20 del string, 4 de l'enter i 1+4 de l'string variable
     *
     * 4 - Sabríeu detectar les trames que heu escrit mirant el fitxer test?
     * R: Sí, ja que, al ser diferents tipus de dades podem identificar cada trama d'una forma clara.
     */

    public void writechartest() throws IOException {
        comUtils.writeChar('1');

    }

    public char readchartest() throws IOException {
        return comUtils.readChar();

    }

}


