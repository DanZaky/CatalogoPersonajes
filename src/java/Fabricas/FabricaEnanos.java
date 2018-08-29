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
public class FabricaEnanos implements FabricaAbstracta{

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoEnano();
    }
    
    @Override
    public Arma crearArma() {
        return new ArmaEnano();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoEnano();
    }

    @Override
    public Montura crearMontura() {
        return new MonturaEnano();
    }
    
}
