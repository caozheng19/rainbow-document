package edu.changan.rainbow.document.entity.info;
/**
 * 项目经费情况类
 */
public class ProCapitalSourceInfo {
    /**
     * 资金来源预算-省厅资助
     */
    private String agenciesFunded;
    /**
     * 资金来源预算-省厅资助2022
     */
    private String agenciesFundedFir;
    /**
     * 资金来源预算-省厅资助2023
     */
    private String agenciesFundedSec;
    /**
     * 资金来源预算-省厅资助2024
     */
    private String agenciesFundedThi;
    /**
     * 资金来源预算-单位自筹经费
     */
    private String unitRaisedFonded;
    /**
     * 资金来源预算-单位自筹经费2022
     */
    private String unitRaisedFondedFir;
    /**
     * 资金来源预算-单位自筹经费2023
     */
    private String unitRaisedFondedSec;
    /**
     * 资金来源预算-单位自筹经费2024
     */
    private String unitRaisedFondedThi;
    /**
     * 资金来源预算-其他经费来源
     */
    private String elseFonded;
    /**
     * 资金来源预算-其他经费来源2022
     */
    private String elseFondedFir;
    /**
     * 资金来源预算-其他经费来源2023
     */
    private String elseFondedSec;
    /**
     * 资金来源预算-其他经费来源2024
     */
    private String elseFondedThi;
    /**
     * 资金来源预算-来源总计
     */
    private String sourceFondedTotal;
    /**
     * 资金来源预算-来源总计2022
     */
    private String sourceFondedTotalFir;
    /**
     * 资金来源预算-来源总计2023
     */
    private String sourceFondedTotalSec;
    /**
     * 资金来源预算-来源总计2024
     */
    private String sourceFondedTotalThi;
    /**
     * 资金支出预算-直接费用
     */
    private String directCost;
    /**
     * 资金支出预算-直接费用-省厅资助
     */
    private String directCostFir;
    /**
     * 资金支出预算-直接费用-自筹经费
     */
    private String directCostSec;
    /**
     * 资金支出预算-直接费用-其它经费
     */
    private String directCostThi;

    /**
     * 资金支出预算-设备费
     */
    private String equipmentCost;
    /**
     * 资金支出预算-设备费-省厅资助
     */
    private String equipmentCostFir;
    /**
     * 资金支出预算-设备费-自筹经费
     */
    private String equipmentCostSec;
    /**
     * 资金支出预算-设备费-其它经费
     */
    private String equipmentCostThi;

    /**
     * 资金支出预算-购置设备费
     */
    private String purchaseEquipmentCost;
    /**
     * 资金支出预算-购置设备费-省厅资助
     */
    private String purchaseEquipmentCostFir;
    /**
     * 资金支出预算-购置设备费-自筹经费
     */
    private String purchaseEquipmentCostSec;
    /**
     * 资金支出预算-购置设备费-其它经费
     */
    private String purchaseEquipmentCostThi;

    /**
     * 资金支出预算-自制设备费
     */
    private String madeEquipmentCost;
    /**
     * 资金支出预算-自制设备费-省厅资助
     */
    private String madeEquipmentCostFir;
    /**
     * 资金支出预算-自制设备费-自筹经费
     */
    private String madeEquipmentCostSec;
    /**
     * 资金支出预算-自制设备费-其它经费
     */
    private String madeEquipmentCostThi;

    /**
     * 资金支出预算-设备改造与租赁
     */
    private String leaseEquipmentCost;
    /**
     * 资金支出预算-设备改造与租赁-省厅资助
     */
    private String leaseEquipmentCostFir;
    /**
     * 资金支出预算-设备改造与租赁-自筹经费
     */
    private String leaseEquipmentCostSec;
    /**
     * 资金支出预算-设备改造与租赁-其它经费
     */
    private String leaseEquipmentCostThi;



