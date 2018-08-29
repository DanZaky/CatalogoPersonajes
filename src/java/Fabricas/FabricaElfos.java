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
public class FabricaElfos implements FabricaAbstracta{

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoElfo();
    }
    
    @Override
    public Arma crearArma() {
        return new ArmaElfo();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoElfo();
    }

    @Override
    public Montura crearMontura() {
        return new MonturaElfo();
    }
    
}
