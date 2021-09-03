package com.xworkz.designpattern.dp.dto;

public class MessageTester {

	public static void main(String[] args) {
		MessageDTO message = new MessageDTO();
		message.setMsgPerDay(150);
		message.setCharPerMsg("1rs");
		message.setPerMsgCharge(2);
		message.setReceiverName("Anu");
		message.setSenderName("Priya");
		System.out.println(message);

		MessageDTO message1 = new MessageDTO(100, 1, "Teju", "Sahana", "0.5rs");
		System.out.println(message1);

	}

}