    /**
     * 资金支出预算-材料费
     */
    private String materialCost;
    /**
     * 资金支出预算-材料费-省厅资助
     */
    private String materialCostFir;
    /**
     * 资金支出预算-材料费-自筹经费
     */
    private String materialCostSec;
    /**
     * 资金支出预算-材料费-其它经费
     */
    private String materialCostThi;


    /**
     * 资金支出预算-测试化验加工费
     */
    private String testAPCost;
    /**
     * 资金支出预算-测试化验加工费-省厅资助
     */
    private String testAPCostFir;
    /**
     * 资金支出预算-测试化验加工费-自筹经费
     */
    private String testAPCostSec;
    /**
     * 资金支出预算-测试化验加工费-其它经费
     */
    private String testAPCostThi;


    /**
     * 资金支出预算-燃料动力费
     */
    private String  fuelsEnergyCost;
    /**
     * 资金支出预算-燃料动力费-省厅资助
     */
    private String fuelsEnergyCostFir;
    /**
     * 资金支出预算-燃料动力费-自筹经费
     */
    private String fuelsEnergyCostSec;
    /**
     * 资金支出预算-燃料动力费-其它经费
     */
    private String fuelsEnergyCostThi;

    /**
     * 资金支出预算-信息费
     */
    private String  messageCost;
    /**
     * 资金支出预算-信息费-省厅资助
     */
    private String messageCostFir;
    /**
     * 资金支出预算-信息费-自筹经费
     */
    private String messageCostSec;
    /**
     * 资金支出预算-信息费-其它经费
     */
    private String messageCostThi;

    /**
     * 资金支出预算-差旅/会议/国际合作与交流费
     */
    private String travelBusinessCost;
    /**
     * 资金支出预算-差旅/会议/国际合作与交流费-省厅资助
     */
    private String travelBusinessCostFir;
    /**
     * 资金支出预算-差旅/会议/国际合作与交流费-自筹经费
     */
    private String travelBusinessCostSec;
    /**
     * 资金支出预算-差旅/会议/国际合作与交流费-其它经费
     */
    private String travelBusinessCostThi;

    /**
     * 资金支出预算-专家咨询费
     */
    private String expertConsultingCost;
    /**
     * 资金支出预算-专家咨询费-省厅资助
     */
    private String expertConsultingCostFir;
    /**
     * 资金支出预算-专家咨询费-自筹经费
     */
    private String expertConsultingCostSec;
    /**
     * 资金支出预算-专家咨询费-其它经费
     */
    private String expertConsultingCostThi;

    /**
     * 资金支出预算-劳务费
     */
    private String laborCost;
    /**
     * 资金支出预算-劳务费-省厅资助
     */
    private String laborCostFir;
    /**
     * 资金支出预算-劳务费-自筹经费
     */
    private String laborCostSec;
    /**
     * 资金支出预算-劳务费-其它经费
     */
    private String laborCostThi;

    /**
     * 资金支出预算-其他支出
     */
    private String elseCost;
    /**
     * 资金支出预算-劳务费-省厅资助
     */
    private String elseCostFir;
    /**
     * 资金支出预算-劳务费-自筹经费
     */
    private String elseCostSec;
    /**
     * 资金支出预算-劳务费-其它经费
     */
    private String elseCostThi;


    /**
     * 资金支出预算-间接费用
     */
    private String indirectCost;
    /**
     * 资金支出预算-间接费用-省厅资助
     */
    private String indirectCostFir;
    /**
     * 资金支出预算-间接费用-自筹经费
     */
    private String indirectCostSec;
    /**
     * 资金支出预算-间接费用-其它经费
     */
    private String indirectCostThi;

    /**
     * 资金支出预算-管理费
     */
    private String manageCost;
    /**
     * 资金支出预算-管理费-省厅资助
     */
    private String manageCostFir;
    /**
     * 资金支出预算-管理费-自筹经费
     */
    private String manageCostSec;
    /**
     * 资金支出预算-管理费-其它经费
     */
    private String manageCostThi;


