package com.org;

import java.util.ArrayList;
import java.util.List;

public class Aadhar implements Identifier {

	public Aadhar() {
		System.out.println("Aaddhar");
	}
	@Override
	public List<String> display() {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<>();
		list.add("Name:Rahul");
		list.add("Age:25");
		list.add("FingerPrint");
		list.add("RatinalScanning");
		return list;
	}

}
