package edu.changan.rainbow.document.entity;

import edu.changan.rainbow.document.entity.info.*;

public class PdfInfo {
    private CovertitleInfo covertitleInfo;
    private BaseInfo baseInfo;

    private ProjectBaseInfo projectBaseInfo;

    private ProParticipantsInfo proParticipantsInfo;

    private ProCapitalSourceInfo proCapitalSourceInfo;

    private ProjectScheduleInfo projectScheduleInfo;

    private ProPerformanceTarInfo proPerformanceTarInfo;

    private AuditOpinionInfo auditOpinionInfo;

    public BaseInfo getBaseInfo() {
        return baseInfo;
    }

    public void setBaseInfo(BaseInfo baseInfo) {
        this.baseInfo = baseInfo;
    }

    public CovertitleInfo getCovertitleInfo() {
        return covertitleInfo;
    }

    public void setCovertitleInfo(CovertitleInfo covertitleInfo) {
        this.covertitleInfo = covertitleInfo;
    }

    public ProjectBaseInfo getProjectBaseInfo() {
        return projectBaseInfo;
    }

    public void setProjectBaseInfo(ProjectBaseInfo projectBaseInfo) {
        this.projectBaseInfo = projectBaseInfo;
    }

    public ProParticipantsInfo getProParticipantsInfo() {
        return proParticipantsInfo;
    }

    public void setProParticipantsInfo(ProParticipantsInfo proParticipantsInfo) {
        this.proParticipantsInfo = proParticipantsInfo;
    }

    public ProCapitalSourceInfo getProCapitalSourceInfo() {
        return proCapitalSourceInfo;
    }

    public void setProCapitalSourceInfo(ProCapitalSourceInfo proCapitalSourceInfo) {
        this.proCapitalSourceInfo = proCapitalSourceInfo;
    }

    public ProjectScheduleInfo getProjectScheduleInfo() {
        return projectScheduleInfo;
    }

    public void setProjectScheduleInfo(ProjectScheduleInfo projectScheduleInfo) {
        this.projectScheduleInfo = projectScheduleInfo;
    }

    public ProPerformanceTarInfo getProPerformanceTarInfo() {
        return proPerformanceTarInfo;
    }

    public void setProPerformanceTarInfo(ProPerformanceTarInfo proPerformanceTarInfo) {
        this.proPerformanceTarInfo = proPerformanceTarInfo;
    }

    public AuditOpinionInfo getAuditOpinionInfo() {
        return auditOpinionInfo;
    }

    public void setAuditOpinionInfo(AuditOpinionInfo auditOpinionInfo) {
        this.auditOpinionInfo = auditOpinionInfo;
    }
}
