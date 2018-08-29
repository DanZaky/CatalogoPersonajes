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
public class FabricaTrols implements FabricaAbstracta{

    @Override
    public Cuerpo crearCuerpo() {
        return new CuerpoTrol();
    }
    
    @Override
    public Arma crearArma() {
        return new ArmaTrol();
    }

    @Override
    public Escudo crearEscudo() {
        return new EscudoTrol();
    }

    @Override
    public Montura crearMontura() {
        return new MonturaTrol();
    }
    
}
