package edu.changan.rainbow.document.entity;

/**
 * 负责人实体类
 */
public class Major {
    /**
     * 对应生成docx中的负责人(暂用major 忘改了)
     */
    private String major;
    /**
     * 编号
     */
    private  String number;
    /**
     * 照片
     */
    private String photo;

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }
}
