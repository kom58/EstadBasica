
/* CLASE: Comprobar                             Version 0.1.4

    Métodos:
            boolean esEnteroPositivo (String)   Comprueba entero positivo o cero
                                                con control de errores
                                                try { ... } catch (Exception e) { ... }
                                                Ojo captura cualquier tipo de excepción

            boolean esEntero (String)           Comprueba entero con control de errores
                                                try { ... } catch (Exception e) { ... }
                                                Ojo captura cualquier tipo de excepción

            boolean esEnteroNegativo (String)   Comprueba entero negativo con control
                                                de errores try/catch

            boolean esDoble (String)            ...

            boolean esDoblePositivo (String)    ...

            boolean esDobleNegativo (String)    ...
 */

package estadist;

public class Comprobar {

    public boolean esEnteroPositivo (String tt){         // esEnteroPositivo

        boolean correcto = false;
        int n;

        try { n = Integer.parseInt(tt);}
        catch (Exception e) {return false;}

        if ( n >= 0 ){correcto = true;}

        return correcto;
    }


    public boolean esEntero (String tt){                    // esEntero

        boolean correcto = false;
        int n;

        try { n = Integer.parseInt(tt);}
        catch (Exception e) {return false;}

        if ( n == n * 1 ) {correcto = true;}

        return correcto;
    }


    public boolean esEnteroNegativo (String tt){            // esEnteroNegativo

        boolean correcto = false;
        int n;

        try { n = Integer.parseInt(tt);}
        catch (Exception e) {return false;}

        if ( n < 0 ){correcto = true;}

        return correcto;

    }


}
