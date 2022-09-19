package edu.changan.rainbow.document.entity.info;

import java.util.List;

/**
 * 项目组主要参与者信息
 */
public class ProParticipantsInfo {
    /**
     * 项目人数-项目组人员总数
     */
    private String totalNumber;
    /**
     * 项目人数-高级职称
     */
    private String seniorTitle;
    /**
     * 项目人数-中级职称
     */
    private String intermediateTitle;
    /**
     * 项目人数-初级职称
     */
    private String primaryTitle;
    /**
     * 项目人数-其他
     */
    private String elseTitle;
    /**
     * 项目人数-博士
     */
    private String doctorDegree;
    /**
     * 项目人数-硕士
     */
    private String masterDegree;
    /**
     * 项目人数-学士
     */
    private String bachelorDegree;
    /**
     * 项目人数-其他
     */
    private String elseDegree;
    /**
     * 项目负责人-姓名
     */
    private String name3;
    /**
     * 项目负责人-性别
     */
    private String sex3;
    /**
     * 项目负责人-出生年月
     */
    private String birth3;
    /**
     * 项目负责人-证件类型
     */
    private String certificateType3;
    /**
     * 项目负责人-证件号码
     */
    private String certificateNum3;
    /**
     * 项目负责人-从事专业
     */
    private String major3;
    /**
     * 项目负责人-职称
     */
    private String title3;
    /**
     * 项目负责人-职务
     */
    private String position3;
    /**
     * 项目负责人-学历
     */
    private String educationBackground3;
    /**
     * 项目负责人-所在单位
     */
    private String unit3;
    /**
     * 项目负责人-联系方式
     */
    private String contact;
    /**
     * 项目负责人-电子邮箱
     */
    private String email3;
    /**
     * 项目负责人-简介
     */
    private String introduction;
    /**
     * 主要研究人员
     */
    private List<ResearcherInfo> researcherInfoList;

    public String getTotalNumber() {
        return totalNumber;
    }

    public void setTotalNumber(String totalNumber) {
        this.totalNumber = totalNumber;
    }

    public String getSeniorTitle() {
        return seniorTitle;
    }

    public void setSeniorTitle(String seniorTitle) {
        this.seniorTitle = seniorTitle;
    }

    public String getIntermediateTitle() {
        return intermediateTitle;
    }

    public void setIntermediateTitle(String intermediateTitle) {
        this.intermediateTitle = intermediateTitle;
    }

    public String getPrimaryTitle() {
        return primaryTitle;
    }

    public void setPrimaryTitle(String primaryTitle) {
        this.primaryTitle = primaryTitle;
    }

    public String getElseTitle() {
        return elseTitle;
    }

    public void setElseTitle(String elseTitle) {
        this.elseTitle = elseTitle;
    }

    public String getDoctorDegree() {
        return doctorDegree;
    }

    public void setDoctorDegree(String doctorDegree) {
        this.doctorDegree = doctorDegree;
    }

    public String getMasterDegree() {
        return masterDegree;
    }

    public void setMasterDegree(String masterDegree) {
        this.masterDegree = masterDegree;
    }

    public String getBachelorDegree() {
        return bachelorDegree;
    }

    public void setBachelorDegree(String bachelorDegree) {
        this.bachelorDegree = bachelorDegree;
    }

    public String getElseDegree() {
        return elseDegree;
    }

    public void setElseDegree(String elseDegree) {
        this.elseDegree = elseDegree;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getSex3() {
        return sex3;
    }

    public void setSex3(String sex3) {
        this.sex3 = sex3;
    }

    public String getBirth3() {
        return birth3;
    }

    public void setBirth3(String birth3) {
        this.birth3 = birth3;
    }

    public String getCertificateType3() {
        return certificateType3;
    }

    public void setCertificateType3(String certificateType3) {
        this.certificateType3 = certificateType3;
    }

    public String getCertificateNum3() {
        return certificateNum3;
    }

    public void setCertificateNum3(String certificateNum3) {
        this.certificateNum3 = certificateNum3;
    }

    public String getMajor3() {
        return major3;
    }

    public void setMajor3(String major3) {
        this.major3 = major3;
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title3) {
        this.title3 = title3;
    }

    public String getPosition3() {
        return position3;
    }

    public void setPosition3(String position3) {
        this.position3 = position3;
    }

    public String getEducationBackground3() {
        return educationBackground3;
    }

    public void setEducationBackground3(String educationBackground3) {
        this.educationBackground3 = educationBackground3;
    }

    public String getUnit3() {
        return unit3;
    }

    public void setUnit3(String unit3) {
        this.unit3 = unit3;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail3() {
        return email3;
    }

    public void setEmail3(String email3) {
        this.email3 = email3;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public List<ResearcherInfo> getResearcherInfoList() {
        return researcherInfoList;
    }

    public void setResearcherInfoList(List<ResearcherInfo> researcherInfoList) {
        this.researcherInfoList = researcherInfoList;
    }
}
