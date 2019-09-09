public class Student extends Person {
    private int enrollment;
    private String career;

    public void setEnrollment( int enrollment){
        this.enrollment = enrollment;
    }
    public void setCareer(String career) {
        this.career = career;
    }
    public int getEnrollment(){
        return enrollment;
    }
    public String getCareer(){
        return career;
    }
}
