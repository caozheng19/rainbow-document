package edu.changan.rainbow.document.entity.info;

import java.util.List;

/**
 * 基本信息类
 */
public class BaseInfo {
    /**
     * 申请人信息-姓名
     */
    private String name;
    /**
     * 申请人信息-性别
     */
    private String sex;
    /**
     * 申请人信息-出生年月
     */
    private String birth;
    /**
     * 申请人信息-职称
     */
    private String title;
    /**
     * 申请人信息-手机号码
     */
    private String phone;
    /**
     * 申请人信息-电子邮箱
     */
    private String email;
    /**
     * 申请人信息-学位
     */
    private String degree;
    /**
     * 申请人信息-最终学位授予国及地区
     */
    private String degreeAwardedRegion;
    /**
     * 申请人信息-授予年份
     */
    private String awardedYear;
    /**
     * 项目基本信息-项目名称
     */
    private String projectName;
    /**
     * 项目基本信息-项目类别
     */
    private String projectType;
    /**
     * 项目基本信息-指南分类
     */
    private String guideClassification;
    /**
     * 项目基本信息-开始时间
     */
    private String startTimeY;
    /**
     * 项目基本信息-开始时间
     */
    private String startTimeM;
    /**
     * 项目基本信息-结束时间
     */
    private String stopTimeY;
    /**
     * 项目基本信息-结束时间
     */
    private String stopTimeM;
    /**
    /**
     * 项目基本信息-项目总投资
     */
    private String totalInvestment;
    /**
     * 项目基本信息-省厅拨款
     */
    private String agenciesAppropriations;
    /**
     * 项目基本信息-申报单位
     */
    private String applicationUnit;
    /**
     * 项目基本信息-通信地址
     */
    private String correspondenceAddress;
    /**
     * 项目基本信息-单位性质
     */
    private String unitNature;
    /**
     * 项目基本信息-联系电话
     */
    private String phoneNum;
    /**
     * 合作单位信息
     */
    private List<CooperationUnitInfo> cooperationUnitInfoList;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getDegreeAwardedRegion() {
        return degreeAwardedRegion;
    }

    public void setDegreeAwardedRegion(String degreeAwardedRegion) {
        this.degreeAwardedRegion = degreeAwardedRegion;
    }

    public String getAwardedYear() {
        return awardedYear;
    }

    public void setAwardedYear(String awardedYear) {
        this.awardedYear = awardedYear;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getGuideClassification() {
        return guideClassification;
    }

    public void setGuideClassification(String guideClassification) {
        this.guideClassification = guideClassification;
    }

    public String getStartTimeY() {
        return startTimeY;
    }

    public void setStartTimeY(String startTimeY) {
        this.startTimeY = startTimeY;
    }

    public String getStartTimeM() {
        return startTimeM;
    }

    public void setStartTimeM(String startTimeM) {
        this.startTimeM = startTimeM;
    }

    public String getStopTimeY() {
        return stopTimeY;
    }

    public void setStopTimeY(String stopTimeY) {
        this.stopTimeY = stopTimeY;
    }

    public String getStopTimeM() {
        return stopTimeM;
    }

    public void setStopTimeM(String stopTimeM) {
        this.stopTimeM = stopTimeM;
    }

    public String getTotalInvestment() {
        return totalInvestment;
    }

    public void setTotalInvestment(String totalInvestment) {
        this.totalInvestment = totalInvestment;
    }

    public String getAgenciesAppropriations() {
        return agenciesAppropriations;
    }

    public void setAgenciesAppropriations(String agenciesAppropriations) {
        this.agenciesAppropriations = agenciesAppropriations;
    }

    public String getApplicationUnit() {
        return applicationUnit;
    }

    public void setApplicationUnit(String applicationUnit) {
        this.applicationUnit = applicationUnit;
    }

    public String getCorrespondenceAddress() {
        return correspondenceAddress;
    }

    public void setCorrespondenceAddress(String correspondenceAddress) {
        this.correspondenceAddress = correspondenceAddress;
    }

    public String getUnitNature() {
        return unitNature;
    }

    public void setUnitNature(String unitNature) {
        this.unitNature = unitNature;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public List<CooperationUnitInfo> getCooperationUnitInfoList() {
        return cooperationUnitInfoList;
    }

    public void setCooperationUnitInfoList(List<CooperationUnitInfo> cooperationUnitInfoList) {
        this.cooperationUnitInfoList = cooperationUnitInfoList;
    }
}
