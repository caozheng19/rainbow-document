package edu.changan.rainbow.document.entity.info;
/**
 * 基本信息类中的合作单位信息列表
 */
public class CooperationUnitInfo {
    /**
     * 合作单位信息列表-序号
     */
    private String no;
    /**
     * 合作单位信息列表-单位名称
     */
    private String unitName;
    /**
     * 合作单位信息列表-单位地址
     */
    private String unitAddress;
    /**
     * 合作单位信息列表-项目负责人
     */
    private String projectLeader;
    /**
     * 合作单位信息列表-联系电话
     */
    private String unitPhone;

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitAddress() {
        return unitAddress;
    }

    public void setUnitAddress(String unitAddress) {
        this.unitAddress = unitAddress;
    }

    public String getProjectLeader() {
        return projectLeader;
    }

    public void setProjectLeader(String projectLeader) {
        this.projectLeader = projectLeader;
    }

    public String getUnitPhone() {
        return unitPhone;
    }

    public void setUnitPhone(String unitPhone) {
        this.unitPhone = unitPhone;
    }
}
