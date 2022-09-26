package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        } else if (numberToSkip < 0) {
            System.out.println("last number in row is negative");
        } else {
            int skippedSum = 0;
            int countedSum = 0;
            boolean increaseSkipped = true;
            boolean increaseCounted = false;
            for (int i = 1; i <= lastInRow; i++) {
                if (increaseSkipped) {
                    skippedSum += i;
                }
                if (i == numberToSkip) {
                    increaseSkipped = false;
                    increaseCounted = true;
                    continue;
                }
                if (increaseCounted) {
                    countedSum += i;
                }
            }
            System.out.println("skipped sum is " + skippedSum);
            System.out.println("counted sum is " + countedSum);
        }
    }
}