    /**
     * 资金支出预算-绩效支出
     */
    private String performanceCost;
    /**
     * 资金支出预算-绩效支出-省厅资助
     */
    private String performanceCostFir;
    /**
     * 资金支出预算-绩效支出-自筹经费
     */
    private String performanceCostSec;
    /**
     * 资金支出预算-绩效支出-其它经费
     */
    private String performanceCostThi;

    /**
     * 资金支出预算-其他费用
     */
    private String elseIndirectCost;
    /**
     * 资金支出预算-其他费用-省厅资助
     */
    private String elseIndirectCostFir;
    /**
     * 资金支出预算-其他费用-自筹经费
     */
    private String elseIndirectCostSec;
    /**
     * 资金支出预算-其他费用-其它经费
     */
    private String elseIndirectCostThi;


    /**
     * 资金支出预算-支出合计
     */
    private String costTotal;
    /**
     * 资金支出预算-支出合计-省厅资助
     */
    private String costTotalFir;
    /**
     * 资金支出预算-支出合计-自筹经费
     */
    private String costTotalSec;
    /**
     * 资金支出预算-支出合计-其它经费
     */
    private String costTotalThi;



    public String getAgenciesFunded() {
        return agenciesFunded;
    }

    public void setAgenciesFunded(String agenciesFunded) {
        this.agenciesFunded = agenciesFunded;
    }

    public String getAgenciesFundedFir() {
        return agenciesFundedFir;
    }

    public void setAgenciesFundedFir(String agenciesFundedFir) {
        this.agenciesFundedFir = agenciesFundedFir;
    }

    public String getAgenciesFundedSec() {
        return agenciesFundedSec;
    }

    public void setAgenciesFundedSec(String agenciesFundedSec) {
        this.agenciesFundedSec = agenciesFundedSec;
    }

    public String getAgenciesFundedThi() {
        return agenciesFundedThi;
    }

    public void setAgenciesFundedThi(String agenciesFundedThi) {
        this.agenciesFundedThi = agenciesFundedThi;
    }

    public String getUnitRaisedFonded() {
        return unitRaisedFonded;
    }

    public void setUnitRaisedFonded(String unitRaisedFonded) {
        this.unitRaisedFonded = unitRaisedFonded;
    }

    public String getUnitRaisedFondedFir() {
        return unitRaisedFondedFir;
    }

    public void setUnitRaisedFondedFir(String unitRaisedFondedFir) {
        this.unitRaisedFondedFir = unitRaisedFondedFir;
    }

    public String getUnitRaisedFondedSec() {
        return unitRaisedFondedSec;
    }

    public void setUnitRaisedFondedSec(String unitRaisedFondedSec) {
        this.unitRaisedFondedSec = unitRaisedFondedSec;
    }

    public String getUnitRaisedFondedThi() {
        return unitRaisedFondedThi;
    }

    public void setUnitRaisedFondedThi(String unitRaisedFondedThi) {
        this.unitRaisedFondedThi = unitRaisedFondedThi;
    }

    public String getElseFonded() {
        return elseFonded;
    }

    public void setElseFonded(String elseFonded) {
        this.elseFonded = elseFonded;
    }

    public String getElseFondedFir() {
        return elseFondedFir;
    }

    public void setElseFondedFir(String elseFondedFir) {
        this.elseFondedFir = elseFondedFir;
    }

    public String getElseFondedSec() {
        return elseFondedSec;
    }

    public void setElseFondedSec(String elseFondedSec) {
        this.elseFondedSec = elseFondedSec;
    }

    public String getElseFondedThi() {
        return elseFondedThi;
    }

    public void setElseFondedThi(String elseFondedThi) {
        this.elseFondedThi = elseFondedThi;
    }

