package KodlamaİoOdev2;

public class InstructorManager extends UserManager{

    public void dersEkle(User user){
        System.out.println("Ders eklendi" + user.getName());
    }

    public void dersGuncelle(User user){
        System.out.println("Ders güncellendi" + user.getName());
    }

    public void dersSil(User user){
        System.out.println("Ders Silindi" + user.getName());
    }

}
