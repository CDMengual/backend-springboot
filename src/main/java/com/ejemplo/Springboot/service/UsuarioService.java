
package com.ejemplo.Springboot.service;

import com.ejemplo.Springboot.model.sesion;
import com.ejemplo.Springboot.model.usuario;
import com.ejemplo.Springboot.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService implements IUsuarioService {
    
    @Autowired
    public UsuarioRepository usuarioRepo;
    
    @Override
    public void crearUsuario(usuario usuario) {
         usuarioRepo.save(usuario);
    }
    
    @Override
    public sesion loginUsuario(usuario usuario) {
         List<usuario>usuarios = usuarioRepo.findByEmailAndPassword(usuario.getEmail(),usuario.getPassword());
         if(usuarios.size()>0){
             sesion sesion=new sesion();
             sesion.email=usuarios.get(0).getEmail();
             return sesion;
         }
         else{
         return null;
         }
    }
    
    
    
}
