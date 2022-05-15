package com.kcn;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {
    //The constructor isn't important,Ignore it!
    public Main() {}
    //The method isn't important,Ignore it!
    public static void main(String[] args) {}

    //Create you sound identifier
    public static final Identifier MY_SOUND_ID = new Identifier("kcn:my_sound");
    //Create you sound event
    public static SoundEvent MY_SOUND_EVENT = new SoundEvent(MY_SOUND_ID);
    /*Create you Record
    1.The first formal parameter describes the intensity of the redstone signal that the record can emit when placed in the jukebox
    2.The second formal parameter is your sound event
    3.The third formal parameter you don't have to think about it,copy it unless you want to change something
     */
    public static final MyRecord MY_RECORD = new MyRecord(4, MY_SOUND_EVENT, new Item.Settings().group(ItemGroup.MISC).maxCount(1));

    @Override
    public void onInitialize() {
        //Register your sound event and record
        Registry.register(Registry.ITEM, new Identifier("kcn", "my_record"), MY_RECORD);
        Registry.register(Registry.SOUND_EVENT, MY_SOUND_ID, MY_SOUND_EVENT);
        //If you have completed the above,Under the "resources/assets/kcn" path, create the sounds folder and sounds.json file
        //After that,you will get a record of your own
    }
}
