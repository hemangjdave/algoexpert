package com.techrevolution.algorithms.medium.invertbinarytree;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Hemang Dave.
 * Date: 27/12/21
 * Time: 12:42 AM
 */
@Slf4j
public class MemoryTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        List<Integer> tempList = list;
        list.add(4);
        list.add(5);
        List<Integer> cloneList = tempList;
        log.info("Main list is:--------");
        list.forEach(integer -> log.info(String.valueOf(integer)));
        log.info("-------cloned list is:----------");
        cloneList.forEach(integer -> log.info(String.valueOf(integer)));
    }
}
