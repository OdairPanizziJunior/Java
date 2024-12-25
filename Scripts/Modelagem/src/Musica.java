
public class Musica {
    String genero;
    String artista;
    String album;

    void inicializa(String g, String a, String ab) {
        genero = g;
        artista = a;
        album = ab;
    }
    
    void detalhar(){
        System.out.println("Artista: " + artista);
        System.out.println("Genero: " + genero);
        System.out.println("Album: " + album);
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }
    
    
}


