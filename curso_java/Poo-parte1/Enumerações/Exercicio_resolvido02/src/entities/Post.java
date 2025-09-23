package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {
    
    private static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime momento;
    private String titulo;
    private String conteudo;
    private Integer likes;


    private List<Comentario> comentarios = new ArrayList<>();

    public Post() {

    }

    public Post(LocalDateTime momento, String titulo, String conteudo, Integer likes) {
        this.momento = momento;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public LocalDateTime getMomento() {
        return momento;
    }

    public void setMomento(LocalDateTime momento) {
        this.momento = momento;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }
    
    public void removerComentario(Comentario comentario){
        comentarios.remove(comentario);
    }

    public void adicionarComentario(Comentario comentario){
        comentarios.add(comentario);
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(likes);
        sb.append("Likes - ");
        sb.append(fmt.format(momento) +"\n" );
        sb.append(conteudo + "\n");
        sb.append("Comentarios: \n");
        for (Comentario c : comentarios) {
            sb.append(c.getTexto() + "\n");
        }
        return sb.toString();
    }
}
