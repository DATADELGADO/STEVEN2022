package paciente;

public class Principal {

    public static void main(String[] args) {
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-35s%10s  %10s %-10s%-10s\n", "DNI", "NOMBRE", "PATERNO", "MATERNO", "TELEFONO", "CORREO", "DIRECCION", "EDAD", "ESTATURA", "ISCASADO", "SEXO");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s%-20s%-35s%10s  %10s %-10s%-10s\n", "---", "------", "-------", "-------", "--------", "------", "---------", "----", "--------", "--------", "----");
//CREAR UN OBJETO DE TIPO PACIENTE
        Paciente luis = new Paciente();
        luis.setDni("11111111");
        luis.setPaterno("Ruiz");
        luis.setMaterno("Roncal");
        luis.setCorreo("luis@gmail.com");
        luis.setTelefono("678123123");
        luis.setDireccion("Av. Ejercito 123");
        luis.setEdad(34);
        luis.setEstatura(1.72);
        luis.setSexo('H');
        luis.setIsCasado(true);
        luis.setNombre("Luis");

        //luis.mostrar();
        Paciente carla = new Paciente("22222222",
                "Carla",
                "Lescano",
                "Rodriguez",
                "656283123",
                "miguel@gmail.com",
                "C/. Guillermo Marconi 145",
                24,
                1.75,
                false,
                'M');
        //carla.mostrar();

        Paciente maria = new Paciente("33333333", "María", "Vazquez", "Ledesma");
        maria.setEdad(17);
        maria.setEstatura(1.76);
        //maria.mostrar();

        luis.mostrarMayoresEdad();
        carla.mostrarMayoresEdad();
        maria.mostrarMayoresEdad();

        luis.mostrarEstaturaMayor173();
        carla.mostrarEstaturaMayor173();
        maria.mostrarEstaturaMayor173();

    }
}
