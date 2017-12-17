package FirstLaba;

import java.lang.*;
import java.nio.*;
import java.util.*;
import java.awt.*;
import java.io.*;
import java.math.*;

public class Laba1 {

	static final int MAX_LESSON = 7;
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();

	public static void main(String args[]) {
		int auditStatus[];
		int groups;
		int minAuditor;
		StringBuilder raspisanie;
		auditStatus = new int[MAX_LESSON];

		System.out.println("Сколько у вас групп?");
		groups = scan.nextInt();
		if (scan.hasNextLine())
			scan.nextLine();
		for (int i = 0; i < groups; i++) {
			System.out.println((i + 1) + " : " + (raspisanie = randomValueOfArray()));
			for (int j = 0; j < MAX_LESSON; j++)
				auditStatus[j] += Integer.parseInt(raspisanie.charAt(j) + "");
		}
		minAuditor = auditStatus[0];
		for (int i = 1; i < MAX_LESSON; i++)
			if (auditStatus[i] > minAuditor)
				minAuditor = auditStatus[i];
		System.out.println("Для размещения групп нужно " + minAuditor + " аудиторий.");

		scan.close();
	}

	public static StringBuilder randomValueOfArray() {
		StringBuilder raspisanie = new StringBuilder(MAX_LESSON);
		for (int i = 0; i < MAX_LESSON; i++)
			raspisanie.append(rand.nextInt(2));
		return raspisanie;
	}
}
