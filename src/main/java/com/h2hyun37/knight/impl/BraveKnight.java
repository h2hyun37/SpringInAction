package com.h2hyun37.knight.impl;

import com.h2hyun37.knight.Knight;
import com.h2hyun37.knight.Quest;

public class BraveKnight implements Knight {

	private Quest quest;

	public BraveKnight(Quest quest) {
		this.quest = quest;
	}

	public void embarkOnQuest() {
		quest.embark();
	}
}
