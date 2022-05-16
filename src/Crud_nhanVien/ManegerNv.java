package Crud_nhanVien;

import java.util.Scanner;

public class ManegerNv {
    Scanner sc = new Scanner(System.in);
    NhanVien nhanVienS []= new NhanVien[0];
    public  void  menu(){
        System.out.println("----Menu----");
        System.out.println("1.Them");
        System.out.println("2.Xoa");
        System.out.println("3.Sua");
        System.out.println("4.Hien thi");
        System.out.println("0.Thoat");
        System.out.println("Nhap lua chon:");
        int a = Integer.parseInt(sc.nextLine());
        switch (a){
            case 1:
                NhanVien nv = creat();
                nhanVienS=addNhanVien(nv);
                break;
            case 2  :
                nhanVienS=deleteNhanVien();
                break;
            case 3:
                System.out.println("Nhap vi tri ban muon sua:");
                int vt = Integer.parseInt(sc.nextLine());
                NhanVien nvx=creat();
                for(int i=0;i<nhanVienS.length;i++){
                    if(i==vt){
                        nhanVienS[i]=nvx;
                        break;
                    }
                }
                break;
            case 4:
                for (NhanVien nvs : nhanVienS) {
                    System.out.println(nvs);
                }
                break;
        }

    }
    public NhanVien creat(){
        System.out.println("Nhap id:");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap ten:");
        String name = sc.nextLine();
        System.out.println("Nhap tuoi:");
        int age = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap dia chi :");
        String diaChi = sc.nextLine();
        return  new NhanVien(id,name,age,diaChi);
    }
    public NhanVien [] addNhanVien(NhanVien nhanVien){
        NhanVien newNhanVien []= new  NhanVien[nhanVienS.length+1];
        System.arraycopy(nhanVienS,0,newNhanVien,0,nhanVienS.length);
        newNhanVien[newNhanVien.length-1]=nhanVien;
        return newNhanVien;
    }
    public NhanVien[] deleteNhanVien(){
        NhanVien newNhanVien[] = new NhanVien[nhanVienS.length-1];
        System.out.println("Nhap vi tri ban muon xoa:");
        int vt = Integer.parseInt(sc.nextLine());
           for(int i=0;i<nhanVienS.length-1;i++){
                if(i<vt){
                    newNhanVien[i]=nhanVienS[i];
                }
                else {
                    newNhanVien[i]=nhanVienS[i+1];
                }
           }
           return newNhanVien;
    }
}
