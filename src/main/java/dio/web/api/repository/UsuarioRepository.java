package dio.web.api.repository;

import dio.web.api.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository // Essa anotação informa ao Spring que essa classe é um Component
public class UsuarioRepository {
    public void save(Usuario usuario){
        if(usuario.getId()==null)
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada repositório");

        System.out.println(usuario);
    }
    public void deleteById(Integer id){
        System.out.println(String.format("DELETE/id - Recebendo o id: %d para"));
        System.out.println(id);
    }
    public List<Usuario> fingAll(){
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("joabe","password"));
        usuarios.add(new Usuario("Valverde", "masterpass"));
        return usuarios;
    }
    public Usuario findById(Integer id){
        System.out.println(String.format("FIND/id - Recebendo o id: %d para"));
        return new Usuario("Joabe","password");
    }
    public Usuario findByUsername(String username){
        System.out.println(String.format("FIND/username - recebendo o username"));
        return new Usuario("Joabe","password");
    }
}
