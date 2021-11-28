/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan;

/**
 *
 * @author MAM
 */
public class Xiaomi implements Phone {
    private int volume;
    private boolean isPowerOn;

    public Xiaomi() {
        this.volume = 50;
    }

    @Override
    public void powerOn() {
        isPowerOn = true;
        System.out.println("Power ON");
        System.out.println("XIAOMI MI 11 ultra");
        System.out.println("Android version 12");
    }

    @Override
    public void powerOff() {
        isPowerOn = false;
        System.out.println("Handphone dimatikan");
    }

    @Override
    public void volumeUp() {
        if (isPowerOn) {
            if (this.volume == MAX_VOLUME) {
                System.out.println("Volume FULL!!");
                System.out.println("sudah " + this.getVolume() + "%");
            } else {
                this.volume += 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("HP Masih belum dinyalakan");
        }
    }

    @Override
    public void volumeDown() {
        if (isPowerOn) {
            if (this.volume == MIN_VOLUME) {
                System.out.println("Volume = 0%");
            } else {
                this.volume -= 10;
                System.out.println("Volume sekarang: " + this.getVolume());
            }
        } else {
            System.out.println("HP Masih belum dinyalakan");
        }
    }

    public int getVolume() {
        return this.volume;
    }

}