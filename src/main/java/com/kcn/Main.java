package com.kcn;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
    public Main() {
    }

    public static void main(String[] args) {

    }

    public static final Identifier MY_SOUND_ID = new Identifier("kcn:my_sound");
    public static SoundEvent MY_SOUND_EVENT = new SoundEvent(MY_SOUND_ID);
    public static final MyRecord MY_RECORD = new MyRecord(4, MY_SOUND_EVENT, new Item.Settings().group(ItemGroup.MISC));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("kcn", "my_record"), MY_RECORD);
        Registry.register(Registry.SOUND_EVENT, MY_SOUND_ID, MY_SOUND_EVENT);
    }
}
