package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        boolean iterateTillTheEnd = false;
        if (numberToGoUntil < toBreakWith) {
            System.out.println("iterating till the end");
            iterateTillTheEnd = true;
        }

        for (int i = 1; i <= numberToGoUntil; i++) {
            if (iterateTillTheEnd || i <= toBreakWith) {
                System.out.println(i);
            } else {
                break;
            }
        }
    }
}
