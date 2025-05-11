class Empleado extends Persona {
    private String puesto;
    public Empleado(String nombre, int edad, String puesto) {
        super(nombre, edad);
        this.puesto = puesto;
    }
    // Constructor sobrecargado
    public Empleado(String puesto) {
        this.puesto = puesto;
    }
    public String getPuesto() {
        return puesto;
    }
    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    // Sobrescritura del metodo clonar
    @Override
    public Persona clonar() {
        return new Empleado(getNombre(), getEdad(), puesto);
    }
    @Override
    public void presentarse() {
        System.out.println("Soy " + getNombre() + ", trabajo como " + puesto);
    }
}
