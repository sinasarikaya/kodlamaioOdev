package KodlamaİoOdev2;

public class Student extends User{
    private String ClassId;
    private int note;



    public String getClassId() {
        return ClassId;
    }

    public void setClassId(String classId) {
        ClassId = classId;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
}
