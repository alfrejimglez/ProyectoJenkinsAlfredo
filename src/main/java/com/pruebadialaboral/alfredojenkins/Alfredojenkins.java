/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.pruebadialaboral.alfredojenkins;

/**
 *
 * @author alfre
 */
public class Alfredojenkins {

public static boolean dia_laboral(String dia) {
    return switch (dia) {
        case "Lunes" -> true;
        case "Martes" -> true;
        case "Miercoles" -> true;
        case "Jueves" -> true;
        case "Viernes" -> true;
        case "Sabado" -> false;
        case "Domingo" -> false;
        default -> false;
    };
}
}


