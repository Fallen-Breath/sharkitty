package com.kahzerx;

import com.llamalad7.mixinextras.MixinExtrasBootstrap;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class SharkittyPreLaunch implements PreLaunchEntrypoint {
	@Override
	public void onPreLaunch() {
		MixinExtrasBootstrap.init();
	}
}
