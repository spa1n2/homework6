package com.company;

public class Main {

    public static void main(String[] args) {
        boss slash = new boss();
        slash.setDamage(50);
        slash.setHealth(400);
        slash.weapon.setNameWeapon(" Огнестрельное");
        slash.weapon.setNameWeapon("    G18");
        System.out.println("   boss health" + slash.health +
                "   boss damage" + slash.damage + "     name weapon " + slash.weapon.getNameWeapon()
                + "  typ weapon" + slash.weapon.getTypWeapon());
    }
}