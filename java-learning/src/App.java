import java.util.Scanner;

import DAO.usuarioDAO;
import tabela.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

        int op;

        Scanner leitor = new Scanner(System.in);

        System.out.println("1- VER DADOS  || 2- ADICIONAR  ||  3- EDITAR || 4- EXCLUIR");
        op = leitor.nextInt();

        switch (op) {

            case 1:
                new usuarioDAO().verDados();
                break;

            case 2:
                Usuario u = new Usuario();
                u.setNome("gol");
                u.setMarca("Volkswagen");
                new usuarioDAO().cadastrarUsuario(u);
                break;

            case 3:
                Usuario x = new Usuario();
                x.setMarca("Volkswagen");
                x.setId(4);
                new usuarioDAO().editarDado(x);
                break;

            case 4:
                Usuario y = new Usuario();
                y.setId(3);
                new usuarioDAO().deletarDado(y);

            default:
                break;
        }
       
    }
}
