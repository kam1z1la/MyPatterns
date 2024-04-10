package com.myprojects.patterns.thread;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;
import java.util.stream.Collectors;

@Slf4j
public class ThreadApplication {
    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort(50000, -100, 100);
        InsertionSort insertion = new InsertionSort(50000, -100, 100);
        SelectionSort selection = new SelectionSort(50000, -100, 100);

//        System.out.println(Arrays.asList(bubble, insertion, selection)
//                .parallelStream()
//                .map(Sort::execute)
//                .collect(Collectors.toList()));

        System.out.println(Arrays.asList(bubble, insertion, selection).stream()
                .map(Sort::execute)
                .collect(Collectors.toList()));
    }
}