    public String getSourceFondedTotal() {
        return sourceFondedTotal;
    }

    public void setSourceFondedTotal(String sourceFondedTotal) {
        this.sourceFondedTotal = sourceFondedTotal;
    }

    public String getSourceFondedTotalFir() {
        return sourceFondedTotalFir;
    }

    public void setSourceFondedTotalFir(String sourceFondedTotalFir) {
        this.sourceFondedTotalFir = sourceFondedTotalFir;
    }

    public String getSourceFondedTotalSec() {
        return sourceFondedTotalSec;
    }

    public void setSourceFondedTotalSec(String sourceFondedTotalSec) {
        this.sourceFondedTotalSec = sourceFondedTotalSec;
    }

    public String getSourceFondedTotalThi() {
        return sourceFondedTotalThi;
    }

    public void setSourceFondedTotalThi(String sourceFondedTotalThi) {
        this.sourceFondedTotalThi = sourceFondedTotalThi;
    }

    public String getDirectCost() {
        return directCost;
    }

    public void setDirectCost(String directCost) {
        this.directCost = directCost;
    }

    public String getDirectCostFir() {
        return directCostFir;
    }

    public void setDirectCostFir(String directCostFir) {
        this.directCostFir = directCostFir;
    }

    public String getDirectCostSec() {
        return directCostSec;
    }

    public void setDirectCostSec(String directCostSec) {
        this.directCostSec = directCostSec;
    }

    public String getDirectCostThi() {
        return directCostThi;
    }

    public void setDirectCostThi(String directCostThi) {
        this.directCostThi = directCostThi;
    }

    public String getEquipmentCost() {
        return equipmentCost;
    }

    public void setEquipmentCost(String equipmentCost) {
        this.equipmentCost = equipmentCost;
    }

    public String getEquipmentCostFir() {
        return equipmentCostFir;
    }

    public void setEquipmentCostFir(String equipmentCostFir) {
        this.equipmentCostFir = equipmentCostFir;
    }

    public String getEquipmentCostSec() {
        return equipmentCostSec;
    }

    public void setEquipmentCostSec(String equipmentCostSec) {
        this.equipmentCostSec = equipmentCostSec;
    }

    public String getEquipmentCostThi() {
        return equipmentCostThi;
    }

    public void setEquipmentCostThi(String equipmentCostThi) {
        this.equipmentCostThi = equipmentCostThi;
    }

    public String getPurchaseEquipmentCost() {
        return purchaseEquipmentCost;
    }

    public void setPurchaseEquipmentCost(String purchaseEquipmentCost) {
        this.purchaseEquipmentCost = purchaseEquipmentCost;
    }

    public String getPurchaseEquipmentCostFir() {
        return purchaseEquipmentCostFir;
    }

    public void setPurchaseEquipmentCostFir(String purchaseEquipmentCostFir) {
        this.purchaseEquipmentCostFir = purchaseEquipmentCostFir;
    }

    public String getPurchaseEquipmentCostSec() {
        return purchaseEquipmentCostSec;
    }

    public void setPurchaseEquipmentCostSec(String purchaseEquipmentCostSec) {
        this.purchaseEquipmentCostSec = purchaseEquipmentCostSec;
    }

    public String getPurchaseEquipmentCostThi() {
        return purchaseEquipmentCostThi;
    }

    public void setPurchaseEquipmentCostThi(String purchaseEquipmentCostThi) {
        this.purchaseEquipmentCostThi = purchaseEquipmentCostThi;
    }

    public String getMadeEquipmentCost() {
        return madeEquipmentCost;
    }

    public void setMadeEquipmentCost(String madeEquipmentCost) {
        this.madeEquipmentCost = madeEquipmentCost;
    }

    public String getMadeEquipmentCostFir() {
        return madeEquipmentCostFir;
    }

    public void setMadeEquipmentCostFir(String madeEquipmentCostFir) {
        this.madeEquipmentCostFir = madeEquipmentCostFir;
    }

