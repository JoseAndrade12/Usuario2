public class Main {

    public static void main(String[] args) {

        // Prueba 1: el contador empieza en 0 y sube al crear usuarios
        System.out.println("=== Prueba 1: contador ===");
        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());

        Usuario usuario1 = new Usuario("jperez", "jperez@correo.com");
        Usuario usuario2 = new Usuario("mlopez", "mlopez@correo.com");
        Usuario usuario3 = new Usuario("agomez", "agomez@correo.com");
        Usuario usuario4 = new Usuario("crodriguez", "crodriguez@correo.com");

        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());

        // Prueba 2: cada usuario tiene su propio id y sus propios datos
        System.out.println();
        System.out.println("=== Prueba 2: datos de cada objeto ===");
        usuario1.mostrarInformacion();
        System.out.println();
        usuario2.mostrarInformacion();
        System.out.println();
        usuario3.mostrarInformacion();
        System.out.println();
        usuario4.mostrarInformacion();

        // Prueba 3: modificar un solo usuario con los setters
        System.out.println();
        System.out.println("=== Prueba 3: modificar un solo objeto ===");
        usuario2.setActivo(false);
        usuario3.setCorreo("andrea.gomez@correo.com");

        System.out.println("Usuario 2 activo: " + usuario2.isActivo());
        System.out.println("Usuario 1 activo: " + usuario1.isActivo());
        System.out.println("Correo del usuario 3: " + usuario3.getCorreo());
        System.out.println("Correo del usuario 4: " + usuario4.getCorreo());
        System.out.println("Total de usuarios: " + Usuario.getTotalUsuarios());
    }
}