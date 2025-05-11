class Estudiante extends Persona {
    private String carrera;
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }
    // Constructor sobrecargado
    public Estudiante(String carrera) {
        this.carrera = carrera;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    // Sobrescritura del metodo clonar
    @Override
    public Persona clonar() {
        return new Estudiante(getNombre(), getEdad(), carrera);
    }
    @Override
    public void presentarse() {
        System.out.println("Soy estudiante de " + carrera + ", me llamo " + getNombre());
    }
}
