package Test;

import DAO.CategoriaDAO;
import DAO.CategoriaDAOImplementar;
import DAO.UsuarioDAO;
import DAO.UsuarioImplementar;
import Model.Categoria;
import Model.Usuario;
import java.util.List;

public class Prueba1 {
    public static void main(String[] args) {
        Prueba1 evaluar = new Prueba1();
        evaluar.guardaCategoria();
        //evaluar.listarCategoria();
        //evaluar.eliminarCategoria();
       //evaluar.listarCategoria();
        //evaluar.editarCategoria();
    }
   
    public void listarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        List<Categoria> listar = categoria.Listar();
        System.out.println("LISTADO DE CATEGORIA");
        for(Categoria categoriaListar : listar){
            System.out.println("ID: " + categoriaListar.getId_categoria() +
                    "NOMBRE: " + categoriaListar.getNom_categoria() +
                    "ESTADO: " + categoriaListar.getEstado_categoria());
        }
    }
    
     public void editarCategoria(){
        CategoriaDAO categoria = new CategoriaDAOImplementar();
        Categoria cat_edit = categoria.editarCat(1);
        System.out.println("CATEGORIA A MODIFICAR");
        System.out.println("ID: " + cat_edit.getId_categoria() +
                    "NOMBRE: " + cat_edit.getNom_categoria() +
                    "ESTADO: " + cat_edit.getEstado_categoria());
    }
     
     public void guardaCategoria(){
         UsuarioDAO usuario = new UsuarioImplementar();
         Usuario guarda_usu= new Usuario();
         guarda_usu.setNombre("dfdGGGFfd");
         guarda_usu.setApellido("P");
         guarda_usu.setCorreo("armandGFGSFo@gmail.com");
         guarda_usu.setClave("123445");
         guarda_usu.setEstado(1);
         guarda_usu.setPregunta("HSDFDFDS");
         guarda_usu.setRespuesta("PDFGGF");
         guarda_usu.setTipo(1);
         guarda_usu.setUsuario("MineroSSD");
         
         System.out.println( usuario.guardarUsu(guarda_usu));
        
     }
     
     public void eliminarCategoria(){
         CategoriaDAO categoria = new CategoriaDAOImplementar();
        categoria.borrarCat(20);
     }
}
