package com.pillar.codemash.kata;

import java.util.ArrayList;
import java.util.List;

public class VennIntersectionFinder3 {
	public List<Integer> findAllNonDuplicateCommonIntegers(
			List<Integer> firstList, List<Integer> secondList) {
		List<Integer> intersectingList = new ArrayList<Integer>();
		
		if (null == firstList) {return intersectingList;}
		if (null == secondList) {return intersectingList;}
//		if (firstList.size() == 0) {return secondList;} //Breaks one test
		if (secondList.size() == 0) {return firstList;}

		for (Integer candidateInteger : firstList) {
			if (candidateInteger != null) {
				addCommonItemToIntersectingList(secondList, intersectingList, candidateInteger);
			}
		}
		return intersectingList;
	}

	private void addCommonItemToIntersectingList(List<Integer> secondList, List<Integer> intersectingList, Integer candidateInteger) {
		if ((secondList.contains(candidateInteger))
				&& (!intersectingList.contains(candidateInteger))) {
			intersectingList.add(candidateInteger);
		}
	}

}