    public String getMadeEquipmentCostSec() {
        return madeEquipmentCostSec;
    }

    public void setMadeEquipmentCostSec(String madeEquipmentCostSec) {
        this.madeEquipmentCostSec = madeEquipmentCostSec;
    }

    public String getMadeEquipmentCostThi() {
        return madeEquipmentCostThi;
    }

    public void setMadeEquipmentCostThi(String madeEquipmentCostThi) {
        this.madeEquipmentCostThi = madeEquipmentCostThi;
    }

    public String getLeaseEquipmentCost() {
        return leaseEquipmentCost;
    }

    public void setLeaseEquipmentCost(String leaseEquipmentCost) {
        this.leaseEquipmentCost = leaseEquipmentCost;
    }

    public String getLeaseEquipmentCostFir() {
        return leaseEquipmentCostFir;
    }

    public void setLeaseEquipmentCostFir(String leaseEquipmentCostFir) {
        this.leaseEquipmentCostFir = leaseEquipmentCostFir;
    }

    public String getLeaseEquipmentCostSec() {
        return leaseEquipmentCostSec;
    }

    public void setLeaseEquipmentCostSec(String leaseEquipmentCostSec) {
        this.leaseEquipmentCostSec = leaseEquipmentCostSec;
    }

    public String getLeaseEquipmentCostThi() {
        return leaseEquipmentCostThi;
    }

    public void setLeaseEquipmentCostThi(String leaseEquipmentCostThi) {
        this.leaseEquipmentCostThi = leaseEquipmentCostThi;
    }

    public String getMaterialCost() {
        return materialCost;
    }

    public void setMaterialCost(String materialCost) {
        this.materialCost = materialCost;
    }

    public String getMaterialCostFir() {
        return materialCostFir;
    }

    public void setMaterialCostFir(String materialCostFir) {
        this.materialCostFir = materialCostFir;
    }

    public String getMaterialCostSec() {
        return materialCostSec;
    }

    public void setMaterialCostSec(String materialCostSec) {
        this.materialCostSec = materialCostSec;
    }

    public String getMaterialCostThi() {
        return materialCostThi;
    }

    public void setMaterialCostThi(String materialCostThi) {
        this.materialCostThi = materialCostThi;
    }

    public String getTestAPCost() {
        return testAPCost;
    }

    public void setTestAPCost(String testAPCost) {
        this.testAPCost = testAPCost;
    }

    public String getTestAPCostFir() {
        return testAPCostFir;
    }

    public void setTestAPCostFir(String testAPCostFir) {
        this.testAPCostFir = testAPCostFir;
    }

    public String getTestAPCostSec() {
        return testAPCostSec;
    }

    public void setTestAPCostSec(String testAPCostSec) {
        this.testAPCostSec = testAPCostSec;
    }

    public String getTestAPCostThi() {
        return testAPCostThi;
    }

    public void setTestAPCostThi(String testAPCostThi) {
        this.testAPCostThi = testAPCostThi;
    }

    public String getFuelsEnergyCost() {
        return fuelsEnergyCost;
    }

    public void setFuelsEnergyCost(String fuelsEnergyCost) {
        this.fuelsEnergyCost = fuelsEnergyCost;
    }

    public String getFuelsEnergyCostFir() {
        return fuelsEnergyCostFir;
    }

    public void setFuelsEnergyCostFir(String fuelsEnergyCostFir) {
        this.fuelsEnergyCostFir = fuelsEnergyCostFir;
    }

    public String getFuelsEnergyCostSec() {
        return fuelsEnergyCostSec;
    }

    public void setFuelsEnergyCostSec(String fuelsEnergyCostSec) {
        this.fuelsEnergyCostSec = fuelsEnergyCostSec;
    }

    public String getFuelsEnergyCostThi() {
        return fuelsEnergyCostThi;
    }

