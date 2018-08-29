/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fabricas;

import Caracteristicas.*;

/**
 *
 * @author Estudiantes
 */
public class FabricaOrcos implements FabricaAbstracta{

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoOrco();
    }
    
    @Override
    public Arma crearArma() {
        return new ArmaOrco();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoOrco();
    }

    @Override
    public Montura crearMontura() {
        return new MonturaOrco();
    }
    
}
