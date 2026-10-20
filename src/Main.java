//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Videojuego juego1 = new Videojuego();
        Videojuego juego2 = new Videojuego();
        Videojuego juego3 = new Videojuego();

        juego1.nombre = "Minecraft";
        juego1.genero = "Aventura";
        juego1.version = "1.21";
        juego1.activo = false;

        juego2.nombre = "FIFA 25";
        juego2.genero = "Deportes";
        juego2.version = "2.3";
        juego2.activo = false;

        juego3.nombre = "Valorant";
        juego3.genero = "Disparos";
        juego3.version = "9.05";
        juego3.activo = false;

        System.out.println(" Estado inicial ");
        juego1.mostrarInformacion();
        System.out.println();
        juego2.mostrarInformacion();
        System.out.println();
        juego3.mostrarInformacion();

        // Solo se inicia y se cierra el primer juego
        System.out.println("\n Se inicia solo el juego 1 ");
        juego1.iniciar();

        System.out.println("\n Estado después de iniciar el juego 1 ");
        juego1.mostrarInformacion();
        System.out.println();
        juego2.mostrarInformacion();
        System.out.println();
        juego3.mostrarInformacion();

        System.out.println("\n Se cierra el juego 1 ");
        juego1.cerrar();

        System.out.println("\n Versiones ");
        juego1.mostrarVersion();
        juego2.mostrarVersion();
        juego3.mostrarVersion();
    }
}