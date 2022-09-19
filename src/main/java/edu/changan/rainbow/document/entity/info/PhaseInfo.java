package edu.changan.rainbow.document.entity.info;

public class PhaseInfo {
    /**
     * 阶段信息-阶段
     */
    private String phaseNo;
    /**
     * 阶段信息-开始时间
     */
    private String startTime5;
    /**
     * 阶段信息-结束时间
     */
    private String stopTime5;
    /**
     * 阶段信息-计划完成内容
     */
    private String scheduleCpContent;

    public String getPhaseNo() {
        return phaseNo;
    }

    public void setPhaseNo(String phaseNo) {
        this.phaseNo = phaseNo;
    }

    public String getStartTime5() {
        return startTime5;
    }

    public void setStartTime5(String startTime5) {
        this.startTime5 = startTime5;
    }

    public String getStopTime5() {
        return stopTime5;
    }

    public void setStopTime5(String stopTime5) {
        this.stopTime5 = stopTime5;
    }

    public String getScheduleCpContent() {
        return scheduleCpContent;
    }

    public void setScheduleCpContent(String scheduleCpContent) {
        this.scheduleCpContent = scheduleCpContent;
    }
}
