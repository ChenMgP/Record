package com.kcn;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

/*
    The reason for creating this class is to get the constructor of MusicDiscItem
    Because the constructor of this class is protected
 */
public class MyRecord extends MusicDiscItem {
    public MyRecord(int comparatorOutput, SoundEvent sound, Settings settings) {
        super(comparatorOutput, sound, settings);
    }
}
