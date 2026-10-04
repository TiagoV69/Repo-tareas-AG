import java.util.Arrays;

class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int intervalosBorrados = 0;
        int finDelIntervaloActual = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            int inicioDelSiguiente = intervals[i][0];
            int finDelSiguiente = intervals[i][1];
            if (inicioDelSiguiente < finDelIntervaloActual) {
                intervalosBorrados++;
            } else {
                finDelIntervaloActual = finDelSiguiente;
            }
        }
        return intervalosBorrados;
    }
}