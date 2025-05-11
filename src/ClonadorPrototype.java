public class ClonadorPrototype {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Paula", 22, "Ingeniería");
        Empleado empleado1 = new Empleado("Marcos", 35, "Contador");

        Persona clonEstudiante = estudiante1.clonar();
        Persona clonEmpleado = empleado1.clonar();

        estudiante1.presentarse();
        clonEstudiante.presentarse();

        empleado1.presentarse();
        clonEmpleado.presentarse();
    }
}