    public void setFuelsEnergyCostThi(String fuelsEnergyCostThi) {
        this.fuelsEnergyCostThi = fuelsEnergyCostThi;
    }

    public String getMessageCost() {
        return messageCost;
    }

    public void setMessageCost(String messageCost) {
        this.messageCost = messageCost;
    }

    public String getMessageCostFir() {
        return messageCostFir;
    }

    public void setMessageCostFir(String messageCostFir) {
        this.messageCostFir = messageCostFir;
    }

    public String getMessageCostSec() {
        return messageCostSec;
    }

    public void setMessageCostSec(String messageCostSec) {
        this.messageCostSec = messageCostSec;
    }

    public String getMessageCostThi() {
        return messageCostThi;
    }

    public void setMessageCostThi(String messageCostThi) {
        this.messageCostThi = messageCostThi;
    }

    public String getTravelBusinessCost() {
        return travelBusinessCost;
    }

    public void setTravelBusinessCost(String travelBusinessCost) {
        this.travelBusinessCost = travelBusinessCost;
    }

    public String getTravelBusinessCostFir() {
        return travelBusinessCostFir;
    }

    public void setTravelBusinessCostFir(String travelBusinessCostFir) {
        this.travelBusinessCostFir = travelBusinessCostFir;
    }

    public String getTravelBusinessCostSec() {
        return travelBusinessCostSec;
    }

    public void setTravelBusinessCostSec(String travelBusinessCostSec) {
        this.travelBusinessCostSec = travelBusinessCostSec;
    }

    public String getTravelBusinessCostThi() {
        return travelBusinessCostThi;
    }

    public void setTravelBusinessCostThi(String travelBusinessCostThi) {
        this.travelBusinessCostThi = travelBusinessCostThi;
    }

    public String getExpertConsultingCost() {
        return expertConsultingCost;
    }

    public void setExpertConsultingCost(String expertConsultingCost) {
        this.expertConsultingCost = expertConsultingCost;
    }

    public String getExpertConsultingCostFir() {
        return expertConsultingCostFir;
    }

    public void setExpertConsultingCostFir(String expertConsultingCostFir) {
        this.expertConsultingCostFir = expertConsultingCostFir;
    }

    public String getExpertConsultingCostSec() {
        return expertConsultingCostSec;
    }

    public void setExpertConsultingCostSec(String expertConsultingCostSec) {
        this.expertConsultingCostSec = expertConsultingCostSec;
    }

    public String getExpertConsultingCostThi() {
        return expertConsultingCostThi;
    }

    public void setExpertConsultingCostThi(String expertConsultingCostThi) {
        this.expertConsultingCostThi = expertConsultingCostThi;
    }

    public String getLaborCost() {
        return laborCost;
    }

    public void setLaborCost(String laborCost) {
        this.laborCost = laborCost;
    }

    public String getLaborCostFir() {
        return laborCostFir;
    }

    public void setLaborCostFir(String laborCostFir) {
        this.laborCostFir = laborCostFir;
    }

    public String getLaborCostSec() {
        return laborCostSec;
    }

    public void setLaborCostSec(String laborCostSec) {
        this.laborCostSec = laborCostSec;
    }

    public String getLaborCostThi() {
        return laborCostThi;
    }

    public void setLaborCostThi(String laborCostThi) {
        this.laborCostThi = laborCostThi;
    }

    public String getElseCost() {
        return elseCost;
    }

    public void setElseCost(String elseCost) {
        this.elseCost = elseCost;
    }

    public String getElseCostFir() {
        return elseCostFir;
    }

    public void setElseCostFir(String elseCostFir) {
        this.elseCostFir = elseCostFir;
    }

    public String getElseCostSec() {
        return elseCostSec;
    }

    public void setElseCostSec(String elseCostSec) {
        this.elseCostSec = elseCostSec;
    }

