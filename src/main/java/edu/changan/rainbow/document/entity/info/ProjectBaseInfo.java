package edu.changan.rainbow.document.entity.info;
/**
 * 项目基本情况
 */
public class ProjectBaseInfo {
    /**
     * 项目主要研究内容和意义
     */
     private String contentSignificance;
    /**
     * 预期研究目标
     */
     private String researchTarget;

    public String getContentSignificance() {
        return contentSignificance;
    }

    public void setContentSignificance(String contentSignificance) {
        this.contentSignificance = contentSignificance;
    }

    public String getResearchTarget() {
        return researchTarget;
    }

    public void setResearchTarget(String researchTarget) {
        this.researchTarget = researchTarget;
    }
}
