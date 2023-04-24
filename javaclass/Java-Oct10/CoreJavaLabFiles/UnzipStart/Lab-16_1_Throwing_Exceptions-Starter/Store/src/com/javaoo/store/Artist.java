package com.javaoo.store;

import java.util.Map;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class Artist {
	
	public Artist() {
		memberNames = new TreeSet<>();
		memberInstruments = new TreeMap<>();
	}
	
	public Artist(String name, SortedSet<String> memberNames, Map<String, SortedSet<String>> memberInstruments) {
		this.name = name;
		this.memberNames = memberNames;
		this.memberInstruments = memberInstruments;
	}

	public Artist(String name) {
		this();	// Use the default constructor to initialize the collections
		setName(name);
	}

	public void addMember(String name, SortedSet<String> instruments) {
		memberNames.add(name);
		memberInstruments.put(name, instruments);
	}
	
	public SortedSet<String> getMembers() {
		return memberNames;
	}
	
	public SortedSet<String> getInstruments(String memberName) {
		return memberInstruments.get(memberName);
	}
	
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	private SortedSet<String> memberNames;
	private Map<String, SortedSet<String>> memberInstruments;
}
