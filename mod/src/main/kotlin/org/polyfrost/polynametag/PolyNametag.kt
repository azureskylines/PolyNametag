package org.polyfrost.polynametag

import net.minecraftforge.fml.common.Loader
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent
import org.polyfrost.polynametag.config.ModConfig
import org.polyfrost.polynametag.render.initNametagRendering

@Mod(modid = PolyNametag.MODID, name = PolyNametag.NAME, version = PolyNametag.VERSION, modLanguageAdapter = "cc.polyfrost.oneconfig.utils.KotlinLanguageAdapter")
object PolyNametag {
    const val MODID = "@ID@"
    const val NAME = "@NAME@"
    const val VERSION = "@VER@"
    internal var isPatcher = false
        private set

    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        ModConfig
    }

    @Mod.EventHandler
    fun onPostInit(event: FMLPostInitializationEvent) {
        initNametagRendering()
        isPatcher = Loader.isModLoaded("patcher")
    }
}