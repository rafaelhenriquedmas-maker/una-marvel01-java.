public class ProjetoRenascimento {

    public static void main(String[] args) {

        boolean coragem = true;
        boolean bondade = true;
        boolean intelecto = false;
        boolean recursos = false;

        if (coragem && bondade) {
            System.out.println("Capitão América");
        } else if (intelecto && recursos) {
            System.out.println("Howard Stark (Apoio Logístico)");
        } else {
            System.out.println("Soldado de Infantaria");
        }

    }

}