package edu.changan.rainbow.document.entity.info;
/**
 * 审核意见
 */
public class AuditOpinionInfo {
    /**
     * 申请单位意见
     */
    private String  applicantComments;
    /**
     * 推荐部门意见
     */
    private String  departmentsRecommendations;

    public String getApplicantComments() {
        return applicantComments;
    }

    public void setApplicantComments(String applicantComments) {
        this.applicantComments = applicantComments;
    }

    public String getDepartmentsRecommendations() {
        return departmentsRecommendations;
    }

    public void setDepartmentsRecommendations(String departmentsRecommendations) {
        this.departmentsRecommendations = departmentsRecommendations;
    }
}
