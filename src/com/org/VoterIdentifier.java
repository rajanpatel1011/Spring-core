package com.org;

import java.util.ArrayList;
import java.util.List;

public class VoterIdentifier implements Identifier {

	@Override
	public List<String> display() {
		// TODO Auto-generated method stub
		List<String> list= new ArrayList<>();
		list.add("Name:Rahul");
		list.add("Age:25");
		return list;
	}

}
