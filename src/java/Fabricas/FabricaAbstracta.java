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
public interface FabricaAbstracta {
    
    public Cuerpo crearCuerpo();
    public Arma crearArma();
    public Escudo crearEscudo();
    public Montura crearMontura();
    
}
