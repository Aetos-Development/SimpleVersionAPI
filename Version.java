package me.orbit.aetos.util;

public class Version {
	int fullRelease;
	int minorRelease;
	int patchRelease;
	
	
	boolean beta;
	int betaReleaseVer;
	
	
	public Version(int fullRelease, int minorRelease, int patchRelease) {
		this.fullRelease = fullRelease;
		this.minorRelease = minorRelease;
		this.patchRelease = patchRelease;
		this.beta = false;
	}
	
	public Version(int fullRelease, int minorRelease, int patchRelease, int betaRel) {
		this.fullRelease = fullRelease;
		this.minorRelease = minorRelease;
		this.patchRelease = patchRelease;
		this.beta = true;
		this.betaReleaseVer = betaRel;
	}
	
	
	@Override
	public String toString() {
		
		if(!beta) {
			return fullRelease + "." + minorRelease + "." + patchRelease;
		} else {
			return fullRelease + "." + minorRelease + "." + patchRelease + "-beta" + betaReleaseVer;
		}
		
		
	}
	
	
	
	
	
}
