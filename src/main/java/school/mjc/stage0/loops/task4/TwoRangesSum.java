package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        if (numberToSkip > lastInRow)
            System.out.println("number to skip is bugger than the last");
        else if (lastInRow < 0)
            System.out.println("last number in row is negative");
        else
            System.out.println("Skipped sum is number " + (numberToSkip + lastInRow));
            int sum = 0;
            for (int i = numberToSkip + 1; i <= lastInRow; i++) {
                sum += i;
            }
            System.out.println(sum);
    }
}
