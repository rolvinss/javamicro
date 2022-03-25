package com.example.microservices.billingservice;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Billing {
	
	@Id
	private Long id;
	
	private String TenantName;
	
	private String Consumption;

	private String PeakDemand;

	private String BillingPeriod;


	private String ChildSpaceNames;

	private String VariationState;

	private String PeakDemandUnit;

	private Long Cost;

	private Boolean IsAutomatedBill;

	private Date LastBillingStartDate;

	private String FacilityId;

	private String Area;

	private String BillPeriodsString;

	private String TotalLastBilledAmount;

	private String IsAnchor;

	private String Currency;

	private String LastBillingEndDate;

	private String AreaUnit;

	private String ConsumptionUnit;

	private String BillPeriods;

	private String Variation;

	private String BillingType;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getConsumption() {
		return Consumption;
	}

	public void setConsumption(String consumption) {
		Consumption = consumption;
	}

	public String getPeakDemand() {
		return PeakDemand;
	}

	public void setPeakDemand(String peakDemand) {
		PeakDemand = peakDemand;
	}

	public String getBillingPeriod() {
		return BillingPeriod;
	}

	public void setBillingPeriod(String billingPeriod) {
		BillingPeriod = billingPeriod;
	}

	public String getTenantName() {
		return TenantName;
	}

	public void setTenantName(String tenantName) {
		TenantName = tenantName;
	}

	public String getChildSpaceNames() {
		return ChildSpaceNames;
	}

	public void setChildSpaceNames(String childSpaceNames) {
		ChildSpaceNames = childSpaceNames;
	}

	public String getVariationState() {
		return VariationState;
	}

	public void setVariationState(String variationState) {
		VariationState = variationState;
	}

	public String getPeakDemandUnit() {
		return PeakDemandUnit;
	}

	public void setPeakDemandUnit(String peakDemandUnit) {
		PeakDemandUnit = peakDemandUnit;
	}

	public Long getCost() {
		return Cost;
	}

	public void setCost(Long cost) {
		Cost = cost;
	}

	public Boolean getIsAutomatedBill() {
		return IsAutomatedBill;
	}

	public void setIsAutomatedBill(Boolean isAutomatedBill) {
		IsAutomatedBill = isAutomatedBill;
	}

	public Date getLastBillingStartDate() {
		return LastBillingStartDate;
	}

	public void setLastBillingStartDate(Date lastBillingStartDate) {
		LastBillingStartDate = lastBillingStartDate;
	}

	public String getFacilityId() {
		return FacilityId;
	}

	public void setFacilityId(String facilityId) {
		FacilityId = facilityId;
	}

	public String getArea() {
		return Area;
	}

	public void setArea(String area) {
		Area = area;
	}

	public String getBillPeriodsString() {
		return BillPeriodsString;
	}

	public void setBillPeriodsString(String billPeriodsString) {
		BillPeriodsString = billPeriodsString;
	}

	public String getTotalLastBilledAmount() {
		return TotalLastBilledAmount;
	}

	public void setTotalLastBilledAmount(String totalLastBilledAmount) {
		TotalLastBilledAmount = totalLastBilledAmount;
	}

	public String getIsAnchor() {
		return IsAnchor;
	}

	public void setIsAnchor(String isAnchor) {
		IsAnchor = isAnchor;
	}

	public String getCurrency() {
		return Currency;
	}

	public void setCurrency(String currency) {
		Currency = currency;
	}

	public String getLastBillingEndDate() {
		return LastBillingEndDate;
	}

	public void setLastBillingEndDate(String lastBillingEndDate) {
		LastBillingEndDate = lastBillingEndDate;
	}

	public String getAreaUnit() {
		return AreaUnit;
	}

	public void setAreaUnit(String areaUnit) {
		AreaUnit = areaUnit;
	}

	public String getConsumptionUnit() {
		return ConsumptionUnit;
	}

	public void setConsumptionUnit(String consumptionUnit) {
		ConsumptionUnit = consumptionUnit;
	}

	public String getBillPeriods() {
		return BillPeriods;
	}

	public void setBillPeriods(String billPeriods) {
		BillPeriods = billPeriods;
	}

	public String getVariation() {
		return Variation;
	}

	public void setVariation(String variation) {
		Variation = variation;
	}

	public String getBillingType() {
		return BillingType;
	}

	public void setBillingType(String billingType) {
		BillingType = billingType;
	}

	public Billing() {
		super();
	}

	public Billing(Long id, String consumption, String peakDemand, String billingPeriod, String tenantName,
			String childSpaceNames, String variationState, String peakDemandUnit, Long cost, Boolean isAutomatedBill,
			Date lastBillingStartDate, String facilityId, String area, String billPeriodsString,
			String totalLastBilledAmount, String isAnchor, String currency, String lastBillingEndDate, String areaUnit,
			String consumptionUnit, String billPeriods, String variation, String billingType) {
		super();
		this.id = id;
		Consumption = consumption;
		PeakDemand = peakDemand;
		BillingPeriod = billingPeriod;
		TenantName = tenantName;
		ChildSpaceNames = childSpaceNames;
		VariationState = variationState;
		PeakDemandUnit = peakDemandUnit;
		Cost = cost;
		IsAutomatedBill = isAutomatedBill;
		LastBillingStartDate = lastBillingStartDate;
		FacilityId = facilityId;
		Area = area;
		BillPeriodsString = billPeriodsString;
		TotalLastBilledAmount = totalLastBilledAmount;
		IsAnchor = isAnchor;
		Currency = currency;
		LastBillingEndDate = lastBillingEndDate;
		AreaUnit = areaUnit;
		ConsumptionUnit = consumptionUnit;
		BillPeriods = billPeriods;
		Variation = variation;
		BillingType = billingType;
	}

}
