package com.techrevolution.algorithms.easy.math;

import lombok.extern.slf4j.Slf4j;

import static java.lang.String.valueOf;

/**
 * Created By Hemang Dave
 * Date: 17/08/22
 * Time: 1:18 pm
 */
@Slf4j
public class MathDemo {
    public static void main(String[] args) {
        log.info(valueOf(Math.abs(4))); // 4
        log.info(valueOf(Math.abs(- 4))); // 4
        log.info(valueOf(Math.absExact(5))); //4
        log.info(valueOf(Math.addExact(5, 10))); // 15
        log.info(valueOf(Math.ceil(3.14))); //4.0
        log.info(valueOf(Math.floor(3.14))); //3.0
        log.info(valueOf(Math.floorDiv(6, 3)));//2
        log.info(valueOf(Math.floorDiv(6, 4)));//1
        log.info(valueOf(Math.floorMod(6, 3)));//0
        log.info(valueOf(Math.multiplyExact(3, 3)));//9
        log.info(valueOf(Math.multiplyFull(3, 3)));//9
        log.info(valueOf(Math.negateExact(- 3))); //3
        log.info(valueOf(Math.nextAfter(3.14, 1)));//3.14
        log.info(valueOf(Math.round(3.14)));//3
        log.info(valueOf(Math.sqrt(100)));//10
        log.info(valueOf(Math.pow(10, 2)));//100.0

    }
}
