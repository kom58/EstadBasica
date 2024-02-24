package estadist;

import java.util.Arrays;
import static estadist.Aplicacion.numListaX;

public class DatosEstad {

    //private int[] n;
    private int suma;
    private int max = -99999999;
    private int min = 99999999;


    public double getMedia(){

        int h;
        suma = 0;
        for (h = 0; h <= 9; h = h + 1) {
           suma = suma + numListaX[h];
        }

        return (double) suma/10;
    }

    public int getMaximo(){

        int h;
        for (h = 0; h <=9; h = h + 1) {
            if (numListaX[h] > max) {
                max = numListaX[h];
            }
        }
        return max;
    }


    public int getMinimo(){

        int h;
        for (h = 0; h <=9; h = h + 1) {
            if (numListaX[h] < min) {
                min = numListaX[h];
            }
        }
        return min;
    }

    public double getDesviacion(){

        double desv, media;

        media = getMedia();
        desv = 0;
        int i;

        for (i = 0; i < 10; i++){
            desv = desv + Math.pow(numListaX[i] - media, 2);
        }

        desv = desv / 10;
        desv = Math.sqrt(desv);

        return desv;
    }

    public double getMediana(){

        int i;
        int[] nListaOrdenada = new int[10];

        for (i = 0; i <= 9; i = i + 1){
            nListaOrdenada[i] = numListaX[i];
        }

        Arrays.sort(nListaOrdenada);

        return ((double) (nListaOrdenada[4] + nListaOrdenada[5])) / 2;
    }


}
