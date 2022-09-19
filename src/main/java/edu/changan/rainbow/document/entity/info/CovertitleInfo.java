package edu.changan.rainbow.document.entity.info;

/**
 * 封面信息类
 */
public class CovertitleInfo {
    /**
     * 受理编号
     */
    private String acceptanceNumber;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 申报单位
     */
    private String applicationUnit;
    /**
     * 推荐部门
     */
    private String recommendDepartment;
    /**
     * 项目负责人
     */
    private String projectLeader;
    /**
     * 联系电话
     */
    private String contactPhoneNumber;
    /**
     * 申请日期
     */
    private String applicationDate;

    public String getAcceptanceNumber() {
        return acceptanceNumber;
    }

    public void setAcceptanceNumber(String acceptanceNumber) {
        this.acceptanceNumber = acceptanceNumber;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getApplicationUnit() {
        return applicationUnit;
    }

    public void setApplicationUnit(String applicationUnit) {
        this.applicationUnit = applicationUnit;
    }

    public String getRecommendDepartment() {
        return recommendDepartment;
    }

    public void setRecommendDepartment(String recommendDepartment) {
        this.recommendDepartment = recommendDepartment;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public String getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(String applicationDate) {
        this.applicationDate = applicationDate;
    }
}
