/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 k*/
package com.pruebadialaboral.alfredojenkins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AlfredojenkinsTest {

    @Test
    public void testDiaLaboralLunes() {
        assertTrue(Alfredojenkins.dia_laboral("Lunes")); 
    }

    @Test
    public void testDiaLaboralMartes() {
        assertTrue(Alfredojenkins.dia_laboral("Martes")); 
    }

    @Test
    public void testDiaLaboralMiercoles() {
        assertTrue(Alfredojenkins.dia_laboral("Miercoles")); 
    }

    @Test
    public void testDiaLaboralJueves() {
        assertTrue(Alfredojenkins.dia_laboral("Jueves")); 
    }

    @Test
    public void testDiaLaboralViernes() {
        assertTrue(Alfredojenkins.dia_laboral("Viernes")); 
    }

    @Test
    public void testDiaLaboralSabado() {
        assertFalse(Alfredojenkins.dia_laboral("Sabado")); 
    }

    @Test
    public void testDiaLaboralDomingo() {
        assertFalse(Alfredojenkins.dia_laboral("Domingo")); 
    }
}