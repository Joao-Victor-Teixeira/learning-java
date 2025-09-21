package aplication;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comentario;
import entities.Post;

public class App {
    public static void main(String[] args) throws Exception {
        
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
        Comentario c1 = new Comentario("Tenha uma boa viagem!");
        Comentario c2 = new Comentario("Uau! Isso é incrível!");
        Post p1 = new Post(LocalDateTime.parse("21/06/2018 13:05:44", fmt), "Viajando para a Nova Zelândia",
         "Vou visitar esse país maravilhoso!", 12);

         p1.adicionarComentario(c1);
         p1.adicionarComentario(c2);

         System.out.println(p1);

        Comentario c3 = new Comentario("Boa noite.");
        Comentario c4 = new Comentario("Que a força esteja com você!"); 
         
         Post p2 = new Post(LocalDateTime.parse("28/06/2018 23:14:19", fmt), "Boa noite galera",
          "Vejo você amanhã", 5);
        
        p2.adicionarComentario(c3);
        p2.adicionarComentario(c4);
        
        System.out.println(p2);

    }
}
