package com.mycompany.development;

public class Development {
	static final int MAX_PROGS = 10;
	static final int MAX_TESTERS = 5;
	private Programmer [] devteam = null;
	private Tester [] testteam = null;
	public void bugReport() {
		this.findAvailableProgrammer().bugReport();
	}
	
	public Development () {
		for (int i = 0 ; i < Development.MAX_PROGS; i++) {
			devteam[i] = new Programmer();
		}
		
	}
	
	private Programmer findAvailableProgrammer() {
		// some looking around for some not working
		return this.devteam[0];
	}

}

class Programmer {
	void bugReport() {}
	
}

class Tester {
	
}

class BA {
	
}