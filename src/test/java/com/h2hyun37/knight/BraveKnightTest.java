package com.h2hyun37.knight;
import org.junit.Test;

import com.h2hyun37.knight.Quest;
import com.h2hyun37.knight.impl.BraveKnight;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.times;

public class BraveKnightTest {

	@Test
	public void knightShouldEmbarkOnQuest() {

		Quest mockQuest = mock(Quest.class);

		BraveKnight knight = new BraveKnight(mockQuest);
		knight.embarkOnQuest();

		verify(mockQuest, times(1)).embark();


	}

}
