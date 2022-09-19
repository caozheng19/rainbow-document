package edu.changan.rainbow.document.entity.info;

import java.util.List;

/**
 * 项目进度计划信息
 */
public class ProjectScheduleInfo {
    /**
     * 阶段信息列表
     */
    List<PhaseInfo> phaseInfoList;

    public List<PhaseInfo> getPhaseInfoList() {
        return phaseInfoList;
    }

    public void setPhaseInfoList(List<PhaseInfo> phaseInfoList) {
        this.phaseInfoList = phaseInfoList;
    }
}
