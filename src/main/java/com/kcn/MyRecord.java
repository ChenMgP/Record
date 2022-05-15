package com.kcn;

import net.minecraft.item.MusicDiscItem;
import net.minecraft.sound.SoundEvent;

public class MyRecord extends MusicDiscItem {
    public MyRecord(int comparatorOutput, SoundEvent sound, Settings settings) {
        super(comparatorOutput, sound, settings);
    }
}
