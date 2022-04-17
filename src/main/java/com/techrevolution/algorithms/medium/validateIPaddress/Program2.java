package com.techrevolution.algorithms.medium.validateIPaddress;

import java.util.ArrayList;

/**
 * Created By Hemang Dave
 * Date: 15/04/22
 * Time: 7:16 PM
 */
public class Program2 {

    public static void main(String[] args) {
        long startTime = System.nanoTime();
        new Program().validIPAddresses("255255255255");
        long endTime = System.nanoTime();
        long divider = 1000;
        System.out.println((endTime - startTime)/divider);
    }


    public ArrayList<String> validIPAddresses(String string) {
        ArrayList<String> ipAddressesFound = new ArrayList<>();
        for (var i = 1; i < Math.min(string.length(), 4); i++) {
            String[] currentIPAddressParts = new String[]{"", "", "", ""};
            currentIPAddressParts[0] = string.substring(0, i);
            if (!isValidPart(currentIPAddressParts[0])) {
                continue;
            }
            for (var j = i + 1; j < i + Math.min(string.length() - 1, 4); j++) {
                currentIPAddressParts[1] = string.substring(i, j);
                if (!isValidPart(currentIPAddressParts[1])) {
                    continue;
                }
                for (int k = j + 1; k < j + Math.min(string.length() - j, 4); k++) {
                    currentIPAddressParts[2] = string.substring(j, k);
                    currentIPAddressParts[3] = string.substring(k);
                    if (isValidPart(currentIPAddressParts[2]) && isValidPart(currentIPAddressParts[3])) {
                        ipAddressesFound.add(join(currentIPAddressParts));
                    }
                }
            }
        }
        return ipAddressesFound;
    }

    public boolean isValidPart(String string) {
        int stringAsInt = Integer.parseInt(string);
        if (stringAsInt > 255) {
            return false;
        }
        return string.length() == Integer.toString(stringAsInt).length();
    }

    public String join(String[] strings) {
        StringBuilder builder = new StringBuilder();
        for (var i = 0; i < strings.length; i++) {
            builder.append(strings[i]);
            if (i < strings.length - 1) {
                builder.append(".");
            }
        }
        return builder.toString();
    }

}