    public String getElseCostThi() {
        return elseCostThi;
    }

    public void setElseCostThi(String elseCostThi) {
        this.elseCostThi = elseCostThi;
    }

    public String getIndirectCost() {
        return indirectCost;
    }

    public void setIndirectCost(String indirectCost) {
        this.indirectCost = indirectCost;
    }

    public String getIndirectCostFir() {
        return indirectCostFir;
    }

    public void setIndirectCostFir(String indirectCostFir) {
        this.indirectCostFir = indirectCostFir;
    }

    public String getIndirectCostSec() {
        return indirectCostSec;
    }

    public void setIndirectCostSec(String indirectCostSec) {
        this.indirectCostSec = indirectCostSec;
    }

    public String getIndirectCostThi() {
        return indirectCostThi;
    }

    public void setIndirectCostThi(String indirectCostThi) {
        this.indirectCostThi = indirectCostThi;
    }

    public String getManageCost() {
        return manageCost;
    }

    public void setManageCost(String manageCost) {
        this.manageCost = manageCost;
    }

    public String getManageCostFir() {
        return manageCostFir;
    }

    public void setManageCostFir(String manageCostFir) {
        this.manageCostFir = manageCostFir;
    }

    public String getManageCostSec() {
        return manageCostSec;
    }

    public void setManageCostSec(String manageCostSec) {
        this.manageCostSec = manageCostSec;
    }

    public String getManageCostThi() {
        return manageCostThi;
    }

    public void setManageCostThi(String manageCostThi) {
        this.manageCostThi = manageCostThi;
    }

    public String getPerformanceCost() {
        return performanceCost;
    }

    public void setPerformanceCost(String performanceCost) {
        this.performanceCost = performanceCost;
    }

    public String getPerformanceCostFir() {
        return performanceCostFir;
    }

    public void setPerformanceCostFir(String performanceCostFir) {
        this.performanceCostFir = performanceCostFir;
    }

    public String getPerformanceCostSec() {
        return performanceCostSec;
    }

    public void setPerformanceCostSec(String performanceCostSec) {
        this.performanceCostSec = performanceCostSec;
    }

    public String getPerformanceCostThi() {
        return performanceCostThi;
    }

    public void setPerformanceCostThi(String performanceCostThi) {
        this.performanceCostThi = performanceCostThi;
    }

    public String getElseIndirectCost() {
        return elseIndirectCost;
    }

    public void setElseIndirectCost(String elseIndirectCost) {
        this.elseIndirectCost = elseIndirectCost;
    }

    public String getElseIndirectCostFir() {
        return elseIndirectCostFir;
    }

    public void setElseIndirectCostFir(String elseIndirectCostFir) {
        this.elseIndirectCostFir = elseIndirectCostFir;
    }

    public String getElseIndirectCostSec() {
        return elseIndirectCostSec;
    }

    public void setElseIndirectCostSec(String elseIndirectCostSec) {
        this.elseIndirectCostSec = elseIndirectCostSec;
    }

    public String getElseIndirectCostThi() {
        return elseIndirectCostThi;
    }

    public void setElseIndirectCostThi(String elseIndirectCostThi) {
        this.elseIndirectCostThi = elseIndirectCostThi;
    }

    public String getCostTotal() {
        return costTotal;
    }

    public void setCostTotal(String costTotal) {
        this.costTotal = costTotal;
    }

    public String getCostTotalFir() {
        return costTotalFir;
    }

    public void setCostTotalFir(String costTotalFir) {
        this.costTotalFir = costTotalFir;
    }

    public String getCostTotalSec() {
        return costTotalSec;
    }

    public void setCostTotalSec(String costTotalSec) {
        this.costTotalSec = costTotalSec;
    }

    public String getCostTotalThi() {
        return costTotalThi;
    }

    public void setCostTotalThi(String costTotalThi) {
        this.costTotalThi = costTotalThi;
    }


}
