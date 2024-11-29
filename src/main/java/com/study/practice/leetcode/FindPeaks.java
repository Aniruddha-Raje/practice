package com.study.practice.leetcode;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Slf4j
public class FindPeaks {

    public static void main(String[] args) {
        List<Integer> peaks = new ArrayList<>();

        int[] arr = {10, 20, 15, 2, 23, 90, 67};
        int n = arr.length;

        if (n < 3) {
            peaks.add(Arrays.stream(arr).max().getAsInt());
        }

        for (int i = 1; i < n - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                peaks.add(arr[i]);
            }
        }
        log.info("Peaks: " + peaks);
    }
}
