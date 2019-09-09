public class Main {
    public static void main(String[] args) {

        Teacher teacher1 = new Teacher();
        teacher1.setName("Vladimir");
        teacher1.setlastName("Castañeda");
        teacher1.setArea("Java");
        teacher1.setMatter("Backend");

        System.out.println("El nombre del profesor es: " +teacher1.getName());
        System.out.println("Y su apellido es: " +teacher1.getLastName());
        System.out.println("El area que se le asigna es: "+teacher1.getArea());
        System.out.println("La materia que se le asigna es: "+teacher1.getMatter());


        Student student1 = new Student();
        student1.setName("Sabrina");
        student1.setlastName("Ferreyra");
        student1.setEnrollment(3);
        student1.setCareer("Backend");


        System.out.println("El nombre del alumno: " +student1.getName());
        System.out.println("Y su apellido es: " +student1.getLastName());
        System.out.printf("El numero de inscripcion que se le asigna es: "+student1.getEnrollment());
        System.out.printf("La carrera elegida es: "+student1.getCareer());
    }
}
