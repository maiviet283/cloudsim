package org.cloudbus.cloudsim.examples;

import org.cloudbus.cloudsim.core.CloudSim;

import java.util.Calendar;

public class MyCloudSimTest {
    public static void main(String[] args) {
        // Khởi tạo CloudSim
        int numUsers = 1;
        Calendar calendar = Calendar.getInstance();
        CloudSim.init(numUsers, calendar, false);

        System.out.println("CloudSim đã khởi tạo thành công!");
    }
}
