package com.zl.pojo.business;
/**
 *信用卡申请进度表尸体类
 */

import java.util.Date;

import com.zl.pojo.manger.CardType;

public class ApplyCardPlan {
	private int id;//主键id
	private int cardType;		//卡种id，外键关联卡种表		plan_card
	private Date applyTime;			//申请时间					plan_time
	private String planState;		//进度状态					plan_state
	private Date acceptTime;		//受理时间					plan_accept_time
	private String planIDcard;		//申请人身份证号				plan_idcard
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getApplyTime() {
		return applyTime;
	}
	public void setApplyTime(Date applyTime) {
		this.applyTime = applyTime;
	}
	public String getPlanState() {
		return planState;
	}
	public void setPlanState(String planState) {
		this.planState = planState;
	}
	public Date getAcceptTime() {
		return acceptTime;
	}
	public void setAcceptTime(Date acceptTime) {
		this.acceptTime = acceptTime;
	}
	public String getPlanIDcard() {
		return planIDcard;
	}
	public void setPlanIDcard(String planIDcard) {
		this.planIDcard = planIDcard;
	}
	public int getCardType() {
		return cardType;
	}
	public void setCardType(int cardType) {
		this.cardType = cardType;
	}
	@Override
	public String toString() {
		return "ApplyCardPlan [id=" + id + ", cardType=" + cardType + ", applyTime=" + applyTime + ", planState="
				+ planState + ", acceptTime=" + acceptTime + ", planIDcard=" + planIDcard + "]";
	}
	
	
}
