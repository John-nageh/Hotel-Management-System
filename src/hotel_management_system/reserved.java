/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel_management_system;

import java.util.ArrayList;

/**
 *
 * @author johnn
 */
public class reserved {

    public static ArrayList<Integer> rr = new ArrayList<>();  // Empty ArrayList of Strings
    public static ArrayList<Double> rrp = new ArrayList<>();  // Empty ArrayList of Strings
    
    public static String fi = "";
    public static String mi = "";
    public static String la = "";
    public static String ph = "";
    public static String mm = "";
    public static String ss = "";
    public static String du = "";
    public static String pd = "";
    
    public static double fpr = 0;
    public static double pa = 0;
    public static int id = 0;
    
    
    public void add(int data, double pr) {
        rr.add(data);
        rrp.add(pr);
    }

    public void remove(int data) {
        int r = 0;
        for (int i = 0; i < rr.size(); i++) {
            if (rr.get(i) == data) {  // Replace targetValue with the value you're searching for
                r = i; // If you want to exit the loop after finding the first match
                break;
            }
        }
        rrp.remove(r);
        rr.remove(r);
    }

    public ArrayList<Integer> getI() {
        return rr;
    }

    public ArrayList<Double> getD() {
        return rrp;
    }

    public void clr() {
        rr.clear();
        rrp.clear();
    }
    public boolean emp() {
        return rr.isEmpty();
    }
}
