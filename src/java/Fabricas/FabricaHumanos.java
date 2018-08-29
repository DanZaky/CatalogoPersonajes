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
public class FabricaHumanos implements FabricaAbstracta{

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoHumano();
    }
    
    @Override
    public Arma crearArma() {
        return new ArmaHumano();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoHumano();
    }

    @Override
    public Montura crearMontura() {
        return new MonturaHumano();
    }
    
}
