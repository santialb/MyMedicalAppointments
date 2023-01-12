public class Doctor {
    static int id = 0; // AUtoincrement
    String name;
    String speciality;
    String email;
    public Doctor(){
        System.out.println("Construyendo el Objeto Doctor");
    }

    public Doctor(String name, String speciality){
        id++;
        this.name = name;
        this.speciality = speciality;
        System.out.println("El nombre del Doctor asignado es " + name + " Especialidad: " + speciality);
    }

    public void showName(){
        System.out.println(name);
    }
    public void showId(){
        System.out.println("ID Doctor: " + id);
    }
}
