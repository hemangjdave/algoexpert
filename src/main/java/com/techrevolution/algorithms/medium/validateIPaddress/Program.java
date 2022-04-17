package com.techrevolution.algorithms.medium.validateIPaddress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Predicate;

/**
 * Created By Hemang Dave
 * Date: 04/03/22
 * Time: 1:25 AM
 */
public class Program {

    private static final Predicate<String> isValidIpPart = (s -> {
        if (s.length() > 1 && s.charAt(0) == '0') {
            return false;
        }
        var intValue = Integer.parseInt(s);
        return intValue < 256;
    });

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        new Program().validIPAddresses("255255255255");
        long endTime = System.nanoTime();
        long divider = 1000;
        System.out.println((endTime - startTime)/divider);
    }

    private ArrayList<String> verifyIpAddress(String ipAddress) {
        ArrayList<String> strings = generateIpAddress(ipAddress);
        ArrayList<String> validIpAddresses = new ArrayList<>();
        for (String ip : strings) {
            String[] parts = ip.split("\\.");
            var isValidIpAddress = true;
            for (String s : parts) {
                if (isValidIpPart.negate().test(s)) {
                    isValidIpAddress = false;
                    break;
                }
            }
            if (isValidIpAddress) {
                validIpAddresses.add(ip);
            }
        }
        return validIpAddresses;
    }


    private ArrayList<String> generateIpAddress(String ipAddress) {
        ArrayList<int[]> list = generateIpIndex(ipAddress.length());
        ArrayList<String> listOfIpAddress = new ArrayList<>();
        var size = list.size() > 1 ? list.size() - 1 : list.size();
        for (var i = 0; i < size; i++) {
            StringBuilder builder = new StringBuilder(ipAddress);
            int[] indexes = list.get(i);
            String address = builder.insert(indexes[0], ".").insert(indexes[1], ".").insert(indexes[2], ".").toString();
            listOfIpAddress.add(address);
        }
        return listOfIpAddress;
    }

    public ArrayList<String> validIPAddresses(String string) {
        // Write your code here.
        if (string.length() == 4) {
            StringBuilder builder = new StringBuilder(string);
            String toString = builder.insert(1, ".").insert(3, ".").insert(5, ".").toString();
            return new ArrayList<>(Collections.singletonList(toString));
        }
        if (!isStringValid(string)) {
            return new ArrayList<>();
        }
        return verifyIpAddress(string);
    }

    private ArrayList<int[]> generateIpIndex(int stringLength) {
        ArrayList<int[]> list = new ArrayList<>();
        int startIdx = 1;
        int midIdx = 3;
        int endIdx = 5;
        list.add(getArrayOfIndexes(startIdx, midIdx, endIdx));
        while (startIdx != 4) {
            if (endIdx <= stringLength) {
                endIdx++;
                list.add(getArrayOfIndexes(startIdx, midIdx, endIdx));
            } else if (midIdx < stringLength - 1) {
                midIdx++;
                endIdx = midIdx + 2;
                list.add(getArrayOfIndexes(startIdx, midIdx, endIdx));
            } else {
                startIdx++;
                midIdx = startIdx + 2;
                endIdx = midIdx + 2;
                if (endIdx > stringLength+1) {
                    return list;
                }
                list.add(getArrayOfIndexes(startIdx, midIdx, endIdx));
            }
        }
        return list;
    }

    private int[] getArrayOfIndexes(int startIdx, int midIdx, int endIdx) {
        return new int[]{startIdx, midIdx, endIdx};
    }


    private boolean isStringValid(String string) {
        var length = string.length();
        return length >= 4 && length <= 12;
    }

}
