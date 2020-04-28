package com.project.Utilities;

public class StringUtilities {
	String name;
	String gender;

	public StringUtilities() {
		System.out.println("StringUtilities Object Created");
	}

	public StringUtilities(String firstname, String lastname, String emailid) {
		System.out.println(" Swathi " + firstname);
		System.out.println(" Banda " + lastname);
		System.out.println(" Swathi@gmail.com " + emailid);
	}

	public boolean isCharExists(String s, char ch) {
		System.out.println("name : " + name);
		int length = s.length();
		for (int i = 0; i < length; i++) {
			char c = s.charAt(i);
			if (c == ch) {
				return true;
			}
		}
		return false;
	}

	public String isValidOrNot(String s1, String s2) {
		if (s1.equalsIgnoreCase(s2)) {
			return "Valid";
		} else {
			return "Invalid";
		}
	}

	public String concatString(String s, String s1) {
		String s2 = s.concat(" ").concat(s1);
		// String s2 = s + s1;
		return s2;
	}

}
