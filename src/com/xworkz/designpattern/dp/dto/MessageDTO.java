package com.xworkz.designpattern.dp.dto;

import java.io.Serializable;

public class MessageDTO implements Serializable {

	private int msgPerDay;
	private int perMsgChargeInRs;
	private String receiverName;
	private String senderName;
	private String charPerMsg;

	public MessageDTO() {
		System.out.println("Default constructor");
	}

	public MessageDTO(int msgPerDay, int perMsgCharge, String receiverName, String senderName, String charPerMsg) {
		super();
		this.msgPerDay = msgPerDay;
		this.perMsgChargeInRs = perMsgCharge;
		this.receiverName = receiverName;
		this.senderName = senderName;
		this.charPerMsg = charPerMsg;
	}

	public int getMsgPerDay() {
		return msgPerDay;
	}

	public void setMsgPerDay(int msgPerDay) {
		this.msgPerDay = msgPerDay;
	}

	public int getPerMsgCharge() {
		return perMsgChargeInRs;
	}

	public void setPerMsgCharge(int perMsgCharge) {
		this.perMsgChargeInRs = perMsgCharge;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	public String getCharPerMsg() {
		return charPerMsg;
	}

	public void setCharPerMsg(String charPerMsg) {
		this.charPerMsg = charPerMsg;
	}

	@Override
	public String toString() {
		return "MessageDTO [msgPerDay=" + msgPerDay + ", perMsgChargeInRs=" + perMsgChargeInRs + ", receiverName="
				+ receiverName + ", senderName=" + senderName + ", charPerMsg=" + charPerMsg + "]";
	}

}
