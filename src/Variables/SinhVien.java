package Variables;

public class SinhVien {
    // Bien tinh static

    //Bien toan cuc
    public String phonenumber = "081745668";
    public String lop = "10A1";

    public SinhVien() {
        this.phonenumber = phonenumber;
        this.lop = lop;
    }

    public void Showphoneandclass() {
        System.out.println("So dien thoai : " + phonenumber);
        System.out.println("Ten lop: " + lop);
    }

    public void getInfo() {
        /*Bien Local*/
        String name = "Cao Thanh Phat";
        int tuoi = 22;
        System.out.println("Ten cua hoc sinh la: " + name);
        System.out.println("Tuoi cua hoc sinh la: " + tuoi);
    }

    public static void main(String[] args) {
        //Generate object
        SinhVien sv = new SinhVien();
        sv.getInfo();
        sv.Showphoneandclass();
        System.out.println("Ma hoc sinh : " + ThongTin.maHs);
        System.out.println("Can nang hoc sinh: " + ThongTin.weight + "kg");
    }
}

