package fpt.fis.DTO;

import java.util.Date;

public class UngVienDTO {
    private Long Id;
    private String name;

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    private String phoneNumber;
    private Date ngaySinh;
    private String emailCaNhan;
    private String gioiTinh;
    private String danToc;

    public String getDanToc() {
        return danToc;
    }

    public void setDanToc(String danToc) {
        this.danToc = danToc;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getEmailCaNhan() {
        return emailCaNhan;
    }

    public void setEmailCaNhan(String emailCaNhan) {
        this.emailCaNhan = emailCaNhan;
    }

    public Long getcMND() {
        return cMND;
    }

    public void setcMND(Long cMND) {
        this.cMND = cMND;
    }

    public String getHonNhan() {
        return honNhan;
    }

    public void setHonNhan(String honNhan) {
        this.honNhan = honNhan;
    }

    public Date getNgayCapCMND() {
        return ngayCapCMND;
    }

    public void setNgayCapCMND(Date ngayCapCMND) {
        this.ngayCapCMND = ngayCapCMND;
    }

    public String getNoiSinh() {
        return noiSinh;
    }

    public void setNoiSinh(String noiSinh) {
        this.noiSinh = noiSinh;
    }

    public String getNoiCapCMND() {
        return noiCapCMND;
    }

    public void setNoiCapCMND(String noiCapCMND) {
        this.noiCapCMND = noiCapCMND;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getDiaChiCT() {
        return diaChiCT;
    }

    public void setDiaChiCT(String diaChiCT) {
        this.diaChiCT = diaChiCT;
    }

    public String getDiaChiHT() {
        return diaChiHT;
    }

    public void setDiaChiHT(String diaChiHT) {
        this.diaChiHT = diaChiHT;
    }

    public Long getsTK() {
        return sTK;
    }

    public void setsTK(Long sTK) {
        this.sTK = sTK;
    }

    public String getTenNganHang() {
        return tenNganHang;
    }

    public void setTenNganHang(String tenNganHang) {
        this.tenNganHang = tenNganHang;
    }

    public Long getmST() {
        return mST;
    }

    public void setmST(Long mST) {
        this.mST = mST;
    }

    public Date getNgayCapMST() {
        return ngayCapMST;
    }

    public void setNgayCapMST(Date ngayCapMST) {
        this.ngayCapMST = ngayCapMST;
    }

    public String getNoiCapMST() {
        return noiCapMST;
    }

    public void setNoiCapMST(String noiCapMST) {
        this.noiCapMST = noiCapMST;
    }

    public Long getSoBHXH() {
        return soBHXH;
    }

    public void setSoBHXH(Long soBHXH) {
        this.soBHXH = soBHXH;
    }

    public String getNoiCapBHXH() {
        return noiCapBHXH;
    }

    public void setNoiCapBHXH(String noiCapBHXH) {
        this.noiCapBHXH = noiCapBHXH;
    }

    public Date getNgayCapBHXH() {
        return ngayCapBHXH;
    }

    public void setNgayCapBHXH(Date ngayCapBHXH) {
        this.ngayCapBHXH = ngayCapBHXH;
    }

    private Long cMND;
    private String honNhan;
    private Date ngayCapCMND;
    private String noiSinh;
    private String noiCapCMND;
    private String queQuan;
    private String quocTich;
    private String diaChiCT;
    private String diaChiHT;
    private Long sTK;
    private String tenNganHang;
    private Long mST;
    private Date ngayCapMST;
    private String noiCapMST;
    private Long soBHXH;
    private String noiCapBHXH;
    private Date ngayCapBHXH;
}
