package com.bae.service;

import org.springframework.stereotype.Service;

@Service
public class PrizeGenServiceImpl implements PrizeGenService{

	@Override
	public String genPrize(String accountNumber) {
		String prize = null;
		if (accountNumber.length() == 6) {
			switch (accountNumber.charAt(0)) {
			case 'a':
				prize = "You win £1000";
				break;
			case 'b':
				prize = "You win £700";
				break;
			case 'c':
				prize = "You win £500";
				break;

			}
		} else if (accountNumber.length() == 7) {
			switch (accountNumber.charAt(0)) {
			case 'a':
				prize = "You win £400";
				break;
			case 'b':
				prize = "You win £300";
				break;
			case 'c':
				prize = "You win £200";
				break;

			}
		} else if (accountNumber.length() == 8) {
			switch (accountNumber.charAt(0)) {
			case 'a':
				prize = "You win £100";
				break;
			case 'b':
				prize = "You win £50";
				break;
			case 'c':
				prize = "You win £0";
				break;

			}
		} 
		return prize;
	}

	
	
	

}
