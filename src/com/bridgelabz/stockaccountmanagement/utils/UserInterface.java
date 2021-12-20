package com.bridgelabz.stockaccountmanagement.utils;

import java.util.ArrayList;
import java.util.Scanner;

import com.bridgelabz.stockaccountmanagement.service.StockStore;
import com.bridgelabz.stockaccountmanagement.stockvalues.StockValues;

public class UserInterface {
	public void print(ArrayList<StockValues> stockList) {
		for (int i = 0; i < stockList.size(); i++) {
			System.out.println(stockList.get(i));
		}
	}

	public void addStock(StockValues stock) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter share name");
		stock.setShareName(sc.nextLine());
		System.out.println("Enter Number of shares :");
		stock.setNumOfShares(sc.nextInt());
		System.out.println("Enter share price :");
		stock.setSharePrice(sc.nextInt());
		stock.setTotalValueOfStock(stock.getNumOfShares() * stock.getSharePrice());
		StockStore stockStore = new StockStore();
		stockStore.add(stock);
	}
}