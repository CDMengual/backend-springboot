
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.sesion;
import com.ejemplo.Springboot.model.usuario;


public interface IUsuarioService {
    
    public void crearUsuario(usuario usuario);
    public sesion loginUsuario(usuario usuario);
    
}
