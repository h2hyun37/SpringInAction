package com.h2hyun37.chap02.autoScan;

import org.springframework.stereotype.Component;

@Component("component01")
public class SgtPeppers1 implements CompactDisc {
    
    String title = "sgtPeppers1";
    String artist = "Beatles";
    
    @Override
    public void play() {
	System.out.println("Playing " + title + " by  " + artist);
    }

}
