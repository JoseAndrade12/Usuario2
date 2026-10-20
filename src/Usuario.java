public class Usuario {


    private int id;
    private String username;
    private String correo;
    private boolean activo;

        // Contador compartido por toda la clase
    private static int contadorUsuarios = 0;

        public Usuario(String username, String correo) {
            contadorUsuarios++;
            this.id = contadorUsuarios;
            this.username = username;
            this.correo = correo;
            this.activo = true;
        }

        // Getters
        public int getId() {
            return id;
        }

        public String getUsername() {
            return username;
        }

        public String getCorreo() {
            return correo;
        }

        public boolean isActivo() {
            return activo;
        }

        // Setters (el id no se puede modificar)
        public void setUsername(String username) {
            this.username = username;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public void setActivo(boolean activo) {
            this.activo = activo;
        }

        public void mostrarInformacion() {
            System.out.println("ID: " + id);
            System.out.println("Username: " + username);
            System.out.println("Correo: " + correo);
            System.out.println("Activo: " + activo);
        }

        public static int getTotalUsuarios() {
            return contadorUsuarios;
        }
    }

